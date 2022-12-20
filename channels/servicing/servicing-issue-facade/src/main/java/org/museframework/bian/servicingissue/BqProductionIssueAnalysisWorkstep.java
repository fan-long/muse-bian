package org.museframework.bian.servicingissue;

import org.museframework.bian.servicingissue.dto.ExchangeProductionIssueAnalysisWorkstepRequest;
import org.museframework.bian.servicingissue.dto.ExchangeProductionIssueAnalysisWorkstepResponse;
import org.museframework.bian.servicingissue.dto.ExecuteProductionIssueAnalysisWorkstepRequest;
import org.museframework.bian.servicingissue.dto.ExecuteProductionIssueAnalysisWorkstepResponse;
import org.museframework.bian.servicingissue.dto.InitiateProductionIssueAnalysisWorkstepRequest;
import org.museframework.bian.servicingissue.dto.InitiateProductionIssueAnalysisWorkstepResponse;
import org.museframework.bian.servicingissue.dto.NotifyProductionIssueAnalysisWorkstepRequest;
import org.museframework.bian.servicingissue.dto.NotifyProductionIssueAnalysisWorkstepResponse;
import org.museframework.bian.servicingissue.dto.RequestProductionIssueAnalysisWorkstepRequest;
import org.museframework.bian.servicingissue.dto.RequestProductionIssueAnalysisWorkstepResponse;
import org.museframework.bian.servicingissue.dto.RetrieveProductionIssueAnalysisWorkstepRequest;
import org.museframework.bian.servicingissue.dto.RetrieveProductionIssueAnalysisWorkstepResponse;
import org.museframework.bian.servicingissue.dto.UpdateProductionIssueAnalysisWorkstepRequest;
import org.museframework.bian.servicingissue.dto.UpdateProductionIssueAnalysisWorkstepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A course of action for doing Production Issue Resolution Workstep in the context of executing the Production Issue Resolution Workstep")
@GenericDomain(name="ServicingIssue", group="ProductionIssueAnalysisWorkstep")
public interface BqProductionIssueAnalysisWorkstep {
    @GenericDtxEndpoint
    @Description("Exchange Production Issue Analysis Workstep")
    ExchangeProductionIssueAnalysisWorkstepResponse exchangeProductionIssueAnalysisWorkstep(ExchangeProductionIssueAnalysisWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Execute Production Issue Analysis Workstep")
    ExecuteProductionIssueAnalysisWorkstepResponse executeProductionIssueAnalysisWorkstep(ExecuteProductionIssueAnalysisWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Production Issue Analysis Workstep")
    InitiateProductionIssueAnalysisWorkstepResponse initiateProductionIssueAnalysisWorkstep(InitiateProductionIssueAnalysisWorkstepRequest req);

    @Description("Notify Production Issue Analysis Workstep")
    NotifyProductionIssueAnalysisWorkstepResponse notifyProductionIssueAnalysisWorkstep(NotifyProductionIssueAnalysisWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Request Production Issue Analysis Workstep")
    RequestProductionIssueAnalysisWorkstepResponse requestProductionIssueAnalysisWorkstep(RequestProductionIssueAnalysisWorkstepRequest req);

    @Description("Retrieve Production Issue Analysis Workstep")
    RetrieveProductionIssueAnalysisWorkstepResponse retrieveProductionIssueAnalysisWorkstep(RetrieveProductionIssueAnalysisWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Update Production Issue Analysis Workstep")
    UpdateProductionIssueAnalysisWorkstepResponse updateProductionIssueAnalysisWorkstep(UpdateProductionIssueAnalysisWorkstepRequest req);
}