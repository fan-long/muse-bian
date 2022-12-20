package org.museframework.bian.achoperations;

import org.museframework.bian.achoperations.dto.InitiateOutboundACHRequest;
import org.museframework.bian.achoperations.dto.InitiateOutboundACHResponse;
import org.museframework.bian.achoperations.dto.RetrieveOutboundACHRequest;
import org.museframework.bian.achoperations.dto.RetrieveOutboundACHResponse;
import org.museframework.bian.achoperations.dto.UpdateOutboundACHRequest;
import org.museframework.bian.achoperations.dto.UpdateOutboundACHResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="ACHOperations", group="OutboundACH")
public interface BqOutboundACH {
    @GenericDtxEndpoint
    @Description("InBQ Initiate an outbound ACH transaction batch handling")
    InitiateOutboundACHResponse initiateOutboundACH(InitiateOutboundACHRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update an outbound ACH transaction batch")
    UpdateOutboundACHResponse updateOutboundACH(UpdateOutboundACHRequest req);

    @Description("ReBQ Retrieve details about an outbound ACH transaction batch")
    RetrieveOutboundACHResponse retrieveOutboundACH(RetrieveOutboundACHRequest req);
}