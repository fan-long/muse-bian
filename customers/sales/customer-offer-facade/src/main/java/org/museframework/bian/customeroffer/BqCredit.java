package org.museframework.bian.customeroffer;

import org.museframework.bian.customeroffer.dto.RetrieveCreditRequest;
import org.museframework.bian.customeroffer.dto.RetrieveCreditResponse;
import org.museframework.bian.customeroffer.dto.UpdateCreditRequest;
import org.museframework.bian.customeroffer.dto.UpdateCreditResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handles the booking of the asset or liability to the appropriate unit")
@GenericDomain(name="CustomerOffer", group="Credit")
public interface BqCredit {
    @GenericDtxEndpoint
    @Description("UpBQ Update credit submission details")
    UpdateCreditResponse updateCredit(UpdateCreditRequest req);

    @Description("ReBQ Retrieve details about the credit submission")
    RetrieveCreditResponse retrieveCredit(RetrieveCreditRequest req);
}