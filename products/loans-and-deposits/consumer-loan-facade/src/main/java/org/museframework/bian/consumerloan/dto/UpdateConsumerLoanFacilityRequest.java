package org.museframework.bian.consumerloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateConsumerLoanFacilityRequest {
    @MetaField
    private String consumerloanid;

    @MetaField(ref=true)
    private org.museframework.bian.consumerloan.dto.cr.ConsumerLoanFacility consumerLoanFacility;

    public void setConsumerloanid(String consumerloanid) {
        this.consumerloanid = consumerloanid;
    }

    public String getConsumerloanid() {
        return consumerloanid;
    }

    public void setConsumerLoanFacility(org.museframework.bian.consumerloan.dto.cr.ConsumerLoanFacility consumerLoanFacility) {
        this.consumerLoanFacility = consumerLoanFacility;
    }

    public org.museframework.bian.consumerloan.dto.cr.ConsumerLoanFacility getConsumerLoanFacility() {
        return consumerLoanFacility;
    }
}