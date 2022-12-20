package org.museframework.bian.bankguarantee.dto;

public class InitiateCustomerPaymentTaskRequest {
    private String bankguaranteeid;

    private String customerpaymenttaskid;

    private org.museframework.bian.bankguarantee.dto.bq.CustomerPaymentTask customerPaymentTask;

    public void setBankguaranteeid(String bankguaranteeid) {
        this.bankguaranteeid = bankguaranteeid;
    }

    public String getBankguaranteeid() {
        return bankguaranteeid;
    }

    public void setCustomerpaymenttaskid(String customerpaymenttaskid) {
        this.customerpaymenttaskid = customerpaymenttaskid;
    }

    public String getCustomerpaymenttaskid() {
        return customerpaymenttaskid;
    }

    public void setCustomerPaymentTask(org.museframework.bian.bankguarantee.dto.bq.CustomerPaymentTask customerPaymentTask) {
        this.customerPaymentTask = customerPaymentTask;
    }

    public org.museframework.bian.bankguarantee.dto.bq.CustomerPaymentTask getCustomerPaymentTask() {
        return customerPaymentTask;
    }
}