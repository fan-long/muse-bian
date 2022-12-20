package org.museframework.bian.hedfunadm;

import org.museframework.bian.hedfunadm.dto.ExchangeFundInflowsandOutflowRoutineRequest;
import org.museframework.bian.hedfunadm.dto.ExchangeFundInflowsandOutflowRoutineResponse;
import org.museframework.bian.hedfunadm.dto.GrantFundInflowsandOutflowRoutineRequest;
import org.museframework.bian.hedfunadm.dto.GrantFundInflowsandOutflowRoutineResponse;
import org.museframework.bian.hedfunadm.dto.NotifyFundInflowsandOutflowRoutineRequest;
import org.museframework.bian.hedfunadm.dto.NotifyFundInflowsandOutflowRoutineResponse;
import org.museframework.bian.hedfunadm.dto.RequestFundInflowsandOutflowRoutineRequest;
import org.museframework.bian.hedfunadm.dto.RequestFundInflowsandOutflowRoutineResponse;
import org.museframework.bian.hedfunadm.dto.RetrieveFundInflowsandOutflowRoutineRequest;
import org.museframework.bian.hedfunadm.dto.RetrieveFundInflowsandOutflowRoutineResponse;
import org.museframework.bian.hedfunadm.dto.UpdateFundInflowsandOutflowRoutineRequest;
import org.museframework.bian.hedfunadm.dto.UpdateFundInflowsandOutflowRoutineResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Fund Inflows and Outflow Routine is an activity that is performed as one aspect of carrying out the Fund Inflows and Outflow Routine")
@GenericDomain(name="HedgeFundAdministration", group="FundInflowsandOutflowRoutine")
public interface BqFundInflowsandOutflowRoutine {
    @GenericDtxEndpoint
    @Description("Exchange Fund Inflows and Outflow Routine")
    ExchangeFundInflowsandOutflowRoutineResponse exchangeFundInflowsandOutflowRoutine(ExchangeFundInflowsandOutflowRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Grant Fund Inflows and Outflow Routine")
    GrantFundInflowsandOutflowRoutineResponse grantFundInflowsandOutflowRoutine(GrantFundInflowsandOutflowRoutineRequest req);

    @Description("Notify Fund Inflows and Outflow Routine")
    NotifyFundInflowsandOutflowRoutineResponse notifyFundInflowsandOutflowRoutine(NotifyFundInflowsandOutflowRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Request Fund Inflows and Outflow Routine")
    RequestFundInflowsandOutflowRoutineResponse requestFundInflowsandOutflowRoutine(RequestFundInflowsandOutflowRoutineRequest req);

    @Description("Retrieve Fund Inflows and Outflow Routine")
    RetrieveFundInflowsandOutflowRoutineResponse retrieveFundInflowsandOutflowRoutine(RetrieveFundInflowsandOutflowRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Update Fund Inflows and Outflow Routine")
    UpdateFundInflowsandOutflowRoutineResponse updateFundInflowsandOutflowRoutine(UpdateFundInflowsandOutflowRoutineRequest req);
}