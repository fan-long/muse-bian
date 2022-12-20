package org.museframework.bian.customeroffer;

import org.museframework.bian.customeroffer.dto.RetrieveDisclosuresRequest;
import org.museframework.bian.customeroffer.dto.RetrieveDisclosuresResponse;
import org.museframework.bian.customeroffer.dto.UpdateDisclosuresRequest;
import org.museframework.bian.customeroffer.dto.UpdateDisclosuresResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handles the booking of the asset or liability to the appropriate unit")
@GenericDomain(name="CustomerOffer", group="Disclosures")
public interface BqDisclosures {
    @GenericDtxEndpoint
    @Description("UpBQ Update disclosure submission")
    UpdateDisclosuresResponse updateDisclosures(UpdateDisclosuresRequest req);

    @Description("ReBQ Retrieve details about disclosure submissions")
    RetrieveDisclosuresResponse retrieveDisclosures(RetrieveDisclosuresRequest req);
}