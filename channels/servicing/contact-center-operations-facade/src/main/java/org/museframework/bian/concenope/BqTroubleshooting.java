package org.museframework.bian.concenope;

import org.museframework.bian.concenope.dto.CreateTroubleshootingRequest;
import org.museframework.bian.concenope.dto.CreateTroubleshootingResponse;
import org.museframework.bian.concenope.dto.RequestTroubleshootingRequest;
import org.museframework.bian.concenope.dto.RequestTroubleshootingResponse;
import org.museframework.bian.concenope.dto.RetrieveTroubleshootingRequest;
import org.museframework.bian.concenope.dto.RetrieveTroubleshootingResponse;
import org.museframework.bian.concenope.dto.UpdateTroubleshootingRequest;
import org.museframework.bian.concenope.dto.UpdateTroubleshootingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more clerical routines that are to be followed to administer the operational unit/function  Examples: Time-sheet recording")
@GenericDomain(name="ContactCenterOperations", group="Troubleshooting")
public interface BqTroubleshooting {
    @GenericDtxEndpoint
    @Description("CrBQ Create a troubleshooting response task")
    CreateTroubleshootingResponse createTroubleshooting(CreateTroubleshootingRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update aspects of a troubleshooting task")
    UpdateTroubleshootingResponse updateTroubleshooting(UpdateTroubleshootingRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ request manual intervention in troubleshooting activity")
    RequestTroubleshootingResponse requestTroubleshooting(RequestTroubleshootingRequest req);

    @Description("ReBQ Retrieve details about troubleshooting activity")
    RetrieveTroubleshootingResponse retrieveTroubleshooting(RetrieveTroubleshootingRequest req);
}