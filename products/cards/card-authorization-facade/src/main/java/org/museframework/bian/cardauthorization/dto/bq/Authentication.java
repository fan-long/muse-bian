/*All kind of verifications 

Examples: Password verification*/
package org.museframework.bian.cardauthorization.dto.bq;

public class Authentication extends org.museframework.bian.classes.Authentication {
    /*The card account number/identification associated with the card transaction - matched to Issuer's card account instance*/
    private org.museframework.bian.classes.Object cardTransactionProductInstanceReference;

    /*The password may be held at the customer or account level*/
    private String cardHolderAccountPassword;

    /*The PIN may be held at device or customer level*/
    private String issuedDevicePIN;

    /*Use if customer details/questions used to verify identity*/
    private org.museframework.bian.classes.Object authenticationSecretQuestionReference;

    /*Question text and expected customer response - given value is compared*/
    private String authenticationSecretQuestionTemplate;

    /*Provided value is compared to expected response*/
    private String authenticationSecretQuestionValue;

    /*The result of the card holder's authentication check*/
    private String authenticationCheckResult;

    public void setCardTransactionProductInstanceReference(org.museframework.bian.classes.Object cardTransactionProductInstanceReference) {
        this.cardTransactionProductInstanceReference = cardTransactionProductInstanceReference;
    }

    public org.museframework.bian.classes.Object getCardTransactionProductInstanceReference() {
        return cardTransactionProductInstanceReference;
    }

    public void setCardHolderAccountPassword(String cardHolderAccountPassword) {
        this.cardHolderAccountPassword = cardHolderAccountPassword;
    }

    public String getCardHolderAccountPassword() {
        return cardHolderAccountPassword;
    }

    public void setIssuedDevicePIN(String issuedDevicePIN) {
        this.issuedDevicePIN = issuedDevicePIN;
    }

    public String getIssuedDevicePIN() {
        return issuedDevicePIN;
    }

    public void setAuthenticationSecretQuestionReference(org.museframework.bian.classes.Object authenticationSecretQuestionReference) {
        this.authenticationSecretQuestionReference = authenticationSecretQuestionReference;
    }

    public org.museframework.bian.classes.Object getAuthenticationSecretQuestionReference() {
        return authenticationSecretQuestionReference;
    }

    public void setAuthenticationSecretQuestionTemplate(String authenticationSecretQuestionTemplate) {
        this.authenticationSecretQuestionTemplate = authenticationSecretQuestionTemplate;
    }

    public String getAuthenticationSecretQuestionTemplate() {
        return authenticationSecretQuestionTemplate;
    }

    public void setAuthenticationSecretQuestionValue(String authenticationSecretQuestionValue) {
        this.authenticationSecretQuestionValue = authenticationSecretQuestionValue;
    }

    public String getAuthenticationSecretQuestionValue() {
        return authenticationSecretQuestionValue;
    }

    public void setAuthenticationCheckResult(String authenticationCheckResult) {
        this.authenticationCheckResult = authenticationCheckResult;
    }

    public String getAuthenticationCheckResult() {
        return authenticationCheckResult;
    }
}