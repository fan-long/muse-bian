package org.museframework.bian.tradesettlement;

import org.museframework.bian.tradesettlement.dto.ControlTradeSettlementProcedureRequest;
import org.museframework.bian.tradesettlement.dto.ControlTradeSettlementProcedureResponse;
import org.museframework.bian.tradesettlement.dto.ExchangeTradeSettlementProcedureRequest;
import org.museframework.bian.tradesettlement.dto.ExchangeTradeSettlementProcedureResponse;
import org.museframework.bian.tradesettlement.dto.ExecuteTradeSettlementProcedureRequest;
import org.museframework.bian.tradesettlement.dto.ExecuteTradeSettlementProcedureResponse;
import org.museframework.bian.tradesettlement.dto.InitiateTradeSettlementProcedureRequest;
import org.museframework.bian.tradesettlement.dto.InitiateTradeSettlementProcedureResponse;
import org.museframework.bian.tradesettlement.dto.NotifyTradeSettlementProcedureRequest;
import org.museframework.bian.tradesettlement.dto.NotifyTradeSettlementProcedureResponse;
import org.museframework.bian.tradesettlement.dto.RequestTradeSettlementProcedureRequest;
import org.museframework.bian.tradesettlement.dto.RequestTradeSettlementProcedureResponse;
import org.museframework.bian.tradesettlement.dto.RetrieveTradeSettlementProcedureRequest;
import org.museframework.bian.tradesettlement.dto.RetrieveTradeSettlementProcedureResponse;
import org.museframework.bian.tradesettlement.dto.UpdateTradeSettlementProcedureRequest;
import org.museframework.bian.tradesettlement.dto.UpdateTradeSettlementProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Trade Settlement. ")
@GenericDomain(name="TradeSettlement", group="TradeSettlementProcedure")
public interface CrTradeSettlementProcedure {
    @GenericDtxEndpoint
    @Description("Control Trade Settlement Procedure")
    ControlTradeSettlementProcedureResponse controlTradeSettlementProcedure(ControlTradeSettlementProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Trade Settlement Procedure")
    ExchangeTradeSettlementProcedureResponse exchangeTradeSettlementProcedure(ExchangeTradeSettlementProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Execute Trade Settlement Procedure")
    ExecuteTradeSettlementProcedureResponse executeTradeSettlementProcedure(ExecuteTradeSettlementProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Trade Settlement Procedure")
    InitiateTradeSettlementProcedureResponse initiateTradeSettlementProcedure(InitiateTradeSettlementProcedureRequest req);

    @Description("Notify Trade Settlement Procedure")
    NotifyTradeSettlementProcedureResponse notifyTradeSettlementProcedure(NotifyTradeSettlementProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Request Trade Settlement Procedure")
    RequestTradeSettlementProcedureResponse requestTradeSettlementProcedure(RequestTradeSettlementProcedureRequest req);

    @Description("Retrieve Trade Settlement Procedure")
    RetrieveTradeSettlementProcedureResponse retrieveTradeSettlementProcedure(RetrieveTradeSettlementProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Update Trade Settlement Procedure")
    UpdateTradeSettlementProcedureResponse updateTradeSettlementProcedure(UpdateTradeSettlementProcedureRequest req);
}