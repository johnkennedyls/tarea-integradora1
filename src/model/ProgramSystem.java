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
		if(isNewRestaurant(name, nit)) {
		Restaurant newRestaurant = new Restaurant(name, nit, adminName);
		restaurants.add(newRestaurant);
		}
	}

	public boolean isNewRestaurant(String name, String nit) {
        boolean isNew = true;
        for (int i = 0; i < restaurants.size() || !isNew ; i++) {
			if(name == restaurants.get(i).getName() || nit == restaurants.get(i).getNit())
			{
				isNew = false;
			}else {
				
			}
		}
        
		return isNew;
	}
	

}
