package exceptions;



@SuppressWarnings("serial")
public class NegativeCostException extends Exception{

	
	

	public NegativeCostException() {
		super("The product cost can't be negative");
	}
}
