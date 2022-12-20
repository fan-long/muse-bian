package org.museframework.bian.merchandisingloan;

import org.museframework.bian.merchandisingloan.dto.InitiateCollateralRequest;
import org.museframework.bian.merchandisingloan.dto.InitiateCollateralResponse;
import org.museframework.bian.merchandisingloan.dto.RequestCollateralRequest;
import org.museframework.bian.merchandisingloan.dto.RequestCollateralResponse;
import org.museframework.bian.merchandisingloan.dto.RetrieveCollateralRequest;
import org.museframework.bian.merchandisingloan.dto.RetrieveCollateralResponse;
import org.museframework.bian.merchandisingloan.dto.UpdateCollateralRequest;
import org.museframework.bian.merchandisingloan.dto.UpdateCollateralResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="MerchandisingLoan", group="Collateral")
public interface BqCollateral {
    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Collateral")
    InitiateCollateralResponse initiateCollateral(InitiateCollateralRequest req);

    @Description("ReBQ Retrieve details about any aspect of Collateral")
    RetrieveCollateralResponse retrieveCollateral(RetrieveCollateralRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Collateral")
    RequestCollateralResponse requestCollateral(RequestCollateralRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Collateral")
    UpdateCollateralResponse updateCollateral(UpdateCollateralRequest req);
}