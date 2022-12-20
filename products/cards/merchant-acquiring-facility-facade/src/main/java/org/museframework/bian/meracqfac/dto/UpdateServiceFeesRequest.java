package org.museframework.bian.meracqfac.dto;

public class UpdateServiceFeesRequest {
    private String merchantacquiringfacilityid;

    private String servicefeesid;

    private org.museframework.bian.meracqfac.dto.bq.ServiceFees serviceFees;

    public void setMerchantacquiringfacilityid(String merchantacquiringfacilityid) {
        this.merchantacquiringfacilityid = merchantacquiringfacilityid;
    }

    public String getMerchantacquiringfacilityid() {
        return merchantacquiringfacilityid;
    }

    public void setServicefeesid(String servicefeesid) {
        this.servicefeesid = servicefeesid;
    }

    public String getServicefeesid() {
        return servicefeesid;
    }

    public void setServiceFees(org.museframework.bian.meracqfac.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.meracqfac.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}