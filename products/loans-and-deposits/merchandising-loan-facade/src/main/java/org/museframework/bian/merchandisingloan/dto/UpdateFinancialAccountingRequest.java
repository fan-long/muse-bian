package org.museframework.bian.merchandisingloan.dto;

public class UpdateFinancialAccountingRequest {
    private String merchandisingloanid;

    private String financialaccountingid;

    private org.museframework.bian.merchandisingloan.dto.bq.FinancialAccounting financialAccounting;

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

    public void setFinancialAccounting(org.museframework.bian.merchandisingloan.dto.bq.FinancialAccounting financialAccounting) {
        this.financialAccounting = financialAccounting;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.FinancialAccounting getFinancialAccounting() {
        return financialAccounting;
    }
}