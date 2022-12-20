/*The product features/services available with a financical facility*/
package org.museframework.bian.meracqfac.dto.bq;

public class MerchantAccount extends org.museframework.bian.classes.MerchantAccount {
    /*Reference to the posting transaction against the merchant account*/
    private String merchantAccountPostingTransaction;

    /*Annotation of the reason for the positing (e.g. posting for fees, chargebacks, settlement)*/
    private String merchantAcquiringAccountPostingPurpose;

    /*Posted amount  (probably captured as a credit/debit pair)*/
    private String merchantAcquiringAccountPostingAmount;

    /*The value date for the posting*/
    private String merchantAcquiringAccountPostingValueDate;

    /*Confirmation of the posting action*/
    private String merchantAcquiringAccountPostingResult;

    public void setMerchantAccountPostingTransaction(String merchantAccountPostingTransaction) {
        this.merchantAccountPostingTransaction = merchantAccountPostingTransaction;
    }

    public String getMerchantAccountPostingTransaction() {
        return merchantAccountPostingTransaction;
    }

    public void setMerchantAcquiringAccountPostingPurpose(String merchantAcquiringAccountPostingPurpose) {
        this.merchantAcquiringAccountPostingPurpose = merchantAcquiringAccountPostingPurpose;
    }

    public String getMerchantAcquiringAccountPostingPurpose() {
        return merchantAcquiringAccountPostingPurpose;
    }

    public void setMerchantAcquiringAccountPostingAmount(String merchantAcquiringAccountPostingAmount) {
        this.merchantAcquiringAccountPostingAmount = merchantAcquiringAccountPostingAmount;
    }

    public String getMerchantAcquiringAccountPostingAmount() {
        return merchantAcquiringAccountPostingAmount;
    }

    public void setMerchantAcquiringAccountPostingValueDate(String merchantAcquiringAccountPostingValueDate) {
        this.merchantAcquiringAccountPostingValueDate = merchantAcquiringAccountPostingValueDate;
    }

    public String getMerchantAcquiringAccountPostingValueDate() {
        return merchantAcquiringAccountPostingValueDate;
    }

    public void setMerchantAcquiringAccountPostingResult(String merchantAcquiringAccountPostingResult) {
        this.merchantAcquiringAccountPostingResult = merchantAcquiringAccountPostingResult;
    }

    public String getMerchantAcquiringAccountPostingResult() {
        return merchantAcquiringAccountPostingResult;
    }
}