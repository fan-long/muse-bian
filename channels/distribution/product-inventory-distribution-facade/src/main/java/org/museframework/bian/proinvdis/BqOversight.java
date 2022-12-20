package org.museframework.bian.proinvdis;

import org.museframework.bian.proinvdis.dto.CaptureOversightRequest;
import org.museframework.bian.proinvdis.dto.CaptureOversightResponse;
import org.museframework.bian.proinvdis.dto.InitiateOversightRequest;
import org.museframework.bian.proinvdis.dto.InitiateOversightResponse;
import org.museframework.bian.proinvdis.dto.RetrieveOversightRequest;
import org.museframework.bian.proinvdis.dto.RetrieveOversightResponse;
import org.museframework.bian.proinvdis.dto.UpdateOversightRequest;
import org.museframework.bian.proinvdis.dto.UpdateOversightResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handle and assign the day to day activities, capture time, costs and income for an operational unit  within Product Inventory Distribution.  Example: Administer the time reporting and billing for the specialist sales support team.")
@GenericDomain(name="ProductInventoryDistribution", group="Oversight")
public interface BqOversight {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Oversight activity or event related information")
    CaptureOversightResponse captureOversight(CaptureOversightRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Oversight")
    InitiateOversightResponse initiateOversight(InitiateOversightRequest req);

    @Description("ReBQ Retrieve details about any aspect of Oversight")
    RetrieveOversightResponse retrieveOversight(RetrieveOversightRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Oversight")
    UpdateOversightResponse updateOversight(UpdateOversightRequest req);
}