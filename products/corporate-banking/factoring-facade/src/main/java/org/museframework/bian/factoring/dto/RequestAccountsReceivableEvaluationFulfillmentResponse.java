package org.museframework.bian.factoring.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestAccountsReceivableEvaluationFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.factoring.dto.bq.AccountsReceivableEvaluationFulfillment accountsReceivableEvaluationFulfillment;

    public void setAccountsReceivableEvaluationFulfillment(org.museframework.bian.factoring.dto.bq.AccountsReceivableEvaluationFulfillment accountsReceivableEvaluationFulfillment) {
        this.accountsReceivableEvaluationFulfillment = accountsReceivableEvaluationFulfillment;
    }

    public org.museframework.bian.factoring.dto.bq.AccountsReceivableEvaluationFulfillment getAccountsReceivableEvaluationFulfillment() {
        return accountsReceivableEvaluationFulfillment;
    }
}