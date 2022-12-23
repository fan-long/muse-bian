package org.museframework.bian.publicoffering.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecutePublicPlacementFinancialAssessmentandAuditFulfillmentRequest {
    @MetaField
    private String publicofferingid;

    @MetaField
    private String publicplacementfinancialassessmentandauditfulfillmentid;

    @MetaField(ref=true)
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