package model;
import exceptions.NegativeCostException;

public class Product {
     
	private String code;
	private String name;
	private String description;
	private double cost;
	private String restaurantNit;
	private int quantity;
	
	
	public Product(String co, String na, String de, double cos, String rn)
			throws NegativeCostException  {
		
		code = co;
		name = na;
		description = de;
		if(cost<0) {
		  throw new NegativeCostException();
		}
		cost = cos;
		restaurantNit = rn;
		
	}
	
	public Product(String con, int qu) {
		code = con;
	    quantity = qu;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public double getCost() {
		return cost;
	}

	public String getRestaurantNit() {
		return restaurantNit;
	}

	public int getQuantity() {
		return quantity;
	}
	
	
	
}
