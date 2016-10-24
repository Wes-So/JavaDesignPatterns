package core.designpatterns.data.party;

import java.util.Date;

public class PartyData {
	private Long partyId;
	private Date effectiveStartDate;
	private Date effectiveEndDate;
	private PartyInRoleData partyInRoleData;
	private PersonData personData;
	private OrganizationData orgData;
	
	public OrganizationData getOrgData() {
		return orgData;
	}
	public void setOrgData(OrganizationData orgData) {
		this.orgData = orgData;
	}
	public PersonData getPersonData() {
		return personData;
	}
	public void setPersonData(PersonData personData) {
		this.personData = personData;
	}
	public PartyInRoleData getPartyInRoleData() {
		return partyInRoleData;
	}
	public void setPartyInRoleData(PartyInRoleData partyInRoleData) {
		this.partyInRoleData = partyInRoleData;
	}
	public Long getPartyId() {
		return partyId;
	}
	public void setPartyId(Long partyId) {
		this.partyId = partyId;
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
