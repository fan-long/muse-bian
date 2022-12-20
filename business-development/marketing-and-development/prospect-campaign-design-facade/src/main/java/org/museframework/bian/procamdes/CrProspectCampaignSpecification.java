package org.museframework.bian.procamdes;

import org.museframework.bian.procamdes.dto.CaptureProspectCampaignSpecificationRequest;
import org.museframework.bian.procamdes.dto.CaptureProspectCampaignSpecificationResponse;
import org.museframework.bian.procamdes.dto.CreateProspectCampaignSpecificationRequest;
import org.museframework.bian.procamdes.dto.CreateProspectCampaignSpecificationResponse;
import org.museframework.bian.procamdes.dto.ExecuteProspectCampaignSpecificationRequest;
import org.museframework.bian.procamdes.dto.ExecuteProspectCampaignSpecificationResponse;
import org.museframework.bian.procamdes.dto.RequestProspectCampaignSpecificationRequest;
import org.museframework.bian.procamdes.dto.RequestProspectCampaignSpecificationResponse;
import org.museframework.bian.procamdes.dto.RetrieveProspectCampaignSpecificationRequest;
import org.museframework.bian.procamdes.dto.RetrieveProspectCampaignSpecificationResponse;
import org.museframework.bian.procamdes.dto.UpdateProspectCampaignSpecificationRequest;
import org.museframework.bian.procamdes.dto.UpdateProspectCampaignSpecificationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Create and maintain a design for a procedure, product/service model or other such entity  within Prospect Campaign Design.  Example: Create and maintain product designs and analytical models.")
@GenericDomain(name="ProspectCampaignDesign", group="ProspectCampaignSpecification")
public interface CrProspectCampaignSpecification {
    @GenericDtxEndpoint
    @Description("CrCR Create or register an imported prospect campaign design")
    CreateProspectCampaignSpecificationResponse createProspectCampaignSpecification(CreateProspectCampaignSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("UpCr Update details of a prospect campaign specification or usage record")
    UpdateProspectCampaignSpecificationResponse updateProspectCampaignSpecification(UpdateProspectCampaignSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("CaCR Capture impact feedback against a prospect campaign specification")
    CaptureProspectCampaignSpecificationResponse captureProspectCampaignSpecification(CaptureProspectCampaignSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an automated action for a prospect campaign specification")
    ExecuteProspectCampaignSpecificationResponse executeProspectCampaignSpecification(ExecuteProspectCampaignSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention with a prospect campaign specification")
    RequestProspectCampaignSpecificationResponse requestProspectCampaignSpecification(RequestProspectCampaignSpecificationRequest req);

    @Description("ReCR Retrieve details about a prospect campaign specification")
    RetrieveProspectCampaignSpecificationResponse retrieveProspectCampaignSpecification(RetrieveProspectCampaignSpecificationRequest req);
}