package core.designpatterns.bridge;

import core.designpatterns.data.party.PartyData;
import core.designpatterns.data.party.PersonData;

public class Person extends Party {

	public Person(PartyData data,Role role) {
		super(data, role); 
	}

	@Override
	public void create(){
		super.create();
		PersonData personData = data.getPersonData();
 		System.out.println("Creating person with the following data:=" + personData.getFirstName() + "," + personData.getLastName() );
	}

 
	
}
