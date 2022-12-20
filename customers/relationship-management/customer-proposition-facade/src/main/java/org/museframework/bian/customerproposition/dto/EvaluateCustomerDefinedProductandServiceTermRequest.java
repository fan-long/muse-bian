package org.museframework.bian.customerproposition.dto;

public class EvaluateCustomerDefinedProductandServiceTermRequest {
    private String customerpropositionid;

    private String customerdefinedproductandservicetermid;

    private org.museframework.bian.customerproposition.dto.bq.CustomerDefinedProductandServiceTerm customerDefinedProductandServiceTerm;

    public void setCustomerpropositionid(String customerpropositionid) {
        this.customerpropositionid = customerpropositionid;
    }

    public String getCustomerpropositionid() {
        return customerpropositionid;
    }

    public void setCustomerdefinedproductandservicetermid(String customerdefinedproductandservicetermid) {
        this.customerdefinedproductandservicetermid = customerdefinedproductandservicetermid;
    }

    public String getCustomerdefinedproductandservicetermid() {
        return customerdefinedproductandservicetermid;
    }

    public void setCustomerDefinedProductandServiceTerm(org.museframework.bian.customerproposition.dto.bq.CustomerDefinedProductandServiceTerm customerDefinedProductandServiceTerm) {
        this.customerDefinedProductandServiceTerm = customerDefinedProductandServiceTerm;
    }

    public org.museframework.bian.customerproposition.dto.bq.CustomerDefinedProductandServiceTerm getCustomerDefinedProductandServiceTerm() {
        return customerDefinedProductandServiceTerm;
    }
}