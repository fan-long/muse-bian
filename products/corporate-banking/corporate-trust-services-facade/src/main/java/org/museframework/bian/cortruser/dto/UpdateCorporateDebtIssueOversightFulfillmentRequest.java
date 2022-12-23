package org.museframework.bian.cortruser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCorporateDebtIssueOversightFulfillmentRequest {
    @MetaField
    private String corporatetrustservicesid;

    @MetaField
    private String corporatedebtissueoversightfulfillmentid;

    @MetaField(ref=true)
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