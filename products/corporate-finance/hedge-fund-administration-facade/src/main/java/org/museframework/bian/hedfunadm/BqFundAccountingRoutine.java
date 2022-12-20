package org.museframework.bian.hedfunadm;

import org.museframework.bian.hedfunadm.dto.ExchangeFundAccountingRoutineRequest;
import org.museframework.bian.hedfunadm.dto.ExchangeFundAccountingRoutineResponse;
import org.museframework.bian.hedfunadm.dto.GrantFundAccountingRoutineRequest;
import org.museframework.bian.hedfunadm.dto.GrantFundAccountingRoutineResponse;
import org.museframework.bian.hedfunadm.dto.NotifyFundAccountingRoutineRequest;
import org.museframework.bian.hedfunadm.dto.NotifyFundAccountingRoutineResponse;
import org.museframework.bian.hedfunadm.dto.RequestFundAccountingRoutineRequest;
import org.museframework.bian.hedfunadm.dto.RequestFundAccountingRoutineResponse;
import org.museframework.bian.hedfunadm.dto.RetrieveFundAccountingRoutineRequest;
import org.museframework.bian.hedfunadm.dto.RetrieveFundAccountingRoutineResponse;
import org.museframework.bian.hedfunadm.dto.UpdateFundAccountingRoutineRequest;
import org.museframework.bian.hedfunadm.dto.UpdateFundAccountingRoutineResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Fund Inflows and Outflow Routine is an activity that is performed as one aspect of carrying out the Fund Inflows and Outflow Routine")
@GenericDomain(name="HedgeFundAdministration", group="FundAccountingRoutine")
public interface BqFundAccountingRoutine {
    @GenericDtxEndpoint
    @Description("Exchange Fund Accounting Routine")
    ExchangeFundAccountingRoutineResponse exchangeFundAccountingRoutine(ExchangeFundAccountingRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Grant Fund Accounting Routine")
    GrantFundAccountingRoutineResponse grantFundAccountingRoutine(GrantFundAccountingRoutineRequest req);

    @Description("Notify Fund Accounting Routine")
    NotifyFundAccountingRoutineResponse notifyFundAccountingRoutine(NotifyFundAccountingRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Request Fund Accounting Routine")
    RequestFundAccountingRoutineResponse requestFundAccountingRoutine(RequestFundAccountingRoutineRequest req);

    @Description("Retrieve Fund Accounting Routine")
    RetrieveFundAccountingRoutineResponse retrieveFundAccountingRoutine(RetrieveFundAccountingRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Update Fund Accounting Routine")
    UpdateFundAccountingRoutineResponse updateFundAccountingRoutine(UpdateFundAccountingRoutineRequest req);
}