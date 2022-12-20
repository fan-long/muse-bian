package org.museframework.bian.commissionagreement;

import org.museframework.bian.commissionagreement.dto.ControlCommissionTermsRequest;
import org.museframework.bian.commissionagreement.dto.ControlCommissionTermsResponse;
import org.museframework.bian.commissionagreement.dto.ExchangeCommissionTermsRequest;
import org.museframework.bian.commissionagreement.dto.ExchangeCommissionTermsResponse;
import org.museframework.bian.commissionagreement.dto.GrantCommissionTermsRequest;
import org.museframework.bian.commissionagreement.dto.GrantCommissionTermsResponse;
import org.museframework.bian.commissionagreement.dto.InitiateCommissionTermsRequest;
import org.museframework.bian.commissionagreement.dto.InitiateCommissionTermsResponse;
import org.museframework.bian.commissionagreement.dto.RequestCommissionTermsRequest;
import org.museframework.bian.commissionagreement.dto.RequestCommissionTermsResponse;
import org.museframework.bian.commissionagreement.dto.RetrieveCommissionTermsRequest;
import org.museframework.bian.commissionagreement.dto.RetrieveCommissionTermsResponse;
import org.museframework.bian.commissionagreement.dto.UpdateCommissionTermsRequest;
import org.museframework.bian.commissionagreement.dto.UpdateCommissionTermsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of terms (within some jurisdiction) that can be selected and configured to define a contract /agreement  Examples: Required disclosures")
@GenericDomain(name="CommissionAgreement", group="CommissionTerms")
public interface BqCommissionTerms {
    @GenericDtxEndpoint
    @Description("CoBQ Control the processing of Commission Terms")
    ControlCommissionTermsResponse controlCommissionTerms(ControlCommissionTermsRequest req);

    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Commission Terms processing")
    ExchangeCommissionTermsResponse exchangeCommissionTerms(ExchangeCommissionTermsRequest req);

    @GenericDtxEndpoint
    @Description("GrBQ Obtain permission to act in relation to Commission Terms")
    GrantCommissionTermsResponse grantCommissionTerms(GrantCommissionTermsRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Commission Terms")
    InitiateCommissionTermsResponse initiateCommissionTerms(InitiateCommissionTermsRequest req);

    @Description("ReBQ Retrieve details about any aspect of Commission Terms")
    RetrieveCommissionTermsResponse retrieveCommissionTerms(RetrieveCommissionTermsRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Commission Terms")
    RequestCommissionTermsResponse requestCommissionTerms(RequestCommissionTermsRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Commission Terms")
    UpdateCommissionTermsResponse updateCommissionTerms(UpdateCommissionTermsRequest req);
}