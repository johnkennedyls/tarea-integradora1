package model;

import java.util.LinkedList;
import java.util.List;

import model.Client.TypeId;

public class ProgramSystem {

	private List<Restaurant> restaurants;
	private List<Client> clients;
	
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
			if(name.equals(restaurants.get(i).getName())  || nit.equals(restaurants.get(i).getNit()))
			{
				isNew = false;
			}else {
				
			}
		}
        
		return isNew;
	}

	public Restaurant searchRestaurant(String restaurantName) {
		boolean found = false;
		Restaurant searched = null;
		
		for(int i= 0; i< restaurants.size()&& found;i++) {
			if(restaurants.get(i).getName().equals(restaurantName)) {
				searched = restaurants.get(i);
				found = true;
			}
		}
		return searched;
		
	}
	
	public void addClient(TypeId typeId, String numId, String lastName, String FirstName, String phone,  String direction) {
		Client c = new Client(typeId, numId, lastName, FirstName, phone, direction);
		clients.add(c);
	}

}
