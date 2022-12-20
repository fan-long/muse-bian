package org.museframework.bian.conadvser.dto;

public class ExecuteServiceFeesRequest {
    private String consumeradvisoryservicesid;

    private String servicefeesid;

    private org.museframework.bian.conadvser.dto.bq.ServiceFees serviceFees;

    public void setConsumeradvisoryservicesid(String consumeradvisoryservicesid) {
        this.consumeradvisoryservicesid = consumeradvisoryservicesid;
    }

    public String getConsumeradvisoryservicesid() {
        return consumeradvisoryservicesid;
    }

    public void setServicefeesid(String servicefeesid) {
        this.servicefeesid = servicefeesid;
    }

    public String getServicefeesid() {
        return servicefeesid;
    }

    public void setServiceFees(org.museframework.bian.conadvser.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.conadvser.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}