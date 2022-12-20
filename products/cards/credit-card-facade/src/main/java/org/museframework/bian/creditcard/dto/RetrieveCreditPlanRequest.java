package org.museframework.bian.creditcard.dto;

public class RetrieveCreditPlanRequest {
    private String creditcardid;

    private String creditplanid;

    public void setCreditcardid(String creditcardid) {
        this.creditcardid = creditcardid;
    }

    public String getCreditcardid() {
        return creditcardid;
    }

    public void setCreditplanid(String creditplanid) {
        this.creditplanid = creditplanid;
    }

    public String getCreditplanid() {
        return creditplanid;
    }
}