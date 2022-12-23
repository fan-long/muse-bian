package org.museframework.bian.cortruser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveEscrowAccountFulfillmentRequest {
    @MetaField
    private String corporatetrustservicesid;

    @MetaField
    private String escrowaccountfulfillmentid;

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
}