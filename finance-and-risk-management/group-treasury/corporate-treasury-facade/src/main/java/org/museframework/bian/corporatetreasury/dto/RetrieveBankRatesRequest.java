package org.museframework.bian.corporatetreasury.dto;

public class RetrieveBankRatesRequest {
    private String corporatetreasuryid;

    private String bankratesid;

    public void setCorporatetreasuryid(String corporatetreasuryid) {
        this.corporatetreasuryid = corporatetreasuryid;
    }

    public String getCorporatetreasuryid() {
        return corporatetreasuryid;
    }

    public void setBankratesid(String bankratesid) {
        this.bankratesid = bankratesid;
    }

    public String getBankratesid() {
        return bankratesid;
    }
}