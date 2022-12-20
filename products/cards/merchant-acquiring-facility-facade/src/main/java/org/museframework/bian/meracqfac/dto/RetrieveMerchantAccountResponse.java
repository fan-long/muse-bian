package org.museframework.bian.meracqfac.dto;

public class RetrieveMerchantAccountResponse {
    private org.museframework.bian.meracqfac.dto.bq.MerchantAccount merchantAccount;

    public void setMerchantAccount(org.museframework.bian.meracqfac.dto.bq.MerchantAccount merchantAccount) {
        this.merchantAccount = merchantAccount;
    }

    public org.museframework.bian.meracqfac.dto.bq.MerchantAccount getMerchantAccount() {
        return merchantAccount;
    }
}