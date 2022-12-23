package org.museframework.bian.transactionengine.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveTransactionScheduleFacilityRequest {
    @MetaField
    private String transactionengineid;

    public void setTransactionengineid(String transactionengineid) {
        this.transactionengineid = transactionengineid;
    }

    public String getTransactionengineid() {
        return transactionengineid;
    }
}