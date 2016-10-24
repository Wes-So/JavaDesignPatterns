package core.designpatterns.data.party;

public class AttorneyData {
	private String lawOffice;
	private String licenseNumber;
	private PartyInRoleData partyInRole;
	
	public String getLawOffice() {
		return lawOffice;
	}
	public void setLawOffice(String lawOffice) {
		this.lawOffice = lawOffice;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public PartyInRoleData getPartyInRole() {
		return partyInRole;
	}
	public void setPartyInRole(PartyInRoleData partyInRole) {
		this.partyInRole = partyInRole;
	}
	
	
}
