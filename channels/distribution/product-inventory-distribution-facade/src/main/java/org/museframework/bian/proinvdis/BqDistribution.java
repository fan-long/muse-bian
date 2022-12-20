package org.museframework.bian.proinvdis;

import org.museframework.bian.proinvdis.dto.CaptureDistributionRequest;
import org.museframework.bian.proinvdis.dto.CaptureDistributionResponse;
import org.museframework.bian.proinvdis.dto.InitiateDistributionRequest;
import org.museframework.bian.proinvdis.dto.InitiateDistributionResponse;
import org.museframework.bian.proinvdis.dto.RetrieveDistributionRequest;
import org.museframework.bian.proinvdis.dto.RetrieveDistributionResponse;
import org.museframework.bian.proinvdis.dto.UpdateDistributionRequest;
import org.museframework.bian.proinvdis.dto.UpdateDistributionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handle and assign the day to day activities, capture time, costs and income for an operational unit  within Product Inventory Distribution.  Example: Administer the time reporting and billing for the specialist sales support team.")
@GenericDomain(name="ProductInventoryDistribution", group="Distribution")
public interface BqDistribution {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Distribution activity or event related information")
    CaptureDistributionResponse captureDistribution(CaptureDistributionRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Distribution")
    InitiateDistributionResponse initiateDistribution(InitiateDistributionRequest req);

    @Description("ReBQ Retrieve details about any aspect of Distribution")
    RetrieveDistributionResponse retrieveDistribution(RetrieveDistributionRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Distribution")
    UpdateDistributionResponse updateDistribution(UpdateDistributionRequest req);
}