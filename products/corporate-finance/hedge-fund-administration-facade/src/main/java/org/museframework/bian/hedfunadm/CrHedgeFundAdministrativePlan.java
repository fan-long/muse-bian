package org.museframework.bian.hedfunadm;

import org.museframework.bian.hedfunadm.dto.ControlHedgeFundAdministrativePlanRequest;
import org.museframework.bian.hedfunadm.dto.ControlHedgeFundAdministrativePlanResponse;
import org.museframework.bian.hedfunadm.dto.CreateHedgeFundAdministrativePlanRequest;
import org.museframework.bian.hedfunadm.dto.CreateHedgeFundAdministrativePlanResponse;
import org.museframework.bian.hedfunadm.dto.ExchangeHedgeFundAdministrativePlanRequest;
import org.museframework.bian.hedfunadm.dto.ExchangeHedgeFundAdministrativePlanResponse;
import org.museframework.bian.hedfunadm.dto.GrantHedgeFundAdministrativePlanRequest;
import org.museframework.bian.hedfunadm.dto.GrantHedgeFundAdministrativePlanResponse;
import org.museframework.bian.hedfunadm.dto.NotifyHedgeFundAdministrativePlanRequest;
import org.museframework.bian.hedfunadm.dto.NotifyHedgeFundAdministrativePlanResponse;
import org.museframework.bian.hedfunadm.dto.RequestHedgeFundAdministrativePlanRequest;
import org.museframework.bian.hedfunadm.dto.RequestHedgeFundAdministrativePlanResponse;
import org.museframework.bian.hedfunadm.dto.RetrieveHedgeFundAdministrativePlanRequest;
import org.museframework.bian.hedfunadm.dto.RetrieveHedgeFundAdministrativePlanResponse;
import org.museframework.bian.hedfunadm.dto.UpdateHedgeFundAdministrativePlanRequest;
import org.museframework.bian.hedfunadm.dto.UpdateHedgeFundAdministrativePlanResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handle and assign the day to day activities, capture time, costs and income for an operational unit within Hedge Fund Administration. ")
@GenericDomain(name="HedgeFundAdministration", group="HedgeFundAdministrativePlan")
public interface CrHedgeFundAdministrativePlan {
    @GenericDtxEndpoint
    @Description("Control Hedge Fund Administrative Plan")
    ControlHedgeFundAdministrativePlanResponse controlHedgeFundAdministrativePlan(ControlHedgeFundAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("Create Hedge Fund Administrative Plan")
    CreateHedgeFundAdministrativePlanResponse createHedgeFundAdministrativePlan(CreateHedgeFundAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Hedge Fund Administrative Plan")
    ExchangeHedgeFundAdministrativePlanResponse exchangeHedgeFundAdministrativePlan(ExchangeHedgeFundAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("Grant Hedge Fund Administrative Plan")
    GrantHedgeFundAdministrativePlanResponse grantHedgeFundAdministrativePlan(GrantHedgeFundAdministrativePlanRequest req);

    @Description("Notify Hedge Fund Administrative Plan")
    NotifyHedgeFundAdministrativePlanResponse notifyHedgeFundAdministrativePlan(NotifyHedgeFundAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("Request Hedge Fund Administrative Plan")
    RequestHedgeFundAdministrativePlanResponse requestHedgeFundAdministrativePlan(RequestHedgeFundAdministrativePlanRequest req);

    @Description("Retrieve Hedge Fund Administrative Plan")
    RetrieveHedgeFundAdministrativePlanResponse retrieveHedgeFundAdministrativePlan(RetrieveHedgeFundAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("Update Hedge Fund Administrative Plan")
    UpdateHedgeFundAdministrativePlanResponse updateHedgeFundAdministrativePlan(UpdateHedgeFundAdministrativePlanRequest req);
}