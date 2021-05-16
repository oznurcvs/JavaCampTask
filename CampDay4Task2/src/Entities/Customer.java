package Entities;

import java.time.LocalDate;

import Abstracts.IEntity;

public class Customer implements IEntity {
	 private int Id;
	 private String FirstName;
	 private String LastName;
	 private LocalDate DateOfBirth;
	 private String NationalityId;
	 
	 public Customer() {
		 
	 }

	public Customer(int id, String firstName, String lastName, LocalDate dateOfBirth, String nationalityId) {
		
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		NationalityId = nationalityId;
	}

	public int getId() {
		return Id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}

	public String getNationalityId() {
		return NationalityId;
	}

	public void setId(int id) {
		Id = id;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
	 

}
