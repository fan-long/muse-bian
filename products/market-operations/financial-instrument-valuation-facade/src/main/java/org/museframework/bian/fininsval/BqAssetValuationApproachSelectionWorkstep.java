package org.museframework.bian.fininsval;

import org.museframework.bian.fininsval.dto.ExchangeAssetValuationApproachSelectionWorkstepRequest;
import org.museframework.bian.fininsval.dto.ExchangeAssetValuationApproachSelectionWorkstepResponse;
import org.museframework.bian.fininsval.dto.ExecuteAssetValuationApproachSelectionWorkstepRequest;
import org.museframework.bian.fininsval.dto.ExecuteAssetValuationApproachSelectionWorkstepResponse;
import org.museframework.bian.fininsval.dto.InitiateAssetValuationApproachSelectionWorkstepRequest;
import org.museframework.bian.fininsval.dto.InitiateAssetValuationApproachSelectionWorkstepResponse;
import org.museframework.bian.fininsval.dto.NotifyAssetValuationApproachSelectionWorkstepRequest;
import org.museframework.bian.fininsval.dto.NotifyAssetValuationApproachSelectionWorkstepResponse;
import org.museframework.bian.fininsval.dto.RequestAssetValuationApproachSelectionWorkstepRequest;
import org.museframework.bian.fininsval.dto.RequestAssetValuationApproachSelectionWorkstepResponse;
import org.museframework.bian.fininsval.dto.RetrieveAssetValuationApproachSelectionWorkstepRequest;
import org.museframework.bian.fininsval.dto.RetrieveAssetValuationApproachSelectionWorkstepResponse;
import org.museframework.bian.fininsval.dto.UpdateAssetValuationApproachSelectionWorkstepRequest;
import org.museframework.bian.fininsval.dto.UpdateAssetValuationApproachSelectionWorkstepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A course of action for doing Asset Valuation Workstep in the context of executing the Asset Valuation Workstep")
@GenericDomain(name="FinancialInstrumentValuation", group="AssetValuationApproachSelectionWorkstep")
public interface BqAssetValuationApproachSelectionWorkstep {
    @GenericDtxEndpoint
    @Description("Exchange Asset Valuation Approach Selection Workstep")
    ExchangeAssetValuationApproachSelectionWorkstepResponse exchangeAssetValuationApproachSelectionWorkstep(ExchangeAssetValuationApproachSelectionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Execute Asset Valuation Approach Selection Workstep")
    ExecuteAssetValuationApproachSelectionWorkstepResponse executeAssetValuationApproachSelectionWorkstep(ExecuteAssetValuationApproachSelectionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Asset Valuation Approach Selection Workstep")
    InitiateAssetValuationApproachSelectionWorkstepResponse initiateAssetValuationApproachSelectionWorkstep(InitiateAssetValuationApproachSelectionWorkstepRequest req);

    @Description("Notify Asset Valuation Approach Selection Workstep")
    NotifyAssetValuationApproachSelectionWorkstepResponse notifyAssetValuationApproachSelectionWorkstep(NotifyAssetValuationApproachSelectionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Request Asset Valuation Approach Selection Workstep")
    RequestAssetValuationApproachSelectionWorkstepResponse requestAssetValuationApproachSelectionWorkstep(RequestAssetValuationApproachSelectionWorkstepRequest req);

    @Description("Retrieve Asset Valuation Approach Selection Workstep")
    RetrieveAssetValuationApproachSelectionWorkstepResponse retrieveAssetValuationApproachSelectionWorkstep(RetrieveAssetValuationApproachSelectionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Update Asset Valuation Approach Selection Workstep")
    UpdateAssetValuationApproachSelectionWorkstepResponse updateAssetValuationApproachSelectionWorkstep(UpdateAssetValuationApproachSelectionWorkstepRequest req);
}