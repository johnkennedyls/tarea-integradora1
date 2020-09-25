package ui;

import java.util.Scanner;
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
	System.out.println("Write the new product code");
	String code = sc.nextLine();
	System.out.println("Write the new product name");
	String name = sc.nextLine();
	System.out.println("Write the new product description");
	String product = sc.nextLine();
	System.out.println("Write the new product cost");
	double cost = sc.nextInt();
	int restaurantsSize = programSystem.getRestaurants().size();
	programSystem.getRestaurants().get(restaurantsSize).
	
		
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
