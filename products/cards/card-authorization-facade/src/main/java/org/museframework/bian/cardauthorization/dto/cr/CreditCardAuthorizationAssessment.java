/*To test or assess an entity, possibly against some formal qualification or certification requirement within Card Authorization. */
package org.museframework.bian.cardauthorization.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CreditCardAuthorizationAssessment {
    /*Reference to the network the authentication is processed through*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object networkReference;

    /*Reference to the Acquiring bank requesting authorization*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object participantAcquirerBankReference;

    /*Reference to the Issuing bank providing authorization*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object participantIssuerBankReference;

    /*The card transaction submitted for authorization by the merchant*/
    @MetaField
    private String cardTransactionRecord;

    /*The account number associated with the card transaction*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object cardTransactionProductInstanceReference;

    /*The identity of the account holder submitting the transaction*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object cardHolderReference;

    /*Reference to the issued device submitted to authorize the transaction (e.g. card number)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object cardTransactionIssuedDeviceReference;

    /*Reference to the network the card transaction is handled by as recorded with the transaction*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object cardTransactionNetworkReference;

    /*Refers to the card holder's issuing bank as recorded with the transaction*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object cardTransactionIssuingBankReference;

    /*Refers to the merchant's acquiring bank as recorded with the transaction*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object cardTransactionMerchantAcquiringBankReference;

    /*The type of transaction (purchase, cash advance, etc.)*/
    @MetaField
    private String cardTransactionType;

    /*The currency that the transaction is made in*/
    @MetaField
    private String cardTransactionCurrency;

    /*Type of amount (e.g. original amount, billing currency amount, conversion rate, FX Mark-up)*/
    @MetaField
    private String cardTransactionAmountType;

    /*The amount corresponding to the type*/
    @MetaField
    private String cardTransactionAmount;

    /*Refers to the merchant initiating settlement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object cardTransactionMerchantReference;

    /*Refers to the point of sale location*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object cardTransactionLocationReference;

    /*Details of the transaction (e.g. purchased service/product, purpose)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object cardTransactionProductandServiceReference;

    /*Significant dates and times associated with the transaction*/
    @MetaField
    private String cardTransactionDateTime;

    /*The applied currency conversion charge*/
    @MetaField
    private String cardTransactionFXConversionCharge;

    /*The applied intercharge fee*/
    @MetaField
    private String cardTransactionInterchargeFee;

    /*Details the reference, amount, timestamp of the transaction authorization*/
    @MetaField
    private String cardTransactionAuthorizationRecord;

    public void setNetworkReference(org.museframework.bian.classes.Object networkReference) {
        this.networkReference = networkReference;
    }

    public org.museframework.bian.classes.Object getNetworkReference() {
        return networkReference;
    }

    public void setParticipantAcquirerBankReference(org.museframework.bian.classes.Object participantAcquirerBankReference) {
        this.participantAcquirerBankReference = participantAcquirerBankReference;
    }

    public org.museframework.bian.classes.Object getParticipantAcquirerBankReference() {
        return participantAcquirerBankReference;
    }

    public void setParticipantIssuerBankReference(org.museframework.bian.classes.Object participantIssuerBankReference) {
        this.participantIssuerBankReference = participantIssuerBankReference;
    }

    public org.museframework.bian.classes.Object getParticipantIssuerBankReference() {
        return participantIssuerBankReference;
    }

    public void setCardTransactionRecord(String cardTransactionRecord) {
        this.cardTransactionRecord = cardTransactionRecord;
    }

    public String getCardTransactionRecord() {
        return cardTransactionRecord;
    }

    public void setCardTransactionProductInstanceReference(org.museframework.bian.classes.Object cardTransactionProductInstanceReference) {
        this.cardTransactionProductInstanceReference = cardTransactionProductInstanceReference;
    }

    public org.museframework.bian.classes.Object getCardTransactionProductInstanceReference() {
        return cardTransactionProductInstanceReference;
    }

    public void setCardHolderReference(org.museframework.bian.classes.Object cardHolderReference) {
        this.cardHolderReference = cardHolderReference;
    }

    public org.museframework.bian.classes.Object getCardHolderReference() {
        return cardHolderReference;
    }

    public void setCardTransactionIssuedDeviceReference(org.museframework.bian.classes.Object cardTransactionIssuedDeviceReference) {
        this.cardTransactionIssuedDeviceReference = cardTransactionIssuedDeviceReference;
    }

    public org.museframework.bian.classes.Object getCardTransactionIssuedDeviceReference() {
        return cardTransactionIssuedDeviceReference;
    }

    public void setCardTransactionNetworkReference(org.museframework.bian.classes.Object cardTransactionNetworkReference) {
        this.cardTransactionNetworkReference = cardTransactionNetworkReference;
    }

    public org.museframework.bian.classes.Object getCardTransactionNetworkReference() {
        return cardTransactionNetworkReference;
    }

    public void setCardTransactionIssuingBankReference(org.museframework.bian.classes.Object cardTransactionIssuingBankReference) {
        this.cardTransactionIssuingBankReference = cardTransactionIssuingBankReference;
    }

    public org.museframework.bian.classes.Object getCardTransactionIssuingBankReference() {
        return cardTransactionIssuingBankReference;
    }

    public void setCardTransactionMerchantAcquiringBankReference(org.museframework.bian.classes.Object cardTransactionMerchantAcquiringBankReference) {
        this.cardTransactionMerchantAcquiringBankReference = cardTransactionMerchantAcquiringBankReference;
    }

    public org.museframework.bian.classes.Object getCardTransactionMerchantAcquiringBankReference() {
        return cardTransactionMerchantAcquiringBankReference;
    }

    public void setCardTransactionType(String cardTransactionType) {
        this.cardTransactionType = cardTransactionType;
    }

    public String getCardTransactionType() {
        return cardTransactionType;
    }

    public void setCardTransactionCurrency(String cardTransactionCurrency) {
        this.cardTransactionCurrency = cardTransactionCurrency;
    }

    public String getCardTransactionCurrency() {
        return cardTransactionCurrency;
    }

    public void setCardTransactionAmountType(String cardTransactionAmountType) {
        this.cardTransactionAmountType = cardTransactionAmountType;
    }

    public String getCardTransactionAmountType() {
        return cardTransactionAmountType;
    }

    public void setCardTransactionAmount(String cardTransactionAmount) {
        this.cardTransactionAmount = cardTransactionAmount;
    }

    public String getCardTransactionAmount() {
        return cardTransactionAmount;
    }

    public void setCardTransactionMerchantReference(org.museframework.bian.classes.Object cardTransactionMerchantReference) {
        this.cardTransactionMerchantReference = cardTransactionMerchantReference;
    }

    public org.museframework.bian.classes.Object getCardTransactionMerchantReference() {
        return cardTransactionMerchantReference;
    }

    public void setCardTransactionLocationReference(org.museframework.bian.classes.Object cardTransactionLocationReference) {
        this.cardTransactionLocationReference = cardTransactionLocationReference;
    }

    public org.museframework.bian.classes.Object getCardTransactionLocationReference() {
        return cardTransactionLocationReference;
    }

    public void setCardTransactionProductandServiceReference(org.museframework.bian.classes.Object cardTransactionProductandServiceReference) {
        this.cardTransactionProductandServiceReference = cardTransactionProductandServiceReference;
    }

    public org.museframework.bian.classes.Object getCardTransactionProductandServiceReference() {
        return cardTransactionProductandServiceReference;
    }

    public void setCardTransactionDateTime(String cardTransactionDateTime) {
        this.cardTransactionDateTime = cardTransactionDateTime;
    }

    public String getCardTransactionDateTime() {
        return cardTransactionDateTime;
    }

    public void setCardTransactionFXConversionCharge(String cardTransactionFXConversionCharge) {
        this.cardTransactionFXConversionCharge = cardTransactionFXConversionCharge;
    }

    public String getCardTransactionFXConversionCharge() {
        return cardTransactionFXConversionCharge;
    }

    public void setCardTransactionInterchargeFee(String cardTransactionInterchargeFee) {
        this.cardTransactionInterchargeFee = cardTransactionInterchargeFee;
    }

    public String getCardTransactionInterchargeFee() {
        return cardTransactionInterchargeFee;
    }

    public void setCardTransactionAuthorizationRecord(String cardTransactionAuthorizationRecord) {
        this.cardTransactionAuthorizationRecord = cardTransactionAuthorizationRecord;
    }

    public String getCardTransactionAuthorizationRecord() {
        return cardTransactionAuthorizationRecord;
    }
}