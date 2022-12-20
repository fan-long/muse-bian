package org.museframework.bian.mortgageloan.dto;

public class UpdateFinancialAccountingRequest {
    private String mortgageloanid;

    private String financialaccountingid;

    private org.museframework.bian.mortgageloan.dto.bq.FinancialAccounting financialAccounting;

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

    public void setFinancialAccounting(org.museframework.bian.mortgageloan.dto.bq.FinancialAccounting financialAccounting) {
        this.financialAccounting = financialAccounting;
    }

    public org.museframework.bian.mortgageloan.dto.bq.FinancialAccounting getFinancialAccounting() {
        return financialAccounting;
    }
}