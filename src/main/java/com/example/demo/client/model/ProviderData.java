package com.example.demo.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Represents PROVIDER DATA configuration.
 * 
 * @author Avanish Awasthi
 * @since 1.0.0
 */
@JsonInclude(Include.NON_NULL)
public class ProviderData {	

	private String attributeName;
	private String attributeValue;
	private String attributeCreatedDate;
	private String attributeCreatedBy;
	
	public String getAttributeCreatedDate() {
		return attributeCreatedDate;
	}

	public void setAttributeCreatedDate(String attributeCreatedDate) {
		this.attributeCreatedDate = attributeCreatedDate;
	}

	public String getAttributeCreatedBy() {
		return attributeCreatedBy;
	}

	public void setAttributeCreatedBy(String attributeCreatedBy) {
		this.attributeCreatedBy = attributeCreatedBy;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getAttributeValue() {
		return attributeValue;
	}

	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}

}
