package org.museframework.bian.fininsval;

import org.museframework.bian.fininsval.dto.ExchangeAssetValuationInformationConsolidationWorkstepRequest;
import org.museframework.bian.fininsval.dto.ExchangeAssetValuationInformationConsolidationWorkstepResponse;
import org.museframework.bian.fininsval.dto.ExecuteAssetValuationInformationConsolidationWorkstepRequest;
import org.museframework.bian.fininsval.dto.ExecuteAssetValuationInformationConsolidationWorkstepResponse;
import org.museframework.bian.fininsval.dto.InitiateAssetValuationInformationConsolidationWorkstepRequest;
import org.museframework.bian.fininsval.dto.InitiateAssetValuationInformationConsolidationWorkstepResponse;
import org.museframework.bian.fininsval.dto.NotifyAssetValuationInformationConsolidationWorkstepRequest;
import org.museframework.bian.fininsval.dto.NotifyAssetValuationInformationConsolidationWorkstepResponse;
import org.museframework.bian.fininsval.dto.RequestAssetValuationInformationConsolidationWorkstepRequest;
import org.museframework.bian.fininsval.dto.RequestAssetValuationInformationConsolidationWorkstepResponse;
import org.museframework.bian.fininsval.dto.RetrieveAssetValuationInformationConsolidationWorkstepRequest;
import org.museframework.bian.fininsval.dto.RetrieveAssetValuationInformationConsolidationWorkstepResponse;
import org.museframework.bian.fininsval.dto.UpdateAssetValuationInformationConsolidationWorkstepRequest;
import org.museframework.bian.fininsval.dto.UpdateAssetValuationInformationConsolidationWorkstepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A course of action for doing Asset Valuation Workstep in the context of executing the Asset Valuation Workstep")
@GenericDomain(name="FinancialInstrumentValuation", group="AssetValuationInformationConsolidationWorkstep")
public interface BqAssetValuationInformationConsolidationWorkstep {
    @GenericDtxEndpoint
    @Description("Exchange Asset Valuation Information Consolidation Workstep")
    ExchangeAssetValuationInformationConsolidationWorkstepResponse exchangeAssetValuationInformationConsolidationWorkstep(ExchangeAssetValuationInformationConsolidationWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Execute Asset Valuation Information Consolidation Workstep")
    ExecuteAssetValuationInformationConsolidationWorkstepResponse executeAssetValuationInformationConsolidationWorkstep(ExecuteAssetValuationInformationConsolidationWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Asset Valuation Information Consolidation Workstep")
    InitiateAssetValuationInformationConsolidationWorkstepResponse initiateAssetValuationInformationConsolidationWorkstep(InitiateAssetValuationInformationConsolidationWorkstepRequest req);

    @Description("Notify Asset Valuation Information Consolidation Workstep")
    NotifyAssetValuationInformationConsolidationWorkstepResponse notifyAssetValuationInformationConsolidationWorkstep(NotifyAssetValuationInformationConsolidationWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Request Asset Valuation Information Consolidation Workstep")
    RequestAssetValuationInformationConsolidationWorkstepResponse requestAssetValuationInformationConsolidationWorkstep(RequestAssetValuationInformationConsolidationWorkstepRequest req);

    @Description("Retrieve Asset Valuation Information Consolidation Workstep")
    RetrieveAssetValuationInformationConsolidationWorkstepResponse retrieveAssetValuationInformationConsolidationWorkstep(RetrieveAssetValuationInformationConsolidationWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Update Asset Valuation Information Consolidation Workstep")
    UpdateAssetValuationInformationConsolidationWorkstepResponse updateAssetValuationInformationConsolidationWorkstep(UpdateAssetValuationInformationConsolidationWorkstepRequest req);
}