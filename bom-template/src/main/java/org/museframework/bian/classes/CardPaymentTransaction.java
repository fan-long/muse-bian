/*A payment transaction initiated by a payment card. 

'Card-based payment transaction means a service based on a payment card scheme's infrastructure and business rules to make a payment transaction by means of any card, telecommunication, digital or IT device or software if this results in a debit or a credit card transaction. Card-based payment transactions exclude transactions based on other kinds of payment services. (PSD)*/
package org.museframework.bian.classes;

public class CardPaymentTransaction {
    /*Amount added to the total price of the transaction and received in cash by the customer. (ISO20022)*/
    private String cashBackAmount;

    /*Place where the merchant actually performed the transaction. (ISO20022)*/
    private Location merchantLocation;

    /*Specifies the direction of a payment. (ISO20022)*/
    private String debitCreditDirection;

    /*Identifies the type of the communication channels used by the cardholder to the acceptor system. (ISO20022)*/
    private Channel transactionChannel;

    /*Local date and time of the transaction assigned by the POI (Point Of Interaction). (ISO20022)*/
    private String transactionDateTime;

    /*Indicates the environment of the transaction like Merchant, Private, Public, Branch.*/
    private String transactionEnvironmentType;

    /*Country of the merchant where the transaction took place. (ISO20022)*/
    private Country merchantCountry;

    public void setCashBackAmount(String cashBackAmount) {
        this.cashBackAmount = cashBackAmount;
    }

    public String getCashBackAmount() {
        return cashBackAmount;
    }

    public void setMerchantLocation(Location merchantLocation) {
        this.merchantLocation = merchantLocation;
    }

    public Location getMerchantLocation() {
        return merchantLocation;
    }

    public void setDebitCreditDirection(String debitCreditDirection) {
        this.debitCreditDirection = debitCreditDirection;
    }

    public String getDebitCreditDirection() {
        return debitCreditDirection;
    }

    public void setTransactionChannel(Channel transactionChannel) {
        this.transactionChannel = transactionChannel;
    }

    public Channel getTransactionChannel() {
        return transactionChannel;
    }

    public void setTransactionDateTime(String transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
    }

    public String getTransactionDateTime() {
        return transactionDateTime;
    }

    public void setTransactionEnvironmentType(String transactionEnvironmentType) {
        this.transactionEnvironmentType = transactionEnvironmentType;
    }

    public String getTransactionEnvironmentType() {
        return transactionEnvironmentType;
    }

    public void setMerchantCountry(Country merchantCountry) {
        this.merchantCountry = merchantCountry;
    }

    public Country getMerchantCountry() {
        return merchantCountry;
    }
}