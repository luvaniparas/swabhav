package com.techlab.contact;

import java.io.Serializable;

public class Contact implements Serializable {

	private String fName;
	private String lName;
	private long phoneNo;
	private String emailId;

	public Contact(String fName, String lName, long phoneNo, String emailId) {
		this.fName = fName;
		this.lName = lName;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Contact [fName=" + fName + ", lName=" + lName + ", phoneNo=" + phoneNo + ", emailId=" + emailId + "]";
	}

}
