package core.designpatterns.structural.bridge;

import core.designpatterns.data.party.PartyData;

public class Organization extends Party {

	public Organization(PartyData data,Role role) {
		super(data,role); 
	}

	@Override
	public void create(){
 		System.out.println("Creating organization");
	}

 
}
