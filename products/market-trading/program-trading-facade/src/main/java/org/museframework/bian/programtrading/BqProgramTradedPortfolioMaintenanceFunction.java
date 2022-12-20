package org.museframework.bian.programtrading;

import org.museframework.bian.programtrading.dto.ExchangeProgramTradedPortfolioMaintenanceFunctionRequest;
import org.museframework.bian.programtrading.dto.ExchangeProgramTradedPortfolioMaintenanceFunctionResponse;
import org.museframework.bian.programtrading.dto.ExecuteProgramTradedPortfolioMaintenanceFunctionRequest;
import org.museframework.bian.programtrading.dto.ExecuteProgramTradedPortfolioMaintenanceFunctionResponse;
import org.museframework.bian.programtrading.dto.InitiateProgramTradedPortfolioMaintenanceFunctionRequest;
import org.museframework.bian.programtrading.dto.InitiateProgramTradedPortfolioMaintenanceFunctionResponse;
import org.museframework.bian.programtrading.dto.NotifyProgramTradedPortfolioMaintenanceFunctionRequest;
import org.museframework.bian.programtrading.dto.NotifyProgramTradedPortfolioMaintenanceFunctionResponse;
import org.museframework.bian.programtrading.dto.RequestProgramTradedPortfolioMaintenanceFunctionRequest;
import org.museframework.bian.programtrading.dto.RequestProgramTradedPortfolioMaintenanceFunctionResponse;
import org.museframework.bian.programtrading.dto.RetrieveProgramTradedPortfolioMaintenanceFunctionRequest;
import org.museframework.bian.programtrading.dto.RetrieveProgramTradedPortfolioMaintenanceFunctionResponse;
import org.museframework.bian.programtrading.dto.UpdateProgramTradedPortfolioMaintenanceFunctionRequest;
import org.museframework.bian.programtrading.dto.UpdateProgramTradedPortfolioMaintenanceFunctionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An operational service or function supported within the Program Traded Portfolio Maintenance Function for doing Program Traded Portfolio Maintenance Function")
@GenericDomain(name="ProgramTrading", group="ProgramTradedPortfolioMaintenanceFunction")
public interface BqProgramTradedPortfolioMaintenanceFunction {
    @GenericDtxEndpoint
    @Description("Exchange Program Traded Portfolio Maintenance Function")
    ExchangeProgramTradedPortfolioMaintenanceFunctionResponse exchangeProgramTradedPortfolioMaintenanceFunction(ExchangeProgramTradedPortfolioMaintenanceFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Program Traded Portfolio Maintenance Function")
    ExecuteProgramTradedPortfolioMaintenanceFunctionResponse executeProgramTradedPortfolioMaintenanceFunction(ExecuteProgramTradedPortfolioMaintenanceFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Program Traded Portfolio Maintenance Function")
    InitiateProgramTradedPortfolioMaintenanceFunctionResponse initiateProgramTradedPortfolioMaintenanceFunction(InitiateProgramTradedPortfolioMaintenanceFunctionRequest req);

    @Description("Notify Program Traded Portfolio Maintenance Function")
    NotifyProgramTradedPortfolioMaintenanceFunctionResponse notifyProgramTradedPortfolioMaintenanceFunction(NotifyProgramTradedPortfolioMaintenanceFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Request Program Traded Portfolio Maintenance Function")
    RequestProgramTradedPortfolioMaintenanceFunctionResponse requestProgramTradedPortfolioMaintenanceFunction(RequestProgramTradedPortfolioMaintenanceFunctionRequest req);

    @Description("Retrieve Program Traded Portfolio Maintenance Function")
    RetrieveProgramTradedPortfolioMaintenanceFunctionResponse retrieveProgramTradedPortfolioMaintenanceFunction(RetrieveProgramTradedPortfolioMaintenanceFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Update Program Traded Portfolio Maintenance Function")
    UpdateProgramTradedPortfolioMaintenanceFunctionResponse updateProgramTradedPortfolioMaintenanceFunction(UpdateProgramTradedPortfolioMaintenanceFunctionRequest req);
}