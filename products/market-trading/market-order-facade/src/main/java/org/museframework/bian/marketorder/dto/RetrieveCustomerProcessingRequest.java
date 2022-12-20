package org.museframework.bian.marketorder.dto;

public class RetrieveCustomerProcessingRequest {
    private String marketorderid;

    private String customerprocessingid;

    public void setMarketorderid(String marketorderid) {
        this.marketorderid = marketorderid;
    }

    public String getMarketorderid() {
        return marketorderid;
    }

    public void setCustomerprocessingid(String customerprocessingid) {
        this.customerprocessingid = customerprocessingid;
    }

    public String getCustomerprocessingid() {
        return customerprocessingid;
    }
}