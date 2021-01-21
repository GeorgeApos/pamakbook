package main_package;

import java.util.ArrayList;

public class connectedClass {
	
	ArrayList<users> usersOfTheApp;
	ArrayList<groups> listOfGroups;
	
	
	public connectedClass() {
		usersOfTheApp = new ArrayList<>();
		listOfGroups = new ArrayList<>();
	}
	
	public boolean checkIfUnique(String name, String email) {
		
		for(users checkingUser : usersOfTheApp) {
			if(checkingUser.getEmail().equals(email) && checkingUser.getName().equals(name)) {
				return false;
			}
		}
		
		return true;
	}
	
	public void writeToList(users aUser) {
		usersOfTheApp.add(aUser);
	}
	
	public void writeToListGroup(groups aGroup ) {
		listOfGroups.add(aGroup);
	}

	public ArrayList<users> getUsersOfTheApp() {
		return usersOfTheApp;
	}

	public ArrayList<groups> getListOfGroups() {
		return listOfGroups;
	}


}
