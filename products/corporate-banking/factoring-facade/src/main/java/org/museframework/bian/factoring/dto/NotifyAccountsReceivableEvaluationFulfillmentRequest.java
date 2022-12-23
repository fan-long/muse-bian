package org.museframework.bian.factoring.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyAccountsReceivableEvaluationFulfillmentRequest {
    @MetaField
    private String factoringid;

    @MetaField
    private String accountsreceivableevaluationfulfillmentid;

    public void setFactoringid(String factoringid) {
        this.factoringid = factoringid;
    }

    public String getFactoringid() {
        return factoringid;
    }

    public void setAccountsreceivableevaluationfulfillmentid(String accountsreceivableevaluationfulfillmentid) {
        this.accountsreceivableevaluationfulfillmentid = accountsreceivableevaluationfulfillmentid;
    }

    public String getAccountsreceivableevaluationfulfillmentid() {
        return accountsreceivableevaluationfulfillmentid;
    }
}