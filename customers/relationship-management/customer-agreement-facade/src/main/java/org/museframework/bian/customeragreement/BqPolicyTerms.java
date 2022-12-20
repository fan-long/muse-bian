package org.museframework.bian.customeragreement;

import org.museframework.bian.customeragreement.dto.EvaluatePolicyTermsRequest;
import org.museframework.bian.customeragreement.dto.EvaluatePolicyTermsResponse;
import org.museframework.bian.customeragreement.dto.RetrievePolicyTermsRequest;
import org.museframework.bian.customeragreement.dto.RetrievePolicyTermsResponse;
import org.museframework.bian.customeragreement.dto.UpdatePolicyTermsRequest;
import org.museframework.bian.customeragreement.dto.UpdatePolicyTermsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of terms (within some jurisdiction) that can be selected and configured to define a contract /agreement  Examples: Required disclosures")
@GenericDomain(name="CustomerAgreement", group="PolicyTerms")
public interface BqPolicyTerms {
    @GenericDtxEndpoint
    @Description("EvBQ Establish the corporate policy terms for a customer master agreement")
    EvaluatePolicyTermsResponse evaluatePolicyTerms(EvaluatePolicyTermsRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update the corporate policy terms for a customer master agreement")
    UpdatePolicyTermsResponse updatePolicyTerms(UpdatePolicyTermsRequest req);

    @Description("ReBQ Retrieve details about the corporate policy terms of an agreement")
    RetrievePolicyTermsResponse retrievePolicyTerms(RetrievePolicyTermsRequest req);
}