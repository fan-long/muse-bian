package org.museframework.bian.leasing;

import org.museframework.bian.leasing.dto.ControlLeasingFacilityRequest;
import org.museframework.bian.leasing.dto.ControlLeasingFacilityResponse;
import org.museframework.bian.leasing.dto.ExchangeLeasingFacilityRequest;
import org.museframework.bian.leasing.dto.ExchangeLeasingFacilityResponse;
import org.museframework.bian.leasing.dto.ExecuteLeasingFacilityRequest;
import org.museframework.bian.leasing.dto.ExecuteLeasingFacilityResponse;
import org.museframework.bian.leasing.dto.InitiateLeasingFacilityRequest;
import org.museframework.bian.leasing.dto.InitiateLeasingFacilityResponse;
import org.museframework.bian.leasing.dto.RequestLeasingFacilityRequest;
import org.museframework.bian.leasing.dto.RequestLeasingFacilityResponse;
import org.museframework.bian.leasing.dto.RetrieveLeasingFacilityRequest;
import org.museframework.bian.leasing.dto.RetrieveLeasingFacilityResponse;
import org.museframework.bian.leasing.dto.UpdateLeasingFacilityRequest;
import org.museframework.bian.leasing.dto.UpdateLeasingFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Leasing.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="Leasing", group="LeasingFacility")
public interface CrLeasingFacility {
    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Leasing Facility")
    ControlLeasingFacilityResponse controlLeasingFacility(ControlLeasingFacilityRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Leasing Facility processing")
    ExchangeLeasingFacilityResponse exchangeLeasingFacility(ExchangeLeasingFacilityRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an available automated action for Leasing Facility")
    ExecuteLeasingFacilityResponse executeLeasingFacility(ExecuteLeasingFacilityRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Leasing Facility")
    InitiateLeasingFacilityResponse initiateLeasingFacility(InitiateLeasingFacilityRequest req);

    @Description("ReCR Retrieve details about any aspect of Leasing Facility")
    RetrieveLeasingFacilityResponse retrieveLeasingFacility(RetrieveLeasingFacilityRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Leasing Facility")
    RequestLeasingFacilityResponse requestLeasingFacility(RequestLeasingFacilityRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Leasing Facility")
    UpdateLeasingFacilityResponse updateLeasingFacility(UpdateLeasingFacilityRequest req);
}