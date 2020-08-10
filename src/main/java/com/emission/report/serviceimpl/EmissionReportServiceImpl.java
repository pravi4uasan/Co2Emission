package com.emission.report.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emission.report.entity.CustomerDetails;
import com.emission.report.repositories.EmissionReportRepository;
import com.emission.report.service.EmissionReportService;

@Service
public class EmissionReportServiceImpl implements EmissionReportService{

	@Autowired
	private EmissionReportRepository repo;
	
	@Override
	public void addEmissionData(CustomerDetails req) {
		
		repo.save(req);
		
	}

}
