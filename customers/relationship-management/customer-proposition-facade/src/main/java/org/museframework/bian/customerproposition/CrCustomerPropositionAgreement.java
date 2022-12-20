package org.museframework.bian.customerproposition;

import org.museframework.bian.customerproposition.dto.ControlCustomerPropositionAgreementRequest;
import org.museframework.bian.customerproposition.dto.ControlCustomerPropositionAgreementResponse;
import org.museframework.bian.customerproposition.dto.EvaluateCustomerPropositionAgreementRequest;
import org.museframework.bian.customerproposition.dto.EvaluateCustomerPropositionAgreementResponse;
import org.museframework.bian.customerproposition.dto.ExchangeCustomerPropositionAgreementRequest;
import org.museframework.bian.customerproposition.dto.ExchangeCustomerPropositionAgreementResponse;
import org.museframework.bian.customerproposition.dto.GrantCustomerPropositionAgreementRequest;
import org.museframework.bian.customerproposition.dto.GrantCustomerPropositionAgreementResponse;
import org.museframework.bian.customerproposition.dto.NotifyCustomerPropositionAgreementRequest;
import org.museframework.bian.customerproposition.dto.NotifyCustomerPropositionAgreementResponse;
import org.museframework.bian.customerproposition.dto.RequestCustomerPropositionAgreementRequest;
import org.museframework.bian.customerproposition.dto.RequestCustomerPropositionAgreementResponse;
import org.museframework.bian.customerproposition.dto.RetrieveCustomerPropositionAgreementRequest;
import org.museframework.bian.customerproposition.dto.RetrieveCustomerPropositionAgreementResponse;
import org.museframework.bian.customerproposition.dto.UpdateCustomerPropositionAgreementRequest;
import org.museframework.bian.customerproposition.dto.UpdateCustomerPropositionAgreementResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Maintain the terms and conditions that apply to a commercial relationship within Customer Proposition.  ")
@GenericDomain(name="CustomerProposition", group="CustomerPropositionAgreement")
public interface CrCustomerPropositionAgreement {
    @GenericDtxEndpoint
    @Description("Control Customer Proposition Agreement")
    ControlCustomerPropositionAgreementResponse controlCustomerPropositionAgreement(ControlCustomerPropositionAgreementRequest req);

    @GenericDtxEndpoint
    @Description("Evaluate Customer Proposition Agreement")
    EvaluateCustomerPropositionAgreementResponse evaluateCustomerPropositionAgreement(EvaluateCustomerPropositionAgreementRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Customer Proposition Agreement")
    ExchangeCustomerPropositionAgreementResponse exchangeCustomerPropositionAgreement(ExchangeCustomerPropositionAgreementRequest req);

    @GenericDtxEndpoint
    @Description("Grant Customer Proposition Agreement")
    GrantCustomerPropositionAgreementResponse grantCustomerPropositionAgreement(GrantCustomerPropositionAgreementRequest req);

    @Description("Notify Customer Proposition Agreement")
    NotifyCustomerPropositionAgreementResponse notifyCustomerPropositionAgreement(NotifyCustomerPropositionAgreementRequest req);

    @GenericDtxEndpoint
    @Description("Request Customer Proposition Agreement")
    RequestCustomerPropositionAgreementResponse requestCustomerPropositionAgreement(RequestCustomerPropositionAgreementRequest req);

    @Description("Retrieve Customer Proposition Agreement")
    RetrieveCustomerPropositionAgreementResponse retrieveCustomerPropositionAgreement(RetrieveCustomerPropositionAgreementRequest req);

    @GenericDtxEndpoint
    @Description("Update Customer Proposition Agreement")
    UpdateCustomerPropositionAgreementResponse updateCustomerPropositionAgreement(UpdateCustomerPropositionAgreementRequest req);
}