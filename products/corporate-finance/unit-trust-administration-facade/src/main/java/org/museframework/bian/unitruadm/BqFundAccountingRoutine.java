package org.museframework.bian.unitruadm;

import org.museframework.bian.unitruadm.dto.ExchangeFundAccountingRoutineRequest;
import org.museframework.bian.unitruadm.dto.ExchangeFundAccountingRoutineResponse;
import org.museframework.bian.unitruadm.dto.GrantFundAccountingRoutineRequest;
import org.museframework.bian.unitruadm.dto.GrantFundAccountingRoutineResponse;
import org.museframework.bian.unitruadm.dto.NotifyFundAccountingRoutineRequest;
import org.museframework.bian.unitruadm.dto.NotifyFundAccountingRoutineResponse;
import org.museframework.bian.unitruadm.dto.RequestFundAccountingRoutineRequest;
import org.museframework.bian.unitruadm.dto.RequestFundAccountingRoutineResponse;
import org.museframework.bian.unitruadm.dto.RetrieveFundAccountingRoutineRequest;
import org.museframework.bian.unitruadm.dto.RetrieveFundAccountingRoutineResponse;
import org.museframework.bian.unitruadm.dto.UpdateFundAccountingRoutineRequest;
import org.museframework.bian.unitruadm.dto.UpdateFundAccountingRoutineResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Fund Investor, Middle and Back Office Service Routine is an activity that is performed as one aspect of carrying out the Fund Investor, Middle and Back Office Service Routine")
@GenericDomain(name="UnitTrustAdministration", group="FundAccountingRoutine")
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