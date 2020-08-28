package com.optum.api.patient.models;

import java.util.Date;

public class PatientInformation {
private int patientId;

private String lastNAme;
private String firstName;
private Date dueDate;
private String phoneNumber;
private String state;
public int getPatientId() {
	return patientId;
}
public void setPatientId(int patientId) {
	this.patientId = patientId;
}

public String getLastNAme() {
	return lastNAme;
}
public void setLastNAme(String lastNAme) {
	this.lastNAme = lastNAme;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public Date getDueDate() {
	return dueDate;
}
public void setDueDate(Date dueDate) {
	this.dueDate = dueDate;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}


}
