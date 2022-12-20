package org.museframework.bian.etradingworkbench;

import org.museframework.bian.etradingworkbench.dto.ControleTradingWorkbenchOperatingSessionRequest;
import org.museframework.bian.etradingworkbench.dto.ControleTradingWorkbenchOperatingSessionResponse;
import org.museframework.bian.etradingworkbench.dto.ExchangeeTradingWorkbenchOperatingSessionRequest;
import org.museframework.bian.etradingworkbench.dto.ExchangeeTradingWorkbenchOperatingSessionResponse;
import org.museframework.bian.etradingworkbench.dto.ExecuteeTradingWorkbenchOperatingSessionRequest;
import org.museframework.bian.etradingworkbench.dto.ExecuteeTradingWorkbenchOperatingSessionResponse;
import org.museframework.bian.etradingworkbench.dto.InitiateeTradingWorkbenchOperatingSessionRequest;
import org.museframework.bian.etradingworkbench.dto.InitiateeTradingWorkbenchOperatingSessionResponse;
import org.museframework.bian.etradingworkbench.dto.NotifyeTradingWorkbenchOperatingSessionRequest;
import org.museframework.bian.etradingworkbench.dto.NotifyeTradingWorkbenchOperatingSessionResponse;
import org.museframework.bian.etradingworkbench.dto.RequesteTradingWorkbenchOperatingSessionRequest;
import org.museframework.bian.etradingworkbench.dto.RequesteTradingWorkbenchOperatingSessionResponse;
import org.museframework.bian.etradingworkbench.dto.RetrieveeTradingWorkbenchOperatingSessionRequest;
import org.museframework.bian.etradingworkbench.dto.RetrieveeTradingWorkbenchOperatingSessionResponse;
import org.museframework.bian.etradingworkbench.dto.UpdateeTradingWorkbenchOperatingSessionRequest;
import org.museframework.bian.etradingworkbench.dto.UpdateeTradingWorkbenchOperatingSessionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility within eTrading Workbench. ")
@GenericDomain(name="eTradingWorkbench", group="eTradingWorkbenchOperatingSession")
public interface CreTradingWorkbenchOperatingSession {
    @GenericDtxEndpoint
    @Description("Control eTrading Workbench Operating Session")
    ControleTradingWorkbenchOperatingSessionResponse controleTradingWorkbenchOperatingSession(ControleTradingWorkbenchOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Exchange eTrading Workbench Operating Session")
    ExchangeeTradingWorkbenchOperatingSessionResponse exchangeeTradingWorkbenchOperatingSession(ExchangeeTradingWorkbenchOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Execute eTrading Workbench Operating Session")
    ExecuteeTradingWorkbenchOperatingSessionResponse executeeTradingWorkbenchOperatingSession(ExecuteeTradingWorkbenchOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate eTrading Workbench Operating Session")
    InitiateeTradingWorkbenchOperatingSessionResponse initiateeTradingWorkbenchOperatingSession(InitiateeTradingWorkbenchOperatingSessionRequest req);

    @Description("Notify eTrading Workbench Operating Session")
    NotifyeTradingWorkbenchOperatingSessionResponse notifyeTradingWorkbenchOperatingSession(NotifyeTradingWorkbenchOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Request eTrading Workbench Operating Session")
    RequesteTradingWorkbenchOperatingSessionResponse requesteTradingWorkbenchOperatingSession(RequesteTradingWorkbenchOperatingSessionRequest req);

    @Description("Retrieve eTrading Workbench Operating Session")
    RetrieveeTradingWorkbenchOperatingSessionResponse retrieveeTradingWorkbenchOperatingSession(RetrieveeTradingWorkbenchOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Update eTrading Workbench Operating Session")
    UpdateeTradingWorkbenchOperatingSessionResponse updateeTradingWorkbenchOperatingSession(UpdateeTradingWorkbenchOperatingSessionRequest req);
}