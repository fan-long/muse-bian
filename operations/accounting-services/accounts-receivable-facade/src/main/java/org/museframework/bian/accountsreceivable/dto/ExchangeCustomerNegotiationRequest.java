package org.museframework.bian.accountsreceivable.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeCustomerNegotiationRequest {
    @MetaField
    private String accountsreceivableid;

    @MetaField
    private String customernegotiationid;

    @MetaField(ref=true)
    private org.museframework.bian.accountsreceivable.dto.bq.CustomerNegotiation customerNegotiation;

    public void setAccountsreceivableid(String accountsreceivableid) {
        this.accountsreceivableid = accountsreceivableid;
    }

    public String getAccountsreceivableid() {
        return accountsreceivableid;
    }

    public void setCustomernegotiationid(String customernegotiationid) {
        this.customernegotiationid = customernegotiationid;
    }

    public String getCustomernegotiationid() {
        return customernegotiationid;
    }

    public void setCustomerNegotiation(org.museframework.bian.accountsreceivable.dto.bq.CustomerNegotiation customerNegotiation) {
        this.customerNegotiation = customerNegotiation;
    }

    public org.museframework.bian.accountsreceivable.dto.bq.CustomerNegotiation getCustomerNegotiation() {
        return customerNegotiation;
    }
}