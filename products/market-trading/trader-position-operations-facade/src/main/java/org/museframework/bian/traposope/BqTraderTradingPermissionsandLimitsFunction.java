package org.museframework.bian.traposope;

import org.museframework.bian.traposope.dto.ExchangeTraderTradingPermissionsandLimitsFunctionRequest;
import org.museframework.bian.traposope.dto.ExchangeTraderTradingPermissionsandLimitsFunctionResponse;
import org.museframework.bian.traposope.dto.ExecuteTraderTradingPermissionsandLimitsFunctionRequest;
import org.museframework.bian.traposope.dto.ExecuteTraderTradingPermissionsandLimitsFunctionResponse;
import org.museframework.bian.traposope.dto.InitiateTraderTradingPermissionsandLimitsFunctionRequest;
import org.museframework.bian.traposope.dto.InitiateTraderTradingPermissionsandLimitsFunctionResponse;
import org.museframework.bian.traposope.dto.NotifyTraderTradingPermissionsandLimitsFunctionRequest;
import org.museframework.bian.traposope.dto.NotifyTraderTradingPermissionsandLimitsFunctionResponse;
import org.museframework.bian.traposope.dto.RequestTraderTradingPermissionsandLimitsFunctionRequest;
import org.museframework.bian.traposope.dto.RequestTraderTradingPermissionsandLimitsFunctionResponse;
import org.museframework.bian.traposope.dto.RetrieveTraderTradingPermissionsandLimitsFunctionRequest;
import org.museframework.bian.traposope.dto.RetrieveTraderTradingPermissionsandLimitsFunctionResponse;
import org.museframework.bian.traposope.dto.UpdateTraderTradingPermissionsandLimitsFunctionRequest;
import org.museframework.bian.traposope.dto.UpdateTraderTradingPermissionsandLimitsFunctionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An operational service or function supported within the Trade Capture and Reporting Function for doing Trade Capture and Reporting Function")
@GenericDomain(name="TraderPositionOperations", group="TraderTradingPermissionsandLimitsFunction")
public interface BqTraderTradingPermissionsandLimitsFunction {
    @GenericDtxEndpoint
    @Description("Exchange Trader Trading Permissions and Limits Function")
    ExchangeTraderTradingPermissionsandLimitsFunctionResponse exchangeTraderTradingPermissionsandLimitsFunction(ExchangeTraderTradingPermissionsandLimitsFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Trader Trading Permissions and Limits Function")
    ExecuteTraderTradingPermissionsandLimitsFunctionResponse executeTraderTradingPermissionsandLimitsFunction(ExecuteTraderTradingPermissionsandLimitsFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Trader Trading Permissions and Limits Function")
    InitiateTraderTradingPermissionsandLimitsFunctionResponse initiateTraderTradingPermissionsandLimitsFunction(InitiateTraderTradingPermissionsandLimitsFunctionRequest req);

    @Description("Notify Trader Trading Permissions and Limits Function")
    NotifyTraderTradingPermissionsandLimitsFunctionResponse notifyTraderTradingPermissionsandLimitsFunction(NotifyTraderTradingPermissionsandLimitsFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Request Trader Trading Permissions and Limits Function")
    RequestTraderTradingPermissionsandLimitsFunctionResponse requestTraderTradingPermissionsandLimitsFunction(RequestTraderTradingPermissionsandLimitsFunctionRequest req);

    @Description("Retrieve Trader Trading Permissions and Limits Function")
    RetrieveTraderTradingPermissionsandLimitsFunctionResponse retrieveTraderTradingPermissionsandLimitsFunction(RetrieveTraderTradingPermissionsandLimitsFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Update Trader Trading Permissions and Limits Function")
    UpdateTraderTradingPermissionsandLimitsFunctionResponse updateTraderTradingPermissionsandLimitsFunction(UpdateTraderTradingPermissionsandLimitsFunctionRequest req);
}