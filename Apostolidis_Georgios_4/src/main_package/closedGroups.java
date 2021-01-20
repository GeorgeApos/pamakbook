package main_package;

import java.util.ArrayList;

public class closedGroups extends groups {
	
	public String name;
	public String description;
	
	public closedGroups(String name, String description, connectedClass connector) {
		super(name, description, connector);
		this.name = name;
		this.description = description;
		
		connector.listOfGroups.add(this);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	/*
	 * 
	 */
	@Override
	public void inGroupAddMember(users sampleUser) {
		if(this.getListOfMembersInGroups().isEmpty()) {
			getListOfMembersInGroups().add(sampleUser);
			sampleUser.setMembersGroup(this);
			System.out.println(sampleUser.getName() + " has been successfully enrolled in group " + this.name);
		}else if(!this.checkGroupForMember(sampleUser) && 
			sampleUser.checkForClosedGroups(this)) {
			this.getListOfMembersInGroups().add(sampleUser);
			sampleUser.setMembersGroup(this);
			System.out.println(sampleUser.getName() + " has been successfully enrolled in group " + this.name);
		}else {
			System.out.println("FAILED: " + sampleUser.getName() + " cannot be enrolled in group " + this.getName());
		}
		
	}
}
