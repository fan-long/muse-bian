package org.museframework.bian.customerworkbench.dto;

public class InitiateBrowsingRequest {
    private String customerworkbenchid;

    private String browsingid;

    private org.museframework.bian.customerworkbench.dto.bq.Browsing browsing;

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

    public void setBrowsing(org.museframework.bian.customerworkbench.dto.bq.Browsing browsing) {
        this.browsing = browsing;
    }

    public org.museframework.bian.customerworkbench.dto.bq.Browsing getBrowsing() {
        return browsing;
    }
}