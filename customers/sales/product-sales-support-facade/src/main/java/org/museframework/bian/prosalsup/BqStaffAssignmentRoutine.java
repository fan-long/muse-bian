package org.museframework.bian.prosalsup;

import org.museframework.bian.prosalsup.dto.ExchangeStaffAssignmentRoutineRequest;
import org.museframework.bian.prosalsup.dto.ExchangeStaffAssignmentRoutineResponse;
import org.museframework.bian.prosalsup.dto.GrantStaffAssignmentRoutineRequest;
import org.museframework.bian.prosalsup.dto.GrantStaffAssignmentRoutineResponse;
import org.museframework.bian.prosalsup.dto.NotifyStaffAssignmentRoutineRequest;
import org.museframework.bian.prosalsup.dto.NotifyStaffAssignmentRoutineResponse;
import org.museframework.bian.prosalsup.dto.RequestStaffAssignmentRoutineRequest;
import org.museframework.bian.prosalsup.dto.RequestStaffAssignmentRoutineResponse;
import org.museframework.bian.prosalsup.dto.RetrieveStaffAssignmentRoutineRequest;
import org.museframework.bian.prosalsup.dto.RetrieveStaffAssignmentRoutineResponse;
import org.museframework.bian.prosalsup.dto.UpdateStaffAssignmentRoutineRequest;
import org.museframework.bian.prosalsup.dto.UpdateStaffAssignmentRoutineResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Staff Availability Tracking Routine is an activity that is performed as one aspect of carrying out the Staff Availability Tracking Routine")
@GenericDomain(name="ProductSalesSupport", group="StaffAssignmentRoutine")
public interface BqStaffAssignmentRoutine {
    @GenericDtxEndpoint
    @Description("Exchange Staff Assignment Routine")
    ExchangeStaffAssignmentRoutineResponse exchangeStaffAssignmentRoutine(ExchangeStaffAssignmentRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Grant Staff Assignment Routine")
    GrantStaffAssignmentRoutineResponse grantStaffAssignmentRoutine(GrantStaffAssignmentRoutineRequest req);

    @Description("Notify Staff Assignment Routine")
    NotifyStaffAssignmentRoutineResponse notifyStaffAssignmentRoutine(NotifyStaffAssignmentRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Request Staff Assignment Routine")
    RequestStaffAssignmentRoutineResponse requestStaffAssignmentRoutine(RequestStaffAssignmentRoutineRequest req);

    @Description("Retrieve Staff Assignment Routine")
    RetrieveStaffAssignmentRoutineResponse retrieveStaffAssignmentRoutine(RetrieveStaffAssignmentRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Update Staff Assignment Routine")
    UpdateStaffAssignmentRoutineResponse updateStaffAssignmentRoutine(UpdateStaffAssignmentRoutineRequest req);
}