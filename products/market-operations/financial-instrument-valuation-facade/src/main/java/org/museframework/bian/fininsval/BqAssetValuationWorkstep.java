package org.museframework.bian.fininsval;

import org.museframework.bian.fininsval.dto.ExchangeAssetValuationWorkstepRequest;
import org.museframework.bian.fininsval.dto.ExchangeAssetValuationWorkstepResponse;
import org.museframework.bian.fininsval.dto.ExecuteAssetValuationWorkstepRequest;
import org.museframework.bian.fininsval.dto.ExecuteAssetValuationWorkstepResponse;
import org.museframework.bian.fininsval.dto.InitiateAssetValuationWorkstepRequest;
import org.museframework.bian.fininsval.dto.InitiateAssetValuationWorkstepResponse;
import org.museframework.bian.fininsval.dto.NotifyAssetValuationWorkstepRequest;
import org.museframework.bian.fininsval.dto.NotifyAssetValuationWorkstepResponse;
import org.museframework.bian.fininsval.dto.RequestAssetValuationWorkstepRequest;
import org.museframework.bian.fininsval.dto.RequestAssetValuationWorkstepResponse;
import org.museframework.bian.fininsval.dto.RetrieveAssetValuationWorkstepRequest;
import org.museframework.bian.fininsval.dto.RetrieveAssetValuationWorkstepResponse;
import org.museframework.bian.fininsval.dto.UpdateAssetValuationWorkstepRequest;
import org.museframework.bian.fininsval.dto.UpdateAssetValuationWorkstepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A course of action for doing Asset Valuation Workstep in the context of executing the Asset Valuation Workstep")
@GenericDomain(name="FinancialInstrumentValuation", group="AssetValuationWorkstep")
public interface BqAssetValuationWorkstep {
    @GenericDtxEndpoint
    @Description("Exchange Asset Valuation Workstep")
    ExchangeAssetValuationWorkstepResponse exchangeAssetValuationWorkstep(ExchangeAssetValuationWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Execute Asset Valuation Workstep")
    ExecuteAssetValuationWorkstepResponse executeAssetValuationWorkstep(ExecuteAssetValuationWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Asset Valuation Workstep")
    InitiateAssetValuationWorkstepResponse initiateAssetValuationWorkstep(InitiateAssetValuationWorkstepRequest req);

    @Description("Notify Asset Valuation Workstep")
    NotifyAssetValuationWorkstepResponse notifyAssetValuationWorkstep(NotifyAssetValuationWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Request Asset Valuation Workstep")
    RequestAssetValuationWorkstepResponse requestAssetValuationWorkstep(RequestAssetValuationWorkstepRequest req);

    @Description("Retrieve Asset Valuation Workstep")
    RetrieveAssetValuationWorkstepResponse retrieveAssetValuationWorkstep(RetrieveAssetValuationWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Update Asset Valuation Workstep")
    UpdateAssetValuationWorkstepResponse updateAssetValuationWorkstep(UpdateAssetValuationWorkstepRequest req);
}