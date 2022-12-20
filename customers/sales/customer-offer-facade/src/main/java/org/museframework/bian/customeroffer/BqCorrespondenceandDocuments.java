package org.museframework.bian.customeroffer;

import org.museframework.bian.customeroffer.dto.RetrieveCorrespondenceandDocumentsRequest;
import org.museframework.bian.customeroffer.dto.RetrieveCorrespondenceandDocumentsResponse;
import org.museframework.bian.customeroffer.dto.UpdateCorrespondenceandDocumentsRequest;
import org.museframework.bian.customeroffer.dto.UpdateCorrespondenceandDocumentsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handles the booking of the asset or liability to the appropriate unit")
@GenericDomain(name="CustomerOffer", group="CorrespondenceandDocuments")
public interface BqCorrespondenceandDocuments {
    @GenericDtxEndpoint
    @Description("UpBQ Update details about the correspondence and documents accessed and created by the offer")
    UpdateCorrespondenceandDocumentsResponse updateCorrespondenceandDocuments(UpdateCorrespondenceandDocumentsRequest req);

    @Description("ReBQ Retrieve details about correspondence and documents from the customer offer procedure")
    RetrieveCorrespondenceandDocumentsResponse retrieveCorrespondenceandDocuments(RetrieveCorrespondenceandDocumentsRequest req);
}