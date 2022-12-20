package org.museframework.bian.customerproposition.dto;

public class NotifyBankDefinedProductandServiceTermRequest {
    private String customerpropositionid;

    private String bankdefinedproductandservicetermid;

    public void setCustomerpropositionid(String customerpropositionid) {
        this.customerpropositionid = customerpropositionid;
    }

    public String getCustomerpropositionid() {
        return customerpropositionid;
    }

    public void setBankdefinedproductandservicetermid(String bankdefinedproductandservicetermid) {
        this.bankdefinedproductandservicetermid = bankdefinedproductandservicetermid;
    }

    public String getBankdefinedproductandservicetermid() {
        return bankdefinedproductandservicetermid;
    }
}