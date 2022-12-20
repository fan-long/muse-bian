/*Authentication of card payment instruction or transaction.


Once the transaction has been initiated, the card and cardholder need to be authenticated. Authentication of the card usually involves reading the magnetic strip or chip, or checking the CVC/CVV2 (a three-digit code printed without relief on the back of the card, data which is not included in the magnetic strip) for card-not-present transactions. The cardholders identity is usually authenticated using a PIN code or a signature. (Payment System ECB)*/
package org.museframework.bian.classes;

public class CardPaymentAuthentication {
    /*Cardholder for which an authentication is provided (ISO20022)*/
    private String cardHolder;

    /*Method used to authenticate a person. (ISO20022)*/
    private String authenticationMethod;

    /*Entity or object in charge of verifying the person authenticity. (ISO20022)*/
    private String authenticationEntity;

    /*Value used to authenticate the owner of the payment card. (ISO20022)*/
    private String authenticationValue;

    /*Encrypted personal identification number (PIN) format.*/
    private String PINFormat;

    /*Personal Identification Number (PIN) for authentication. (ISO20022)*/
    private String PIN;

    /*Specifies the result of the authentication. 
e.g. Denial, NonParticipation,     
UnableToAuthenticate, WithCryptogram, WithoutCryptogram, ...*/
    private String authenticationResult;

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setAuthenticationMethod(String authenticationMethod) {
        this.authenticationMethod = authenticationMethod;
    }

    public String getAuthenticationMethod() {
        return authenticationMethod;
    }

    public void setAuthenticationEntity(String authenticationEntity) {
        this.authenticationEntity = authenticationEntity;
    }

    public String getAuthenticationEntity() {
        return authenticationEntity;
    }

    public void setAuthenticationValue(String authenticationValue) {
        this.authenticationValue = authenticationValue;
    }

    public String getAuthenticationValue() {
        return authenticationValue;
    }

    public void setPINFormat(String PINFormat) {
        this.PINFormat = PINFormat;
    }

    public String getPINFormat() {
        return PINFormat;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }

    public String getPIN() {
        return PIN;
    }

    public void setAuthenticationResult(String authenticationResult) {
        this.authenticationResult = authenticationResult;
    }

    public String getAuthenticationResult() {
        return authenticationResult;
    }
}