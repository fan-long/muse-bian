package org.museframework.bian.customerproposition.dto;

public class ExchangeBankDefinedProductandServiceTermRequest {
    private String customerpropositionid;

    private String bankdefinedproductandservicetermid;

    private org.museframework.bian.customerproposition.dto.bq.BankDefinedProductandServiceTerm bankDefinedProductandServiceTerm;

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

    public void setBankDefinedProductandServiceTerm(org.museframework.bian.customerproposition.dto.bq.BankDefinedProductandServiceTerm bankDefinedProductandServiceTerm) {
        this.bankDefinedProductandServiceTerm = bankDefinedProductandServiceTerm;
    }

    public org.museframework.bian.customerproposition.dto.bq.BankDefinedProductandServiceTerm getBankDefinedProductandServiceTerm() {
        return bankDefinedProductandServiceTerm;
    }
}