package org.museframework.bian.corbanope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateInboundPaymentsRequest {
    @MetaField
    private String correspondentbankoperationsid;

    @MetaField
    private String inboundpaymentsid;

    @MetaField(ref=true)
    private org.museframework.bian.corbanope.dto.bq.InboundPayments inboundPayments;

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

    public void setInboundPayments(org.museframework.bian.corbanope.dto.bq.InboundPayments inboundPayments) {
        this.inboundPayments = inboundPayments;
    }

    public org.museframework.bian.corbanope.dto.bq.InboundPayments getInboundPayments() {
        return inboundPayments;
    }
}