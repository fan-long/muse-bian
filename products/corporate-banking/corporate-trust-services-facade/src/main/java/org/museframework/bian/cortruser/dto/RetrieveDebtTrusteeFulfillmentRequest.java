package org.museframework.bian.cortruser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveDebtTrusteeFulfillmentRequest {
    @MetaField
    private String corporatetrustservicesid;

    @MetaField
    private String debttrusteefulfillmentid;

    public void setCorporatetrustservicesid(String corporatetrustservicesid) {
        this.corporatetrustservicesid = corporatetrustservicesid;
    }

    public String getCorporatetrustservicesid() {
        return corporatetrustservicesid;
    }

    public void setDebttrusteefulfillmentid(String debttrusteefulfillmentid) {
        this.debttrusteefulfillmentid = debttrusteefulfillmentid;
    }

    public String getDebttrusteefulfillmentid() {
        return debttrusteefulfillmentid;
    }
}