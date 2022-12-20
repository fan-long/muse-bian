package org.museframework.bian.marinfman;

import org.museframework.bian.marinfman.dto.CreateFinancialMarketInformationAdministrativePlanRequest;
import org.museframework.bian.marinfman.dto.CreateFinancialMarketInformationAdministrativePlanResponse;
import org.museframework.bian.marinfman.dto.RetrieveFinancialMarketInformationAdministrativePlanRequest;
import org.museframework.bian.marinfman.dto.RetrieveFinancialMarketInformationAdministrativePlanResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handle and assign the day to day activities, capture time, costs and income for an operational unit within Market Information Management.  ")
@GenericDomain(name="MarketInformationManagement", group="FinancialMarketInformationAdministrativePlan")
public interface CrFinancialMarketInformationAdministrativePlan {
    @GenericDtxEndpoint
    @Description("CrCR Create an administrative plan for market information management")
    CreateFinancialMarketInformationAdministrativePlanResponse createFinancialMarketInformationAdministrativePlan(CreateFinancialMarketInformationAdministrativePlanRequest req);

    @Description("ReCR Retrieve details about the financial market information management activity")
    RetrieveFinancialMarketInformationAdministrativePlanResponse retrieveFinancialMarketInformationAdministrativePlan(RetrieveFinancialMarketInformationAdministrativePlanRequest req);
}