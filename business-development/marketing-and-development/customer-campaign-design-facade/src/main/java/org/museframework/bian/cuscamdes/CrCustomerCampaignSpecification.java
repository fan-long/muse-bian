package org.museframework.bian.cuscamdes;

import org.museframework.bian.cuscamdes.dto.CaptureCustomerCampaignSpecificationRequest;
import org.museframework.bian.cuscamdes.dto.CaptureCustomerCampaignSpecificationResponse;
import org.museframework.bian.cuscamdes.dto.CreateCustomerCampaignSpecificationRequest;
import org.museframework.bian.cuscamdes.dto.CreateCustomerCampaignSpecificationResponse;
import org.museframework.bian.cuscamdes.dto.ExecuteCustomerCampaignSpecificationRequest;
import org.museframework.bian.cuscamdes.dto.ExecuteCustomerCampaignSpecificationResponse;
import org.museframework.bian.cuscamdes.dto.RequestCustomerCampaignSpecificationRequest;
import org.museframework.bian.cuscamdes.dto.RequestCustomerCampaignSpecificationResponse;
import org.museframework.bian.cuscamdes.dto.RetrieveCustomerCampaignSpecificationRequest;
import org.museframework.bian.cuscamdes.dto.RetrieveCustomerCampaignSpecificationResponse;
import org.museframework.bian.cuscamdes.dto.UpdateCustomerCampaignSpecificationRequest;
import org.museframework.bian.cuscamdes.dto.UpdateCustomerCampaignSpecificationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Create and maintain a design for a procedure, product/service model or other such entity  within Customer Campaign Design.  Example: Create and maintain product designs and analytical models.")
@GenericDomain(name="CustomerCampaignDesign", group="CustomerCampaignSpecification")
public interface CrCustomerCampaignSpecification {
    @GenericDtxEndpoint
    @Description("CrCR Create or register an imported customer campaign design")
    CreateCustomerCampaignSpecificationResponse createCustomerCampaignSpecification(CreateCustomerCampaignSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("UpCr Update details of a customer campaign specification or usage record")
    UpdateCustomerCampaignSpecificationResponse updateCustomerCampaignSpecification(UpdateCustomerCampaignSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("CaCR Capture impact feedback against a customer campaign specification")
    CaptureCustomerCampaignSpecificationResponse captureCustomerCampaignSpecification(CaptureCustomerCampaignSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an automated action for a customer campaign specification")
    ExecuteCustomerCampaignSpecificationResponse executeCustomerCampaignSpecification(ExecuteCustomerCampaignSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention with a customer campaign specification")
    RequestCustomerCampaignSpecificationResponse requestCustomerCampaignSpecification(RequestCustomerCampaignSpecificationRequest req);

    @Description("ReCR Retrieve details about a customer campaign specification")
    RetrieveCustomerCampaignSpecificationResponse retrieveCustomerCampaignSpecification(RetrieveCustomerCampaignSpecificationRequest req);
}