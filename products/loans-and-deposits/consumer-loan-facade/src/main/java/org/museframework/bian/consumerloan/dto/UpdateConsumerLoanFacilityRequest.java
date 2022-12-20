package org.museframework.bian.consumerloan.dto;

public class UpdateConsumerLoanFacilityRequest {
    private String consumerloanid;

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