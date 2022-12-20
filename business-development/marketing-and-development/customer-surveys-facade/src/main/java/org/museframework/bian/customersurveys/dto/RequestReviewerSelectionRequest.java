package org.museframework.bian.customersurveys.dto;

public class RequestReviewerSelectionRequest {
    private String customersurveysid;

    private String reviewerselectionid;

    private org.museframework.bian.customersurveys.dto.bq.ReviewerSelection reviewerSelection;

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

    public void setReviewerSelection(org.museframework.bian.customersurveys.dto.bq.ReviewerSelection reviewerSelection) {
        this.reviewerSelection = reviewerSelection;
    }

    public org.museframework.bian.customersurveys.dto.bq.ReviewerSelection getReviewerSelection() {
        return reviewerSelection;
    }
}