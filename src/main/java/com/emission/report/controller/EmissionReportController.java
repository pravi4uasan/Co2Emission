package com.emission.report.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emission.report.entity.CustomerDetails;
import com.emission.report.service.EmissionReportService;

@RestController
public class EmissionReportController {

	@Autowired
	private EmissionReportService service;
	
	@GetMapping(value = "/sensorData1")
	public String Test() {
		return "HelloWorld";
	}
	
	@PostMapping(value="/sensorData" ,produces = MediaType.APPLICATION_JSON_VALUE ,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addEmissionData(@RequestBody CustomerDetails req) {
		
		service.addEmissionData(req);
		
	}
	
	
}
