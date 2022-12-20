package org.museframework.bian.cusproandsereli.dto;

public class RetrieveNextBestRequest {
    private String customerproductandserviceeligibilityid;

    private String nextbestid;

    public void setCustomerproductandserviceeligibilityid(String customerproductandserviceeligibilityid) {
        this.customerproductandserviceeligibilityid = customerproductandserviceeligibilityid;
    }

    public String getCustomerproductandserviceeligibilityid() {
        return customerproductandserviceeligibilityid;
    }

    public void setNextbestid(String nextbestid) {
        this.nextbestid = nextbestid;
    }

    public String getNextbestid() {
        return nextbestid;
    }
}