package org.museframework.bian.opeiteman;

import org.museframework.bian.opeiteman.dto.RetrieveTrackingRequest;
import org.museframework.bian.opeiteman.dto.RetrieveTrackingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="OpenItemManagement", group="Tracking")
public interface BqTracking {
    @Description("ReBQ Retrieve tracking details about an open item")
    RetrieveTrackingResponse retrieveTracking(RetrieveTrackingRequest req);
}