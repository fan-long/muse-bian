package org.museframework.bian.achoperations;

import org.museframework.bian.achoperations.dto.InitiateWarehousingRequest;
import org.museframework.bian.achoperations.dto.InitiateWarehousingResponse;
import org.museframework.bian.achoperations.dto.RetrieveWarehousingRequest;
import org.museframework.bian.achoperations.dto.RetrieveWarehousingResponse;
import org.museframework.bian.achoperations.dto.UpdateWarehousingRequest;
import org.museframework.bian.achoperations.dto.UpdateWarehousingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="ACHOperations", group="Warehousing")
public interface BqWarehousing {
    @GenericDtxEndpoint
    @Description("InBQ Initiate a warehoused outbound ACH transaction batch")
    InitiateWarehousingResponse initiateWarehousing(InitiateWarehousingRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update a warehoused outbound ACH transaction batch")
    UpdateWarehousingResponse updateWarehousing(UpdateWarehousingRequest req);

    @Description("ReBQ Retrieve details about a warehoused outbound ACH transaction batch")
    RetrieveWarehousingResponse retrieveWarehousing(RetrieveWarehousingRequest req);
}