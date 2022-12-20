package org.museframework.bian.positionmanagement;

import org.museframework.bian.positionmanagement.dto.InitiateFinancialPositionStateRequest;
import org.museframework.bian.positionmanagement.dto.InitiateFinancialPositionStateResponse;
import org.museframework.bian.positionmanagement.dto.RequestFinancialPositionStateRequest;
import org.museframework.bian.positionmanagement.dto.RequestFinancialPositionStateResponse;
import org.museframework.bian.positionmanagement.dto.UpdateFinancialPositionStateRequest;
import org.museframework.bian.positionmanagement.dto.UpdateFinancialPositionStateResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Monitor and define the status/rating of some entity within Position Management. ")
@GenericDomain(name="PositionManagement", group="FinancialPositionState")
public interface CrFinancialPositionState {
    @GenericDtxEndpoint
    @Description("InCR Initialize a monitored financial position")
    InitiateFinancialPositionStateResponse initiateFinancialPositionState(InitiateFinancialPositionStateRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update the settings and notification arrangements for a position")
    UpdateFinancialPositionStateResponse updateFinancialPositionState(UpdateFinancialPositionStateRequest req);

    @GenericDtxEndpoint
    @Description("ReCR Get details and the current value of a monitored position")
    RequestFinancialPositionStateResponse requestFinancialPositionState(RequestFinancialPositionStateRequest req);
}