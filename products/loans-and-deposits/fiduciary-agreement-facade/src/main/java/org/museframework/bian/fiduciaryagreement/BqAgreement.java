package org.museframework.bian.fiduciaryagreement;

import org.museframework.bian.fiduciaryagreement.dto.ExchangeAgreementRequest;
import org.museframework.bian.fiduciaryagreement.dto.ExchangeAgreementResponse;
import org.museframework.bian.fiduciaryagreement.dto.InitiateAgreementRequest;
import org.museframework.bian.fiduciaryagreement.dto.InitiateAgreementResponse;
import org.museframework.bian.fiduciaryagreement.dto.RequestAgreementRequest;
import org.museframework.bian.fiduciaryagreement.dto.RequestAgreementResponse;
import org.museframework.bian.fiduciaryagreement.dto.RetrieveAgreementRequest;
import org.museframework.bian.fiduciaryagreement.dto.RetrieveAgreementResponse;
import org.museframework.bian.fiduciaryagreement.dto.UpdateAgreementRequest;
import org.museframework.bian.fiduciaryagreement.dto.UpdateAgreementResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Fiduciary Agreement.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="FiduciaryAgreement", group="Agreement")
public interface BqAgreement {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Agreement processing")
    ExchangeAgreementResponse exchangeAgreement(ExchangeAgreementRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Agreement")
    InitiateAgreementResponse initiateAgreement(InitiateAgreementRequest req);

    @Description("ReBQ Retrieve details about any aspect of Agreement")
    RetrieveAgreementResponse retrieveAgreement(RetrieveAgreementRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Agreement")
    RequestAgreementResponse requestAgreement(RequestAgreementRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Agreement")
    UpdateAgreementResponse updateAgreement(UpdateAgreementRequest req);
}