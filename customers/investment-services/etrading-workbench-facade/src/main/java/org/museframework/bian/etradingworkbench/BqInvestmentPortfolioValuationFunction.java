package org.museframework.bian.etradingworkbench;

import org.museframework.bian.etradingworkbench.dto.ExchangeInvestmentPortfolioValuationFunctionRequest;
import org.museframework.bian.etradingworkbench.dto.ExchangeInvestmentPortfolioValuationFunctionResponse;
import org.museframework.bian.etradingworkbench.dto.ExecuteInvestmentPortfolioValuationFunctionRequest;
import org.museframework.bian.etradingworkbench.dto.ExecuteInvestmentPortfolioValuationFunctionResponse;
import org.museframework.bian.etradingworkbench.dto.InitiateInvestmentPortfolioValuationFunctionRequest;
import org.museframework.bian.etradingworkbench.dto.InitiateInvestmentPortfolioValuationFunctionResponse;
import org.museframework.bian.etradingworkbench.dto.NotifyInvestmentPortfolioValuationFunctionRequest;
import org.museframework.bian.etradingworkbench.dto.NotifyInvestmentPortfolioValuationFunctionResponse;
import org.museframework.bian.etradingworkbench.dto.RequestInvestmentPortfolioValuationFunctionRequest;
import org.museframework.bian.etradingworkbench.dto.RequestInvestmentPortfolioValuationFunctionResponse;
import org.museframework.bian.etradingworkbench.dto.RetrieveInvestmentPortfolioValuationFunctionRequest;
import org.museframework.bian.etradingworkbench.dto.RetrieveInvestmentPortfolioValuationFunctionResponse;
import org.museframework.bian.etradingworkbench.dto.UpdateInvestmentPortfolioValuationFunctionRequest;
import org.museframework.bian.etradingworkbench.dto.UpdateInvestmentPortfolioValuationFunctionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An operational service or function supported within the Market Order Initiation Function for doing Market Order Initiation Function")
@GenericDomain(name="eTradingWorkbench", group="InvestmentPortfolioValuationFunction")
public interface BqInvestmentPortfolioValuationFunction {
    @GenericDtxEndpoint
    @Description("Exchange Investment Portfolio Valuation Function")
    ExchangeInvestmentPortfolioValuationFunctionResponse exchangeInvestmentPortfolioValuationFunction(ExchangeInvestmentPortfolioValuationFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Investment Portfolio Valuation Function")
    ExecuteInvestmentPortfolioValuationFunctionResponse executeInvestmentPortfolioValuationFunction(ExecuteInvestmentPortfolioValuationFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Investment Portfolio Valuation Function")
    InitiateInvestmentPortfolioValuationFunctionResponse initiateInvestmentPortfolioValuationFunction(InitiateInvestmentPortfolioValuationFunctionRequest req);

    @Description("Notify Investment Portfolio Valuation Function")
    NotifyInvestmentPortfolioValuationFunctionResponse notifyInvestmentPortfolioValuationFunction(NotifyInvestmentPortfolioValuationFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Request Investment Portfolio Valuation Function")
    RequestInvestmentPortfolioValuationFunctionResponse requestInvestmentPortfolioValuationFunction(RequestInvestmentPortfolioValuationFunctionRequest req);

    @Description("Retrieve Investment Portfolio Valuation Function")
    RetrieveInvestmentPortfolioValuationFunctionResponse retrieveInvestmentPortfolioValuationFunction(RetrieveInvestmentPortfolioValuationFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Update Investment Portfolio Valuation Function")
    UpdateInvestmentPortfolioValuationFunctionResponse updateInvestmentPortfolioValuationFunction(UpdateInvestmentPortfolioValuationFunctionRequest req);
}