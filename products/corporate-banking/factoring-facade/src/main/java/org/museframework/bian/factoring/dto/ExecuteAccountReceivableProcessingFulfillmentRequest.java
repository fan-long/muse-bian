package org.museframework.bian.factoring.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteAccountReceivableProcessingFulfillmentRequest {
    @MetaField
    private String factoringid;

    @MetaField
    private String accountreceivableprocessingfulfillmentid;

    @MetaField(ref=true)
    private org.museframework.bian.factoring.dto.bq.AccountReceivableProcessingFulfillment accountReceivableProcessingFulfillment;

    public void setFactoringid(String factoringid) {
        this.factoringid = factoringid;
    }

    public String getFactoringid() {
        return factoringid;
    }

    public void setAccountreceivableprocessingfulfillmentid(String accountreceivableprocessingfulfillmentid) {
        this.accountreceivableprocessingfulfillmentid = accountreceivableprocessingfulfillmentid;
    }

    public String getAccountreceivableprocessingfulfillmentid() {
        return accountreceivableprocessingfulfillmentid;
    }

    public void setAccountReceivableProcessingFulfillment(org.museframework.bian.factoring.dto.bq.AccountReceivableProcessingFulfillment accountReceivableProcessingFulfillment) {
        this.accountReceivableProcessingFulfillment = accountReceivableProcessingFulfillment;
    }

    public org.museframework.bian.factoring.dto.bq.AccountReceivableProcessingFulfillment getAccountReceivableProcessingFulfillment() {
        return accountReceivableProcessingFulfillment;
    }
}