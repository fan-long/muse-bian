package org.museframework.bian.proinvdis;

import org.museframework.bian.proinvdis.dto.CaptureMailingRequest;
import org.museframework.bian.proinvdis.dto.CaptureMailingResponse;
import org.museframework.bian.proinvdis.dto.InitiateMailingRequest;
import org.museframework.bian.proinvdis.dto.InitiateMailingResponse;
import org.museframework.bian.proinvdis.dto.RetrieveMailingRequest;
import org.museframework.bian.proinvdis.dto.RetrieveMailingResponse;
import org.museframework.bian.proinvdis.dto.UpdateMailingRequest;
import org.museframework.bian.proinvdis.dto.UpdateMailingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handle and assign the day to day activities, capture time, costs and income for an operational unit  within Product Inventory Distribution.  Example: Administer the time reporting and billing for the specialist sales support team.")
@GenericDomain(name="ProductInventoryDistribution", group="Mailing")
public interface BqMailing {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Mailing activity or event related information")
    CaptureMailingResponse captureMailing(CaptureMailingRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Mailing")
    InitiateMailingResponse initiateMailing(InitiateMailingRequest req);

    @Description("ReBQ Retrieve details about any aspect of Mailing")
    RetrieveMailingResponse retrieveMailing(RetrieveMailingRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Mailing")
    UpdateMailingResponse updateMailing(UpdateMailingRequest req);
}