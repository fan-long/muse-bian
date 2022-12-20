package org.museframework.bian.factoring;

import org.museframework.bian.factoring.dto.ControlFactoringFacilityRequest;
import org.museframework.bian.factoring.dto.ControlFactoringFacilityResponse;
import org.museframework.bian.factoring.dto.ExchangeFactoringFacilityRequest;
import org.museframework.bian.factoring.dto.ExchangeFactoringFacilityResponse;
import org.museframework.bian.factoring.dto.ExecuteFactoringFacilityRequest;
import org.museframework.bian.factoring.dto.ExecuteFactoringFacilityResponse;
import org.museframework.bian.factoring.dto.InitiateFactoringFacilityRequest;
import org.museframework.bian.factoring.dto.InitiateFactoringFacilityResponse;
import org.museframework.bian.factoring.dto.NotifyFactoringFacilityRequest;
import org.museframework.bian.factoring.dto.NotifyFactoringFacilityResponse;
import org.museframework.bian.factoring.dto.RequestFactoringFacilityRequest;
import org.museframework.bian.factoring.dto.RequestFactoringFacilityResponse;
import org.museframework.bian.factoring.dto.RetrieveFactoringFacilityRequest;
import org.museframework.bian.factoring.dto.RetrieveFactoringFacilityResponse;
import org.museframework.bian.factoring.dto.UpdateFactoringFacilityRequest;
import org.museframework.bian.factoring.dto.UpdateFactoringFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Factoring. ")
@GenericDomain(name="Factoring", group="FactoringFacility")
public interface CrFactoringFacility {
    @GenericDtxEndpoint
    @Description("Control Factoring Facility")
    ControlFactoringFacilityResponse controlFactoringFacility(ControlFactoringFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Factoring Facility")
    ExchangeFactoringFacilityResponse exchangeFactoringFacility(ExchangeFactoringFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Execute Factoring Facility")
    ExecuteFactoringFacilityResponse executeFactoringFacility(ExecuteFactoringFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Factoring Facility")
    InitiateFactoringFacilityResponse initiateFactoringFacility(InitiateFactoringFacilityRequest req);

    @Description("Notify Factoring Facility")
    NotifyFactoringFacilityResponse notifyFactoringFacility(NotifyFactoringFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Request Factoring Facility")
    RequestFactoringFacilityResponse requestFactoringFacility(RequestFactoringFacilityRequest req);

    @Description("Retrieve Factoring Facility")
    RetrieveFactoringFacilityResponse retrieveFactoringFacility(RetrieveFactoringFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Update Factoring Facility")
    UpdateFactoringFacilityResponse updateFactoringFacility(UpdateFactoringFacilityRequest req);
}