package org.museframework.bian.conadvser.dto;

public class InitiateConsumerAdviceFacilityRequest {
    private org.museframework.bian.conadvser.dto.cr.ConsumerAdviceFacility consumerAdviceFacility;

    public void setConsumerAdviceFacility(org.museframework.bian.conadvser.dto.cr.ConsumerAdviceFacility consumerAdviceFacility) {
        this.consumerAdviceFacility = consumerAdviceFacility;
    }

    public org.museframework.bian.conadvser.dto.cr.ConsumerAdviceFacility getConsumerAdviceFacility() {
        return consumerAdviceFacility;
    }
}