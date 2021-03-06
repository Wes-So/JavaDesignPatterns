package core.designpatterns.structural.bridge;

import core.designpatterns.data.party.PartyData;
import core.designpatterns.data.party.PartyInRoleData;

public class AppUser implements Role {

	@Override
	public void assign(PartyData data) {
		PartyInRoleData role = data.getPartyInRoleData();
		role.setPartyInRoleId(2222L);
		System.out.println("Creating appUser role for partyId:=" + data.getPartyId());
		System.out.println("AppUser role has the following partyInRoleId:=" + role.getPartyInRoleId());
	}

}
