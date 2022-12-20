package org.museframework.bian.standingorder;

import org.museframework.bian.standingorder.dto.ControlStandingOrderFacilityRequest;
import org.museframework.bian.standingorder.dto.ControlStandingOrderFacilityResponse;
import org.museframework.bian.standingorder.dto.ExchangeStandingOrderFacilityRequest;
import org.museframework.bian.standingorder.dto.ExchangeStandingOrderFacilityResponse;
import org.museframework.bian.standingorder.dto.ExecuteStandingOrderFacilityRequest;
import org.museframework.bian.standingorder.dto.ExecuteStandingOrderFacilityResponse;
import org.museframework.bian.standingorder.dto.InitiateStandingOrderFacilityRequest;
import org.museframework.bian.standingorder.dto.InitiateStandingOrderFacilityResponse;
import org.museframework.bian.standingorder.dto.RequestStandingOrderFacilityRequest;
import org.museframework.bian.standingorder.dto.RequestStandingOrderFacilityResponse;
import org.museframework.bian.standingorder.dto.RetrieveStandingOrderFacilityRequest;
import org.museframework.bian.standingorder.dto.RetrieveStandingOrderFacilityResponse;
import org.museframework.bian.standingorder.dto.UpdateStandingOrderFacilityRequest;
import org.museframework.bian.standingorder.dto.UpdateStandingOrderFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Standing Order.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="StandingOrder", group="StandingOrderFacility")
public interface CrStandingOrderFacility {
    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Standing Order Facility")
    ControlStandingOrderFacilityResponse controlStandingOrderFacility(ControlStandingOrderFacilityRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Standing Order Facility processing")
    ExchangeStandingOrderFacilityResponse exchangeStandingOrderFacility(ExchangeStandingOrderFacilityRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an available automated action for Standing Order Facility")
    ExecuteStandingOrderFacilityResponse executeStandingOrderFacility(ExecuteStandingOrderFacilityRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Standing Order Facility")
    InitiateStandingOrderFacilityResponse initiateStandingOrderFacility(InitiateStandingOrderFacilityRequest req);

    @Description("ReCR Retrieve details about any aspect of Standing Order Facility")
    RetrieveStandingOrderFacilityResponse retrieveStandingOrderFacility(RetrieveStandingOrderFacilityRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Standing Order Facility")
    RequestStandingOrderFacilityResponse requestStandingOrderFacility(RequestStandingOrderFacilityRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Standing Order Facility")
    UpdateStandingOrderFacilityResponse updateStandingOrderFacility(UpdateStandingOrderFacilityRequest req);
}