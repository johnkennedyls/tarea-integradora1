package model;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import model.TypeId;

public class ProgramSystem {

	private List<Restaurant> restaurants;
	private List<Client> clients;
	
	public ProgramSystem() {
		restaurants = new LinkedList<>();
		clients = new ArrayList<Client>();
	}
	
	public List<Restaurant> getRestaurants(){
		return restaurants;
	}
	
	public List<Client> getClients(){
		return clients;
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

	public Client searchClient(String clientName) {
		Client searched = null;
		for (int i = 0; i < clients.size(); i++) {
			if(clientName.contentEquals(clients.get(i).getFirstName())) {
				searched = clients.get(i);
			}
		}
		return searched;
	}
	
	public int getIndexClient(String clientName) {
		int index = 0;
		for (int i = 0; i < clients.size(); i++) {
			if(clientName.contentEquals(clients.get(i).getFirstName())) {
				index = i;
			}
		
	}
		return index;
	
	
	}
	
	
	
	
}


