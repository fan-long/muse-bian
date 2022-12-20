package org.museframework.bian.corporatelease;

import org.museframework.bian.corporatelease.dto.ControlCorporateLeaseFacilityRequest;
import org.museframework.bian.corporatelease.dto.ControlCorporateLeaseFacilityResponse;
import org.museframework.bian.corporatelease.dto.ExchangeCorporateLeaseFacilityRequest;
import org.museframework.bian.corporatelease.dto.ExchangeCorporateLeaseFacilityResponse;
import org.museframework.bian.corporatelease.dto.ExecuteCorporateLeaseFacilityRequest;
import org.museframework.bian.corporatelease.dto.ExecuteCorporateLeaseFacilityResponse;
import org.museframework.bian.corporatelease.dto.InitiateCorporateLeaseFacilityRequest;
import org.museframework.bian.corporatelease.dto.InitiateCorporateLeaseFacilityResponse;
import org.museframework.bian.corporatelease.dto.RequestCorporateLeaseFacilityRequest;
import org.museframework.bian.corporatelease.dto.RequestCorporateLeaseFacilityResponse;
import org.museframework.bian.corporatelease.dto.RetrieveCorporateLeaseFacilityRequest;
import org.museframework.bian.corporatelease.dto.RetrieveCorporateLeaseFacilityResponse;
import org.museframework.bian.corporatelease.dto.UpdateCorporateLeaseFacilityRequest;
import org.museframework.bian.corporatelease.dto.UpdateCorporateLeaseFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Corporate Lease.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="CorporateLease", group="CorporateLeaseFacility")
public interface CrCorporateLeaseFacility {
    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Corporate Lease Facility")
    ControlCorporateLeaseFacilityResponse controlCorporateLeaseFacility(ControlCorporateLeaseFacilityRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Corporate Lease Facility processing")
    ExchangeCorporateLeaseFacilityResponse exchangeCorporateLeaseFacility(ExchangeCorporateLeaseFacilityRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an available automated action for Corporate Lease Facility")
    ExecuteCorporateLeaseFacilityResponse executeCorporateLeaseFacility(ExecuteCorporateLeaseFacilityRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Corporate Lease Facility")
    InitiateCorporateLeaseFacilityResponse initiateCorporateLeaseFacility(InitiateCorporateLeaseFacilityRequest req);

    @Description("ReCR Retrieve details about any aspect of Corporate Lease Facility")
    RetrieveCorporateLeaseFacilityResponse retrieveCorporateLeaseFacility(RetrieveCorporateLeaseFacilityRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Corporate Lease Facility")
    RequestCorporateLeaseFacilityResponse requestCorporateLeaseFacility(RequestCorporateLeaseFacilityRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Corporate Lease Facility")
    UpdateCorporateLeaseFacilityResponse updateCorporateLeaseFacility(UpdateCorporateLeaseFacilityRequest req);
}