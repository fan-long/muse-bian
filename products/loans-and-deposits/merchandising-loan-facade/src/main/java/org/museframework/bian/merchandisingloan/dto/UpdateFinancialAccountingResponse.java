package org.museframework.bian.merchandisingloan.dto;

public class UpdateFinancialAccountingResponse {
    private org.museframework.bian.merchandisingloan.dto.bq.FinancialAccounting financialAccounting;

    public void setFinancialAccounting(org.museframework.bian.merchandisingloan.dto.bq.FinancialAccounting financialAccounting) {
        this.financialAccounting = financialAccounting;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.FinancialAccounting getFinancialAccounting() {
        return financialAccounting;
    }
}