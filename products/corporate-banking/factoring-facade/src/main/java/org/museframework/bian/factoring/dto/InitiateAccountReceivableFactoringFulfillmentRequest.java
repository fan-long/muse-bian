package org.museframework.bian.factoring.dto;

public class InitiateAccountReceivableFactoringFulfillmentRequest {
    private String factoringid;

    private String accountreceivablefactoringfulfillmentid;

    private org.museframework.bian.factoring.dto.bq.AccountReceivableFactoringFulfillment accountReceivableFactoringFulfillment;

    public void setFactoringid(String factoringid) {
        this.factoringid = factoringid;
    }

    public String getFactoringid() {
        return factoringid;
    }

    public void setAccountreceivablefactoringfulfillmentid(String accountreceivablefactoringfulfillmentid) {
        this.accountreceivablefactoringfulfillmentid = accountreceivablefactoringfulfillmentid;
    }

    public String getAccountreceivablefactoringfulfillmentid() {
        return accountreceivablefactoringfulfillmentid;
    }

    public void setAccountReceivableFactoringFulfillment(org.museframework.bian.factoring.dto.bq.AccountReceivableFactoringFulfillment accountReceivableFactoringFulfillment) {
        this.accountReceivableFactoringFulfillment = accountReceivableFactoringFulfillment;
    }

    public org.museframework.bian.factoring.dto.bq.AccountReceivableFactoringFulfillment getAccountReceivableFactoringFulfillment() {
        return accountReceivableFactoringFulfillment;
    }
}