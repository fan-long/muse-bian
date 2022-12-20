package org.museframework.bian.merchandisingloan.dto;

public class UpdateServiceFeesRequest {
    private String merchandisingloanid;

    private String servicefeesid;

    private org.museframework.bian.merchandisingloan.dto.bq.ServiceFees serviceFees;

    public void setMerchandisingloanid(String merchandisingloanid) {
        this.merchandisingloanid = merchandisingloanid;
    }

    public String getMerchandisingloanid() {
        return merchandisingloanid;
    }

    public void setServicefeesid(String servicefeesid) {
        this.servicefeesid = servicefeesid;
    }

    public String getServicefeesid() {
        return servicefeesid;
    }

    public void setServiceFees(org.museframework.bian.merchandisingloan.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}