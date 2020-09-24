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
		default:     break;
		}
		
	}

	

	private void addRestaurant() {
	   	System.out.println();
		
		
		
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
	    menu += "Please enter the option: ";

		return menu;
	}
}
