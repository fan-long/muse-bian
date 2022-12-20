package org.museframework.bian.casroocauana.dto;

public class ExecuteCustomerCaseRootCauseAnalysisRequest {
    private String caserootcauseanalysisid;

    private org.museframework.bian.casroocauana.dto.cr.CustomerCaseRootCauseAnalysis customerCaseRootCauseAnalysis;

    public void setCaserootcauseanalysisid(String caserootcauseanalysisid) {
        this.caserootcauseanalysisid = caserootcauseanalysisid;
    }

    public String getCaserootcauseanalysisid() {
        return caserootcauseanalysisid;
    }

    public void setCustomerCaseRootCauseAnalysis(org.museframework.bian.casroocauana.dto.cr.CustomerCaseRootCauseAnalysis customerCaseRootCauseAnalysis) {
        this.customerCaseRootCauseAnalysis = customerCaseRootCauseAnalysis;
    }

    public org.museframework.bian.casroocauana.dto.cr.CustomerCaseRootCauseAnalysis getCustomerCaseRootCauseAnalysis() {
        return customerCaseRootCauseAnalysis;
    }
}