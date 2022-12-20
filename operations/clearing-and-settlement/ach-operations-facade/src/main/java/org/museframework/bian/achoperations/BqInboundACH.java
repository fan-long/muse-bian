package org.museframework.bian.achoperations;

import org.museframework.bian.achoperations.dto.InitiateInboundACHRequest;
import org.museframework.bian.achoperations.dto.InitiateInboundACHResponse;
import org.museframework.bian.achoperations.dto.RetrieveInboundACHRequest;
import org.museframework.bian.achoperations.dto.RetrieveInboundACHResponse;
import org.museframework.bian.achoperations.dto.UpdateInboundACHRequest;
import org.museframework.bian.achoperations.dto.UpdateInboundACHResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="ACHOperations", group="InboundACH")
public interface BqInboundACH {
    @GenericDtxEndpoint
    @Description("InBQ Initiate an inbound ACH transaction batch handling")
    InitiateInboundACHResponse initiateInboundACH(InitiateInboundACHRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update an inbound ACH transaction batch")
    UpdateInboundACHResponse updateInboundACH(UpdateInboundACHRequest req);

    @Description("ReBQ Retrieve details about an inbound ACH transaction batch")
    RetrieveInboundACHResponse retrieveInboundACH(RetrieveInboundACHRequest req);
}