package org.museframework.bian.traandprirep;

import org.museframework.bian.traandprirep.dto.ControlMarketTradeReportingOperatingSessionRequest;
import org.museframework.bian.traandprirep.dto.ControlMarketTradeReportingOperatingSessionResponse;
import org.museframework.bian.traandprirep.dto.ExchangeMarketTradeReportingOperatingSessionRequest;
import org.museframework.bian.traandprirep.dto.ExchangeMarketTradeReportingOperatingSessionResponse;
import org.museframework.bian.traandprirep.dto.ExecuteMarketTradeReportingOperatingSessionRequest;
import org.museframework.bian.traandprirep.dto.ExecuteMarketTradeReportingOperatingSessionResponse;
import org.museframework.bian.traandprirep.dto.InitiateMarketTradeReportingOperatingSessionRequest;
import org.museframework.bian.traandprirep.dto.InitiateMarketTradeReportingOperatingSessionResponse;
import org.museframework.bian.traandprirep.dto.NotifyMarketTradeReportingOperatingSessionRequest;
import org.museframework.bian.traandprirep.dto.NotifyMarketTradeReportingOperatingSessionResponse;
import org.museframework.bian.traandprirep.dto.RequestMarketTradeReportingOperatingSessionRequest;
import org.museframework.bian.traandprirep.dto.RequestMarketTradeReportingOperatingSessionResponse;
import org.museframework.bian.traandprirep.dto.RetrieveMarketTradeReportingOperatingSessionRequest;
import org.museframework.bian.traandprirep.dto.RetrieveMarketTradeReportingOperatingSessionResponse;
import org.museframework.bian.traandprirep.dto.UpdateMarketTradeReportingOperatingSessionRequest;
import org.museframework.bian.traandprirep.dto.UpdateMarketTradeReportingOperatingSessionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility within Trade and Price Reporting. ")
@GenericDomain(name="TradeandPriceReporting", group="MarketTradeReportingOperatingSession")
public interface CrMarketTradeReportingOperatingSession {
    @GenericDtxEndpoint
    @Description("Control Market Trade Reporting Operating Session")
    ControlMarketTradeReportingOperatingSessionResponse controlMarketTradeReportingOperatingSession(ControlMarketTradeReportingOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Market Trade Reporting Operating Session")
    ExchangeMarketTradeReportingOperatingSessionResponse exchangeMarketTradeReportingOperatingSession(ExchangeMarketTradeReportingOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Market Trade Reporting Operating Session")
    ExecuteMarketTradeReportingOperatingSessionResponse executeMarketTradeReportingOperatingSession(ExecuteMarketTradeReportingOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Market Trade Reporting Operating Session")
    InitiateMarketTradeReportingOperatingSessionResponse initiateMarketTradeReportingOperatingSession(InitiateMarketTradeReportingOperatingSessionRequest req);

    @Description("Notify Market Trade Reporting Operating Session")
    NotifyMarketTradeReportingOperatingSessionResponse notifyMarketTradeReportingOperatingSession(NotifyMarketTradeReportingOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Request Market Trade Reporting Operating Session")
    RequestMarketTradeReportingOperatingSessionResponse requestMarketTradeReportingOperatingSession(RequestMarketTradeReportingOperatingSessionRequest req);

    @Description("Retrieve Market Trade Reporting Operating Session")
    RetrieveMarketTradeReportingOperatingSessionResponse retrieveMarketTradeReportingOperatingSession(RetrieveMarketTradeReportingOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Update Market Trade Reporting Operating Session")
    UpdateMarketTradeReportingOperatingSessionResponse updateMarketTradeReportingOperatingSession(UpdateMarketTradeReportingOperatingSessionRequest req);
}