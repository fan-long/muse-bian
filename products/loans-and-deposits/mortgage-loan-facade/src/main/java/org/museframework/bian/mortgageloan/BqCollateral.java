package org.museframework.bian.mortgageloan;

import org.museframework.bian.mortgageloan.dto.InitiateCollateralRequest;
import org.museframework.bian.mortgageloan.dto.InitiateCollateralResponse;
import org.museframework.bian.mortgageloan.dto.RequestCollateralRequest;
import org.museframework.bian.mortgageloan.dto.RequestCollateralResponse;
import org.museframework.bian.mortgageloan.dto.RetrieveCollateralRequest;
import org.museframework.bian.mortgageloan.dto.RetrieveCollateralResponse;
import org.museframework.bian.mortgageloan.dto.UpdateCollateralRequest;
import org.museframework.bian.mortgageloan.dto.UpdateCollateralResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="MortgageLoan", group="Collateral")
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