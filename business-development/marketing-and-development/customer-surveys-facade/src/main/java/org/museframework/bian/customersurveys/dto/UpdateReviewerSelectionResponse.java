package org.museframework.bian.customersurveys.dto;

public class UpdateReviewerSelectionResponse {
    private org.museframework.bian.customersurveys.dto.bq.ReviewerSelection reviewerSelection;

    public void setReviewerSelection(org.museframework.bian.customersurveys.dto.bq.ReviewerSelection reviewerSelection) {
        this.reviewerSelection = reviewerSelection;
    }

    public org.museframework.bian.customersurveys.dto.bq.ReviewerSelection getReviewerSelection() {
        return reviewerSelection;
    }
}