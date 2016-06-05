package core.designpatterns.bridge;

import core.designpatterns.data.PartyData;

public class Organization extends Party {

	public Organization(PartyData data,Role role) {
		super(data,role); 
	}

	@Override
	public void create(){
 		System.out.println("Creating organization");
	}

 
}
