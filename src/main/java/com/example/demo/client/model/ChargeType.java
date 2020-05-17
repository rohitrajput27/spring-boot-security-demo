package com.example.demo.client.model;



/**
 * Represents CHARGE_TYPE configuration.
 * 
 * @author Avanish Awasthi
 * @since 1.0.0
 */
public class ChargeType {
	private String chargeId;
	private String chargeDesc;
	private String chargeCode;	
	
	public String getChargeId() {
		return chargeId;
	}
	public void setChargeId(String chargeId) {
		this.chargeId = chargeId;
	}
	public String getChargeCode() {
		return chargeCode;
	}
	public void setChargeCode(String chargeCode) {
		this.chargeCode = chargeCode;
	}
	
	public String getChargeDesc() {
		return chargeDesc;
	}
	public void setChargeDesc(String chargeDesc) {
		this.chargeDesc = chargeDesc;
	}

	
}
