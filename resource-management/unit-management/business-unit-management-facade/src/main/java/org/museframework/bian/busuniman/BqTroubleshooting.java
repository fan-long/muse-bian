package org.museframework.bian.busuniman;

import org.museframework.bian.busuniman.dto.CreateTroubleshootingRequest;
import org.museframework.bian.busuniman.dto.CreateTroubleshootingResponse;
import org.museframework.bian.busuniman.dto.RequestTroubleshootingRequest;
import org.museframework.bian.busuniman.dto.RequestTroubleshootingResponse;
import org.museframework.bian.busuniman.dto.RetrieveTroubleshootingRequest;
import org.museframework.bian.busuniman.dto.RetrieveTroubleshootingResponse;
import org.museframework.bian.busuniman.dto.UpdateTroubleshootingRequest;
import org.museframework.bian.busuniman.dto.UpdateTroubleshootingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more responsibilities or tasks under management  Examples: Relationship development, Troubleshooting")
@GenericDomain(name="BusinessUnitManagement", group="Troubleshooting")
public interface BqTroubleshooting {
    @GenericDtxEndpoint
    @Description("CrBQ Create a service troubleshooting activity (to address major production issue)")
    CreateTroubleshootingResponse createTroubleshooting(CreateTroubleshootingRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of a troubleshooting plan item")
    UpdateTroubleshootingResponse updateTroubleshooting(UpdateTroubleshootingRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention to a troubleshooting action")
    RequestTroubleshootingResponse requestTroubleshooting(RequestTroubleshootingRequest req);

    @Description("ReBQ Retrieve details about troubleshooting activity")
    RetrieveTroubleshootingResponse retrieveTroubleshooting(RetrieveTroubleshootingRequest req);
}