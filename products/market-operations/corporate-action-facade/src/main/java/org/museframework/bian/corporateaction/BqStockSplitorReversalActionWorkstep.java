package org.museframework.bian.corporateaction;

import org.museframework.bian.corporateaction.dto.ExchangeStockSplitorReversalActionWorkstepRequest;
import org.museframework.bian.corporateaction.dto.ExchangeStockSplitorReversalActionWorkstepResponse;
import org.museframework.bian.corporateaction.dto.ExecuteStockSplitorReversalActionWorkstepRequest;
import org.museframework.bian.corporateaction.dto.ExecuteStockSplitorReversalActionWorkstepResponse;
import org.museframework.bian.corporateaction.dto.InitiateStockSplitorReversalActionWorkstepRequest;
import org.museframework.bian.corporateaction.dto.InitiateStockSplitorReversalActionWorkstepResponse;
import org.museframework.bian.corporateaction.dto.NotifyStockSplitorReversalActionWorkstepRequest;
import org.museframework.bian.corporateaction.dto.NotifyStockSplitorReversalActionWorkstepResponse;
import org.museframework.bian.corporateaction.dto.RequestStockSplitorReversalActionWorkstepRequest;
import org.museframework.bian.corporateaction.dto.RequestStockSplitorReversalActionWorkstepResponse;
import org.museframework.bian.corporateaction.dto.RetrieveStockSplitorReversalActionWorkstepRequest;
import org.museframework.bian.corporateaction.dto.RetrieveStockSplitorReversalActionWorkstepResponse;
import org.museframework.bian.corporateaction.dto.UpdateStockSplitorReversalActionWorkstepRequest;
import org.museframework.bian.corporateaction.dto.UpdateStockSplitorReversalActionWorkstepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A course of action for doing Security Spin-Off Action Workstep in the context of executing the Security Spin-Off Action Workstep")
@GenericDomain(name="CorporateAction", group="StockSplitorReversalActionWorkstep")
public interface BqStockSplitorReversalActionWorkstep {
    @GenericDtxEndpoint
    @Description("Exchange Stock Split or Reversal Action Workstep")
    ExchangeStockSplitorReversalActionWorkstepResponse exchangeStockSplitorReversalActionWorkstep(ExchangeStockSplitorReversalActionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Execute Stock Split or Reversal Action Workstep")
    ExecuteStockSplitorReversalActionWorkstepResponse executeStockSplitorReversalActionWorkstep(ExecuteStockSplitorReversalActionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Stock Split or Reversal Action Workstep")
    InitiateStockSplitorReversalActionWorkstepResponse initiateStockSplitorReversalActionWorkstep(InitiateStockSplitorReversalActionWorkstepRequest req);

    @Description("Notify Stock Split or Reversal Action Workstep")
    NotifyStockSplitorReversalActionWorkstepResponse notifyStockSplitorReversalActionWorkstep(NotifyStockSplitorReversalActionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Request Stock Split or Reversal Action Workstep")
    RequestStockSplitorReversalActionWorkstepResponse requestStockSplitorReversalActionWorkstep(RequestStockSplitorReversalActionWorkstepRequest req);

    @Description("Retrieve Stock Split or Reversal Action Workstep")
    RetrieveStockSplitorReversalActionWorkstepResponse retrieveStockSplitorReversalActionWorkstep(RetrieveStockSplitorReversalActionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Update Stock Split or Reversal Action Workstep")
    UpdateStockSplitorReversalActionWorkstepResponse updateStockSplitorReversalActionWorkstep(UpdateStockSplitorReversalActionWorkstepRequest req);
}