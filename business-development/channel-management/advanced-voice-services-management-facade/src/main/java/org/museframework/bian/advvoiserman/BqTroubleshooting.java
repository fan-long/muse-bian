package org.museframework.bian.advvoiserman;

import org.museframework.bian.advvoiserman.dto.RequestTroubleshootingRequest;
import org.museframework.bian.advvoiserman.dto.RequestTroubleshootingResponse;
import org.museframework.bian.advvoiserman.dto.RetrieveTroubleshootingRequest;
import org.museframework.bian.advvoiserman.dto.RetrieveTroubleshootingResponse;
import org.museframework.bian.advvoiserman.dto.UpdateTroubleshootingRequest;
import org.museframework.bian.advvoiserman.dto.UpdateTroubleshootingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more responsibilities or tasks under management  Examples: Relationship development, Troubleshooting")
@GenericDomain(name="AdvancedVoiceServicesManagement", group="Troubleshooting")
public interface BqTroubleshooting {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of a production issue, root cause or remedial action recommendation")
    UpdateTroubleshootingResponse updateTroubleshooting(UpdateTroubleshootingRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention in troubleshooting tasks")
    RequestTroubleshootingResponse requestTroubleshooting(RequestTroubleshootingRequest req);

    @Description("ReBQ Retrieve details about troubleshooting tasks, root cause and proposed remedial actions")
    RetrieveTroubleshootingResponse retrieveTroubleshooting(RetrieveTroubleshootingRequest req);
}