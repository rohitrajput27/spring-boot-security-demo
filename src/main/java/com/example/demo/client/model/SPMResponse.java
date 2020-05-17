package com.example.demo.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


import java.util.List;

/**
 * SPM response
 * 
 * @author Avanish Awasthi
 * @since 1.0.0
 */
@JsonInclude(Include.NON_NULL)
public class SPMResponse {

	private Account account;

	private String status;

	private String statusCode;
	
    private String responseMessage;
	
    private String responseSource;
	
    private String spmID;
    
    private List<PaymentMethod> paymentMethod;
	
	public List<PaymentMethod> getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(List<PaymentMethod> paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public String getResponseSource() {
		return responseSource;
	}

	public void setResponseSource(String responseSource) {
		this.responseSource = responseSource;
	}

	public String getSpmID() {
		return spmID;
	}

	public void setSpmID(String spmID) {
		this.spmID = spmID;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}



}
