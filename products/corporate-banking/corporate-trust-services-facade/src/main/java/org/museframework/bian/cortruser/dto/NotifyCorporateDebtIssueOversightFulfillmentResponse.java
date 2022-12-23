package org.museframework.bian.cortruser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifyCorporateDebtIssueOversightFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cortruser.dto.bq.CorporateDebtIssueOversightFulfillment corporateDebtIssueOversightFulfillment;

    public void setCorporateDebtIssueOversightFulfillment(org.museframework.bian.cortruser.dto.bq.CorporateDebtIssueOversightFulfillment corporateDebtIssueOversightFulfillment) {
        this.corporateDebtIssueOversightFulfillment = corporateDebtIssueOversightFulfillment;
    }

    public org.museframework.bian.cortruser.dto.bq.CorporateDebtIssueOversightFulfillment getCorporateDebtIssueOversightFulfillment() {
        return corporateDebtIssueOversightFulfillment;
    }
}