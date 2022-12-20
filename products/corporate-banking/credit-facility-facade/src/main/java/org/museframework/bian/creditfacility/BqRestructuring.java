package org.museframework.bian.creditfacility;

import org.museframework.bian.creditfacility.dto.RequestRestructuringRequest;
import org.museframework.bian.creditfacility.dto.RequestRestructuringResponse;
import org.museframework.bian.creditfacility.dto.RetrieveRestructuringRequest;
import org.museframework.bian.creditfacility.dto.RetrieveRestructuringResponse;
import org.museframework.bian.creditfacility.dto.UpdateRestructuringRequest;
import org.museframework.bian.creditfacility.dto.UpdateRestructuringResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="CreditFacility", group="Restructuring")
public interface BqRestructuring {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of a credit facility's restructuring activities")
    UpdateRestructuringResponse updateRestructuring(UpdateRestructuringRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request activity associated with a restructuring effort")
    RequestRestructuringResponse requestRestructuring(RequestRestructuringRequest req);

    @Description("ReBQ Retrieve details about a credit facility restructuring task")
    RetrieveRestructuringResponse retrieveRestructuring(RetrieveRestructuringRequest req);
}