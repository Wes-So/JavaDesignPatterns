package core.designpatterns.data.party;

import java.util.Date;

public class PersonData {
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String ssn;
	private PartyData party;
	
	public PartyData getParty() {
		return party;
	}
	public void setParty(PartyData party) {
		this.party = party;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
}
