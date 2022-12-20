package org.museframework.bian.custodyadministration;

import org.museframework.bian.custodyadministration.dto.ControlCustodyFacilityRequest;
import org.museframework.bian.custodyadministration.dto.ControlCustodyFacilityResponse;
import org.museframework.bian.custodyadministration.dto.ExchangeCustodyFacilityRequest;
import org.museframework.bian.custodyadministration.dto.ExchangeCustodyFacilityResponse;
import org.museframework.bian.custodyadministration.dto.ExecuteCustodyFacilityRequest;
import org.museframework.bian.custodyadministration.dto.ExecuteCustodyFacilityResponse;
import org.museframework.bian.custodyadministration.dto.InitiateCustodyFacilityRequest;
import org.museframework.bian.custodyadministration.dto.InitiateCustodyFacilityResponse;
import org.museframework.bian.custodyadministration.dto.RequestCustodyFacilityRequest;
import org.museframework.bian.custodyadministration.dto.RequestCustodyFacilityResponse;
import org.museframework.bian.custodyadministration.dto.RetrieveCustodyFacilityRequest;
import org.museframework.bian.custodyadministration.dto.RetrieveCustodyFacilityResponse;
import org.museframework.bian.custodyadministration.dto.UpdateCustodyFacilityRequest;
import org.museframework.bian.custodyadministration.dto.UpdateCustodyFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Custody Administration.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="CustodyAdministration", group="CustodyFacility")
public interface CrCustodyFacility {
    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Custody Facility")
    ControlCustodyFacilityResponse controlCustodyFacility(ControlCustodyFacilityRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Custody Facility processing")
    ExchangeCustodyFacilityResponse exchangeCustodyFacility(ExchangeCustodyFacilityRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an available automated action for Custody Facility")
    ExecuteCustodyFacilityResponse executeCustodyFacility(ExecuteCustodyFacilityRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Custody Facility")
    InitiateCustodyFacilityResponse initiateCustodyFacility(InitiateCustodyFacilityRequest req);

    @Description("ReCR Retrieve details about any aspect of Custody Facility")
    RetrieveCustodyFacilityResponse retrieveCustodyFacility(RetrieveCustodyFacilityRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Custody Facility")
    RequestCustodyFacilityResponse requestCustodyFacility(RequestCustodyFacilityRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Custody Facility")
    UpdateCustodyFacilityResponse updateCustodyFacility(UpdateCustodyFacilityRequest req);
}