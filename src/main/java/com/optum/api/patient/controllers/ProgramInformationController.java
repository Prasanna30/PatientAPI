package com.optum.api.patient.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.optum.api.patient.models.ProgramInformation;
import com.optum.api.patient.services.ProgramService;

@RestController
public class ProgramInformationController {
	
	@Autowired
	private ProgramService programservice;
	
	@GetMapping("/api/Programs")
	public List<ProgramInformation> getProgramInformation(){
		return programservice.getProgramInformations();
	}
	
	
	

}
