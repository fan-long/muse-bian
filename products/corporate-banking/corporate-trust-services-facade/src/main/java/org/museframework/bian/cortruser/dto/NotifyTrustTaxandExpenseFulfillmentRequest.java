package org.museframework.bian.cortruser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyTrustTaxandExpenseFulfillmentRequest {
    @MetaField
    private String corporatetrustservicesid;

    @MetaField
    private String trusttaxandexpensefulfillmentid;

    public void setCorporatetrustservicesid(String corporatetrustservicesid) {
        this.corporatetrustservicesid = corporatetrustservicesid;
    }

    public String getCorporatetrustservicesid() {
        return corporatetrustservicesid;
    }

    public void setTrusttaxandexpensefulfillmentid(String trusttaxandexpensefulfillmentid) {
        this.trusttaxandexpensefulfillmentid = trusttaxandexpensefulfillmentid;
    }

    public String getTrusttaxandexpensefulfillmentid() {
        return trusttaxandexpensefulfillmentid;
    }
}