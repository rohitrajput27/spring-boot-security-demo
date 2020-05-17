package com.example.demo.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Represents CHARGE TYPE configuration.
 * 
 * @author Avanish Awasthi
 * @since 1.0.0
 */
@JsonInclude(Include.NON_NULL)
public class PaymentChargeType {
	private String chargeType;
	private String defaultFlag;
	
	@JsonIgnore
	private String chargeId;
	
	private String chargeTypeDescription;
	
	public String getChargeTypeDescription() {
		return chargeTypeDescription;
	}
	public void setChargeTypeDescription(String chargeTypeDescription) {
		this.chargeTypeDescription = chargeTypeDescription;
	}
	public String getChargeId() {
		return chargeId;
	}
	public void setChargeId(String chargeId) {
		this.chargeId = chargeId;
	}
	
	public String getChargeType() {
		return chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public String getDefaultFlag() {
		return defaultFlag;
	}

	public void setDefaultFlag(String defaultFlag) {
		this.defaultFlag = defaultFlag;
	}

	
}
