package org.museframework.bian.merchandisingloan.dto;

public class RetrieveFinancialAccountingRequest {
    private String merchandisingloanid;

    private String financialaccountingid;

    public void setMerchandisingloanid(String merchandisingloanid) {
        this.merchandisingloanid = merchandisingloanid;
    }

    public String getMerchandisingloanid() {
        return merchandisingloanid;
    }

    public void setFinancialaccountingid(String financialaccountingid) {
        this.financialaccountingid = financialaccountingid;
    }

    public String getFinancialaccountingid() {
        return financialaccountingid;
    }
}