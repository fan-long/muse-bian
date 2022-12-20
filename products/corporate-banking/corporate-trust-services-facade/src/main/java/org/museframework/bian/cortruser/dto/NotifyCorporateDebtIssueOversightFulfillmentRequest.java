package org.museframework.bian.cortruser.dto;

public class NotifyCorporateDebtIssueOversightFulfillmentRequest {
    private String corporatetrustservicesid;

    private String corporatedebtissueoversightfulfillmentid;

    public void setCorporatetrustservicesid(String corporatetrustservicesid) {
        this.corporatetrustservicesid = corporatetrustservicesid;
    }

    public String getCorporatetrustservicesid() {
        return corporatetrustservicesid;
    }

    public void setCorporatedebtissueoversightfulfillmentid(String corporatedebtissueoversightfulfillmentid) {
        this.corporatedebtissueoversightfulfillmentid = corporatedebtissueoversightfulfillmentid;
    }

    public String getCorporatedebtissueoversightfulfillmentid() {
        return corporatedebtissueoversightfulfillmentid;
    }
}