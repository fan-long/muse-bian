package org.museframework.bian.mutfunadm;

import org.museframework.bian.mutfunadm.dto.ExchangeFundInflowsandOutflowRoutineRequest;
import org.museframework.bian.mutfunadm.dto.ExchangeFundInflowsandOutflowRoutineResponse;
import org.museframework.bian.mutfunadm.dto.GrantFundInflowsandOutflowRoutineRequest;
import org.museframework.bian.mutfunadm.dto.GrantFundInflowsandOutflowRoutineResponse;
import org.museframework.bian.mutfunadm.dto.NotifyFundInflowsandOutflowRoutineRequest;
import org.museframework.bian.mutfunadm.dto.NotifyFundInflowsandOutflowRoutineResponse;
import org.museframework.bian.mutfunadm.dto.RequestFundInflowsandOutflowRoutineRequest;
import org.museframework.bian.mutfunadm.dto.RequestFundInflowsandOutflowRoutineResponse;
import org.museframework.bian.mutfunadm.dto.RetrieveFundInflowsandOutflowRoutineRequest;
import org.museframework.bian.mutfunadm.dto.RetrieveFundInflowsandOutflowRoutineResponse;
import org.museframework.bian.mutfunadm.dto.UpdateFundInflowsandOutflowRoutineRequest;
import org.museframework.bian.mutfunadm.dto.UpdateFundInflowsandOutflowRoutineResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Fund Investor, Middle and Back Office Service Routine is an activity that is performed as one aspect of carrying out the Fund Investor, Middle and Back Office Service Routine")
@GenericDomain(name="MutualFundAdministration", group="FundInflowsandOutflowRoutine")
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