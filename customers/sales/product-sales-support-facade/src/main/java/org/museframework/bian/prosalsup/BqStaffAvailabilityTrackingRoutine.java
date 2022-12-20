package org.museframework.bian.prosalsup;

import org.museframework.bian.prosalsup.dto.ExchangeStaffAvailabilityTrackingRoutineRequest;
import org.museframework.bian.prosalsup.dto.ExchangeStaffAvailabilityTrackingRoutineResponse;
import org.museframework.bian.prosalsup.dto.GrantStaffAvailabilityTrackingRoutineRequest;
import org.museframework.bian.prosalsup.dto.GrantStaffAvailabilityTrackingRoutineResponse;
import org.museframework.bian.prosalsup.dto.NotifyStaffAvailabilityTrackingRoutineRequest;
import org.museframework.bian.prosalsup.dto.NotifyStaffAvailabilityTrackingRoutineResponse;
import org.museframework.bian.prosalsup.dto.RequestStaffAvailabilityTrackingRoutineRequest;
import org.museframework.bian.prosalsup.dto.RequestStaffAvailabilityTrackingRoutineResponse;
import org.museframework.bian.prosalsup.dto.RetrieveStaffAvailabilityTrackingRoutineRequest;
import org.museframework.bian.prosalsup.dto.RetrieveStaffAvailabilityTrackingRoutineResponse;
import org.museframework.bian.prosalsup.dto.UpdateStaffAvailabilityTrackingRoutineRequest;
import org.museframework.bian.prosalsup.dto.UpdateStaffAvailabilityTrackingRoutineResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Staff Availability Tracking Routine is an activity that is performed as one aspect of carrying out the Staff Availability Tracking Routine")
@GenericDomain(name="ProductSalesSupport", group="StaffAvailabilityTrackingRoutine")
public interface BqStaffAvailabilityTrackingRoutine {
    @GenericDtxEndpoint
    @Description("Exchange Staff Availability Tracking Routine")
    ExchangeStaffAvailabilityTrackingRoutineResponse exchangeStaffAvailabilityTrackingRoutine(ExchangeStaffAvailabilityTrackingRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Grant Staff Availability Tracking Routine")
    GrantStaffAvailabilityTrackingRoutineResponse grantStaffAvailabilityTrackingRoutine(GrantStaffAvailabilityTrackingRoutineRequest req);

    @Description("Notify Staff Availability Tracking Routine")
    NotifyStaffAvailabilityTrackingRoutineResponse notifyStaffAvailabilityTrackingRoutine(NotifyStaffAvailabilityTrackingRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Request Staff Availability Tracking Routine")
    RequestStaffAvailabilityTrackingRoutineResponse requestStaffAvailabilityTrackingRoutine(RequestStaffAvailabilityTrackingRoutineRequest req);

    @Description("Retrieve Staff Availability Tracking Routine")
    RetrieveStaffAvailabilityTrackingRoutineResponse retrieveStaffAvailabilityTrackingRoutine(RetrieveStaffAvailabilityTrackingRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Update Staff Availability Tracking Routine")
    UpdateStaffAvailabilityTrackingRoutineResponse updateStaffAvailabilityTrackingRoutine(UpdateStaffAvailabilityTrackingRoutineRequest req);
}