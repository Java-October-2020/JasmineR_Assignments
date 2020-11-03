package com.jasmine.driverslicense.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jasmine.driverslicense.models.License;

public interface LicenseRepository extends CrudRepository<License, Long>{
	public List<License> findAll();
	public License findTopByOrderByNumberDesc();
}