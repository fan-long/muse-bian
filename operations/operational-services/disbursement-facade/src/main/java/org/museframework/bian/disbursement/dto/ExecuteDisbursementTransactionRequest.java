package org.museframework.bian.disbursement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteDisbursementTransactionRequest {
    @MetaField
    private String disbursementid;

    @MetaField(ref=true)
    private org.museframework.bian.disbursement.dto.cr.DisbursementTransaction disbursementTransaction;

    public void setDisbursementid(String disbursementid) {
        this.disbursementid = disbursementid;
    }

    public String getDisbursementid() {
        return disbursementid;
    }

    public void setDisbursementTransaction(org.museframework.bian.disbursement.dto.cr.DisbursementTransaction disbursementTransaction) {
        this.disbursementTransaction = disbursementTransaction;
    }

    public org.museframework.bian.disbursement.dto.cr.DisbursementTransaction getDisbursementTransaction() {
        return disbursementTransaction;
    }
}