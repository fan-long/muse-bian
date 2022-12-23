package org.museframework.bian.publicoffering.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdatePublicPlacementFinancialAssessmentandAuditFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.publicoffering.dto.bq.PublicPlacementFinancialAssessmentandAuditFulfillment publicPlacementFinancialAssessmentandAuditFulfillment;

    public void setPublicPlacementFinancialAssessmentandAuditFulfillment(org.museframework.bian.publicoffering.dto.bq.PublicPlacementFinancialAssessmentandAuditFulfillment publicPlacementFinancialAssessmentandAuditFulfillment) {
        this.publicPlacementFinancialAssessmentandAuditFulfillment = publicPlacementFinancialAssessmentandAuditFulfillment;
    }

    public org.museframework.bian.publicoffering.dto.bq.PublicPlacementFinancialAssessmentandAuditFulfillment getPublicPlacementFinancialAssessmentandAuditFulfillment() {
        return publicPlacementFinancialAssessmentandAuditFulfillment;
    }
}