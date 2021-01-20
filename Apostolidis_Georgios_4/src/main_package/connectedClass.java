package main_package;

import java.util.ArrayList;

public class connectedClass {
	
	ArrayList<users> usersOfTheApp;
	ArrayList<groups> listOfGroups;
	

	public connectedClass() {
		usersOfTheApp = new ArrayList<>();
		listOfGroups = new ArrayList<>();
	}
	
	public void writeToList(users aUser) {
		usersOfTheApp.add(aUser);
	}
	
	public void writeToListGroup() {
		
	}

	public ArrayList<users> getUsersOfTheApp() {
		return usersOfTheApp;
	}

	public ArrayList<groups> getListOfGroups() {
		return listOfGroups;
	}


}
