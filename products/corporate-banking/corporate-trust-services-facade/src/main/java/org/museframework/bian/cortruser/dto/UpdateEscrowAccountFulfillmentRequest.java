package org.museframework.bian.cortruser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateEscrowAccountFulfillmentRequest {
    @MetaField
    private String corporatetrustservicesid;

    @MetaField
    private String escrowaccountfulfillmentid;

    @MetaField(ref=true)
    private org.museframework.bian.cortruser.dto.bq.EscrowAccountFulfillment escrowAccountFulfillment;

    public void setCorporatetrustservicesid(String corporatetrustservicesid) {
        this.corporatetrustservicesid = corporatetrustservicesid;
    }

    public String getCorporatetrustservicesid() {
        return corporatetrustservicesid;
    }

    public void setEscrowaccountfulfillmentid(String escrowaccountfulfillmentid) {
        this.escrowaccountfulfillmentid = escrowaccountfulfillmentid;
    }

    public String getEscrowaccountfulfillmentid() {
        return escrowaccountfulfillmentid;
    }

    public void setEscrowAccountFulfillment(org.museframework.bian.cortruser.dto.bq.EscrowAccountFulfillment escrowAccountFulfillment) {
        this.escrowAccountFulfillment = escrowAccountFulfillment;
    }

    public org.museframework.bian.cortruser.dto.bq.EscrowAccountFulfillment getEscrowAccountFulfillment() {
        return escrowAccountFulfillment;
    }
}