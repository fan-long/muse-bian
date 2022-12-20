package org.museframework.bian.investmentaccount.dto;

public class ExecuteServiceFeesRequest {
    private String investmentaccountid;

    private String servicefeesid;

    private org.museframework.bian.investmentaccount.dto.bq.ServiceFees serviceFees;

    public void setInvestmentaccountid(String investmentaccountid) {
        this.investmentaccountid = investmentaccountid;
    }

    public String getInvestmentaccountid() {
        return investmentaccountid;
    }

    public void setServicefeesid(String servicefeesid) {
        this.servicefeesid = servicefeesid;
    }

    public String getServicefeesid() {
        return servicefeesid;
    }

    public void setServiceFees(org.museframework.bian.investmentaccount.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.investmentaccount.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}