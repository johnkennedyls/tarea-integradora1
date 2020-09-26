package model;

import java.rmi.server.UID;
import java.util.Date;
import java.util.UUID;

public class Order {

	
	
	//-----------------------------
	// Attributes
	//-----------------------------
	private String code;
	private Date date;
	private String clientCode;
	private String restaurantNit;
	private State state;
	
	
	public Order(String co, Date da, String clco, String restaurantNit, State st) {
		code = generateRamdomCode();
		date = da; 
		clientCode = clco;
		this.restaurantNit = restaurantNit;
		state = st;
	}


	private String generateRamdomCode() {
		//Based on YouTube tutorial
		String code;
		code = UUID.randomUUID().toString().toUpperCase().substring(0,8);
		
		return code;
	}


	public String getCode() {
		return code;
	}


	public Date getDate() {
		return date;
	}


	public String getClientCode() {
		return clientCode;
	}


	public String getRestaurantNit() {
		return restaurantNit;
	}


	public State getState() {
		return state;
	}
	
	
	
	
}
