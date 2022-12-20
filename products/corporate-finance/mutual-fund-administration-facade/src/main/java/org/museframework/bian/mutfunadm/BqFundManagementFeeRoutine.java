package org.museframework.bian.mutfunadm;

import org.museframework.bian.mutfunadm.dto.ExchangeFundManagementFeeRoutineRequest;
import org.museframework.bian.mutfunadm.dto.ExchangeFundManagementFeeRoutineResponse;
import org.museframework.bian.mutfunadm.dto.GrantFundManagementFeeRoutineRequest;
import org.museframework.bian.mutfunadm.dto.GrantFundManagementFeeRoutineResponse;
import org.museframework.bian.mutfunadm.dto.NotifyFundManagementFeeRoutineRequest;
import org.museframework.bian.mutfunadm.dto.NotifyFundManagementFeeRoutineResponse;
import org.museframework.bian.mutfunadm.dto.RequestFundManagementFeeRoutineRequest;
import org.museframework.bian.mutfunadm.dto.RequestFundManagementFeeRoutineResponse;
import org.museframework.bian.mutfunadm.dto.RetrieveFundManagementFeeRoutineRequest;
import org.museframework.bian.mutfunadm.dto.RetrieveFundManagementFeeRoutineResponse;
import org.museframework.bian.mutfunadm.dto.UpdateFundManagementFeeRoutineRequest;
import org.museframework.bian.mutfunadm.dto.UpdateFundManagementFeeRoutineResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Fund Investor, Middle and Back Office Service Routine is an activity that is performed as one aspect of carrying out the Fund Investor, Middle and Back Office Service Routine")
@GenericDomain(name="MutualFundAdministration", group="FundManagementFeeRoutine")
public interface BqFundManagementFeeRoutine {
    @GenericDtxEndpoint
    @Description("Exchange Fund Management Fee Routine")
    ExchangeFundManagementFeeRoutineResponse exchangeFundManagementFeeRoutine(ExchangeFundManagementFeeRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Grant Fund Management Fee Routine")
    GrantFundManagementFeeRoutineResponse grantFundManagementFeeRoutine(GrantFundManagementFeeRoutineRequest req);

    @Description("Notify Fund Management Fee Routine")
    NotifyFundManagementFeeRoutineResponse notifyFundManagementFeeRoutine(NotifyFundManagementFeeRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Request Fund Management Fee Routine")
    RequestFundManagementFeeRoutineResponse requestFundManagementFeeRoutine(RequestFundManagementFeeRoutineRequest req);

    @Description("Retrieve Fund Management Fee Routine")
    RetrieveFundManagementFeeRoutineResponse retrieveFundManagementFeeRoutine(RetrieveFundManagementFeeRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Update Fund Management Fee Routine")
    UpdateFundManagementFeeRoutineResponse updateFundManagementFeeRoutine(UpdateFundManagementFeeRoutineRequest req);
}