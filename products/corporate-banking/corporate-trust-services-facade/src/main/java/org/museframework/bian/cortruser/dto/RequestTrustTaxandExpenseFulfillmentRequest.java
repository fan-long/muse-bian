package org.museframework.bian.cortruser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestTrustTaxandExpenseFulfillmentRequest {
    @MetaField
    private String corporatetrustservicesid;

    @MetaField
    private String trusttaxandexpensefulfillmentid;

    @MetaField(ref=true)
    private org.museframework.bian.cortruser.dto.bq.TrustTaxandExpenseFulfillment trustTaxandExpenseFulfillment;

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

    public void setTrustTaxandExpenseFulfillment(org.museframework.bian.cortruser.dto.bq.TrustTaxandExpenseFulfillment trustTaxandExpenseFulfillment) {
        this.trustTaxandExpenseFulfillment = trustTaxandExpenseFulfillment;
    }

    public org.museframework.bian.cortruser.dto.bq.TrustTaxandExpenseFulfillment getTrustTaxandExpenseFulfillment() {
        return trustTaxandExpenseFulfillment;
    }
}