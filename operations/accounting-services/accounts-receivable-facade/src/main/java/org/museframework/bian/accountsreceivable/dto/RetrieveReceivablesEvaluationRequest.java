package org.museframework.bian.accountsreceivable.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveReceivablesEvaluationRequest {
    @MetaField
    private String accountsreceivableid;

    @MetaField
    private String receivablesevaluationid;

    public void setAccountsreceivableid(String accountsreceivableid) {
        this.accountsreceivableid = accountsreceivableid;
    }

    public String getAccountsreceivableid() {
        return accountsreceivableid;
    }

    public void setReceivablesevaluationid(String receivablesevaluationid) {
        this.receivablesevaluationid = receivablesevaluationid;
    }

    public String getReceivablesevaluationid() {
        return receivablesevaluationid;
    }
}