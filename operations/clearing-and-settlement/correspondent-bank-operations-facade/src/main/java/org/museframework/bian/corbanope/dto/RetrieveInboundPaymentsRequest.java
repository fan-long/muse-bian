package org.museframework.bian.corbanope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveInboundPaymentsRequest {
    @MetaField
    private String correspondentbankoperationsid;

    @MetaField
    private String inboundpaymentsid;

    public void setCorrespondentbankoperationsid(String correspondentbankoperationsid) {
        this.correspondentbankoperationsid = correspondentbankoperationsid;
    }

    public String getCorrespondentbankoperationsid() {
        return correspondentbankoperationsid;
    }

    public void setInboundpaymentsid(String inboundpaymentsid) {
        this.inboundpaymentsid = inboundpaymentsid;
    }

    public String getInboundpaymentsid() {
        return inboundpaymentsid;
    }
}