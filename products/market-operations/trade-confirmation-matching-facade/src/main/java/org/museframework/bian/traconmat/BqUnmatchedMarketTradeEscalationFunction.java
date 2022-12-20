package org.museframework.bian.traconmat;

import org.museframework.bian.traconmat.dto.ExchangeUnmatchedMarketTradeEscalationFunctionRequest;
import org.museframework.bian.traconmat.dto.ExchangeUnmatchedMarketTradeEscalationFunctionResponse;
import org.museframework.bian.traconmat.dto.ExecuteUnmatchedMarketTradeEscalationFunctionRequest;
import org.museframework.bian.traconmat.dto.ExecuteUnmatchedMarketTradeEscalationFunctionResponse;
import org.museframework.bian.traconmat.dto.InitiateUnmatchedMarketTradeEscalationFunctionRequest;
import org.museframework.bian.traconmat.dto.InitiateUnmatchedMarketTradeEscalationFunctionResponse;
import org.museframework.bian.traconmat.dto.NotifyUnmatchedMarketTradeEscalationFunctionRequest;
import org.museframework.bian.traconmat.dto.NotifyUnmatchedMarketTradeEscalationFunctionResponse;
import org.museframework.bian.traconmat.dto.RequestUnmatchedMarketTradeEscalationFunctionRequest;
import org.museframework.bian.traconmat.dto.RequestUnmatchedMarketTradeEscalationFunctionResponse;
import org.museframework.bian.traconmat.dto.RetrieveUnmatchedMarketTradeEscalationFunctionRequest;
import org.museframework.bian.traconmat.dto.RetrieveUnmatchedMarketTradeEscalationFunctionResponse;
import org.museframework.bian.traconmat.dto.UpdateUnmatchedMarketTradeEscalationFunctionRequest;
import org.museframework.bian.traconmat.dto.UpdateUnmatchedMarketTradeEscalationFunctionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An operational service or function supported within the Transaction Confirmation/Affirmation Function for doing Transaction Confirmation/Affirmation Function")
@GenericDomain(name="TradeConfirmationMatching", group="UnmatchedMarketTradeEscalationFunction")
public interface BqUnmatchedMarketTradeEscalationFunction {
    @GenericDtxEndpoint
    @Description("Exchange Unmatched Market Trade Escalation Function")
    ExchangeUnmatchedMarketTradeEscalationFunctionResponse exchangeUnmatchedMarketTradeEscalationFunction(ExchangeUnmatchedMarketTradeEscalationFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Unmatched Market Trade Escalation Function")
    ExecuteUnmatchedMarketTradeEscalationFunctionResponse executeUnmatchedMarketTradeEscalationFunction(ExecuteUnmatchedMarketTradeEscalationFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Unmatched Market Trade Escalation Function")
    InitiateUnmatchedMarketTradeEscalationFunctionResponse initiateUnmatchedMarketTradeEscalationFunction(InitiateUnmatchedMarketTradeEscalationFunctionRequest req);

    @Description("Notify Unmatched Market Trade Escalation Function")
    NotifyUnmatchedMarketTradeEscalationFunctionResponse notifyUnmatchedMarketTradeEscalationFunction(NotifyUnmatchedMarketTradeEscalationFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Request Unmatched Market Trade Escalation Function")
    RequestUnmatchedMarketTradeEscalationFunctionResponse requestUnmatchedMarketTradeEscalationFunction(RequestUnmatchedMarketTradeEscalationFunctionRequest req);

    @Description("Retrieve Unmatched Market Trade Escalation Function")
    RetrieveUnmatchedMarketTradeEscalationFunctionResponse retrieveUnmatchedMarketTradeEscalationFunction(RetrieveUnmatchedMarketTradeEscalationFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Update Unmatched Market Trade Escalation Function")
    UpdateUnmatchedMarketTradeEscalationFunctionResponse updateUnmatchedMarketTradeEscalationFunction(UpdateUnmatchedMarketTradeEscalationFunctionRequest req);
}