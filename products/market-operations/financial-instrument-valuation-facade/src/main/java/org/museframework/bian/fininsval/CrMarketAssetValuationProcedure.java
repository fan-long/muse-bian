package org.museframework.bian.fininsval;

import org.museframework.bian.fininsval.dto.ControlMarketAssetValuationProcedureRequest;
import org.museframework.bian.fininsval.dto.ControlMarketAssetValuationProcedureResponse;
import org.museframework.bian.fininsval.dto.ExchangeMarketAssetValuationProcedureRequest;
import org.museframework.bian.fininsval.dto.ExchangeMarketAssetValuationProcedureResponse;
import org.museframework.bian.fininsval.dto.ExecuteMarketAssetValuationProcedureRequest;
import org.museframework.bian.fininsval.dto.ExecuteMarketAssetValuationProcedureResponse;
import org.museframework.bian.fininsval.dto.InitiateMarketAssetValuationProcedureRequest;
import org.museframework.bian.fininsval.dto.InitiateMarketAssetValuationProcedureResponse;
import org.museframework.bian.fininsval.dto.NotifyMarketAssetValuationProcedureRequest;
import org.museframework.bian.fininsval.dto.NotifyMarketAssetValuationProcedureResponse;
import org.museframework.bian.fininsval.dto.RequestMarketAssetValuationProcedureRequest;
import org.museframework.bian.fininsval.dto.RequestMarketAssetValuationProcedureResponse;
import org.museframework.bian.fininsval.dto.RetrieveMarketAssetValuationProcedureRequest;
import org.museframework.bian.fininsval.dto.RetrieveMarketAssetValuationProcedureResponse;
import org.museframework.bian.fininsval.dto.UpdateMarketAssetValuationProcedureRequest;
import org.museframework.bian.fininsval.dto.UpdateMarketAssetValuationProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Financial Instrument Valuation. ")
@GenericDomain(name="FinancialInstrumentValuation", group="MarketAssetValuationProcedure")
public interface CrMarketAssetValuationProcedure {
    @GenericDtxEndpoint
    @Description("Control Market Asset Valuation Procedure")
    ControlMarketAssetValuationProcedureResponse controlMarketAssetValuationProcedure(ControlMarketAssetValuationProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Market Asset Valuation Procedure")
    ExchangeMarketAssetValuationProcedureResponse exchangeMarketAssetValuationProcedure(ExchangeMarketAssetValuationProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Execute Market Asset Valuation Procedure")
    ExecuteMarketAssetValuationProcedureResponse executeMarketAssetValuationProcedure(ExecuteMarketAssetValuationProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Market Asset Valuation Procedure")
    InitiateMarketAssetValuationProcedureResponse initiateMarketAssetValuationProcedure(InitiateMarketAssetValuationProcedureRequest req);

    @Description("Notify Market Asset Valuation Procedure")
    NotifyMarketAssetValuationProcedureResponse notifyMarketAssetValuationProcedure(NotifyMarketAssetValuationProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Request Market Asset Valuation Procedure")
    RequestMarketAssetValuationProcedureResponse requestMarketAssetValuationProcedure(RequestMarketAssetValuationProcedureRequest req);

    @Description("Retrieve Market Asset Valuation Procedure")
    RetrieveMarketAssetValuationProcedureResponse retrieveMarketAssetValuationProcedure(RetrieveMarketAssetValuationProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Update Market Asset Valuation Procedure")
    UpdateMarketAssetValuationProcedureResponse updateMarketAssetValuationProcedure(UpdateMarketAssetValuationProcedureRequest req);
}