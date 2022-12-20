package org.museframework.bian.publicoffering.dto;

public class ExchangePublicPlacementFinancialAssessmentandAuditFulfillmentRequest {
    private String publicofferingid;

    private String publicplacementfinancialassessmentandauditfulfillmentid;

    private org.museframework.bian.publicoffering.dto.bq.PublicPlacementFinancialAssessmentandAuditFulfillment publicPlacementFinancialAssessmentandAuditFulfillment;

    public void setPublicofferingid(String publicofferingid) {
        this.publicofferingid = publicofferingid;
    }

    public String getPublicofferingid() {
        return publicofferingid;
    }

    public void setPublicplacementfinancialassessmentandauditfulfillmentid(String publicplacementfinancialassessmentandauditfulfillmentid) {
        this.publicplacementfinancialassessmentandauditfulfillmentid = publicplacementfinancialassessmentandauditfulfillmentid;
    }

    public String getPublicplacementfinancialassessmentandauditfulfillmentid() {
        return publicplacementfinancialassessmentandauditfulfillmentid;
    }

    public void setPublicPlacementFinancialAssessmentandAuditFulfillment(org.museframework.bian.publicoffering.dto.bq.PublicPlacementFinancialAssessmentandAuditFulfillment publicPlacementFinancialAssessmentandAuditFulfillment) {
        this.publicPlacementFinancialAssessmentandAuditFulfillment = publicPlacementFinancialAssessmentandAuditFulfillment;
    }

    public org.museframework.bian.publicoffering.dto.bq.PublicPlacementFinancialAssessmentandAuditFulfillment getPublicPlacementFinancialAssessmentandAuditFulfillment() {
        return publicPlacementFinancialAssessmentandAuditFulfillment;
    }
}