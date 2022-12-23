package org.museframework.bian.virtualaccount.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateDirectDebitRequest {
    @MetaField
    private String virtualaccountid;

    @MetaField
    private String directdebitid;

    @MetaField(ref=true)
    private org.museframework.bian.virtualaccount.dto.bq.DirectDebit directDebit;

    public void setVirtualaccountid(String virtualaccountid) {
        this.virtualaccountid = virtualaccountid;
    }

    public String getVirtualaccountid() {
        return virtualaccountid;
    }

    public void setDirectdebitid(String directdebitid) {
        this.directdebitid = directdebitid;
    }

    public String getDirectdebitid() {
        return directdebitid;
    }

    public void setDirectDebit(org.museframework.bian.virtualaccount.dto.bq.DirectDebit directDebit) {
        this.directDebit = directDebit;
    }

    public org.museframework.bian.virtualaccount.dto.bq.DirectDebit getDirectDebit() {
        return directDebit;
    }
}