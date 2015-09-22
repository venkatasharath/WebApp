/**
 * 
 */
package com.csc.devops;

/**
 * @author vyeshantarao
 *
 */
public class POCDevOps2 {
	
	String username;
	String firstName;
	String lastName;
	String emailID;	// add new commment 236
	
	private POCDevOps2(){		
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
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
	
	public String getEmailID() {
		return emailID;
	}
	
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	
	public String toString(POCDevOps2 obj)
	{
		String name = obj.getFirstName();
		name.toUpperCase();
		
		return name;
	}
}
