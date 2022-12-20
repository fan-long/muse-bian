package org.museframework.bian.custaxhan.dto;

public class InitiateCustomerTaxObligationFacilityRequest {
    private org.museframework.bian.custaxhan.dto.cr.CustomerTaxObligationFacility customerTaxObligationFacility;

    public void setCustomerTaxObligationFacility(org.museframework.bian.custaxhan.dto.cr.CustomerTaxObligationFacility customerTaxObligationFacility) {
        this.customerTaxObligationFacility = customerTaxObligationFacility;
    }

    public org.museframework.bian.custaxhan.dto.cr.CustomerTaxObligationFacility getCustomerTaxObligationFacility() {
        return customerTaxObligationFacility;
    }
}