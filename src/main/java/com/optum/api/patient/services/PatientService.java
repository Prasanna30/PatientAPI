package com.optum.api.patient.services;

import java.util.List;

import com.optum.api.patient.models.PatientInformation;

public interface PatientService {
 List<PatientInformation> getPatientInformation();

}
