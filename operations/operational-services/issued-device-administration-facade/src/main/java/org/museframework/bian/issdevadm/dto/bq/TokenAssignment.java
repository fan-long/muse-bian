/**/
package org.museframework.bian.issdevadm.dto.bq;

public class TokenAssignment {
    /**/
    private String tokenIdentificationCode;

    /**/
    private String tokenServiceProviderReference;

    /**/
    private String requestorReference;

    /**/
    private org.museframework.bian.classes.Instruction requestReference;

    /**/
    private String requestReasonDescription;

    /**/
    private org.museframework.bian.classes.Account paymentAccountReference;

    /**/
    private org.museframework.bian.classes.PaymentCard cardReference;

    /*Enumeration: Active, Expired, Cancelled*/
    private String tokenStatus;

    /**/
    private String tokenStatusDate;

    public void setTokenIdentificationCode(String tokenIdentificationCode) {
        this.tokenIdentificationCode = tokenIdentificationCode;
    }

    public String getTokenIdentificationCode() {
        return tokenIdentificationCode;
    }

    public void setTokenServiceProviderReference(String tokenServiceProviderReference) {
        this.tokenServiceProviderReference = tokenServiceProviderReference;
    }

    public String getTokenServiceProviderReference() {
        return tokenServiceProviderReference;
    }

    public void setRequestorReference(String requestorReference) {
        this.requestorReference = requestorReference;
    }

    public String getRequestorReference() {
        return requestorReference;
    }

    public void setRequestReference(org.museframework.bian.classes.Instruction requestReference) {
        this.requestReference = requestReference;
    }

    public org.museframework.bian.classes.Instruction getRequestReference() {
        return requestReference;
    }

    public void setRequestReasonDescription(String requestReasonDescription) {
        this.requestReasonDescription = requestReasonDescription;
    }

    public String getRequestReasonDescription() {
        return requestReasonDescription;
    }

    public void setPaymentAccountReference(org.museframework.bian.classes.Account paymentAccountReference) {
        this.paymentAccountReference = paymentAccountReference;
    }

    public org.museframework.bian.classes.Account getPaymentAccountReference() {
        return paymentAccountReference;
    }

    public void setCardReference(org.museframework.bian.classes.PaymentCard cardReference) {
        this.cardReference = cardReference;
    }

    public org.museframework.bian.classes.PaymentCard getCardReference() {
        return cardReference;
    }

    public void setTokenStatus(String tokenStatus) {
        this.tokenStatus = tokenStatus;
    }

    public String getTokenStatus() {
        return tokenStatus;
    }

    public void setTokenStatusDate(String tokenStatusDate) {
        this.tokenStatusDate = tokenStatusDate;
    }

    public String getTokenStatusDate() {
        return tokenStatusDate;
    }
}