package model;

import java.util.LinkedList;
import java.util.List;

public class ProgramSystem {

	private List<Restaurant> restaurants;
	
	public ProgramSystem() {
		restaurants = new LinkedList<>();
	}
	
	public List<Restaurant> getRestaurants(){
		return restaurants;
	}
	
	public void addRestaurant(String name, String nit, String adminName) {
		if(notIsNewRestaurant(name, nit)) {
		Restaurant newRestaurant = new Restaurant(name, nit, adminName);
		restaurants.add(newRestaurant);
		}
	}

	public boolean notIsNewRestaurant(String name, String nit) {
        boolean notIsNew;
        for (int i = 0; i < restaura; i++) {
			
		}
        
		return notIsNew;
	}
	

}
