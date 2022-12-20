package org.museframework.bian.cusrelman;

import org.museframework.bian.cusrelman.dto.CaptureIncidentRequest;
import org.museframework.bian.cusrelman.dto.CaptureIncidentResponse;
import org.museframework.bian.cusrelman.dto.CreateIncidentRequest;
import org.museframework.bian.cusrelman.dto.CreateIncidentResponse;
import org.museframework.bian.cusrelman.dto.RetrieveIncidentRequest;
import org.museframework.bian.cusrelman.dto.RetrieveIncidentResponse;
import org.museframework.bian.cusrelman.dto.UpdateIncidentRequest;
import org.museframework.bian.cusrelman.dto.UpdateIncidentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more responsibilities or tasks under management  Examples: Relationship development, Troubleshooting")
@GenericDomain(name="CustomerRelationshipManagement", group="Incident")
public interface BqIncident {
    @GenericDtxEndpoint
    @Description("CrBQ Create customer incident reporting capability (initialize the capability)")
    CreateIncidentResponse createIncident(CreateIncidentRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details about a customer incident")
    UpdateIncidentResponse updateIncident(UpdateIncidentRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture details of a new customer incident")
    CaptureIncidentResponse captureIncident(CaptureIncidentRequest req);

    @Description("ReBQ Retrieve details about a customer incident")
    RetrieveIncidentResponse retrieveIncident(RetrieveIncidentRequest req);
}