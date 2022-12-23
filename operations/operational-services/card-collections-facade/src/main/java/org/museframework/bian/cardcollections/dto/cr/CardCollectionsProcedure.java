/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Card Collections. */
package org.museframework.bian.cardcollections.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CardCollectionsProcedure {
    /*Reference to the associated product instance in collections*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productInstanceReference;

    /*The type of product*/
    @MetaField
    private String productandServiceType;

    /*Reference to the account primary party/owner*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*The type of card*/
    @MetaField
    private String cardType;

    /*The status of the account (e.g. active, cancelled, blocked, closed,...)*/
    @MetaField
    private String cardAccountStatus;

    /*Card account limits (e.g. spend limits and credit limits for different access types, e.g. POS/ATM)*/
    @MetaField
    private String cardAccountLimits;

    /*A wide range of processing options and rules that apply, including the applicable delinquency penalties…*/
    @MetaField
    private String configurationOptions;

    /*Reference identifier linking the account to appropriate tax handling*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object taxReference;

    /*Customer billing transactions (and associated payments)*/
    @MetaField
    private String billingTransactions;

    /*Reference to individual transactions*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object billingTransactionReference;

    /*Payments deposited to the account - card account payment transaction history as required*/
    @MetaField
    private String paymentTransactions;

    /*Reference to individual transactions*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object paymentTransactionReference;

    /*Product execution transactions - account card use transaction history as required*/
    @MetaField
    private String productTransactions;

    /*Reference to individual transactions*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productTransactionReference;

    /*Statements issued for the account - statement history as required*/
    @MetaField
    private String statements;

    /*Reference to individual statements*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object statementsReference;

    /*The processing schedule for resolution of the collections process and final decision*/
    @MetaField
    private String cardCollectionsProcessingSchedule;

    public void setProductInstanceReference(org.museframework.bian.classes.Object productInstanceReference) {
        this.productInstanceReference = productInstanceReference;
    }

    public org.museframework.bian.classes.Object getProductInstanceReference() {
        return productInstanceReference;
    }

    public void setProductandServiceType(String productandServiceType) {
        this.productandServiceType = productandServiceType;
    }

    public String getProductandServiceType() {
        return productandServiceType;
    }

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardAccountStatus(String cardAccountStatus) {
        this.cardAccountStatus = cardAccountStatus;
    }

    public String getCardAccountStatus() {
        return cardAccountStatus;
    }

    public void setCardAccountLimits(String cardAccountLimits) {
        this.cardAccountLimits = cardAccountLimits;
    }

    public String getCardAccountLimits() {
        return cardAccountLimits;
    }

    public void setConfigurationOptions(String configurationOptions) {
        this.configurationOptions = configurationOptions;
    }

    public String getConfigurationOptions() {
        return configurationOptions;
    }

    public void setTaxReference(org.museframework.bian.classes.Object taxReference) {
        this.taxReference = taxReference;
    }

    public org.museframework.bian.classes.Object getTaxReference() {
        return taxReference;
    }

    public void setBillingTransactions(String billingTransactions) {
        this.billingTransactions = billingTransactions;
    }

    public String getBillingTransactions() {
        return billingTransactions;
    }

    public void setBillingTransactionReference(org.museframework.bian.classes.Object billingTransactionReference) {
        this.billingTransactionReference = billingTransactionReference;
    }

    public org.museframework.bian.classes.Object getBillingTransactionReference() {
        return billingTransactionReference;
    }

    public void setPaymentTransactions(String paymentTransactions) {
        this.paymentTransactions = paymentTransactions;
    }

    public String getPaymentTransactions() {
        return paymentTransactions;
    }

    public void setPaymentTransactionReference(org.museframework.bian.classes.Object paymentTransactionReference) {
        this.paymentTransactionReference = paymentTransactionReference;
    }

    public org.museframework.bian.classes.Object getPaymentTransactionReference() {
        return paymentTransactionReference;
    }

    public void setProductTransactions(String productTransactions) {
        this.productTransactions = productTransactions;
    }

    public String getProductTransactions() {
        return productTransactions;
    }

    public void setProductTransactionReference(org.museframework.bian.classes.Object productTransactionReference) {
        this.productTransactionReference = productTransactionReference;
    }

    public org.museframework.bian.classes.Object getProductTransactionReference() {
        return productTransactionReference;
    }

    public void setStatements(String statements) {
        this.statements = statements;
    }

    public String getStatements() {
        return statements;
    }

    public void setStatementsReference(org.museframework.bian.classes.Object statementsReference) {
        this.statementsReference = statementsReference;
    }

    public org.museframework.bian.classes.Object getStatementsReference() {
        return statementsReference;
    }

    public void setCardCollectionsProcessingSchedule(String cardCollectionsProcessingSchedule) {
        this.cardCollectionsProcessingSchedule = cardCollectionsProcessingSchedule;
    }

    public String getCardCollectionsProcessingSchedule() {
        return cardCollectionsProcessingSchedule;
    }
}