package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client {
    
	
	
	private TypeId typeId;
	private String numId;
	private String lastName;
	private String firstName;
	private String phone;
	private String direction;
	private List<Order> orders; 
	
	public Client(TypeId ty, String nit, String ln, String fn, String ph, String di) {
		typeId = ty;
		numId = nit;
		lastName = ln;
		firstName = fn;
		phone = ph;
		direction = di;
		orders = new ArrayList<Order>();
		
		
	}


	public TypeId getTypeId() {
		return typeId;
	}


	public String getNumId() {
		return numId;
	}


	public String getLastName() {
		return lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getPhone() {
		return phone;
	}


	public String getDirection() {
		return direction;
	}
	
	public void addOrder( State state) {
		Order o = new Order( state);
		orders.add(o);
	}
	
	
	public List<Order> getOrders(){
		return orders;
	}


	
	
	
	
	
	
	
	
	
}
