package org.museframework.bian.chelocbox;

import org.museframework.bian.chelocbox.dto.ControlLockBoxFacilityRequest;
import org.museframework.bian.chelocbox.dto.ControlLockBoxFacilityResponse;
import org.museframework.bian.chelocbox.dto.ExchangeLockBoxFacilityRequest;
import org.museframework.bian.chelocbox.dto.ExchangeLockBoxFacilityResponse;
import org.museframework.bian.chelocbox.dto.ExecuteLockBoxFacilityRequest;
import org.museframework.bian.chelocbox.dto.ExecuteLockBoxFacilityResponse;
import org.museframework.bian.chelocbox.dto.InitiateLockBoxFacilityRequest;
import org.museframework.bian.chelocbox.dto.InitiateLockBoxFacilityResponse;
import org.museframework.bian.chelocbox.dto.NotifyLockBoxFacilityRequest;
import org.museframework.bian.chelocbox.dto.NotifyLockBoxFacilityResponse;
import org.museframework.bian.chelocbox.dto.RequestLockBoxFacilityRequest;
import org.museframework.bian.chelocbox.dto.RequestLockBoxFacilityResponse;
import org.museframework.bian.chelocbox.dto.RetrieveLockBoxFacilityRequest;
import org.museframework.bian.chelocbox.dto.RetrieveLockBoxFacilityResponse;
import org.museframework.bian.chelocbox.dto.UpdateLockBoxFacilityRequest;
import org.museframework.bian.chelocbox.dto.UpdateLockBoxFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Cheque Lock Box. ")
@GenericDomain(name="ChequeLockBox", group="LockBoxFacility")
public interface CrLockBoxFacility {
    @GenericDtxEndpoint
    @Description("Control Lock Box Facility")
    ControlLockBoxFacilityResponse controlLockBoxFacility(ControlLockBoxFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Lock Box Facility")
    ExchangeLockBoxFacilityResponse exchangeLockBoxFacility(ExchangeLockBoxFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Execute Lock Box Facility")
    ExecuteLockBoxFacilityResponse executeLockBoxFacility(ExecuteLockBoxFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Lock Box Facility")
    InitiateLockBoxFacilityResponse initiateLockBoxFacility(InitiateLockBoxFacilityRequest req);

    @Description("Notify Lock Box Facility")
    NotifyLockBoxFacilityResponse notifyLockBoxFacility(NotifyLockBoxFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Request Lock Box Facility")
    RequestLockBoxFacilityResponse requestLockBoxFacility(RequestLockBoxFacilityRequest req);

    @Description("Retrieve Lock Box Facility")
    RetrieveLockBoxFacilityResponse retrieveLockBoxFacility(RetrieveLockBoxFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Update Lock Box Facility")
    UpdateLockBoxFacilityResponse updateLockBoxFacility(UpdateLockBoxFacilityRequest req);
}