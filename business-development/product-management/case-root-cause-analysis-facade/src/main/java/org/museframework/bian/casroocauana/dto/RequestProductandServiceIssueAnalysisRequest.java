package org.museframework.bian.casroocauana.dto;

public class RequestProductandServiceIssueAnalysisRequest {
    private String caserootcauseanalysisid;

    private String productandserviceissueanalysisid;

    private org.museframework.bian.casroocauana.dto.bq.ProductandServiceIssueAnalysis productandServiceIssueAnalysis;

    public void setCaserootcauseanalysisid(String caserootcauseanalysisid) {
        this.caserootcauseanalysisid = caserootcauseanalysisid;
    }

    public String getCaserootcauseanalysisid() {
        return caserootcauseanalysisid;
    }

    public void setProductandserviceissueanalysisid(String productandserviceissueanalysisid) {
        this.productandserviceissueanalysisid = productandserviceissueanalysisid;
    }

    public String getProductandserviceissueanalysisid() {
        return productandserviceissueanalysisid;
    }

    public void setProductandServiceIssueAnalysis(org.museframework.bian.casroocauana.dto.bq.ProductandServiceIssueAnalysis productandServiceIssueAnalysis) {
        this.productandServiceIssueAnalysis = productandServiceIssueAnalysis;
    }

    public org.museframework.bian.casroocauana.dto.bq.ProductandServiceIssueAnalysis getProductandServiceIssueAnalysis() {
        return productandServiceIssueAnalysis;
    }
}