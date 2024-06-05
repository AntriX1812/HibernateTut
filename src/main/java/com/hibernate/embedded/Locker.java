package com.hibernate.embedded;

import jakarta.persistence.Embeddable;

@Embeddable
public class Locker {

	 private int lockerNum;
	 private String lokcerName;
	public int getLockerNum() {
		return lockerNum;
	}
	public void setLockerNum(int lockerNum) {
		this.lockerNum = lockerNum;
	}
	public String getLokcerName() {
		return lokcerName;
	}
	public void setLokcerName(String lokcerName) {
		this.lokcerName = lokcerName;
	}
	@Override
	public String toString() {
		return "Locker [lockerNum=" + lockerNum + ", lokcerName=" + lokcerName + "]";
	}
	 
}
