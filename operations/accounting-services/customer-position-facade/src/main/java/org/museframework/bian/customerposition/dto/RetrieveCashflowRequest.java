package org.museframework.bian.customerposition.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCashflowRequest {
    @MetaField
    private String customerpositionid;

    @MetaField
    private String cashflowid;

    public void setCustomerpositionid(String customerpositionid) {
        this.customerpositionid = customerpositionid;
    }

    public String getCustomerpositionid() {
        return customerpositionid;
    }

    public void setCashflowid(String cashflowid) {
        this.cashflowid = cashflowid;
    }

    public String getCashflowid() {
        return cashflowid;
    }
}