package com.emission.report.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emission.report.entity.CustomerDetails;

public interface EmissionReportRepository extends JpaRepository<CustomerDetails, Integer> {

}
