package org.museframework.bian.mortgageloan.dto;

public class RetrieveFinancialAccountingRequest {
    private String mortgageloanid;

    private String financialaccountingid;

    public void setMortgageloanid(String mortgageloanid) {
        this.mortgageloanid = mortgageloanid;
    }

    public String getMortgageloanid() {
        return mortgageloanid;
    }

    public void setFinancialaccountingid(String financialaccountingid) {
        this.financialaccountingid = financialaccountingid;
    }

    public String getFinancialaccountingid() {
        return financialaccountingid;
    }
}