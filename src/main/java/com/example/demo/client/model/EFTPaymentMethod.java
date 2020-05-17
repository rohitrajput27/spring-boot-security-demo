package com.example.demo.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.List;


@JsonInclude(Include.NON_NULL)
public class EFTPaymentMethod {
	private String generateNewVersionFlag;
	private String paymentMethodType;
	private String paymentMethodName;
	private String visibleFlag;
	private String statementCode;
	private String bankAccountHolderName;
	private String bankAccountNumber;
	private String bankAccountRoutingNumber;
	private String bankAccountType;
	private String zipCode;
	private String providerName;
	
	private InvalidPayment invalidPayment;
	private String version;
	private String bankAccountNumberLast4;
	
	@JsonIgnore
	private int id;
	@JsonIgnore
	private int spmId;
	@JsonIgnore
	private int spmPmId;
	
	private List<ProviderData> providerData;
	private List<PaymentChargeType> paymentChargeType;
	
	public String getBankAccountNumberLast4() {
		return bankAccountNumberLast4;
	}

	public void setBankAccountNumberLast4(String bankAccountNumberLast4) {
		this.bankAccountNumberLast4 = bankAccountNumberLast4;
	}

	public  InvalidPayment getInvalidPayment() {
		return invalidPayment;
	}

	public void setInvalidPayment( InvalidPayment invalidPayment) {
		this.invalidPayment = invalidPayment;
	}

	public String getGenerateNewVersionFlag() {
		return generateNewVersionFlag;
	}

	public void setGenerateNewVersionFlag(String generateNewVersionFlag) {
		this.generateNewVersionFlag = generateNewVersionFlag;
	}

	public List< ProviderData> getProviderData() {
		return providerData;
	}

	public void setProviderData(List< ProviderData> providerData) {
		this.providerData = providerData;
	}

	public List< PaymentChargeType> getPaymentChargeType() {
		return paymentChargeType;
	}

	public void setPaymentChargeType(List< PaymentChargeType> paymentChargeType) {
		this.paymentChargeType = paymentChargeType;
	}
	
	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public String getBankAccountHolderName() {
		return bankAccountHolderName;
	}

	public void setBankAccountHolderName(String bankAccountHolderName) {
		this.bankAccountHolderName = bankAccountHolderName;
	}

	public String getBankAccountRoutingNumber() {
		return bankAccountRoutingNumber;
	}

	public void setBankAccountRoutingNumber(String bankAccountRoutingNumber) {
		this.bankAccountRoutingNumber = bankAccountRoutingNumber;
	}

	public String getBankAccountType() {
		return bankAccountType;
	}

	public void setBankAccountType(String bankAccountType) {
		this.bankAccountType = bankAccountType;
	}

	public String getPaymentMethodType() {
		return paymentMethodType;
	}

	public void setPaymentMethodType(String paymentMethodType) {
		this.paymentMethodType = paymentMethodType;
	}

	public String getPaymentMethodName() {
		return paymentMethodName;
	}

	public void setPaymentMethodName(String paymentMethodName) {
		this.paymentMethodName = paymentMethodName;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public String getStatementCode() {
		return statementCode;
	}

	public void setStatementCode(String statementCode) {
		this.statementCode = statementCode;
	}

	public String getVisibleFlag() {
		return visibleFlag;
	}

	public void setVisibleFlag(String visibleFlag) {
		this.visibleFlag = visibleFlag;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public int getSpmId() {
		return spmId;
	}
	public void setSpmId(int spmId) {
		this.spmId = spmId;
	}
	public int getSpmPmId() {
		return spmPmId;
	}
	public void setSpmPmId(int spmPmId) {
		this.spmPmId = spmPmId;
	}
	

}
