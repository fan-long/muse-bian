package org.museframework.bian.creditfacility.dto;

public class ExecuteServiceFeesRequest {
    private String creditfacilityid;

    private String servicefeesid;

    private org.museframework.bian.creditfacility.dto.bq.ServiceFees serviceFees;

    public void setCreditfacilityid(String creditfacilityid) {
        this.creditfacilityid = creditfacilityid;
    }

    public String getCreditfacilityid() {
        return creditfacilityid;
    }

    public void setServicefeesid(String servicefeesid) {
        this.servicefeesid = servicefeesid;
    }

    public String getServicefeesid() {
        return servicefeesid;
    }

    public void setServiceFees(org.museframework.bian.creditfacility.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.creditfacility.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}