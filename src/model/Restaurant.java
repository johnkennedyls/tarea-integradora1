package model;

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
	
	
	//----------------------
	// Constructor
	//---------------------
	public Restaurant(String na, String ni, String admi) 
	{
		name = na;
		nit = ni;
		adminName = admi;
	}
}
