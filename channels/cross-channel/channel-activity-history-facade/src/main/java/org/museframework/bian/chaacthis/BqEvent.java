package org.museframework.bian.chaacthis;

import org.museframework.bian.chaacthis.dto.CaptureEventRequest;
import org.museframework.bian.chaacthis.dto.CaptureEventResponse;
import org.museframework.bian.chaacthis.dto.RetrieveEventRequest;
import org.museframework.bian.chaacthis.dto.RetrieveEventResponse;
import org.museframework.bian.chaacthis.dto.UpdateEventRequest;
import org.museframework.bian.chaacthis.dto.UpdateEventResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of the events/transactions recorded by the log  Examples: Customer life event, Servicing event")
@GenericDomain(name="ChannelActivityHistory", group="Event")
public interface BqEvent {
    @GenericDtxEndpoint
    @Description("UpBQ Update a logged event for a customer")
    UpdateEventResponse updateEvent(UpdateEventRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture a channel access event in the log")
    CaptureEventResponse captureEvent(CaptureEventRequest req);

    @Description("ReBQ Retrieve details about a logged channel activity event")
    RetrieveEventResponse retrieveEvent(RetrieveEventRequest req);
}