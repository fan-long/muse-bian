package org.museframework.bian.bankguarantee.dto;

public class RetrieveBankGuaranteeTransactionRequest {
    private String bankguaranteeid;

    public void setBankguaranteeid(String bankguaranteeid) {
        this.bankguaranteeid = bankguaranteeid;
    }

    public String getBankguaranteeid() {
        return bankguaranteeid;
    }
}