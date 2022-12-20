package org.museframework.bian.custaxhan.dto;

public class UpdateCustomerTaxObligationFacilityRequest {
    private String customertaxhandlingid;

    private org.museframework.bian.custaxhan.dto.cr.CustomerTaxObligationFacility customerTaxObligationFacility;

    public void setCustomertaxhandlingid(String customertaxhandlingid) {
        this.customertaxhandlingid = customertaxhandlingid;
    }

    public String getCustomertaxhandlingid() {
        return customertaxhandlingid;
    }

    public void setCustomerTaxObligationFacility(org.museframework.bian.custaxhan.dto.cr.CustomerTaxObligationFacility customerTaxObligationFacility) {
        this.customerTaxObligationFacility = customerTaxObligationFacility;
    }

    public org.museframework.bian.custaxhan.dto.cr.CustomerTaxObligationFacility getCustomerTaxObligationFacility() {
        return customerTaxObligationFacility;
    }
}