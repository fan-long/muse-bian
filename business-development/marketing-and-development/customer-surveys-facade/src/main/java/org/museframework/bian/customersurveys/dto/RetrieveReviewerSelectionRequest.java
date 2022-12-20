package org.museframework.bian.customersurveys.dto;

public class RetrieveReviewerSelectionRequest {
    private String customersurveysid;

    private String reviewerselectionid;

    public void setCustomersurveysid(String customersurveysid) {
        this.customersurveysid = customersurveysid;
    }

    public String getCustomersurveysid() {
        return customersurveysid;
    }

    public void setReviewerselectionid(String reviewerselectionid) {
        this.reviewerselectionid = reviewerselectionid;
    }

    public String getReviewerselectionid() {
        return reviewerselectionid;
    }
}