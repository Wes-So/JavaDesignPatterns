package core.designpatterns.data.party;

import java.util.Date;

public class OrganizationData {
	private String businessName;
	private Long ein;
	private Date incorporatedDate;
	private PartyData party;
	
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public Long getEin() {
		return ein;
	}
	public void setEin(Long ein) {
		this.ein = ein;
	}
	public Date getIncorporatedDate() {
		return incorporatedDate;
	}
	public void setIncorporatedDate(Date incorporatedDate) {
		this.incorporatedDate = incorporatedDate;
	}
	public PartyData getParty() {
		return party;
	}
	public void setParty(PartyData party) {
		this.party = party;
	}
}
