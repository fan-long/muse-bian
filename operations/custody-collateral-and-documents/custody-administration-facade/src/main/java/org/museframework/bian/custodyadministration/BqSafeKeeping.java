package org.museframework.bian.custodyadministration;

import org.museframework.bian.custodyadministration.dto.ControlSafeKeepingRequest;
import org.museframework.bian.custodyadministration.dto.ControlSafeKeepingResponse;
import org.museframework.bian.custodyadministration.dto.RequestSafeKeepingRequest;
import org.museframework.bian.custodyadministration.dto.RequestSafeKeepingResponse;
import org.museframework.bian.custodyadministration.dto.RetrieveSafeKeepingRequest;
import org.museframework.bian.custodyadministration.dto.RetrieveSafeKeepingResponse;
import org.museframework.bian.custodyadministration.dto.UpdateSafeKeepingRequest;
import org.museframework.bian.custodyadministration.dto.UpdateSafeKeepingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Custody Administration.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="CustodyAdministration", group="SafeKeeping")
public interface BqSafeKeeping {
    @GenericDtxEndpoint
    @Description("CoBQ Control the processing of Safe Keeping")
    ControlSafeKeepingResponse controlSafeKeeping(ControlSafeKeepingRequest req);

    @Description("ReBQ Retrieve details about any aspect of Safe Keeping")
    RetrieveSafeKeepingResponse retrieveSafeKeeping(RetrieveSafeKeepingRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Safe Keeping")
    RequestSafeKeepingResponse requestSafeKeeping(RequestSafeKeepingRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Safe Keeping")
    UpdateSafeKeepingResponse updateSafeKeeping(UpdateSafeKeepingRequest req);
}