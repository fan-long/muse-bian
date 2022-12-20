package org.museframework.bian.hedfunadm;

import org.museframework.bian.hedfunadm.dto.ExchangeFundDevelopmentRoutineRequest;
import org.museframework.bian.hedfunadm.dto.ExchangeFundDevelopmentRoutineResponse;
import org.museframework.bian.hedfunadm.dto.GrantFundDevelopmentRoutineRequest;
import org.museframework.bian.hedfunadm.dto.GrantFundDevelopmentRoutineResponse;
import org.museframework.bian.hedfunadm.dto.NotifyFundDevelopmentRoutineRequest;
import org.museframework.bian.hedfunadm.dto.NotifyFundDevelopmentRoutineResponse;
import org.museframework.bian.hedfunadm.dto.RequestFundDevelopmentRoutineRequest;
import org.museframework.bian.hedfunadm.dto.RequestFundDevelopmentRoutineResponse;
import org.museframework.bian.hedfunadm.dto.RetrieveFundDevelopmentRoutineRequest;
import org.museframework.bian.hedfunadm.dto.RetrieveFundDevelopmentRoutineResponse;
import org.museframework.bian.hedfunadm.dto.UpdateFundDevelopmentRoutineRequest;
import org.museframework.bian.hedfunadm.dto.UpdateFundDevelopmentRoutineResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Fund Inflows and Outflow Routine is an activity that is performed as one aspect of carrying out the Fund Inflows and Outflow Routine")
@GenericDomain(name="HedgeFundAdministration", group="FundDevelopmentRoutine")
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