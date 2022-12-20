package org.museframework.bian.cortruser;

import org.museframework.bian.cortruser.dto.ExchangeCorporateDebtIssueOversightFulfillmentRequest;
import org.museframework.bian.cortruser.dto.ExchangeCorporateDebtIssueOversightFulfillmentResponse;
import org.museframework.bian.cortruser.dto.ExecuteCorporateDebtIssueOversightFulfillmentRequest;
import org.museframework.bian.cortruser.dto.ExecuteCorporateDebtIssueOversightFulfillmentResponse;
import org.museframework.bian.cortruser.dto.InitiateCorporateDebtIssueOversightFulfillmentRequest;
import org.museframework.bian.cortruser.dto.InitiateCorporateDebtIssueOversightFulfillmentResponse;
import org.museframework.bian.cortruser.dto.NotifyCorporateDebtIssueOversightFulfillmentRequest;
import org.museframework.bian.cortruser.dto.NotifyCorporateDebtIssueOversightFulfillmentResponse;
import org.museframework.bian.cortruser.dto.RequestCorporateDebtIssueOversightFulfillmentRequest;
import org.museframework.bian.cortruser.dto.RequestCorporateDebtIssueOversightFulfillmentResponse;
import org.museframework.bian.cortruser.dto.RetrieveCorporateDebtIssueOversightFulfillmentRequest;
import org.museframework.bian.cortruser.dto.RetrieveCorporateDebtIssueOversightFulfillmentResponse;
import org.museframework.bian.cortruser.dto.UpdateCorporateDebtIssueOversightFulfillmentRequest;
import org.museframework.bian.cortruser.dto.UpdateCorporateDebtIssueOversightFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Trust Court Administration Fulfillment arrangement within the Trust Court Administration Fulfillment")
@GenericDomain(name="CorporateTrustServices", group="CorporateDebtIssueOversightFulfillment")
public interface BqCorporateDebtIssueOversightFulfillment {
    @GenericDtxEndpoint
    @Description("Exchange Corporate Debt Issue Oversight Fulfillment")
    ExchangeCorporateDebtIssueOversightFulfillmentResponse exchangeCorporateDebtIssueOversightFulfillment(ExchangeCorporateDebtIssueOversightFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Execute Corporate Debt Issue Oversight Fulfillment")
    ExecuteCorporateDebtIssueOversightFulfillmentResponse executeCorporateDebtIssueOversightFulfillment(ExecuteCorporateDebtIssueOversightFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Corporate Debt Issue Oversight Fulfillment")
    InitiateCorporateDebtIssueOversightFulfillmentResponse initiateCorporateDebtIssueOversightFulfillment(InitiateCorporateDebtIssueOversightFulfillmentRequest req);

    @Description("Notify Corporate Debt Issue Oversight Fulfillment")
    NotifyCorporateDebtIssueOversightFulfillmentResponse notifyCorporateDebtIssueOversightFulfillment(NotifyCorporateDebtIssueOversightFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Request Corporate Debt Issue Oversight Fulfillment")
    RequestCorporateDebtIssueOversightFulfillmentResponse requestCorporateDebtIssueOversightFulfillment(RequestCorporateDebtIssueOversightFulfillmentRequest req);

    @Description("Retrieve Corporate Debt Issue Oversight Fulfillment")
    RetrieveCorporateDebtIssueOversightFulfillmentResponse retrieveCorporateDebtIssueOversightFulfillment(RetrieveCorporateDebtIssueOversightFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Update Corporate Debt Issue Oversight Fulfillment")
    UpdateCorporateDebtIssueOversightFulfillmentResponse updateCorporateDebtIssueOversightFulfillment(UpdateCorporateDebtIssueOversightFulfillmentRequest req);
}