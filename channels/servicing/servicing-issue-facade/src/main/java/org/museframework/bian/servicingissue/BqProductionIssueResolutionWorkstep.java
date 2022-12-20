package org.museframework.bian.servicingissue;

import org.museframework.bian.servicingissue.dto.ExchangeProductionIssueResolutionWorkstepRequest;
import org.museframework.bian.servicingissue.dto.ExchangeProductionIssueResolutionWorkstepResponse;
import org.museframework.bian.servicingissue.dto.ExecuteProductionIssueResolutionWorkstepRequest;
import org.museframework.bian.servicingissue.dto.ExecuteProductionIssueResolutionWorkstepResponse;
import org.museframework.bian.servicingissue.dto.InitiateProductionIssueResolutionWorkstepRequest;
import org.museframework.bian.servicingissue.dto.InitiateProductionIssueResolutionWorkstepResponse;
import org.museframework.bian.servicingissue.dto.NotifyProductionIssueResolutionWorkstepRequest;
import org.museframework.bian.servicingissue.dto.NotifyProductionIssueResolutionWorkstepResponse;
import org.museframework.bian.servicingissue.dto.RequestProductionIssueResolutionWorkstepRequest;
import org.museframework.bian.servicingissue.dto.RequestProductionIssueResolutionWorkstepResponse;
import org.museframework.bian.servicingissue.dto.RetrieveProductionIssueResolutionWorkstepRequest;
import org.museframework.bian.servicingissue.dto.RetrieveProductionIssueResolutionWorkstepResponse;
import org.museframework.bian.servicingissue.dto.UpdateProductionIssueResolutionWorkstepRequest;
import org.museframework.bian.servicingissue.dto.UpdateProductionIssueResolutionWorkstepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A course of action for doing Production Issue Resolution Workstep in the context of executing the Production Issue Resolution Workstep")
@GenericDomain(name="ServicingIssue", group="ProductionIssueResolutionWorkstep")
public interface BqProductionIssueResolutionWorkstep {
    @GenericDtxEndpoint
    @Description("Exchange Production Issue Resolution Workstep")
    ExchangeProductionIssueResolutionWorkstepResponse exchangeProductionIssueResolutionWorkstep(ExchangeProductionIssueResolutionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Execute Production Issue Resolution Workstep")
    ExecuteProductionIssueResolutionWorkstepResponse executeProductionIssueResolutionWorkstep(ExecuteProductionIssueResolutionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Production Issue Resolution Workstep")
    InitiateProductionIssueResolutionWorkstepResponse initiateProductionIssueResolutionWorkstep(InitiateProductionIssueResolutionWorkstepRequest req);

    @Description("Notify Production Issue Resolution Workstep")
    NotifyProductionIssueResolutionWorkstepResponse notifyProductionIssueResolutionWorkstep(NotifyProductionIssueResolutionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Request Production Issue Resolution Workstep")
    RequestProductionIssueResolutionWorkstepResponse requestProductionIssueResolutionWorkstep(RequestProductionIssueResolutionWorkstepRequest req);

    @Description("Retrieve Production Issue Resolution Workstep")
    RetrieveProductionIssueResolutionWorkstepResponse retrieveProductionIssueResolutionWorkstep(RetrieveProductionIssueResolutionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Update Production Issue Resolution Workstep")
    UpdateProductionIssueResolutionWorkstepResponse updateProductionIssueResolutionWorkstep(UpdateProductionIssueResolutionWorkstepRequest req);
}