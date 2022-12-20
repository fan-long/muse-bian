package org.museframework.bian.collections;

import org.museframework.bian.collections.dto.ExchangeCollateralLiquidationRequest;
import org.museframework.bian.collections.dto.ExchangeCollateralLiquidationResponse;
import org.museframework.bian.collections.dto.InitiateCollateralLiquidationRequest;
import org.museframework.bian.collections.dto.InitiateCollateralLiquidationResponse;
import org.museframework.bian.collections.dto.RetrieveCollateralLiquidationRequest;
import org.museframework.bian.collections.dto.RetrieveCollateralLiquidationResponse;
import org.museframework.bian.collections.dto.UpdateCollateralLiquidationRequest;
import org.museframework.bian.collections.dto.UpdateCollateralLiquidationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Collections.  Example: Process the evaluation and completion of customer offers.")
@GenericDomain(name="Collections", group="CollateralLiquidation")
public interface BqCollateralLiquidation {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Collateral Liquidation processing")
    ExchangeCollateralLiquidationResponse exchangeCollateralLiquidation(ExchangeCollateralLiquidationRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Collateral Liquidation")
    InitiateCollateralLiquidationResponse initiateCollateralLiquidation(InitiateCollateralLiquidationRequest req);

    @Description("ReBQ Retrieve details about any aspect of Collateral Liquidation")
    RetrieveCollateralLiquidationResponse retrieveCollateralLiquidation(RetrieveCollateralLiquidationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Collateral Liquidation")
    UpdateCollateralLiquidationResponse updateCollateralLiquidation(UpdateCollateralLiquidationRequest req);
}