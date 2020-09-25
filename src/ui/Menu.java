package ui;

import java.util.Scanner;

import exceptions.NegativeCostException;
import model.*;

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
		default:     break;
		}
		
	}

	

	private void addProduct() {
		
	System.out.println("Write the restaurant name to add product");
	String restaurantName = sc.nextLine();
	Restaurant restaurant = programSystem.searchRestaurant(restaurantName);
	if(restaurant != null) {
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
		
		e.printStackTrace();
	}
	}
		
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
	    menu += "1. Add a restaurant\n";
	    menu += "2. Add a product\n";
	    menu += "Please enter the option: ";

		return menu;
	}
}
