package org.museframework.bian.corbanope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveOutboundPaymentsRequest {
    @MetaField
    private String correspondentbankoperationsid;

    @MetaField
    private String outboundpaymentsid;

    public void setCorrespondentbankoperationsid(String correspondentbankoperationsid) {
        this.correspondentbankoperationsid = correspondentbankoperationsid;
    }

    public String getCorrespondentbankoperationsid() {
        return correspondentbankoperationsid;
    }

    public void setOutboundpaymentsid(String outboundpaymentsid) {
        this.outboundpaymentsid = outboundpaymentsid;
    }

    public String getOutboundpaymentsid() {
        return outboundpaymentsid;
    }
}