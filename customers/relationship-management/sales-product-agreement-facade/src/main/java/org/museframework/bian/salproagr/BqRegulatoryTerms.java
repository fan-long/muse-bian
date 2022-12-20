package org.museframework.bian.salproagr;

import org.museframework.bian.salproagr.dto.EvaluateRegulatoryTermsRequest;
import org.museframework.bian.salproagr.dto.EvaluateRegulatoryTermsResponse;
import org.museframework.bian.salproagr.dto.RetrieveRegulatoryTermsRequest;
import org.museframework.bian.salproagr.dto.RetrieveRegulatoryTermsResponse;
import org.museframework.bian.salproagr.dto.UpdateRegulatoryTermsRequest;
import org.museframework.bian.salproagr.dto.UpdateRegulatoryTermsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of terms (within some jurisdiction) that can be selected and configured to define a contract /agreement  Examples: Required disclosures")
@GenericDomain(name="SalesProductAgreement", group="RegulatoryTerms")
public interface BqRegulatoryTerms {
    @GenericDtxEndpoint
    @Description("EvBQ Establish the regulatory terms for a sales product agreement")
    EvaluateRegulatoryTermsResponse evaluateRegulatoryTerms(EvaluateRegulatoryTermsRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update the regulatory terms for a sales product agreement")
    UpdateRegulatoryTermsResponse updateRegulatoryTerms(UpdateRegulatoryTermsRequest req);

    @Description("ReBQ Retrieve details about the regulatory terms of an agreement")
    RetrieveRegulatoryTermsResponse retrieveRegulatoryTerms(RetrieveRegulatoryTermsRequest req);
}