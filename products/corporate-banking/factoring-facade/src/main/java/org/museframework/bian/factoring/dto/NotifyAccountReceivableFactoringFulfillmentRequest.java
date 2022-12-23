package org.museframework.bian.factoring.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyAccountReceivableFactoringFulfillmentRequest {
    @MetaField
    private String factoringid;

    @MetaField
    private String accountreceivablefactoringfulfillmentid;

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
}