package org.museframework.bian.salproagr.dto;

public class EvaluateSalesProductAgreementResponse {
    private org.museframework.bian.salproagr.dto.cr.SalesProductAgreement salesProductAgreement;

    public void setSalesProductAgreement(org.museframework.bian.salproagr.dto.cr.SalesProductAgreement salesProductAgreement) {
        this.salesProductAgreement = salesProductAgreement;
    }

    public org.museframework.bian.salproagr.dto.cr.SalesProductAgreement getSalesProductAgreement() {
        return salesProductAgreement;
    }
}