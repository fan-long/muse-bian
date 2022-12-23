package org.museframework.bian.factoring.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyAccountReceivableProcessingFulfillmentRequest {
    @MetaField
    private String factoringid;

    @MetaField
    private String accountreceivableprocessingfulfillmentid;

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
}