package org.museframework.bian.traconmat.dto;

public class UpdateTransactionConfirmationAffirmationFunctionRequest {
    private String tradeconfirmationmatchingid;

    private String transactionconfirmationaffirmationfunctionid;

    private org.museframework.bian.traconmat.dto.bq.TransactionConfirmationAffirmationFunction transactionConfirmationAffirmationFunction;

    public void setTradeconfirmationmatchingid(String tradeconfirmationmatchingid) {
        this.tradeconfirmationmatchingid = tradeconfirmationmatchingid;
    }

    public String getTradeconfirmationmatchingid() {
        return tradeconfirmationmatchingid;
    }

    public void setTransactionconfirmationaffirmationfunctionid(String transactionconfirmationaffirmationfunctionid) {
        this.transactionconfirmationaffirmationfunctionid = transactionconfirmationaffirmationfunctionid;
    }

    public String getTransactionconfirmationaffirmationfunctionid() {
        return transactionconfirmationaffirmationfunctionid;
    }

    public void setTransactionConfirmationAffirmationFunction(org.museframework.bian.traconmat.dto.bq.TransactionConfirmationAffirmationFunction transactionConfirmationAffirmationFunction) {
        this.transactionConfirmationAffirmationFunction = transactionConfirmationAffirmationFunction;
    }

    public org.museframework.bian.traconmat.dto.bq.TransactionConfirmationAffirmationFunction getTransactionConfirmationAffirmationFunction() {
        return transactionConfirmationAffirmationFunction;
    }
}