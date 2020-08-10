package com.emission.report.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emission.report.entity.CustomerDetails;
import com.emission.report.service.EmissionReportService;

@RestController
public class EmissionReportController {

	@Autowired
	private EmissionReportService service;
	
	@PostMapping("/sensorData")
	public void addEmissionData(CustomerDetails req) {
		
		service.addEmissionData(req);
		
	}
	
	
}
