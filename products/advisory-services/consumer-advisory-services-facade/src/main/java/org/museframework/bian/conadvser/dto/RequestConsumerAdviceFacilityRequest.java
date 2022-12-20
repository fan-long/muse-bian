package org.museframework.bian.conadvser.dto;

public class RequestConsumerAdviceFacilityRequest {
    private String consumeradvisoryservicesid;

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