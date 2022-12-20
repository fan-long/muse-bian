package org.museframework.bian.chaactana.dto;

public class ExecuteMerchantBehaviorResponse {
    private org.museframework.bian.chaactana.dto.bq.MerchantBehavior merchantBehavior;

    public void setMerchantBehavior(org.museframework.bian.chaactana.dto.bq.MerchantBehavior merchantBehavior) {
        this.merchantBehavior = merchantBehavior;
    }

    public org.museframework.bian.chaactana.dto.bq.MerchantBehavior getMerchantBehavior() {
        return merchantBehavior;
    }
}