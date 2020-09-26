package model;


import java.util.Date;
import java.util.UUID;
import model.Product;

public class Order {

	
	
	//-----------------------------
	// Attributes
	//-----------------------------
	private String code;
	private Date date;
	private String clientCode;
	private String restaurantNit;
	private State state;
	
	
	public Order(  State st) {
		code = generateRamdomCode();
		date = new Date(); 
		clientCode ="";
		this.restaurantNit = "";
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


	public void setCode(String code) {
		this.code = code;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}


	public void setRestaurantNit(String restaurantNit) {
		this.restaurantNit = restaurantNit;
	}


	public void setState(State state) {
		this.state = state;
	}
	 
	
	
	
	
}
