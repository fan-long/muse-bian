package org.museframework.bian.letofcre.dto;

public class RetrieveCustomerPaymentTaskRequest {
    private String letterofcreditid;

    private String customerpaymenttaskid;

    public void setLetterofcreditid(String letterofcreditid) {
        this.letterofcreditid = letterofcreditid;
    }

    public String getLetterofcreditid() {
        return letterofcreditid;
    }

    public void setCustomerpaymenttaskid(String customerpaymenttaskid) {
        this.customerpaymenttaskid = customerpaymenttaskid;
    }

    public String getCustomerpaymenttaskid() {
        return customerpaymenttaskid;
    }
}