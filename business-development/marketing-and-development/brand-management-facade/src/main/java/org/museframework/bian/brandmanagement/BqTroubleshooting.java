package org.museframework.bian.brandmanagement;

import org.museframework.bian.brandmanagement.dto.CreateTroubleshootingRequest;
import org.museframework.bian.brandmanagement.dto.CreateTroubleshootingResponse;
import org.museframework.bian.brandmanagement.dto.RequestTroubleshootingRequest;
import org.museframework.bian.brandmanagement.dto.RequestTroubleshootingResponse;
import org.museframework.bian.brandmanagement.dto.RetrieveTroubleshootingRequest;
import org.museframework.bian.brandmanagement.dto.RetrieveTroubleshootingResponse;
import org.museframework.bian.brandmanagement.dto.UpdateTroubleshootingRequest;
import org.museframework.bian.brandmanagement.dto.UpdateTroubleshootingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more responsibilities or tasks under management  Examples: Relationship development, Troubleshooting")
@GenericDomain(name="BrandManagement", group="Troubleshooting")
public interface BqTroubleshooting {
    @GenericDtxEndpoint
    @Description("CrBQ Create a brand troubleshooting action")
    CreateTroubleshootingResponse createTroubleshooting(CreateTroubleshootingRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to brand troubleshooting activity")
    UpdateTroubleshootingResponse updateTroubleshooting(UpdateTroubleshootingRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention in a troubleshooting action")
    RequestTroubleshootingResponse requestTroubleshooting(RequestTroubleshootingRequest req);

    @Description("ReBQ Retrieve details about brand troubleshooting activity")
    RetrieveTroubleshootingResponse retrieveTroubleshooting(RetrieveTroubleshootingRequest req);
}