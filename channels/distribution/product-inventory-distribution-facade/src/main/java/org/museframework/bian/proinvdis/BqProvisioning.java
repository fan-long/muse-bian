package org.museframework.bian.proinvdis;

import org.museframework.bian.proinvdis.dto.CaptureProvisioningRequest;
import org.museframework.bian.proinvdis.dto.CaptureProvisioningResponse;
import org.museframework.bian.proinvdis.dto.InitiateProvisioningRequest;
import org.museframework.bian.proinvdis.dto.InitiateProvisioningResponse;
import org.museframework.bian.proinvdis.dto.RetrieveProvisioningRequest;
import org.museframework.bian.proinvdis.dto.RetrieveProvisioningResponse;
import org.museframework.bian.proinvdis.dto.UpdateProvisioningRequest;
import org.museframework.bian.proinvdis.dto.UpdateProvisioningResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handle and assign the day to day activities, capture time, costs and income for an operational unit  within Product Inventory Distribution.  Example: Administer the time reporting and billing for the specialist sales support team.")
@GenericDomain(name="ProductInventoryDistribution", group="Provisioning")
public interface BqProvisioning {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Provisioning activity or event related information")
    CaptureProvisioningResponse captureProvisioning(CaptureProvisioningRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Provisioning")
    InitiateProvisioningResponse initiateProvisioning(InitiateProvisioningRequest req);

    @Description("ReBQ Retrieve details about any aspect of Provisioning")
    RetrieveProvisioningResponse retrieveProvisioning(RetrieveProvisioningRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Provisioning")
    UpdateProvisioningResponse updateProvisioning(UpdateProvisioningRequest req);
}