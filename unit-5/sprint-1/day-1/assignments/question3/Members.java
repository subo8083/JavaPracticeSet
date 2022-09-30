package com.question3;

import java.util.Objects;

public class Members {
	
	private int memberId;
	private String memberName;
	private int membershipNo;
	private String membershipEndDate;
	
	
	
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getMembershipNo() {
		return membershipNo;
	}
	public void setMembershipNo(int membershipNo) {
		this.membershipNo = membershipNo;
	}
	public String getMembershipEndDate() {
		return membershipEndDate;
	}
	public void setMembershipEndDate(String membershipEndDate) {
		this.membershipEndDate = membershipEndDate;
	}
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(memberId, membershipNo);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Members other = (Members) obj;
		return memberId == other.memberId || membershipNo == other.membershipNo;
	}
	@Override
	public String toString() {
		return "Members [memberId=" + memberId + ", memberName=" + memberName + ", membershipNo=" + membershipNo
				+ ", membershipEndDate=" + membershipEndDate + "]" +" \n";
	}
	
	
	
	
	Members(int mi, String memName, int memNo, String memEnd ){
		
		this .memberId=mi;
		this.memberName=memName;
		this.membershipNo=memNo;
		this.membershipEndDate=memEnd;
		
	}
	
	
	
	
	
	 

}
