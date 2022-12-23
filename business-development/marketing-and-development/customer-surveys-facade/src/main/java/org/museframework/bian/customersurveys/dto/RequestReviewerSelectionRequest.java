package org.museframework.bian.customersurveys.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestReviewerSelectionRequest {
    @MetaField
    private String customersurveysid;

    @MetaField
    private String reviewerselectionid;

    @MetaField(ref=true)
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