package org.museframework.bian.hedfunadm;

import org.museframework.bian.hedfunadm.dto.ExchangeFundPerformanceFeeRoutineRequest;
import org.museframework.bian.hedfunadm.dto.ExchangeFundPerformanceFeeRoutineResponse;
import org.museframework.bian.hedfunadm.dto.GrantFundPerformanceFeeRoutineRequest;
import org.museframework.bian.hedfunadm.dto.GrantFundPerformanceFeeRoutineResponse;
import org.museframework.bian.hedfunadm.dto.NotifyFundPerformanceFeeRoutineRequest;
import org.museframework.bian.hedfunadm.dto.NotifyFundPerformanceFeeRoutineResponse;
import org.museframework.bian.hedfunadm.dto.RequestFundPerformanceFeeRoutineRequest;
import org.museframework.bian.hedfunadm.dto.RequestFundPerformanceFeeRoutineResponse;
import org.museframework.bian.hedfunadm.dto.RetrieveFundPerformanceFeeRoutineRequest;
import org.museframework.bian.hedfunadm.dto.RetrieveFundPerformanceFeeRoutineResponse;
import org.museframework.bian.hedfunadm.dto.UpdateFundPerformanceFeeRoutineRequest;
import org.museframework.bian.hedfunadm.dto.UpdateFundPerformanceFeeRoutineResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Fund Inflows and Outflow Routine is an activity that is performed as one aspect of carrying out the Fund Inflows and Outflow Routine")
@GenericDomain(name="HedgeFundAdministration", group="FundPerformanceFeeRoutine")
public interface BqFundPerformanceFeeRoutine {
    @GenericDtxEndpoint
    @Description("Exchange Fund Performance Fee Routine")
    ExchangeFundPerformanceFeeRoutineResponse exchangeFundPerformanceFeeRoutine(ExchangeFundPerformanceFeeRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Grant Fund Performance Fee Routine")
    GrantFundPerformanceFeeRoutineResponse grantFundPerformanceFeeRoutine(GrantFundPerformanceFeeRoutineRequest req);

    @Description("Notify Fund Performance Fee Routine")
    NotifyFundPerformanceFeeRoutineResponse notifyFundPerformanceFeeRoutine(NotifyFundPerformanceFeeRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Request Fund Performance Fee Routine")
    RequestFundPerformanceFeeRoutineResponse requestFundPerformanceFeeRoutine(RequestFundPerformanceFeeRoutineRequest req);

    @Description("Retrieve Fund Performance Fee Routine")
    RetrieveFundPerformanceFeeRoutineResponse retrieveFundPerformanceFeeRoutine(RetrieveFundPerformanceFeeRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Update Fund Performance Fee Routine")
    UpdateFundPerformanceFeeRoutineResponse updateFundPerformanceFeeRoutine(UpdateFundPerformanceFeeRoutineRequest req);
}