package org.museframework.bian.collections;

import org.museframework.bian.collections.dto.ControlCollateralAssetLiquidationProcedureRequest;
import org.museframework.bian.collections.dto.ControlCollateralAssetLiquidationProcedureResponse;
import org.museframework.bian.collections.dto.ExchangeCollateralAssetLiquidationProcedureRequest;
import org.museframework.bian.collections.dto.ExchangeCollateralAssetLiquidationProcedureResponse;
import org.museframework.bian.collections.dto.ExecuteCollateralAssetLiquidationProcedureRequest;
import org.museframework.bian.collections.dto.ExecuteCollateralAssetLiquidationProcedureResponse;
import org.museframework.bian.collections.dto.InitiateCollateralAssetLiquidationProcedureRequest;
import org.museframework.bian.collections.dto.InitiateCollateralAssetLiquidationProcedureResponse;
import org.museframework.bian.collections.dto.RequestCollateralAssetLiquidationProcedureRequest;
import org.museframework.bian.collections.dto.RequestCollateralAssetLiquidationProcedureResponse;
import org.museframework.bian.collections.dto.RetrieveCollateralAssetLiquidationProcedureRequest;
import org.museframework.bian.collections.dto.RetrieveCollateralAssetLiquidationProcedureResponse;
import org.museframework.bian.collections.dto.UpdateCollateralAssetLiquidationProcedureRequest;
import org.museframework.bian.collections.dto.UpdateCollateralAssetLiquidationProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Collections.  Example: Process the evaluation and completion of customer offers.")
@GenericDomain(name="Collections", group="CollateralAssetLiquidationProcedure")
public interface CrCollateralAssetLiquidationProcedure {
    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Collateral Asset Liquidation Procedure")
    ControlCollateralAssetLiquidationProcedureResponse controlCollateralAssetLiquidationProcedure(ControlCollateralAssetLiquidationProcedureRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Collateral Asset Liquidation Procedure processing")
    ExchangeCollateralAssetLiquidationProcedureResponse exchangeCollateralAssetLiquidationProcedure(ExchangeCollateralAssetLiquidationProcedureRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an available automated action for Collateral Asset Liquidation Procedure")
    ExecuteCollateralAssetLiquidationProcedureResponse executeCollateralAssetLiquidationProcedure(ExecuteCollateralAssetLiquidationProcedureRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Collateral Asset Liquidation Procedure")
    InitiateCollateralAssetLiquidationProcedureResponse initiateCollateralAssetLiquidationProcedure(InitiateCollateralAssetLiquidationProcedureRequest req);

    @Description("ReCR Retrieve details about any aspect of Collateral Asset Liquidation Procedure")
    RetrieveCollateralAssetLiquidationProcedureResponse retrieveCollateralAssetLiquidationProcedure(RetrieveCollateralAssetLiquidationProcedureRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Collateral Asset Liquidation Procedure")
    RequestCollateralAssetLiquidationProcedureResponse requestCollateralAssetLiquidationProcedure(RequestCollateralAssetLiquidationProcedureRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Collateral Asset Liquidation Procedure")
    UpdateCollateralAssetLiquidationProcedureResponse updateCollateralAssetLiquidationProcedure(UpdateCollateralAssetLiquidationProcedureRequest req);
}