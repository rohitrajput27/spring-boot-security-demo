package com.example.demo.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.List;

/**
 * Represents SPM service configuration.
 * 
 * @author Avanish Awasthi
 * @since 1.0.0
 */
@JsonInclude(Include.NON_NULL)
public class CardPaymentMethod {
	private String generateNewVersionFlag;
	private String paymentMethodType;
	private String paymentMethodName;
	private String visibleFlag;
	private String statementCode;
	private String cardHolderName;
	private String cardNumberLast4;
	private String cardType;
	private String cardExpirationDate;
	private String zipCode;
	private String cardTokenNumber;
	private String indicatorL2L3DLI;
	private String citTransactionId;
	private String providerName;
	
	@JsonIgnore
	private int spmId;
	
	@JsonIgnore
	private int spmPmId;

	private String version;
	
	
	private InvalidPayment invalidPayment;
	
	
	@JsonIgnore
	private String createdBy;
	
	@JsonIgnore
	private String modifiedBy;
	
	private List<  ProviderData> providerData;
	private List<  PaymentChargeType> paymentChargeType;

	public InvalidPayment getInvalidPayment() {
		return invalidPayment;
	}
	public void setInvalidPayment(InvalidPayment invalidPayment) {
		this.invalidPayment = invalidPayment;
	}
	public String getGenerateNewVersionFlag() {
		return generateNewVersionFlag;
	}
	public void setGenerateNewVersionFlag(String generateNewVersionFlag) {
		this.generateNewVersionFlag = generateNewVersionFlag;
	}
	public String getCardNumberLast4() {
		return cardNumberLast4;
	}
	public void setCardNumberLast4(String cardNumberLast4) {
		this.cardNumberLast4 = cardNumberLast4;
	}
	public String getCardExpirationDate() {
		return cardExpirationDate;
	}
	public void setCardExpirationDate(String cardExpirationDate) {
		this.cardExpirationDate = cardExpirationDate;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCardTokenNumber() {
		return cardTokenNumber;
	}
	public void setCardTokenNumber(String cardTokenNumber) {
		this.cardTokenNumber = cardTokenNumber;
	}
	public String getIndicatorL2L3DLI() {
		return indicatorL2L3DLI;
	}
	public void setIndicatorL2L3DLI(String indicatorL2L3DLI) {
		this.indicatorL2L3DLI = indicatorL2L3DLI;
	}
	public String getCitTransactionId() {
		return citTransactionId;
	}
	public void setCitTransactionId(String citTransactionId) {
		this.citTransactionId = citTransactionId;
	}
	public List<  ProviderData> getProviderData() {
		return providerData;
	}
	public void setProviderData(List<  ProviderData> providerData) {
		this.providerData = providerData;
	}
	public List<  PaymentChargeType> getPaymentChargeType() {
		return paymentChargeType;
	}
	public void setPaymentChargeType(List<  PaymentChargeType> paymentChargeType) {
		this.paymentChargeType = paymentChargeType;
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
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
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
