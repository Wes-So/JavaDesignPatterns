package core.designpatterns.bridge;

import core.designpatterns.data.party.PartyData;

public interface Role {
	
	public void assign(PartyData data);
}
