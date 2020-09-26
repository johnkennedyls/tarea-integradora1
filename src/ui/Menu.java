package ui;

import java.util.Scanner;

import exceptions.NegativeCostException;
import model.*;
import model.TypeId;
import model.State;


public class Menu {
	
	private Scanner sc;
	private final static int EXIT_OPTION = 0;
	private ProgramSystem programSystem;
	
	public Menu()
	{
		sc = new Scanner(System.in);
		programSystem = new ProgramSystem();
	}
	
	public void startMenu()
	{
		String menu = getMenuText();
		int option;
		do {
		System.out.println(menu);
		option = readOption();
		executeOperation(option);
		}while(option != EXIT_OPTION);
		
	}

	private void executeOperation(int option) {
		switch(option) {
		case 1: addRestaurant();             break;
		case 2: addProduct();                break;
		case 3: addClient();                 break;
		case 4: addOrder();                  break;
		case 5: addProductsToTheOrder();      break;
		case 0: exit();                      break;
		default:                             break;
		}
		
	}

	

	private void addProductsToTheOrder() {
		programSystem.getRestaurants().
		
	}

	private void addOrder() {
		System.out.println("Write restaurant to do order");
		String restaurantName = sc.nextLine();
		System.out.println("Write the client first name");
		String clientName = sc.nextLine();
		Client client = programSystem.searchClient(clientName);
		if(client != null) {
		System.out.println("Write the order State");
		System.out.println( "REQUESTED");
		System.out.println("IN_PROCESS");
		System.out.println("SENT");
		System.out.println("DELIVERED");
		String stateSc = sc.nextLine().toUpperCase();
		State state = State.valueOf(stateSc);
		
		int clientIndex = programSystem.getIndexClient(clientName);
		int orderIndex = (programSystem.getClients().get(clientIndex).getOrders().size())-1;
		Restaurant restaurant = programSystem.searchRestaurant(restaurantName);		
		
		programSystem.getClients().get(clientIndex).addOrder(state);
		Order order = programSystem.getClients().get(clientIndex).getOrders().get(orderIndex);
		order.setClientCode(client.getNumId());
		order.setRestaurantNit(restaurant.getNit());
		
		System.out.println("Order added");
				
		
		}else {
			System.out.println("The restaurant has'nt added");
		}
		
	}

	private void addClient() {
		System.out.println("Write the client type ID");
		System.out.println("Write CC for Cedula ciudadan");
		String typeIdSc = sc.nextLine().toUpperCase();
		TypeId typeId = TypeId.valueOf(typeIdSc);
		System.out.println("Write the client ID number");
		String numId = sc.nextLine();
		System.out.println("Write the client last name");
		String lastName = sc.nextLine();
		System.out.println("Write the client first name");
		String firstName = sc.nextLine();
		System.out.println("Write the client phone");
		String phone = sc.nextLine();
		System.out.println("Write the client direction");
		String direction = sc.nextLine();
		
		programSystem.addClient(typeId, numId, lastName, firstName, phone, direction);
		
		System.out.println("The client has added");
		
	}

	private void exit() {
		sc.close();
		
	}

	private void addProduct() {
		
	System.out.println("Write the restaurant name to add product");
	String restaurantName = sc.nextLine();
	Restaurant restaurant = programSystem.searchRestaurant(restaurantName);
	//if(restaurant != null) {
	System.out.println("Write the new product code");
	String code = sc.nextLine();
	System.out.println("Write the new product name");
	String name = sc.nextLine();
	System.out.println("Write the new product description");
	String description = sc.nextLine();
	System.out.println("Write the new product cost");
	double cost = sc.nextInt();
	String restaurantNit = restaurant.getNit();
	try {
		restaurant.addProduct(code, name, description, cost, restaurantNit);
	} catch (NegativeCostException e) {
		System.err.println(e.getMessage());
		e.printStackTrace();
	}
	//}
	/**else {
		System.out.println("The restaurant does'nt exist");
	}
	*/
	
	System.out.println("The product has added");
	
		
	}

	private void addRestaurant() {
	   	String name;
	   	String nit;
	   	String adminName;
	   	
	   	System.out.println("Write the new restaurant name");
	   	name = sc.nextLine();
	   	System.out.println("Write the new restaurant nit");
	   	nit = sc.nextLine();
	   	System.out.println("Write the new restaurant adminName");
	   	adminName = sc.nextLine();
	   	
	   	programSystem.addRestaurant(name, nit, adminName);  
	   	System.out.println("The restaurant has added");
	   	
	}

	private int readOption() {
		int op;
		op = Integer.parseInt(sc.nextLine());
		return op;
	}

	private String getMenuText() {
		
	    String menu;
	    menu  = "=============================\n";
	    menu += "          ORDER SYSTEM\n";
	    menu  = "=============================\n";
	    menu += "1. Add a restaurant.\n";
	    menu += "2. Add a product.\n";
	    menu += "3. Add a client.\n";
	    menu += "4. Add a order.\n";
	    menu += "5. Add products to the order\n";
	    menu += "0. Exit.";
	    menu += "Please enter the option: ";

		return menu;
	}
}
