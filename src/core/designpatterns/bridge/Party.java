package core.designpatterns.bridge;

import core.designpatterns.data.PartyData;

public abstract class Party {

	protected Role role;
	protected PartyData data;
	
	public Party(PartyData data,Role role){
		this.role = role;
		this.data = data;
	}
	
	public void create(){
		data.setPartyId(1111L);
		System.out.println("Creating party:=" + data.getPartyId());
	}
	
	public void assignRole(){
		role.assign(data);
	}
	
}
