package org.museframework.bian.traconmat.dto;

public class RetrieveTransactionConfirmationAffirmationFunctionRequest {
    private String tradeconfirmationmatchingid;

    private String transactionconfirmationaffirmationfunctionid;

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
}