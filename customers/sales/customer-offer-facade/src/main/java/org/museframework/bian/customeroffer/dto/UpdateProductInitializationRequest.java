package org.museframework.bian.customeroffer.dto;

public class UpdateProductInitializationRequest {
    private String customerofferid;

    private String productinitializationid;

    private org.museframework.bian.customeroffer.dto.bq.ProductInitialization productInitialization;

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

    public void setProductInitialization(org.museframework.bian.customeroffer.dto.bq.ProductInitialization productInitialization) {
        this.productInitialization = productInitialization;
    }

    public org.museframework.bian.customeroffer.dto.bq.ProductInitialization getProductInitialization() {
        return productInitialization;
    }
}