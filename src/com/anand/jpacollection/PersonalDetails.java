package com.anand.jpacollection;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PersonalDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int PersonID;
	private String LastName;
	private  String FirstName;
	
	@ElementCollection
	private List<PAddress> Address;

	public int getPersonID() {
		return PersonID;
	}

	public void setPersonID(int personID) {
		PersonID = personID;
	}
	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public List<PAddress> getAddress() {
		return Address;
	}

	public void setAddress(List address) {
		Address = address;
	}

}
