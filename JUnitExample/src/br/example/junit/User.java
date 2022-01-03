package br.example.junit;

public class User {
	private String firstName;
	private String surname;
	private String workCompanyName;
	private int userID;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getWorkCompanyName() {
		return workCompanyName;
	}
	public void setWorkCompanyName(String workCompanyName) {
		this.workCompanyName = workCompanyName;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
}
