package com.formation.parking.dao.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@JsonIgnoreProperties(ignoreUnknown = true)
public class RecordEntity {
	
	//@JsonProperty(value = "fields")
	private FieldsEntity fields;

	public FieldsEntity getFields() {
		return fields;
	}

	public void setFields(FieldsEntity fields) {
		this.fields = fields;
	}

	
	
}
