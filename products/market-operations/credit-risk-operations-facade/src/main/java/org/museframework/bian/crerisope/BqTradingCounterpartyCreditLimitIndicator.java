package org.museframework.bian.crerisope;

import org.museframework.bian.crerisope.dto.EvaluateTradingCounterpartyCreditLimitIndicatorRequest;
import org.museframework.bian.crerisope.dto.EvaluateTradingCounterpartyCreditLimitIndicatorResponse;
import org.museframework.bian.crerisope.dto.ExecuteTradingCounterpartyCreditLimitIndicatorRequest;
import org.museframework.bian.crerisope.dto.ExecuteTradingCounterpartyCreditLimitIndicatorResponse;
import org.museframework.bian.crerisope.dto.NotifyTradingCounterpartyCreditLimitIndicatorRequest;
import org.museframework.bian.crerisope.dto.NotifyTradingCounterpartyCreditLimitIndicatorResponse;
import org.museframework.bian.crerisope.dto.RequestTradingCounterpartyCreditLimitIndicatorRequest;
import org.museframework.bian.crerisope.dto.RequestTradingCounterpartyCreditLimitIndicatorResponse;
import org.museframework.bian.crerisope.dto.RetrieveTradingCounterpartyCreditLimitIndicatorRequest;
import org.museframework.bian.crerisope.dto.RetrieveTradingCounterpartyCreditLimitIndicatorResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Trading Counterparty Credit Limit Indicator is one integral indicator that can be included in Trading Counterparty Credit Limit Indicator monitoring ")
@GenericDomain(name="CreditRiskOperations", group="TradingCounterpartyCreditLimitIndicator")
public interface BqTradingCounterpartyCreditLimitIndicator {
    @GenericDtxEndpoint
    @Description("Evaluate Trading Counterparty Credit Limit Indicator")
    EvaluateTradingCounterpartyCreditLimitIndicatorResponse evaluateTradingCounterpartyCreditLimitIndicator(EvaluateTradingCounterpartyCreditLimitIndicatorRequest req);

    @GenericDtxEndpoint
    @Description("Execute Trading Counterparty Credit Limit Indicator")
    ExecuteTradingCounterpartyCreditLimitIndicatorResponse executeTradingCounterpartyCreditLimitIndicator(ExecuteTradingCounterpartyCreditLimitIndicatorRequest req);

    @Description("Notify Trading Counterparty Credit Limit Indicator")
    NotifyTradingCounterpartyCreditLimitIndicatorResponse notifyTradingCounterpartyCreditLimitIndicator(NotifyTradingCounterpartyCreditLimitIndicatorRequest req);

    @GenericDtxEndpoint
    @Description("Request Trading Counterparty Credit Limit Indicator")
    RequestTradingCounterpartyCreditLimitIndicatorResponse requestTradingCounterpartyCreditLimitIndicator(RequestTradingCounterpartyCreditLimitIndicatorRequest req);

    @Description("Retrieve Trading Counterparty Credit Limit Indicator")
    RetrieveTradingCounterpartyCreditLimitIndicatorResponse retrieveTradingCounterpartyCreditLimitIndicator(RetrieveTradingCounterpartyCreditLimitIndicatorRequest req);
}