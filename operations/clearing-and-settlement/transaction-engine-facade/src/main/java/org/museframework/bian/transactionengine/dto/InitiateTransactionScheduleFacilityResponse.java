package org.museframework.bian.transactionengine.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateTransactionScheduleFacilityResponse {
    @MetaField(ref=true)
    private org.museframework.bian.transactionengine.dto.cr.TransactionScheduleFacility transactionScheduleFacility;

    public void setTransactionScheduleFacility(org.museframework.bian.transactionengine.dto.cr.TransactionScheduleFacility transactionScheduleFacility) {
        this.transactionScheduleFacility = transactionScheduleFacility;
    }

    public org.museframework.bian.transactionengine.dto.cr.TransactionScheduleFacility getTransactionScheduleFacility() {
        return transactionScheduleFacility;
    }
}