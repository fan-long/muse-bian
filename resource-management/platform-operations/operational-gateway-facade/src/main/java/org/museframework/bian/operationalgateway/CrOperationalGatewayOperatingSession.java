package org.museframework.bian.operationalgateway;

import org.museframework.bian.operationalgateway.dto.ControlOperationalGatewayOperatingSessionRequest;
import org.museframework.bian.operationalgateway.dto.ControlOperationalGatewayOperatingSessionResponse;
import org.museframework.bian.operationalgateway.dto.ExchangeOperationalGatewayOperatingSessionRequest;
import org.museframework.bian.operationalgateway.dto.ExchangeOperationalGatewayOperatingSessionResponse;
import org.museframework.bian.operationalgateway.dto.ExecuteOperationalGatewayOperatingSessionRequest;
import org.museframework.bian.operationalgateway.dto.ExecuteOperationalGatewayOperatingSessionResponse;
import org.museframework.bian.operationalgateway.dto.InitiateOperationalGatewayOperatingSessionRequest;
import org.museframework.bian.operationalgateway.dto.InitiateOperationalGatewayOperatingSessionResponse;
import org.museframework.bian.operationalgateway.dto.NotifyOperationalGatewayOperatingSessionRequest;
import org.museframework.bian.operationalgateway.dto.NotifyOperationalGatewayOperatingSessionResponse;
import org.museframework.bian.operationalgateway.dto.RequestOperationalGatewayOperatingSessionRequest;
import org.museframework.bian.operationalgateway.dto.RequestOperationalGatewayOperatingSessionResponse;
import org.museframework.bian.operationalgateway.dto.RetrieveOperationalGatewayOperatingSessionRequest;
import org.museframework.bian.operationalgateway.dto.RetrieveOperationalGatewayOperatingSessionResponse;
import org.museframework.bian.operationalgateway.dto.UpdateOperationalGatewayOperatingSessionRequest;
import org.museframework.bian.operationalgateway.dto.UpdateOperationalGatewayOperatingSessionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility within Operational Gateway. ")
@GenericDomain(name="OperationalGateway", group="OperationalGatewayOperatingSession")
public interface CrOperationalGatewayOperatingSession {
    @GenericDtxEndpoint
    @Description("Control Operational Gateway Operating Session")
    ControlOperationalGatewayOperatingSessionResponse controlOperationalGatewayOperatingSession(ControlOperationalGatewayOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Operational Gateway Operating Session")
    ExchangeOperationalGatewayOperatingSessionResponse exchangeOperationalGatewayOperatingSession(ExchangeOperationalGatewayOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Operational Gateway Operating Session")
    ExecuteOperationalGatewayOperatingSessionResponse executeOperationalGatewayOperatingSession(ExecuteOperationalGatewayOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Operational Gateway Operating Session")
    InitiateOperationalGatewayOperatingSessionResponse initiateOperationalGatewayOperatingSession(InitiateOperationalGatewayOperatingSessionRequest req);

    @Description("Notify Operational Gateway Operating Session")
    NotifyOperationalGatewayOperatingSessionResponse notifyOperationalGatewayOperatingSession(NotifyOperationalGatewayOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Request Operational Gateway Operating Session")
    RequestOperationalGatewayOperatingSessionResponse requestOperationalGatewayOperatingSession(RequestOperationalGatewayOperatingSessionRequest req);

    @Description("Retrieve Operational Gateway Operating Session")
    RetrieveOperationalGatewayOperatingSessionResponse retrieveOperationalGatewayOperatingSession(RetrieveOperationalGatewayOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Update Operational Gateway Operating Session")
    UpdateOperationalGatewayOperatingSessionResponse updateOperationalGatewayOperatingSession(UpdateOperationalGatewayOperatingSessionRequest req);
}