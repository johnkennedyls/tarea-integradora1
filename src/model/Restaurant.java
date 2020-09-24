package model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
       
	
	 //---------------------
	// Attributes
	//----------------------
	
	/**
	 * Represent the restaurant name.
	 */
	private String name;
	
	/**
	 * Represent the retaurant nit
	 */
	private String nit;
	
	/**
	 * Represent the restaurant administrator name.
	 */
	private String adminName;
	
	private List<Product> products;
		
	
	
	
	//----------------------
	// Constructor
	//---------------------
	public Restaurant(String na, String ni, String admi) 
	{
		name = na;
		nit = ni;
		adminName = admi;
		products = new ArrayList<Product>();
	}


	public String getName() {
		return name;
	}


	public String getNit() {
		return nit;
	}


	public String getAdminName() {
		return adminName;
	}
	
	public void addProduct() {
		
	}
	
	
}
