package com.optum.api.patient.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.optum.api.patient.models.PatientInformation;
import com.optum.api.patient.models.ProgramInformation;

@Service
public class ProgramServiceimpl implements ProgramService {

	@Override
	public List<ProgramInformation> getProgramInformations() {
		List<ProgramInformation> programs = new ArrayList<>();
		for (int i=0;i<10;i++) {
			ProgramInformation pp = new ProgramInformation();
			pp.setProgramId(i);
            pp.setProgramName("latest tech");
            programs.add(pp);
            
	}
		return programs;

}
}