/*The product features/services available with a financical facility*/
package org.museframework.bian.meracqfac.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.MerchantAccount
@MetaDto
public class MerchantAccount {
    /*Reference to the posting transaction against the merchant account*/
    @MetaField
    private String merchantAccountPostingTransaction;

    /*Annotation of the reason for the positing (e.g. posting for fees, chargebacks, settlement)*/
    @MetaField
    private String merchantAcquiringAccountPostingPurpose;

    /*Posted amount  (probably captured as a credit/debit pair)*/
    @MetaField
    private String merchantAcquiringAccountPostingAmount;

    /*The value date for the posting*/
    @MetaField
    private String merchantAcquiringAccountPostingValueDate;

    /*Confirmation of the posting action*/
    @MetaField
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