package core.designpatterns.data.party;

import java.util.Date;

public class PartyDataGenerator {
	
	public PartyData createParty(){
		PartyData partyData = new PartyData();
		partyData.setEffectiveStartDate(new Date());
		return partyData;
	}
	
	public PartyData createPerson(){
		PersonData personData = new PersonData();
		personData.setFirstName("Test");
		personData.setLastName("Person");
		
		PartyData partyData = new PartyData();
		partyData.setPersonData(personData); 
		return partyData;
	}
	
	public PartyInRoleData createAppUser(){
		
		AppUserData appUser = new AppUserData();
		appUser.setUserName("testUser");
		appUser.setPassword("testPassword");
		appUser.setEffectiveStartDate(new Date());
		return appUser;
	}
	
	 
}
