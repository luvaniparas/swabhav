package com.techlab.MyContact;

import java.io.Serializable;

public class MyContact implements Serializable{

	private String fName, lName, emailId;
	private long phoneNo;

	public MyContact(String fName, String lName, String emailId, long phoneNo) {
		this.fName = fName;
		this.lName = lName;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public String getEmailId() {
		return emailId;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	@Override
	public String toString() {
		return "MyContact [fName=" + fName + ", lName=" + lName + ", emailId=" + emailId + ", phoneNo=" + phoneNo + "]";
	}

}
