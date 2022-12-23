package org.museframework.bian.factoring.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeAccountReceivableFactoringFulfillmentRequest {
    @MetaField
    private String factoringid;

    @MetaField
    private String accountreceivablefactoringfulfillmentid;

    @MetaField(ref=true)
    private org.museframework.bian.factoring.dto.bq.AccountReceivableFactoringFulfillment accountReceivableFactoringFulfillment;

    public void setFactoringid(String factoringid) {
        this.factoringid = factoringid;
    }

    public String getFactoringid() {
        return factoringid;
    }

    public void setAccountreceivablefactoringfulfillmentid(String accountreceivablefactoringfulfillmentid) {
        this.accountreceivablefactoringfulfillmentid = accountreceivablefactoringfulfillmentid;
    }

    public String getAccountreceivablefactoringfulfillmentid() {
        return accountreceivablefactoringfulfillmentid;
    }

    public void setAccountReceivableFactoringFulfillment(org.museframework.bian.factoring.dto.bq.AccountReceivableFactoringFulfillment accountReceivableFactoringFulfillment) {
        this.accountReceivableFactoringFulfillment = accountReceivableFactoringFulfillment;
    }

    public org.museframework.bian.factoring.dto.bq.AccountReceivableFactoringFulfillment getAccountReceivableFactoringFulfillment() {
        return accountReceivableFactoringFulfillment;
    }
}