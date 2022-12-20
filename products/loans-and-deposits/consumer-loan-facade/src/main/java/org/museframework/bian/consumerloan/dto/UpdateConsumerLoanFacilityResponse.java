package org.museframework.bian.consumerloan.dto;

public class UpdateConsumerLoanFacilityResponse {
    private org.museframework.bian.consumerloan.dto.cr.ConsumerLoanFacility consumerLoanFacility;

    public void setConsumerLoanFacility(org.museframework.bian.consumerloan.dto.cr.ConsumerLoanFacility consumerLoanFacility) {
        this.consumerLoanFacility = consumerLoanFacility;
    }

    public org.museframework.bian.consumerloan.dto.cr.ConsumerLoanFacility getConsumerLoanFacility() {
        return consumerLoanFacility;
    }
}