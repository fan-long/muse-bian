package org.museframework.bian.projectfinance;

import org.museframework.bian.projectfinance.dto.ControlProjectFinanceFacilityRequest;
import org.museframework.bian.projectfinance.dto.ControlProjectFinanceFacilityResponse;
import org.museframework.bian.projectfinance.dto.ExchangeProjectFinanceFacilityRequest;
import org.museframework.bian.projectfinance.dto.ExchangeProjectFinanceFacilityResponse;
import org.museframework.bian.projectfinance.dto.ExecuteProjectFinanceFacilityRequest;
import org.museframework.bian.projectfinance.dto.ExecuteProjectFinanceFacilityResponse;
import org.museframework.bian.projectfinance.dto.InitiateProjectFinanceFacilityRequest;
import org.museframework.bian.projectfinance.dto.InitiateProjectFinanceFacilityResponse;
import org.museframework.bian.projectfinance.dto.NotifyProjectFinanceFacilityRequest;
import org.museframework.bian.projectfinance.dto.NotifyProjectFinanceFacilityResponse;
import org.museframework.bian.projectfinance.dto.RequestProjectFinanceFacilityRequest;
import org.museframework.bian.projectfinance.dto.RequestProjectFinanceFacilityResponse;
import org.museframework.bian.projectfinance.dto.RetrieveProjectFinanceFacilityRequest;
import org.museframework.bian.projectfinance.dto.RetrieveProjectFinanceFacilityResponse;
import org.museframework.bian.projectfinance.dto.UpdateProjectFinanceFacilityRequest;
import org.museframework.bian.projectfinance.dto.UpdateProjectFinanceFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Project Finance. ")
@GenericDomain(name="ProjectFinance", group="ProjectFinanceFacility")
public interface CrProjectFinanceFacility {
    @GenericDtxEndpoint
    @Description("Control Project Finance Facility")
    ControlProjectFinanceFacilityResponse controlProjectFinanceFacility(ControlProjectFinanceFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Project Finance Facility")
    ExchangeProjectFinanceFacilityResponse exchangeProjectFinanceFacility(ExchangeProjectFinanceFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Execute Project Finance Facility")
    ExecuteProjectFinanceFacilityResponse executeProjectFinanceFacility(ExecuteProjectFinanceFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Project Finance Facility")
    InitiateProjectFinanceFacilityResponse initiateProjectFinanceFacility(InitiateProjectFinanceFacilityRequest req);

    @Description("Notify Project Finance Facility")
    NotifyProjectFinanceFacilityResponse notifyProjectFinanceFacility(NotifyProjectFinanceFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Request Project Finance Facility")
    RequestProjectFinanceFacilityResponse requestProjectFinanceFacility(RequestProjectFinanceFacilityRequest req);

    @Description("Retrieve Project Finance Facility")
    RetrieveProjectFinanceFacilityResponse retrieveProjectFinanceFacility(RetrieveProjectFinanceFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Update Project Finance Facility")
    UpdateProjectFinanceFacilityResponse updateProjectFinanceFacility(UpdateProjectFinanceFacilityRequest req);
}