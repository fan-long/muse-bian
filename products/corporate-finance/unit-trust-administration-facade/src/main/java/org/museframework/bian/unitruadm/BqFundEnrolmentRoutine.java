package org.museframework.bian.unitruadm;

import org.museframework.bian.unitruadm.dto.ExchangeFundEnrolmentRoutineRequest;
import org.museframework.bian.unitruadm.dto.ExchangeFundEnrolmentRoutineResponse;
import org.museframework.bian.unitruadm.dto.GrantFundEnrolmentRoutineRequest;
import org.museframework.bian.unitruadm.dto.GrantFundEnrolmentRoutineResponse;
import org.museframework.bian.unitruadm.dto.NotifyFundEnrolmentRoutineRequest;
import org.museframework.bian.unitruadm.dto.NotifyFundEnrolmentRoutineResponse;
import org.museframework.bian.unitruadm.dto.RequestFundEnrolmentRoutineRequest;
import org.museframework.bian.unitruadm.dto.RequestFundEnrolmentRoutineResponse;
import org.museframework.bian.unitruadm.dto.RetrieveFundEnrolmentRoutineRequest;
import org.museframework.bian.unitruadm.dto.RetrieveFundEnrolmentRoutineResponse;
import org.museframework.bian.unitruadm.dto.UpdateFundEnrolmentRoutineRequest;
import org.museframework.bian.unitruadm.dto.UpdateFundEnrolmentRoutineResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Fund Investor, Middle and Back Office Service Routine is an activity that is performed as one aspect of carrying out the Fund Investor, Middle and Back Office Service Routine")
@GenericDomain(name="UnitTrustAdministration", group="FundEnrolmentRoutine")
public interface BqFundEnrolmentRoutine {
    @GenericDtxEndpoint
    @Description("Exchange Fund Enrolment Routine")
    ExchangeFundEnrolmentRoutineResponse exchangeFundEnrolmentRoutine(ExchangeFundEnrolmentRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Grant Fund Enrolment Routine")
    GrantFundEnrolmentRoutineResponse grantFundEnrolmentRoutine(GrantFundEnrolmentRoutineRequest req);

    @Description("Notify Fund Enrolment Routine")
    NotifyFundEnrolmentRoutineResponse notifyFundEnrolmentRoutine(NotifyFundEnrolmentRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Request Fund Enrolment Routine")
    RequestFundEnrolmentRoutineResponse requestFundEnrolmentRoutine(RequestFundEnrolmentRoutineRequest req);

    @Description("Retrieve Fund Enrolment Routine")
    RetrieveFundEnrolmentRoutineResponse retrieveFundEnrolmentRoutine(RetrieveFundEnrolmentRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Update Fund Enrolment Routine")
    UpdateFundEnrolmentRoutineResponse updateFundEnrolmentRoutine(UpdateFundEnrolmentRoutineRequest req);
}