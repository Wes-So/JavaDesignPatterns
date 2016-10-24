package core.designpatterns.data.party;

import java.util.Date;

public abstract class PartyInRoleData {
	private Long partyInRoleId;
	private PartyData party;
	private Date effectiveStartDate;
	private Date effectiveEndDate;
	
	public Long getPartyInRoleId() {
		return partyInRoleId;
	}
	public void setPartyInRoleId(Long partyInRoleId) {
		this.partyInRoleId = partyInRoleId;
	}
	public PartyData getParty() {
		return party;
	}
	public void setParty(PartyData party) {
		this.party = party;
	}
	public Date getEffectiveStartDate() {
		return effectiveStartDate;
	}
	public void setEffectiveStartDate(Date effectiveStartDate) {
		this.effectiveStartDate = effectiveStartDate;
	}
	public Date getEffectiveEndDate() {
		return effectiveEndDate;
	}
	public void setEffectiveEndDate(Date effectiveEndDate) {
		this.effectiveEndDate = effectiveEndDate;
	}
}
