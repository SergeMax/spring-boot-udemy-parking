package com.formation.parking.dao.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseParkingApiEntity {

	
	public List<RecordEntity> records ;
	
	
	public List<RecordEntity> getRecords() {
		return records;
	}

	public void setRecords(List<RecordEntity> records) {
		this.records = records;
	}
	
}
