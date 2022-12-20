package org.museframework.bian.mutfunadm;

import org.museframework.bian.mutfunadm.dto.ExchangeFundInvestor_MiddleandBackOfficeServiceRoutineRequest;
import org.museframework.bian.mutfunadm.dto.ExchangeFundInvestor_MiddleandBackOfficeServiceRoutineResponse;
import org.museframework.bian.mutfunadm.dto.GrantFundInvestor_MiddleandBackOfficeServiceRoutineRequest;
import org.museframework.bian.mutfunadm.dto.GrantFundInvestor_MiddleandBackOfficeServiceRoutineResponse;
import org.museframework.bian.mutfunadm.dto.NotifyFundInvestor_MiddleandBackOfficeServiceRoutineRequest;
import org.museframework.bian.mutfunadm.dto.NotifyFundInvestor_MiddleandBackOfficeServiceRoutineResponse;
import org.museframework.bian.mutfunadm.dto.RequestFundInvestor_MiddleandBackOfficeServiceRoutineRequest;
import org.museframework.bian.mutfunadm.dto.RequestFundInvestor_MiddleandBackOfficeServiceRoutineResponse;
import org.museframework.bian.mutfunadm.dto.RetrieveFundInvestor_MiddleandBackOfficeServiceRoutineRequest;
import org.museframework.bian.mutfunadm.dto.RetrieveFundInvestor_MiddleandBackOfficeServiceRoutineResponse;
import org.museframework.bian.mutfunadm.dto.UpdateFundInvestor_MiddleandBackOfficeServiceRoutineRequest;
import org.museframework.bian.mutfunadm.dto.UpdateFundInvestor_MiddleandBackOfficeServiceRoutineResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Fund Investor, Middle and Back Office Service Routine is an activity that is performed as one aspect of carrying out the Fund Investor, Middle and Back Office Service Routine")
@GenericDomain(name="MutualFundAdministration", group="FundInvestor_MiddleandBackOfficeServiceRoutine")
public interface BqFundInvestor_MiddleandBackOfficeServiceRoutine {
    @GenericDtxEndpoint
    @Description("Exchange Fund Investor, Middle and Back Office Service Routine")
    ExchangeFundInvestor_MiddleandBackOfficeServiceRoutineResponse exchangeFundInvestor_MiddleandBackOfficeServiceRoutine(ExchangeFundInvestor_MiddleandBackOfficeServiceRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Grant Fund Investor, Middle and Back Office Service Routine")
    GrantFundInvestor_MiddleandBackOfficeServiceRoutineResponse grantFundInvestor_MiddleandBackOfficeServiceRoutine(GrantFundInvestor_MiddleandBackOfficeServiceRoutineRequest req);

    @Description("Notify Fund Investor, Middle and Back Office Service Routine")
    NotifyFundInvestor_MiddleandBackOfficeServiceRoutineResponse notifyFundInvestor_MiddleandBackOfficeServiceRoutine(NotifyFundInvestor_MiddleandBackOfficeServiceRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Request Fund Investor, Middle and Back Office Service Routine")
    RequestFundInvestor_MiddleandBackOfficeServiceRoutineResponse requestFundInvestor_MiddleandBackOfficeServiceRoutine(RequestFundInvestor_MiddleandBackOfficeServiceRoutineRequest req);

    @Description("Retrieve Fund Investor, Middle and Back Office Service Routine")
    RetrieveFundInvestor_MiddleandBackOfficeServiceRoutineResponse retrieveFundInvestor_MiddleandBackOfficeServiceRoutine(RetrieveFundInvestor_MiddleandBackOfficeServiceRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Update Fund Investor, Middle and Back Office Service Routine")
    UpdateFundInvestor_MiddleandBackOfficeServiceRoutineResponse updateFundInvestor_MiddleandBackOfficeServiceRoutine(UpdateFundInvestor_MiddleandBackOfficeServiceRoutineRequest req);
}