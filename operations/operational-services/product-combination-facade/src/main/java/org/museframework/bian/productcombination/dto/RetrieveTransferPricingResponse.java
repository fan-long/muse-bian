package org.museframework.bian.productcombination.dto;

public class RetrieveTransferPricingResponse {
    private org.museframework.bian.productcombination.dto.bq.TransferPricing transferPricing;

    public void setTransferPricing(org.museframework.bian.productcombination.dto.bq.TransferPricing transferPricing) {
        this.transferPricing = transferPricing;
    }

    public org.museframework.bian.productcombination.dto.bq.TransferPricing getTransferPricing() {
        return transferPricing;
    }
}