/*Authorisation of a card payment instruction or transaction.

Once the card and the cardholder have been successfully authenticated,
authorisation is usually requested. However, this stage may be skipped in
some cases (e.g. for transactions below a certain value), at the risk of the card acceptor. The terminal forwards the request for authorisation to the acquirer, to the acquirers processor or to the card scheme. If the acquirer and the issuer are one and the same, such transactions are referred to as on-us transactions and the acquiring bank carries out the authorisation itself. For transactions other than on-us transactions (i.e. where the issuer and the acquirer are not the same), authorisation may be obtained offline or online. In offline authorisations, the request is handled directly by the card acceptors terminal. In most cases, however, the authorisation is online and the request passes from the terminal to
the acquirer. The acquirer may directly authorise or refuse the transaction, but will in most cases pass the transaction to a switching centre. The switching centre transfers the authorisation request and transaction information to the appropriate issuer or the authorisation platform (which may be the card scheme or a third-party service provider). The authorisation process usually includes checking the card details against a list of cards that have been reported as having been lost,
stolen, used fraudulently or counterfeited. Checks on balances and card limits (i.e. daily and monthly limits) are usually also carried out. (Payment System ECB)*/
package org.museframework.bian.classes;

public class CardPaymentAuthorisation {
    /*Outcome of the transaction at the acceptor. (ISO20022)*/
    private String transactionSuccess;

    /*Indicate that the acceptor has forced the transaction in spite of the authorisation result (online or offline), or incident to complete the transaction. (ISO20022)*/
    private String merchantOverride;

    /*Transaction authorisation deadline to complete the related payment. (ISO20022)*/
    private String validityDate;

    /*Response to an authorisation request. (ISO20022)*/
    private String response;

    /*Value assigned by the authorising party. (ISO20022)*/
    private String authorisationCode;

    /*Result of the cardholder verification address checks on the street number and the postal code. (ISO20022)*/
    private String cardholderAddressVerificationResult;

    /*Result of the printed CSC (Card Security Code) validation. (ISO20022)*/
    private String CSCResult;

    /*Result of an e-commerce authentication process. (ISO20022)*/
    private String electronicCommerceAuthenticationResult;

    /*Incident occurring during the transaction. (ISO20022)*/
    private String failureReason;

    /**/
    private String authorisationEntity;

    public void setTransactionSuccess(String transactionSuccess) {
        this.transactionSuccess = transactionSuccess;
    }

    public String getTransactionSuccess() {
        return transactionSuccess;
    }

    public void setMerchantOverride(String merchantOverride) {
        this.merchantOverride = merchantOverride;
    }

    public String getMerchantOverride() {
        return merchantOverride;
    }

    public void setValidityDate(String validityDate) {
        this.validityDate = validityDate;
    }

    public String getValidityDate() {
        return validityDate;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getResponse() {
        return response;
    }

    public void setAuthorisationCode(String authorisationCode) {
        this.authorisationCode = authorisationCode;
    }

    public String getAuthorisationCode() {
        return authorisationCode;
    }

    public void setCardholderAddressVerificationResult(String cardholderAddressVerificationResult) {
        this.cardholderAddressVerificationResult = cardholderAddressVerificationResult;
    }

    public String getCardholderAddressVerificationResult() {
        return cardholderAddressVerificationResult;
    }

    public void setCSCResult(String CSCResult) {
        this.CSCResult = CSCResult;
    }

    public String getCSCResult() {
        return CSCResult;
    }

    public void setElectronicCommerceAuthenticationResult(String electronicCommerceAuthenticationResult) {
        this.electronicCommerceAuthenticationResult = electronicCommerceAuthenticationResult;
    }

    public String getElectronicCommerceAuthenticationResult() {
        return electronicCommerceAuthenticationResult;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    public String getFailureReason() {
        return failureReason;
    }

    public void setAuthorisationEntity(String authorisationEntity) {
        this.authorisationEntity = authorisationEntity;
    }

    public String getAuthorisationEntity() {
        return authorisationEntity;
    }
}