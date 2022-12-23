package org.museframework.bian.publicoffering.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrievePublicPlacementFinancialAssessmentandAuditFulfillmentRequest {
    @MetaField
    private String publicofferingid;

    @MetaField
    private String publicplacementfinancialassessmentandauditfulfillmentid;

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
}