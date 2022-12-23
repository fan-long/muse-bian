package org.museframework.bian.cortruser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateDebtTrusteeFulfillmentRequest {
    @MetaField
    private String corporatetrustservicesid;

    @MetaField
    private String debttrusteefulfillmentid;

    @MetaField(ref=true)
    private org.museframework.bian.cortruser.dto.bq.DebtTrusteeFulfillment debtTrusteeFulfillment;

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

    public void setDebtTrusteeFulfillment(org.museframework.bian.cortruser.dto.bq.DebtTrusteeFulfillment debtTrusteeFulfillment) {
        this.debtTrusteeFulfillment = debtTrusteeFulfillment;
    }

    public org.museframework.bian.cortruser.dto.bq.DebtTrusteeFulfillment getDebtTrusteeFulfillment() {
        return debtTrusteeFulfillment;
    }
}