package com.optum.api.patient.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.optum.api.patient.models.PatientInformation;
import com.optum.api.patient.services.PatientService;

@RestController
public class PatientInformationController {
	
	@Autowired
	private PatientService patientservice;
	
	@GetMapping("/api/patients")
	public List<PatientInformation> getPatientInformation(){
		return patientservice.getPatientInformation();
	}
}
