package org.museframework.bian.accountsreceivable.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateReceivablesEvaluationRequest {
    @MetaField
    private String accountsreceivableid;

    @MetaField
    private String receivablesevaluationid;

    @MetaField(ref=true)
    private org.museframework.bian.accountsreceivable.dto.bq.ReceivablesEvaluation receivablesEvaluation;

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

    public void setReceivablesEvaluation(org.museframework.bian.accountsreceivable.dto.bq.ReceivablesEvaluation receivablesEvaluation) {
        this.receivablesEvaluation = receivablesEvaluation;
    }

    public org.museframework.bian.accountsreceivable.dto.bq.ReceivablesEvaluation getReceivablesEvaluation() {
        return receivablesEvaluation;
    }
}