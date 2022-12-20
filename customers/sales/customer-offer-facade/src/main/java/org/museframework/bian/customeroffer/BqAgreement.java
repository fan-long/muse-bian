package org.museframework.bian.customeroffer;

import org.museframework.bian.customeroffer.dto.RetrieveAgreementRequest;
import org.museframework.bian.customeroffer.dto.RetrieveAgreementResponse;
import org.museframework.bian.customeroffer.dto.UpdateAgreementRequest;
import org.museframework.bian.customeroffer.dto.UpdateAgreementResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handles the booking of the asset or liability to the appropriate unit")
@GenericDomain(name="CustomerOffer", group="Agreement")
public interface BqAgreement {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of the customer agreement")
    UpdateAgreementResponse updateAgreement(UpdateAgreementRequest req);

    @Description("ReBQ Retrieve details about the agreements impacted and created as part of the offer")
    RetrieveAgreementResponse retrieveAgreement(RetrieveAgreementRequest req);
}