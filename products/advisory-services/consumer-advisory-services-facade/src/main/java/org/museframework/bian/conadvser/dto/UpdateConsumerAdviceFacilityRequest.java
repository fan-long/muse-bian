package org.museframework.bian.conadvser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateConsumerAdviceFacilityRequest {
    @MetaField
    private String consumeradvisoryservicesid;

    @MetaField(ref=true)
    private org.museframework.bian.conadvser.dto.cr.ConsumerAdviceFacility consumerAdviceFacility;

    public void setConsumeradvisoryservicesid(String consumeradvisoryservicesid) {
        this.consumeradvisoryservicesid = consumeradvisoryservicesid;
    }

    public String getConsumeradvisoryservicesid() {
        return consumeradvisoryservicesid;
    }

    public void setConsumerAdviceFacility(org.museframework.bian.conadvser.dto.cr.ConsumerAdviceFacility consumerAdviceFacility) {
        this.consumerAdviceFacility = consumerAdviceFacility;
    }

    public org.museframework.bian.conadvser.dto.cr.ConsumerAdviceFacility getConsumerAdviceFacility() {
        return consumerAdviceFacility;
    }
}