/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.sessiondialogue.dto.bq;

public class Offer {
    /*The selected product/service*/
    private String productandServiceType;

    /*The result of the invoked offer procedure (e.g. abandoned, in process/pending, offer accepted)*/
    private String offerTaskResult;

    public void setProductandServiceType(String productandServiceType) {
        this.productandServiceType = productandServiceType;
    }

    public String getProductandServiceType() {
        return productandServiceType;
    }

    public void setOfferTaskResult(String offerTaskResult) {
        this.offerTaskResult = offerTaskResult;
    }

    public String getOfferTaskResult() {
        return offerTaskResult;
    }
}