package org.museframework.bian.financialgateway;

import org.museframework.bian.financialgateway.dto.InitiateFinancialGatewayOperatingSessionRequest;
import org.museframework.bian.financialgateway.dto.InitiateFinancialGatewayOperatingSessionResponse;
import org.museframework.bian.financialgateway.dto.RequestFinancialGatewayOperatingSessionRequest;
import org.museframework.bian.financialgateway.dto.RequestFinancialGatewayOperatingSessionResponse;
import org.museframework.bian.financialgateway.dto.RetrieveFinancialGatewayOperatingSessionRequest;
import org.museframework.bian.financialgateway.dto.RetrieveFinancialGatewayOperatingSessionResponse;
import org.museframework.bian.financialgateway.dto.UpdateFinancialGatewayOperatingSessionRequest;
import org.museframework.bian.financialgateway.dto.UpdateFinancialGatewayOperatingSessionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility within Financial Gateway. ")
@GenericDomain(name="FinancialGateway", group="FinancialGatewayOperatingSession")
public interface CrFinancialGatewayOperatingSession {
    @GenericDtxEndpoint
    @Description("InCR Initiate the financial gateway service session")
    InitiateFinancialGatewayOperatingSessionResponse initiateFinancialGatewayOperatingSession(InitiateFinancialGatewayOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update the gateway service details")
    UpdateFinancialGatewayOperatingSessionResponse updateFinancialGatewayOperatingSession(UpdateFinancialGatewayOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Report an issue with the production service")
    RequestFinancialGatewayOperatingSessionResponse requestFinancialGatewayOperatingSession(RequestFinancialGatewayOperatingSessionRequest req);

    @Description("ReCR Retrieve details and statistics relating to a session")
    RetrieveFinancialGatewayOperatingSessionResponse retrieveFinancialGatewayOperatingSession(RetrieveFinancialGatewayOperatingSessionRequest req);
}