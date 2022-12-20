package org.museframework.bian.customeragreement;

import org.museframework.bian.customeragreement.dto.EvaluateLegalTermsRequest;
import org.museframework.bian.customeragreement.dto.EvaluateLegalTermsResponse;
import org.museframework.bian.customeragreement.dto.RetrieveLegalTermsRequest;
import org.museframework.bian.customeragreement.dto.RetrieveLegalTermsResponse;
import org.museframework.bian.customeragreement.dto.UpdateLegalTermsRequest;
import org.museframework.bian.customeragreement.dto.UpdateLegalTermsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of terms (within some jurisdiction) that can be selected and configured to define a contract /agreement  Examples: Required disclosures")
@GenericDomain(name="CustomerAgreement", group="LegalTerms")
public interface BqLegalTerms {
    @GenericDtxEndpoint
    @Description("EvBQ Establish the legal terms for a customer master agreement")
    EvaluateLegalTermsResponse evaluateLegalTerms(EvaluateLegalTermsRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update the legal terms for a customer master agreement")
    UpdateLegalTermsResponse updateLegalTerms(UpdateLegalTermsRequest req);

    @Description("ReBQ Retrieve details about the legal terms of an agreement")
    RetrieveLegalTermsResponse retrieveLegalTerms(RetrieveLegalTermsRequest req);
}