package org.museframework.bian.cortruser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyCorporateDebtIssueOversightFulfillmentRequest {
    @MetaField
    private String corporatetrustservicesid;

    @MetaField
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