package org.museframework.bian.mutfunadm;

import org.museframework.bian.mutfunadm.dto.ExchangeFundDevelopmentRoutineRequest;
import org.museframework.bian.mutfunadm.dto.ExchangeFundDevelopmentRoutineResponse;
import org.museframework.bian.mutfunadm.dto.GrantFundDevelopmentRoutineRequest;
import org.museframework.bian.mutfunadm.dto.GrantFundDevelopmentRoutineResponse;
import org.museframework.bian.mutfunadm.dto.NotifyFundDevelopmentRoutineRequest;
import org.museframework.bian.mutfunadm.dto.NotifyFundDevelopmentRoutineResponse;
import org.museframework.bian.mutfunadm.dto.RequestFundDevelopmentRoutineRequest;
import org.museframework.bian.mutfunadm.dto.RequestFundDevelopmentRoutineResponse;
import org.museframework.bian.mutfunadm.dto.RetrieveFundDevelopmentRoutineRequest;
import org.museframework.bian.mutfunadm.dto.RetrieveFundDevelopmentRoutineResponse;
import org.museframework.bian.mutfunadm.dto.UpdateFundDevelopmentRoutineRequest;
import org.museframework.bian.mutfunadm.dto.UpdateFundDevelopmentRoutineResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Fund Investor, Middle and Back Office Service Routine is an activity that is performed as one aspect of carrying out the Fund Investor, Middle and Back Office Service Routine")
@GenericDomain(name="MutualFundAdministration", group="FundDevelopmentRoutine")
public interface BqFundDevelopmentRoutine {
    @GenericDtxEndpoint
    @Description("Exchange Fund Development Routine")
    ExchangeFundDevelopmentRoutineResponse exchangeFundDevelopmentRoutine(ExchangeFundDevelopmentRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Grant Fund Development Routine")
    GrantFundDevelopmentRoutineResponse grantFundDevelopmentRoutine(GrantFundDevelopmentRoutineRequest req);

    @Description("Notify Fund Development Routine")
    NotifyFundDevelopmentRoutineResponse notifyFundDevelopmentRoutine(NotifyFundDevelopmentRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Request Fund Development Routine")
    RequestFundDevelopmentRoutineResponse requestFundDevelopmentRoutine(RequestFundDevelopmentRoutineRequest req);

    @Description("Retrieve Fund Development Routine")
    RetrieveFundDevelopmentRoutineResponse retrieveFundDevelopmentRoutine(RetrieveFundDevelopmentRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Update Fund Development Routine")
    UpdateFundDevelopmentRoutineResponse updateFundDevelopmentRoutine(UpdateFundDevelopmentRoutineRequest req);
}