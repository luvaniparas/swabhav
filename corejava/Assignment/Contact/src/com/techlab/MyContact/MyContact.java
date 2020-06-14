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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result + ((fName == null) ? 0 : fName.hashCode());
		result = prime * result + ((lName == null) ? 0 : lName.hashCode());
		result = prime * result + (int) (phoneNo ^ (phoneNo >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyContact other = (MyContact) obj;
		if (emailId == null) {
			if (other.emailId != null)
				return false;
		} else if (!emailId.equals(other.emailId))
			return false;
		if (fName == null) {
			if (other.fName != null)
				return false;
		} else if (!fName.equals(other.fName))
			return false;
		if (lName == null) {
			if (other.lName != null)
				return false;
		} else if (!lName.equals(other.lName))
			return false;
		if (phoneNo != other.phoneNo)
			return false;
		return true;
	}

	
	
}
