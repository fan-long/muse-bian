/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Card Case. */
package org.museframework.bian.cardcase.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.CardCaseProcedure
@MetaDto
public class CardCaseProcedure {
    /*The type of card dispute including any supporting narrative (e.g. disputed charges, merchant fraud)*/
    @MetaField(0)
    private String cardCaseType;

    /*Reference to a specific product instance associated with the card case*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productInstanceReference;

    /*The customer raising the card case*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*Reference to the complete contact record assembled during the contact where the card case was raised if appropriate*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerContactRecordReference;

    /*The physical address or electronic venue the card case was initiated*/
    @MetaField(0)
    private String caseLocation;

    /*The date and time the case was initiated*/
    @MetaField(0)
    private String date;

    /*The business unit where the customer case was reported*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*Reference to one or more card transactions associated with the case*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object cardTransactionReference;

    /*The card transaction for the customer case (can be multiple transactions)*/
    @MetaField(0)
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
    @MetaField(0)
    private String cardTransactionType;

    /*The currency that the transaction is made in*/
    @MetaField(0)
    private String cardTransactionCurrency;

    /*Type of amount (e.g. original amount, billing currency amount, conversion rate, FX Mark-up)*/
    @MetaField(0)
    private String cardTransactionAmountType;

    /*The amount corresponding to the type*/
    @MetaField(0)
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
    @MetaField(0)
    private String cardTransactionDateTime;

    /*The applied currency conversion charge*/
    @MetaField(0)
    private String cardTransactionFXConversionCharge;

    /*The applied intercharge fee*/
    @MetaField(0)
    private String cardTransactionInterchargeFee;

    /*Details the reference, amount, timestamp of the transaction authorization*/
    @MetaField(0)
    private String cardTransactionAuthorizationRecord;

    /*The card case processing schedule including key tasks and dates for resolution (target and actual dates/times )*/
    @MetaField(0)
    private String cardCaseResolutionSchedule;

    public void setCardCaseType(String cardCaseType) {
        this.cardCaseType = cardCaseType;
    }

    public String getCardCaseType() {
        return cardCaseType;
    }

    public void setProductInstanceReference(org.museframework.bian.classes.Object productInstanceReference) {
        this.productInstanceReference = productInstanceReference;
    }

    public org.museframework.bian.classes.Object getProductInstanceReference() {
        return productInstanceReference;
    }

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setCustomerContactRecordReference(org.museframework.bian.classes.Object customerContactRecordReference) {
        this.customerContactRecordReference = customerContactRecordReference;
    }

    public org.museframework.bian.classes.Object getCustomerContactRecordReference() {
        return customerContactRecordReference;
    }

    public void setCaseLocation(String caseLocation) {
        this.caseLocation = caseLocation;
    }

    public String getCaseLocation() {
        return caseLocation;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setCardTransactionReference(org.museframework.bian.classes.Object cardTransactionReference) {
        this.cardTransactionReference = cardTransactionReference;
    }

    public org.museframework.bian.classes.Object getCardTransactionReference() {
        return cardTransactionReference;
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

    public void setCardCaseResolutionSchedule(String cardCaseResolutionSchedule) {
        this.cardCaseResolutionSchedule = cardCaseResolutionSchedule;
    }

    public String getCardCaseResolutionSchedule() {
        return cardCaseResolutionSchedule;
    }
}