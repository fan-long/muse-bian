package org.museframework.bian.customerproposition.dto;

public class NotifyCustomerDefinedProductandServiceTermRequest {
    private String customerpropositionid;

    private String customerdefinedproductandservicetermid;

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
}