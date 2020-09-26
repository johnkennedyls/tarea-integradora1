package model;

public class Client {
    
	enum TypeId{
		CC,
		TI,
		CE,
	}
	
	private TypeId typeId;
	private String numId;
	private String lastName;
	private String firstName;
	private String phone;
	private String direction;
	
	
	public Client(TypeId ty, String nit, String ln, String fn, String ph, String di) {
		typeId = ty;
		numId = nit;
		lastName = ln;
		firstName = fn;
		phone = ph;
		direction = di;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
