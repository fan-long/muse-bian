package org.museframework.bian.knowledgeexchange;

import org.museframework.bian.knowledgeexchange.dto.ExchangeReview_RefinementandEditingRequest;
import org.museframework.bian.knowledgeexchange.dto.ExchangeReview_RefinementandEditingResponse;
import org.museframework.bian.knowledgeexchange.dto.RetrieveReview_RefinementandEditingRequest;
import org.museframework.bian.knowledgeexchange.dto.RetrieveReview_RefinementandEditingResponse;
import org.museframework.bian.knowledgeexchange.dto.UpdateReview_RefinementandEditingRequest;
import org.museframework.bian.knowledgeexchange.dto.UpdateReview_RefinementandEditingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility  within Knowledge Exchange.  Example: Operate the bank's internal intranet facility.")
@GenericDomain(name="KnowledgeExchange", group="Review_RefinementandEditing")
public interface BqReview_RefinementandEditing {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Review, Refinement and Editing processing")
    ExchangeReview_RefinementandEditingResponse exchangeReview_RefinementandEditing(ExchangeReview_RefinementandEditingRequest req);

    @Description("ReBQ Retrieve details about any aspect of Review, Refinement and Editing")
    RetrieveReview_RefinementandEditingResponse retrieveReview_RefinementandEditing(RetrieveReview_RefinementandEditingRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Review, Refinement and Editing")
    UpdateReview_RefinementandEditingResponse updateReview_RefinementandEditing(UpdateReview_RefinementandEditingRequest req);
}