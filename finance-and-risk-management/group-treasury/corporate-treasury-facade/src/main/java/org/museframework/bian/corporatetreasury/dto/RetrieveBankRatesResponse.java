package org.museframework.bian.corporatetreasury.dto;

public class RetrieveBankRatesResponse {
    private org.museframework.bian.corporatetreasury.dto.bq.BankRates bankRates;

    public void setBankRates(org.museframework.bian.corporatetreasury.dto.bq.BankRates bankRates) {
        this.bankRates = bankRates;
    }

    public org.museframework.bian.corporatetreasury.dto.bq.BankRates getBankRates() {
        return bankRates;
    }
}