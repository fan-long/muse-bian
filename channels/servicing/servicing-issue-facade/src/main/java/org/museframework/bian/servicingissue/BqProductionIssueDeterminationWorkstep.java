package org.museframework.bian.servicingissue;

import org.museframework.bian.servicingissue.dto.ExchangeProductionIssueDeterminationWorkstepRequest;
import org.museframework.bian.servicingissue.dto.ExchangeProductionIssueDeterminationWorkstepResponse;
import org.museframework.bian.servicingissue.dto.ExecuteProductionIssueDeterminationWorkstepRequest;
import org.museframework.bian.servicingissue.dto.ExecuteProductionIssueDeterminationWorkstepResponse;
import org.museframework.bian.servicingissue.dto.InitiateProductionIssueDeterminationWorkstepRequest;
import org.museframework.bian.servicingissue.dto.InitiateProductionIssueDeterminationWorkstepResponse;
import org.museframework.bian.servicingissue.dto.NotifyProductionIssueDeterminationWorkstepRequest;
import org.museframework.bian.servicingissue.dto.NotifyProductionIssueDeterminationWorkstepResponse;
import org.museframework.bian.servicingissue.dto.RequestProductionIssueDeterminationWorkstepRequest;
import org.museframework.bian.servicingissue.dto.RequestProductionIssueDeterminationWorkstepResponse;
import org.museframework.bian.servicingissue.dto.RetrieveProductionIssueDeterminationWorkstepRequest;
import org.museframework.bian.servicingissue.dto.RetrieveProductionIssueDeterminationWorkstepResponse;
import org.museframework.bian.servicingissue.dto.UpdateProductionIssueDeterminationWorkstepRequest;
import org.museframework.bian.servicingissue.dto.UpdateProductionIssueDeterminationWorkstepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A course of action for doing Production Issue Resolution Workstep in the context of executing the Production Issue Resolution Workstep")
@GenericDomain(name="ServicingIssue", group="ProductionIssueDeterminationWorkstep")
public interface BqProductionIssueDeterminationWorkstep {
    @GenericDtxEndpoint
    @Description("Exchange Production Issue Determination Workstep")
    ExchangeProductionIssueDeterminationWorkstepResponse exchangeProductionIssueDeterminationWorkstep(ExchangeProductionIssueDeterminationWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Execute Production Issue Determination Workstep")
    ExecuteProductionIssueDeterminationWorkstepResponse executeProductionIssueDeterminationWorkstep(ExecuteProductionIssueDeterminationWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Production Issue Determination Workstep")
    InitiateProductionIssueDeterminationWorkstepResponse initiateProductionIssueDeterminationWorkstep(InitiateProductionIssueDeterminationWorkstepRequest req);

    @Description("Notify Production Issue Determination Workstep")
    NotifyProductionIssueDeterminationWorkstepResponse notifyProductionIssueDeterminationWorkstep(NotifyProductionIssueDeterminationWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Request Production Issue Determination Workstep")
    RequestProductionIssueDeterminationWorkstepResponse requestProductionIssueDeterminationWorkstep(RequestProductionIssueDeterminationWorkstepRequest req);

    @Description("Retrieve Production Issue Determination Workstep")
    RetrieveProductionIssueDeterminationWorkstepResponse retrieveProductionIssueDeterminationWorkstep(RetrieveProductionIssueDeterminationWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Update Production Issue Determination Workstep")
    UpdateProductionIssueDeterminationWorkstepResponse updateProductionIssueDeterminationWorkstep(UpdateProductionIssueDeterminationWorkstepRequest req);
}