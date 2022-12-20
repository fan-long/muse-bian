package org.museframework.bian.customeroffer.dto;

public class RetrieveProductInitializationRequest {
    private String customerofferid;

    private String productinitializationid;

    public void setCustomerofferid(String customerofferid) {
        this.customerofferid = customerofferid;
    }

    public String getCustomerofferid() {
        return customerofferid;
    }

    public void setProductinitializationid(String productinitializationid) {
        this.productinitializationid = productinitializationid;
    }

    public String getProductinitializationid() {
        return productinitializationid;
    }
}