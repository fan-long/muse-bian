package org.museframework.bian.customersurveys;

import org.museframework.bian.customersurveys.dto.RequestReviewerSelectionRequest;
import org.museframework.bian.customersurveys.dto.RequestReviewerSelectionResponse;
import org.museframework.bian.customersurveys.dto.RetrieveReviewerSelectionRequest;
import org.museframework.bian.customersurveys.dto.RetrieveReviewerSelectionResponse;
import org.museframework.bian.customersurveys.dto.UpdateReviewerSelectionRequest;
import org.museframework.bian.customersurveys.dto.UpdateReviewerSelectionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="CustomerSurveys", group="ReviewerSelection")
public interface BqReviewerSelection {
    @GenericDtxEndpoint
    @Description("UpBQ Update reviewer selection details")
    UpdateReviewerSelectionResponse updateReviewerSelection(UpdateReviewerSelectionRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention in survey reviewer selection")
    RequestReviewerSelectionResponse requestReviewerSelection(RequestReviewerSelectionRequest req);

    @Description("ReBQ Retrieve details about survey reviewer selection activity")
    RetrieveReviewerSelectionResponse retrieveReviewerSelection(RetrieveReviewerSelectionRequest req);
}