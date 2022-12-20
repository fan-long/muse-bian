package org.museframework.bian.mortgageloan.dto;

public class UpdateFinancialAccountingResponse {
    private org.museframework.bian.mortgageloan.dto.bq.FinancialAccounting financialAccounting;

    public void setFinancialAccounting(org.museframework.bian.mortgageloan.dto.bq.FinancialAccounting financialAccounting) {
        this.financialAccounting = financialAccounting;
    }

    public org.museframework.bian.mortgageloan.dto.bq.FinancialAccounting getFinancialAccounting() {
        return financialAccounting;
    }
}