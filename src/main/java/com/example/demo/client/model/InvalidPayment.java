package com.example.demo.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * Represents Invalid Payment configuration.
 * 
 * @author Avanish Awasthi
 * @since 1.0.0
 */
public class InvalidPayment {
	
	@JsonIgnore
	private String id;
	private String invalidFlag;
	private String invalidReasonCode;
	private String invalidReasonDescription;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private String invalidDate;	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getInvalidFlag() {
		return invalidFlag;
	}

	public void setInvalidFlag(String invalidFlag) {
		this.invalidFlag = invalidFlag;
	}

	public String getInvalidReasonCode() {
		return invalidReasonCode;
	}

	public void setInvalidReasonCode(String invalidReasonCode) {
		this.invalidReasonCode = invalidReasonCode;
	}
	
	public String getInvalidReasonDescription() {
		return invalidReasonDescription;
	}

	public void setInvalidReasonDescription(String invalidReasonDescription) {
		this.invalidReasonDescription = invalidReasonDescription;
	}

	public String getInvalidDate() {
		return invalidDate;
	}

	public void setInvalidDate(String invalidDate) {
		this.invalidDate = invalidDate;
	}
	
}
