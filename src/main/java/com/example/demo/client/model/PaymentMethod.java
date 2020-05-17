package com.example.demo.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.List;

/**
 * Represents SPM service Payment Method.
 * 
 * @author Avanish Awasthi
 * @since 1.0.0
 */
@JsonInclude(Include.NON_NULL)
public class PaymentMethod {
	
	private String spmId;
	@JsonIgnore
	private String pmId;
	
	@JsonIgnore
	private String id;
	private String version;
	private String paymentMethodType;
	private String paymentMethodName;
	private String providerName;
	private String visibleFlag;
	private String statementCode;
	@JsonIgnore
	private String status;
	private InvalidPayment invalidPayment;
	private String createdBy;
	private String modifiedBy;
	private String createdDate;
	private String modifiedDate;
	
	private List<PaymentChargeType> paymentChargeType;
	private List<ProviderData> providerData;
	private List<CardPaymentMethod> cardPaymentMethod;
	private List<EFTPaymentMethod> eftPaymentMethod;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public InvalidPayment getInvalidPayment() {
		return invalidPayment;
	}
	public void setInvalidPayment(InvalidPayment invalidPayment) {
		this.invalidPayment = invalidPayment;
	}
	public List<PaymentChargeType> getPaymentChargeType() {
		return paymentChargeType;
	}
	public void setPaymentChargeType(List<PaymentChargeType> paymentChargeType) {
		this.paymentChargeType = paymentChargeType;
	}
	public List<ProviderData> getProviderData() {
		return providerData;
	}
	public void setProviderData(List<ProviderData> providerData) {
		this.providerData = providerData;
	}
	public List<CardPaymentMethod> getCardPaymentMethod() {
		return cardPaymentMethod;
	}
	public void setCardPaymentMethod(List<CardPaymentMethod> cardPaymentMethod) {
		this.cardPaymentMethod = cardPaymentMethod;
	}
	public List<EFTPaymentMethod> getEftPaymentMethod() {
		return eftPaymentMethod;
	}
	public void setEftPaymentMethod(List<EFTPaymentMethod> eftPaymentMethod) {
		this.eftPaymentMethod = eftPaymentMethod;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getSpmId() {
		return spmId;
	}
	public void setSpmId(String spmId) {
		this.spmId = spmId;
	}
	public String getPmId() {
		return pmId;
	}
	public void setPmId(String pmId) {
		this.pmId = pmId;
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
	public String getVisibleFlag() {
		return visibleFlag;
	}
	public void setVisibleFlag(String visibleFlag) {
		this.visibleFlag = visibleFlag;
	}
	public String getStatementCode() {
		return statementCode;
	}
	public void setStatementCode(String statementCode) {
		this.statementCode = statementCode;
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
	
}
