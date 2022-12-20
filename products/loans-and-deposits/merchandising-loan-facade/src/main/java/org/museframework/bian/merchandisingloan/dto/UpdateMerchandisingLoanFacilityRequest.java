package org.museframework.bian.merchandisingloan.dto;

public class UpdateMerchandisingLoanFacilityRequest {
    private String merchandisingloanid;

    private org.museframework.bian.merchandisingloan.dto.cr.MerchandisingLoanFacility merchandisingLoanFacility;

    public void setMerchandisingloanid(String merchandisingloanid) {
        this.merchandisingloanid = merchandisingloanid;
    }

    public String getMerchandisingloanid() {
        return merchandisingloanid;
    }

    public void setMerchandisingLoanFacility(org.museframework.bian.merchandisingloan.dto.cr.MerchandisingLoanFacility merchandisingLoanFacility) {
        this.merchandisingLoanFacility = merchandisingLoanFacility;
    }

    public org.museframework.bian.merchandisingloan.dto.cr.MerchandisingLoanFacility getMerchandisingLoanFacility() {
        return merchandisingLoanFacility;
    }
}