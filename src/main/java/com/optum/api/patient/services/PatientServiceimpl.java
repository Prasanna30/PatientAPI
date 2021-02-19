package com.optum.api.patient.services;


import java.util.ArrayList;

import java.util.Date;
import java.util.List;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.sym.Name;
import com.optum.api.patient.models.PatientInformation;

@Service
public class PatientServiceimpl implements PatientService {


	
	@Override
	public List<PatientInformation> getPatientInformation() {
		List<PatientInformation> patients = new ArrayList<>();
		for (int i=0;i<10;i++) {
			PatientInformation p = new PatientInformation();
			p.setPatientId(i);
			p.setState("Denver");
			p.setLastNAme("Pawar");
			p.setFirstName("Prasanna");
			p.setPhoneNumber("720-900-6191");
			p.setDueDate(new Date());
			patients.add(p);
		}
		return patients;
	} 
	
	/* public class banking {
	 * Account Accounts;
	 * 
	 * public void setAccounts(Account Accounts)
	 * {
	 * this .Accounts = Accounts;
	 * }
	 */

	/*
	 * banking(Account Accounts)
	 * {
	 * this .Accounts = Accounts;
	 */
}
