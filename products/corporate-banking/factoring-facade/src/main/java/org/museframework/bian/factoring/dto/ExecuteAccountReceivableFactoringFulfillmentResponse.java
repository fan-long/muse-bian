package org.museframework.bian.factoring.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteAccountReceivableFactoringFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.factoring.dto.bq.AccountReceivableFactoringFulfillment accountReceivableFactoringFulfillment;

    public void setAccountReceivableFactoringFulfillment(org.museframework.bian.factoring.dto.bq.AccountReceivableFactoringFulfillment accountReceivableFactoringFulfillment) {
        this.accountReceivableFactoringFulfillment = accountReceivableFactoringFulfillment;
    }

    public org.museframework.bian.factoring.dto.bq.AccountReceivableFactoringFulfillment getAccountReceivableFactoringFulfillment() {
        return accountReceivableFactoringFulfillment;
    }
}