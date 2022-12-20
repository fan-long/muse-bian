/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.carecogat.dto.bq;

public class CardTransaction {
    /*Reference to the card product identifier/number*/
    private org.museframework.bian.classes.BankingProduct productInstanceReference;

    /*The card holder as detailed on the plastic*/
    private String customerReference;

    /*As detailed on the plastic/token*/
    private String cardexpirationdate;

    /*As detailed on the plastic/token*/
    private String cardCVV;

    /*Refers to the card holder's issuing bank*/
    private org.museframework.bian.classes.Object cardIssuingBankReference;

    /*Refers to the merchant's acquiring bank*/
    private org.museframework.bian.classes.Object merchantAcquiringBankReference;

    /*The currency that the transaction is made in*/
    private String eCommerceTransactionCurrency;

    /*Type of amount (e.g. original amount, billing currency amount, conversion rate, FX Mark-up)*/
    private String eCommerceTransactionAmountType;

    /*The amount corresponding to the type*/
    private String eCommerceTransactionAmount;

    /*Refers to the merchant initiating the transaction*/
    private org.museframework.bian.classes.Object eCommerceTransactionMerchantReference;

    /*Refers to the point of sale location*/
    private org.museframework.bian.classes.Object eCommerceTransactionLocationReference;

    /*Details of the transaction (e.g. purchased service/product, purpose)*/
    private org.museframework.bian.classes.Object eCommerceTransactionProductandServiceReference;

    /*Significant dates and times associated with the transaction*/
    private String eCommerceTransactionDateTime;

    public void setProductInstanceReference(org.museframework.bian.classes.BankingProduct productInstanceReference) {
        this.productInstanceReference = productInstanceReference;
    }

    public org.museframework.bian.classes.BankingProduct getProductInstanceReference() {
        return productInstanceReference;
    }

    public void setCustomerReference(String customerReference) {
        this.customerReference = customerReference;
    }

    public String getCustomerReference() {
        return customerReference;
    }

    public void setCardexpirationdate(String cardexpirationdate) {
        this.cardexpirationdate = cardexpirationdate;
    }

    public String getCardexpirationdate() {
        return cardexpirationdate;
    }

    public void setCardCVV(String cardCVV) {
        this.cardCVV = cardCVV;
    }

    public String getCardCVV() {
        return cardCVV;
    }

    public void setCardIssuingBankReference(org.museframework.bian.classes.Object cardIssuingBankReference) {
        this.cardIssuingBankReference = cardIssuingBankReference;
    }

    public org.museframework.bian.classes.Object getCardIssuingBankReference() {
        return cardIssuingBankReference;
    }

    public void setMerchantAcquiringBankReference(org.museframework.bian.classes.Object merchantAcquiringBankReference) {
        this.merchantAcquiringBankReference = merchantAcquiringBankReference;
    }

    public org.museframework.bian.classes.Object getMerchantAcquiringBankReference() {
        return merchantAcquiringBankReference;
    }

    public void seteCommerceTransactionCurrency(String eCommerceTransactionCurrency) {
        this.eCommerceTransactionCurrency = eCommerceTransactionCurrency;
    }

    public String geteCommerceTransactionCurrency() {
        return eCommerceTransactionCurrency;
    }

    public void seteCommerceTransactionAmountType(String eCommerceTransactionAmountType) {
        this.eCommerceTransactionAmountType = eCommerceTransactionAmountType;
    }

    public String geteCommerceTransactionAmountType() {
        return eCommerceTransactionAmountType;
    }

    public void seteCommerceTransactionAmount(String eCommerceTransactionAmount) {
        this.eCommerceTransactionAmount = eCommerceTransactionAmount;
    }

    public String geteCommerceTransactionAmount() {
        return eCommerceTransactionAmount;
    }

    public void seteCommerceTransactionMerchantReference(org.museframework.bian.classes.Object eCommerceTransactionMerchantReference) {
        this.eCommerceTransactionMerchantReference = eCommerceTransactionMerchantReference;
    }

    public org.museframework.bian.classes.Object geteCommerceTransactionMerchantReference() {
        return eCommerceTransactionMerchantReference;
    }

    public void seteCommerceTransactionLocationReference(org.museframework.bian.classes.Object eCommerceTransactionLocationReference) {
        this.eCommerceTransactionLocationReference = eCommerceTransactionLocationReference;
    }

    public org.museframework.bian.classes.Object geteCommerceTransactionLocationReference() {
        return eCommerceTransactionLocationReference;
    }

    public void seteCommerceTransactionProductandServiceReference(org.museframework.bian.classes.Object eCommerceTransactionProductandServiceReference) {
        this.eCommerceTransactionProductandServiceReference = eCommerceTransactionProductandServiceReference;
    }

    public org.museframework.bian.classes.Object geteCommerceTransactionProductandServiceReference() {
        return eCommerceTransactionProductandServiceReference;
    }

    public void seteCommerceTransactionDateTime(String eCommerceTransactionDateTime) {
        this.eCommerceTransactionDateTime = eCommerceTransactionDateTime;
    }

    public String geteCommerceTransactionDateTime() {
        return eCommerceTransactionDateTime;
    }
}