package org.museframework.bian.tradeclearing;

import org.museframework.bian.tradeclearing.dto.ControlTradeClearingProcedureRequest;
import org.museframework.bian.tradeclearing.dto.ControlTradeClearingProcedureResponse;
import org.museframework.bian.tradeclearing.dto.ExchangeTradeClearingProcedureRequest;
import org.museframework.bian.tradeclearing.dto.ExchangeTradeClearingProcedureResponse;
import org.museframework.bian.tradeclearing.dto.ExecuteTradeClearingProcedureRequest;
import org.museframework.bian.tradeclearing.dto.ExecuteTradeClearingProcedureResponse;
import org.museframework.bian.tradeclearing.dto.InitiateTradeClearingProcedureRequest;
import org.museframework.bian.tradeclearing.dto.InitiateTradeClearingProcedureResponse;
import org.museframework.bian.tradeclearing.dto.NotifyTradeClearingProcedureRequest;
import org.museframework.bian.tradeclearing.dto.NotifyTradeClearingProcedureResponse;
import org.museframework.bian.tradeclearing.dto.RequestTradeClearingProcedureRequest;
import org.museframework.bian.tradeclearing.dto.RequestTradeClearingProcedureResponse;
import org.museframework.bian.tradeclearing.dto.RetrieveTradeClearingProcedureRequest;
import org.museframework.bian.tradeclearing.dto.RetrieveTradeClearingProcedureResponse;
import org.museframework.bian.tradeclearing.dto.UpdateTradeClearingProcedureRequest;
import org.museframework.bian.tradeclearing.dto.UpdateTradeClearingProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Trade Clearing. ")
@GenericDomain(name="TradeClearing", group="TradeClearingProcedure")
public interface CrTradeClearingProcedure {
    @GenericDtxEndpoint
    @Description("Control Trade Clearing Procedure")
    ControlTradeClearingProcedureResponse controlTradeClearingProcedure(ControlTradeClearingProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Trade Clearing Procedure")
    ExchangeTradeClearingProcedureResponse exchangeTradeClearingProcedure(ExchangeTradeClearingProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Execute Trade Clearing Procedure")
    ExecuteTradeClearingProcedureResponse executeTradeClearingProcedure(ExecuteTradeClearingProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Trade Clearing Procedure")
    InitiateTradeClearingProcedureResponse initiateTradeClearingProcedure(InitiateTradeClearingProcedureRequest req);

    @Description("Notify Trade Clearing Procedure")
    NotifyTradeClearingProcedureResponse notifyTradeClearingProcedure(NotifyTradeClearingProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Request Trade Clearing Procedure")
    RequestTradeClearingProcedureResponse requestTradeClearingProcedure(RequestTradeClearingProcedureRequest req);

    @Description("Retrieve Trade Clearing Procedure")
    RetrieveTradeClearingProcedureResponse retrieveTradeClearingProcedure(RetrieveTradeClearingProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Update Trade Clearing Procedure")
    UpdateTradeClearingProcedureResponse updateTradeClearingProcedure(UpdateTradeClearingProcedureRequest req);
}