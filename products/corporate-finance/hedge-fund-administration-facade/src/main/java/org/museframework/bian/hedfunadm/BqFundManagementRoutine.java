package org.museframework.bian.hedfunadm;

import org.museframework.bian.hedfunadm.dto.ExchangeFundManagementRoutineRequest;
import org.museframework.bian.hedfunadm.dto.ExchangeFundManagementRoutineResponse;
import org.museframework.bian.hedfunadm.dto.GrantFundManagementRoutineRequest;
import org.museframework.bian.hedfunadm.dto.GrantFundManagementRoutineResponse;
import org.museframework.bian.hedfunadm.dto.NotifyFundManagementRoutineRequest;
import org.museframework.bian.hedfunadm.dto.NotifyFundManagementRoutineResponse;
import org.museframework.bian.hedfunadm.dto.RequestFundManagementRoutineRequest;
import org.museframework.bian.hedfunadm.dto.RequestFundManagementRoutineResponse;
import org.museframework.bian.hedfunadm.dto.RetrieveFundManagementRoutineRequest;
import org.museframework.bian.hedfunadm.dto.RetrieveFundManagementRoutineResponse;
import org.museframework.bian.hedfunadm.dto.UpdateFundManagementRoutineRequest;
import org.museframework.bian.hedfunadm.dto.UpdateFundManagementRoutineResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Fund Inflows and Outflow Routine is an activity that is performed as one aspect of carrying out the Fund Inflows and Outflow Routine")
@GenericDomain(name="HedgeFundAdministration", group="FundManagementRoutine")
public interface BqFundManagementRoutine {
    @GenericDtxEndpoint
    @Description("Exchange Fund Management Routine")
    ExchangeFundManagementRoutineResponse exchangeFundManagementRoutine(ExchangeFundManagementRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Grant Fund Management Routine")
    GrantFundManagementRoutineResponse grantFundManagementRoutine(GrantFundManagementRoutineRequest req);

    @Description("Notify Fund Management Routine")
    NotifyFundManagementRoutineResponse notifyFundManagementRoutine(NotifyFundManagementRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Request Fund Management Routine")
    RequestFundManagementRoutineResponse requestFundManagementRoutine(RequestFundManagementRoutineRequest req);

    @Description("Retrieve Fund Management Routine")
    RetrieveFundManagementRoutineResponse retrieveFundManagementRoutine(RetrieveFundManagementRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Update Fund Management Routine")
    UpdateFundManagementRoutineResponse updateFundManagementRoutine(UpdateFundManagementRoutineRequest req);
}