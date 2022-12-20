package org.museframework.bian.customerworkbench.dto;

public class RetrieveBrowsingRequest {
    private String customerworkbenchid;

    private String browsingid;

    public void setCustomerworkbenchid(String customerworkbenchid) {
        this.customerworkbenchid = customerworkbenchid;
    }

    public String getCustomerworkbenchid() {
        return customerworkbenchid;
    }

    public void setBrowsingid(String browsingid) {
        this.browsingid = browsingid;
    }

    public String getBrowsingid() {
        return browsingid;
    }
}