package org.museframework.bian.customeroffer;

import org.museframework.bian.customeroffer.dto.RetrieveUnderwritingRequest;
import org.museframework.bian.customeroffer.dto.RetrieveUnderwritingResponse;
import org.museframework.bian.customeroffer.dto.UpdateUnderwritingRequest;
import org.museframework.bian.customeroffer.dto.UpdateUnderwritingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handles the booking of the asset or liability to the appropriate unit")
@GenericDomain(name="CustomerOffer", group="Underwriting")
public interface BqUnderwriting {
    @GenericDtxEndpoint
    @Description("UpBQ Update submitted materials for the underwriting decision")
    UpdateUnderwritingResponse updateUnderwriting(UpdateUnderwritingRequest req);

    @Description("ReBQ Retrieve details about the underwriting decision")
    RetrieveUnderwritingResponse retrieveUnderwriting(RetrieveUnderwritingRequest req);
}