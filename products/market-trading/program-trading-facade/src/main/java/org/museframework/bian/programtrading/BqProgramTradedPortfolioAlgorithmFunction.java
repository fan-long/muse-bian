package org.museframework.bian.programtrading;

import org.museframework.bian.programtrading.dto.ExchangeProgramTradedPortfolioAlgorithmFunctionRequest;
import org.museframework.bian.programtrading.dto.ExchangeProgramTradedPortfolioAlgorithmFunctionResponse;
import org.museframework.bian.programtrading.dto.ExecuteProgramTradedPortfolioAlgorithmFunctionRequest;
import org.museframework.bian.programtrading.dto.ExecuteProgramTradedPortfolioAlgorithmFunctionResponse;
import org.museframework.bian.programtrading.dto.InitiateProgramTradedPortfolioAlgorithmFunctionRequest;
import org.museframework.bian.programtrading.dto.InitiateProgramTradedPortfolioAlgorithmFunctionResponse;
import org.museframework.bian.programtrading.dto.NotifyProgramTradedPortfolioAlgorithmFunctionRequest;
import org.museframework.bian.programtrading.dto.NotifyProgramTradedPortfolioAlgorithmFunctionResponse;
import org.museframework.bian.programtrading.dto.RequestProgramTradedPortfolioAlgorithmFunctionRequest;
import org.museframework.bian.programtrading.dto.RequestProgramTradedPortfolioAlgorithmFunctionResponse;
import org.museframework.bian.programtrading.dto.RetrieveProgramTradedPortfolioAlgorithmFunctionRequest;
import org.museframework.bian.programtrading.dto.RetrieveProgramTradedPortfolioAlgorithmFunctionResponse;
import org.museframework.bian.programtrading.dto.UpdateProgramTradedPortfolioAlgorithmFunctionRequest;
import org.museframework.bian.programtrading.dto.UpdateProgramTradedPortfolioAlgorithmFunctionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An operational service or function supported within the Program Traded Portfolio Maintenance Function for doing Program Traded Portfolio Maintenance Function")
@GenericDomain(name="ProgramTrading", group="ProgramTradedPortfolioAlgorithmFunction")
public interface BqProgramTradedPortfolioAlgorithmFunction {
    @GenericDtxEndpoint
    @Description("Exchange Program Traded Portfolio Algorithm Function")
    ExchangeProgramTradedPortfolioAlgorithmFunctionResponse exchangeProgramTradedPortfolioAlgorithmFunction(ExchangeProgramTradedPortfolioAlgorithmFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Program Traded Portfolio Algorithm Function")
    ExecuteProgramTradedPortfolioAlgorithmFunctionResponse executeProgramTradedPortfolioAlgorithmFunction(ExecuteProgramTradedPortfolioAlgorithmFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Program Traded Portfolio Algorithm Function")
    InitiateProgramTradedPortfolioAlgorithmFunctionResponse initiateProgramTradedPortfolioAlgorithmFunction(InitiateProgramTradedPortfolioAlgorithmFunctionRequest req);

    @Description("Notify Program Traded Portfolio Algorithm Function")
    NotifyProgramTradedPortfolioAlgorithmFunctionResponse notifyProgramTradedPortfolioAlgorithmFunction(NotifyProgramTradedPortfolioAlgorithmFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Request Program Traded Portfolio Algorithm Function")
    RequestProgramTradedPortfolioAlgorithmFunctionResponse requestProgramTradedPortfolioAlgorithmFunction(RequestProgramTradedPortfolioAlgorithmFunctionRequest req);

    @Description("Retrieve Program Traded Portfolio Algorithm Function")
    RetrieveProgramTradedPortfolioAlgorithmFunctionResponse retrieveProgramTradedPortfolioAlgorithmFunction(RetrieveProgramTradedPortfolioAlgorithmFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Update Program Traded Portfolio Algorithm Function")
    UpdateProgramTradedPortfolioAlgorithmFunctionResponse updateProgramTradedPortfolioAlgorithmFunction(UpdateProgramTradedPortfolioAlgorithmFunctionRequest req);
}