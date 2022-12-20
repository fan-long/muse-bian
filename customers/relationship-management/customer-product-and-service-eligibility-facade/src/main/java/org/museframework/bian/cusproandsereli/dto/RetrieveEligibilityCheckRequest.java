package org.museframework.bian.cusproandsereli.dto;

public class RetrieveEligibilityCheckRequest {
    private String customerproductandserviceeligibilityid;

    private String eligibilitycheckid;

    public void setCustomerproductandserviceeligibilityid(String customerproductandserviceeligibilityid) {
        this.customerproductandserviceeligibilityid = customerproductandserviceeligibilityid;
    }

    public String getCustomerproductandserviceeligibilityid() {
        return customerproductandserviceeligibilityid;
    }

    public void setEligibilitycheckid(String eligibilitycheckid) {
        this.eligibilitycheckid = eligibilitycheckid;
    }

    public String getEligibilitycheckid() {
        return eligibilitycheckid;
    }
}