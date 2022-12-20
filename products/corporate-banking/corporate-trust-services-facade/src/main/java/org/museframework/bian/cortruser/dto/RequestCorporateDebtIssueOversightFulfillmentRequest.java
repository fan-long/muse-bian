package org.museframework.bian.cortruser.dto;

public class RequestCorporateDebtIssueOversightFulfillmentRequest {
    private String corporatetrustservicesid;

    private String corporatedebtissueoversightfulfillmentid;

    private org.museframework.bian.cortruser.dto.bq.CorporateDebtIssueOversightFulfillment corporateDebtIssueOversightFulfillment;

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

    public void setCorporateDebtIssueOversightFulfillment(org.museframework.bian.cortruser.dto.bq.CorporateDebtIssueOversightFulfillment corporateDebtIssueOversightFulfillment) {
        this.corporateDebtIssueOversightFulfillment = corporateDebtIssueOversightFulfillment;
    }

    public org.museframework.bian.cortruser.dto.bq.CorporateDebtIssueOversightFulfillment getCorporateDebtIssueOversightFulfillment() {
        return corporateDebtIssueOversightFulfillment;
    }
}