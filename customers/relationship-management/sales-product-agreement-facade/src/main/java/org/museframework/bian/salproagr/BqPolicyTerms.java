package org.museframework.bian.salproagr;

import org.museframework.bian.salproagr.dto.EvaluatePolicyTermsRequest;
import org.museframework.bian.salproagr.dto.EvaluatePolicyTermsResponse;
import org.museframework.bian.salproagr.dto.RetrievePolicyTermsRequest;
import org.museframework.bian.salproagr.dto.RetrievePolicyTermsResponse;
import org.museframework.bian.salproagr.dto.UpdatePolicyTermsRequest;
import org.museframework.bian.salproagr.dto.UpdatePolicyTermsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of terms (within some jurisdiction) that can be selected and configured to define a contract /agreement  Examples: Required disclosures")
@GenericDomain(name="SalesProductAgreement", group="PolicyTerms")
public interface BqPolicyTerms {
    @GenericDtxEndpoint
    @Description("EvBQ Establish the corporate policy terms for a sales product agreement")
    EvaluatePolicyTermsResponse evaluatePolicyTerms(EvaluatePolicyTermsRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update the corporate policy terms for a sales product agreement")
    UpdatePolicyTermsResponse updatePolicyTerms(UpdatePolicyTermsRequest req);

    @Description("ReBQ Retrieve details about the corporate policy terms of an agreement")
    RetrievePolicyTermsResponse retrievePolicyTerms(RetrievePolicyTermsRequest req);
}