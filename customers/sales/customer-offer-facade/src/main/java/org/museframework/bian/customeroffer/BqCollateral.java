package org.museframework.bian.customeroffer;

import org.museframework.bian.customeroffer.dto.RetrieveCollateralRequest;
import org.museframework.bian.customeroffer.dto.RetrieveCollateralResponse;
import org.museframework.bian.customeroffer.dto.UpdateCollateralRequest;
import org.museframework.bian.customeroffer.dto.UpdateCollateralResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handles the booking of the asset or liability to the appropriate unit")
@GenericDomain(name="CustomerOffer", group="Collateral")
public interface BqCollateral {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of the collateral allocation")
    UpdateCollateralResponse updateCollateral(UpdateCollateralRequest req);

    @Description("ReBQ Retrieve details about the collateral allocation")
    RetrieveCollateralResponse retrieveCollateral(RetrieveCollateralRequest req);
}