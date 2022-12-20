package org.museframework.bian.spepricon.dto;

public class RetrievePricingTermsResponse {
    private org.museframework.bian.spepricon.dto.bq.PricingTerms pricingTerms;

    public void setPricingTerms(org.museframework.bian.spepricon.dto.bq.PricingTerms pricingTerms) {
        this.pricingTerms = pricingTerms;
    }

    public org.museframework.bian.spepricon.dto.bq.PricingTerms getPricingTerms() {
        return pricingTerms;
    }
}