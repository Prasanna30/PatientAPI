package com.optum.api.patient;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

import com.optum.api.patient.models.PatientInformation;
import com.optum.api.patient.services.PatientService;
import com.optum.api.patient.services.PatientServiceimpl;

@SpringBootApplication
public class PatientApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientApiApplication.class, args);
	}

	@Bean
	@ConditionalOnMissingBean
	public PatientService getPatientServiceBean() {
		return new PatientServiceimpl();
	}
}


