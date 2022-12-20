package org.museframework.bian.leasing;

import org.museframework.bian.leasing.dto.InitiateCollateralRequest;
import org.museframework.bian.leasing.dto.InitiateCollateralResponse;
import org.museframework.bian.leasing.dto.RequestCollateralRequest;
import org.museframework.bian.leasing.dto.RequestCollateralResponse;
import org.museframework.bian.leasing.dto.RetrieveCollateralRequest;
import org.museframework.bian.leasing.dto.RetrieveCollateralResponse;
import org.museframework.bian.leasing.dto.UpdateCollateralRequest;
import org.museframework.bian.leasing.dto.UpdateCollateralResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Leasing.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="Leasing", group="Collateral")
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