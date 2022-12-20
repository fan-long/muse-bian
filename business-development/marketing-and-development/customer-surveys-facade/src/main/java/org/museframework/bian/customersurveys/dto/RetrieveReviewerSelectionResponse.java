package org.museframework.bian.customersurveys.dto;

public class RetrieveReviewerSelectionResponse {
    private org.museframework.bian.customersurveys.dto.bq.ReviewerSelection reviewerSelection;

    public void setReviewerSelection(org.museframework.bian.customersurveys.dto.bq.ReviewerSelection reviewerSelection) {
        this.reviewerSelection = reviewerSelection;
    }

    public org.museframework.bian.customersurveys.dto.bq.ReviewerSelection getReviewerSelection() {
        return reviewerSelection;
    }
}