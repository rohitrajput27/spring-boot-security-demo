package com.example.demo.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Account {

    private String accountNumber;
    private String divisionId;
    private Long soloAccountId;

    public Account(String accountNumber, String divisionId, Long soloAccountId) {
        this.accountNumber = accountNumber;
        this.divisionId = divisionId;
        this.soloAccountId = soloAccountId;
    }

    public Account() {
        super();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Long getSoloAccountId() {
        return soloAccountId;
    }

    public void setSoloAccountId(Long soloAccountId) {
        this.soloAccountId = soloAccountId;
    }

    public String getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(String divisionId) {
        this.divisionId = divisionId;
    }



}
