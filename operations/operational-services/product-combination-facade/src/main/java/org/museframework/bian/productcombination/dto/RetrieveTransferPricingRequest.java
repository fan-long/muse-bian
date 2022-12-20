package org.museframework.bian.productcombination.dto;

public class RetrieveTransferPricingRequest {
    private String productcombinationid;

    private String transferpricingid;

    public void setProductcombinationid(String productcombinationid) {
        this.productcombinationid = productcombinationid;
    }

    public String getProductcombinationid() {
        return productcombinationid;
    }

    public void setTransferpricingid(String transferpricingid) {
        this.transferpricingid = transferpricingid;
    }

    public String getTransferpricingid() {
        return transferpricingid;
    }
}