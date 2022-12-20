package org.museframework.bian.productcombination.dto;

public class RequestTransferPricingRequest {
    private String productcombinationid;

    private String transferpricingid;

    private org.museframework.bian.productcombination.dto.bq.TransferPricing transferPricing;

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

    public void setTransferPricing(org.museframework.bian.productcombination.dto.bq.TransferPricing transferPricing) {
        this.transferPricing = transferPricing;
    }

    public org.museframework.bian.productcombination.dto.bq.TransferPricing getTransferPricing() {
        return transferPricing;
    }
}