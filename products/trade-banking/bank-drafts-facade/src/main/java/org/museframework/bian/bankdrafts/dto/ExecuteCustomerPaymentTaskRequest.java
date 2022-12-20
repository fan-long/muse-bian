package org.museframework.bian.bankdrafts.dto;

public class ExecuteCustomerPaymentTaskRequest {
    private String bankdraftsid;

    private String customerpaymenttaskid;

    private org.museframework.bian.bankdrafts.dto.bq.CustomerPaymentTask customerPaymentTask;

    public void setBankdraftsid(String bankdraftsid) {
        this.bankdraftsid = bankdraftsid;
    }

    public String getBankdraftsid() {
        return bankdraftsid;
    }

    public void setCustomerpaymenttaskid(String customerpaymenttaskid) {
        this.customerpaymenttaskid = customerpaymenttaskid;
    }

    public String getCustomerpaymenttaskid() {
        return customerpaymenttaskid;
    }

    public void setCustomerPaymentTask(org.museframework.bian.bankdrafts.dto.bq.CustomerPaymentTask customerPaymentTask) {
        this.customerPaymentTask = customerPaymentTask;
    }

    public org.museframework.bian.bankdrafts.dto.bq.CustomerPaymentTask getCustomerPaymentTask() {
        return customerPaymentTask;
    }
}