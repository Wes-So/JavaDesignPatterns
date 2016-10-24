package core.designpatterns.structural.bridge;

import core.designpatterns.data.party.PartyData;
import core.designpatterns.data.party.PartyDataGenerator;
import core.designpatterns.data.party.PartyInRoleData;

public class RoleManagementSystem {

	public static void main(String[] args) {
		PartyDataGenerator dataGen = new PartyDataGenerator();
		PartyData partyData = dataGen.createPerson();
		PartyInRoleData roleData = dataGen.createAppUser(); 
		partyData.setPartyInRoleData(roleData);
		
		System.out.println("*****Creating appUser*****");
		createAppUserService(partyData);
		
		
	}
	
	
	//The following methods mimic services in the svc impl file
	private static void createAppUserService(PartyData data){
		Party person = new Person(data,new AppUser());
		person.create(); 
		person.assignRole();
	}
	
	private static void createDebtorOrganizationService(PartyData data){
		
	}
	
	private static void createDebtorPersonService(PartyData data){
		
	}
	
	private static void createAttorneyService(PartyData data){
		
	}

}
