package org.museframework.bian.dealerdesk;

import org.museframework.bian.dealerdesk.dto.ExchangeInformationFeedAdministrationFunctionRequest;
import org.museframework.bian.dealerdesk.dto.ExchangeInformationFeedAdministrationFunctionResponse;
import org.museframework.bian.dealerdesk.dto.ExecuteInformationFeedAdministrationFunctionRequest;
import org.museframework.bian.dealerdesk.dto.ExecuteInformationFeedAdministrationFunctionResponse;
import org.museframework.bian.dealerdesk.dto.InitiateInformationFeedAdministrationFunctionRequest;
import org.museframework.bian.dealerdesk.dto.InitiateInformationFeedAdministrationFunctionResponse;
import org.museframework.bian.dealerdesk.dto.NotifyInformationFeedAdministrationFunctionRequest;
import org.museframework.bian.dealerdesk.dto.NotifyInformationFeedAdministrationFunctionResponse;
import org.museframework.bian.dealerdesk.dto.RequestInformationFeedAdministrationFunctionRequest;
import org.museframework.bian.dealerdesk.dto.RequestInformationFeedAdministrationFunctionResponse;
import org.museframework.bian.dealerdesk.dto.RetrieveInformationFeedAdministrationFunctionRequest;
import org.museframework.bian.dealerdesk.dto.RetrieveInformationFeedAdministrationFunctionResponse;
import org.museframework.bian.dealerdesk.dto.UpdateInformationFeedAdministrationFunctionRequest;
import org.museframework.bian.dealerdesk.dto.UpdateInformationFeedAdministrationFunctionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An operational service or function supported within the Dealer Desk Consolidated Position Tracking Function for doing Dealer Desk Consolidated Position Tracking Function")
@GenericDomain(name="DealerDesk", group="InformationFeedAdministrationFunction")
public interface BqInformationFeedAdministrationFunction {
    @GenericDtxEndpoint
    @Description("Exchange Information Feed Administration Function")
    ExchangeInformationFeedAdministrationFunctionResponse exchangeInformationFeedAdministrationFunction(ExchangeInformationFeedAdministrationFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Information Feed Administration Function")
    ExecuteInformationFeedAdministrationFunctionResponse executeInformationFeedAdministrationFunction(ExecuteInformationFeedAdministrationFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Information Feed Administration Function")
    InitiateInformationFeedAdministrationFunctionResponse initiateInformationFeedAdministrationFunction(InitiateInformationFeedAdministrationFunctionRequest req);

    @Description("Notify Information Feed Administration Function")
    NotifyInformationFeedAdministrationFunctionResponse notifyInformationFeedAdministrationFunction(NotifyInformationFeedAdministrationFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Request Information Feed Administration Function")
    RequestInformationFeedAdministrationFunctionResponse requestInformationFeedAdministrationFunction(RequestInformationFeedAdministrationFunctionRequest req);

    @Description("Retrieve Information Feed Administration Function")
    RetrieveInformationFeedAdministrationFunctionResponse retrieveInformationFeedAdministrationFunction(RetrieveInformationFeedAdministrationFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Update Information Feed Administration Function")
    UpdateInformationFeedAdministrationFunctionResponse updateInformationFeedAdministrationFunction(UpdateInformationFeedAdministrationFunctionRequest req);
}