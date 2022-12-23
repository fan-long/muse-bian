package org.museframework.bian.transactionengine.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateTransactionScheduleFacilityRequest {
    @MetaField
    private String transactionengineid;

    @MetaField(ref=true)
    private org.museframework.bian.transactionengine.dto.cr.TransactionScheduleFacility transactionScheduleFacility;

    public void setTransactionengineid(String transactionengineid) {
        this.transactionengineid = transactionengineid;
    }

    public String getTransactionengineid() {
        return transactionengineid;
    }

    public void setTransactionScheduleFacility(org.museframework.bian.transactionengine.dto.cr.TransactionScheduleFacility transactionScheduleFacility) {
        this.transactionScheduleFacility = transactionScheduleFacility;
    }

    public org.museframework.bian.transactionengine.dto.cr.TransactionScheduleFacility getTransactionScheduleFacility() {
        return transactionScheduleFacility;
    }
}