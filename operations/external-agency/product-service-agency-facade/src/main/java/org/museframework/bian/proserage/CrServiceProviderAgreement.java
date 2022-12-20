package org.museframework.bian.proserage;

import org.museframework.bian.proserage.dto.ControlServiceProviderAgreementRequest;
import org.museframework.bian.proserage.dto.ControlServiceProviderAgreementResponse;
import org.museframework.bian.proserage.dto.EvaluateServiceProviderAgreementRequest;
import org.museframework.bian.proserage.dto.EvaluateServiceProviderAgreementResponse;
import org.museframework.bian.proserage.dto.ExchangeServiceProviderAgreementRequest;
import org.museframework.bian.proserage.dto.ExchangeServiceProviderAgreementResponse;
import org.museframework.bian.proserage.dto.GrantServiceProviderAgreementRequest;
import org.museframework.bian.proserage.dto.GrantServiceProviderAgreementResponse;
import org.museframework.bian.proserage.dto.NotifyServiceProviderAgreementRequest;
import org.museframework.bian.proserage.dto.NotifyServiceProviderAgreementResponse;
import org.museframework.bian.proserage.dto.RequestServiceProviderAgreementRequest;
import org.museframework.bian.proserage.dto.RequestServiceProviderAgreementResponse;
import org.museframework.bian.proserage.dto.RetrieveServiceProviderAgreementRequest;
import org.museframework.bian.proserage.dto.RetrieveServiceProviderAgreementResponse;
import org.museframework.bian.proserage.dto.UpdateServiceProviderAgreementRequest;
import org.museframework.bian.proserage.dto.UpdateServiceProviderAgreementResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Maintain the terms and conditions that apply to a commercial relationship within Product Service Agency.  ")
@GenericDomain(name="ProductServiceAgency", group="ServiceProviderAgreement")
public interface CrServiceProviderAgreement {
    @GenericDtxEndpoint
    @Description("Control Service Provider Agreement")
    ControlServiceProviderAgreementResponse controlServiceProviderAgreement(ControlServiceProviderAgreementRequest req);

    @GenericDtxEndpoint
    @Description("Evaluate Service Provider Agreement")
    EvaluateServiceProviderAgreementResponse evaluateServiceProviderAgreement(EvaluateServiceProviderAgreementRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Service Provider Agreement")
    ExchangeServiceProviderAgreementResponse exchangeServiceProviderAgreement(ExchangeServiceProviderAgreementRequest req);

    @GenericDtxEndpoint
    @Description("Grant Service Provider Agreement")
    GrantServiceProviderAgreementResponse grantServiceProviderAgreement(GrantServiceProviderAgreementRequest req);

    @Description("Notify Service Provider Agreement")
    NotifyServiceProviderAgreementResponse notifyServiceProviderAgreement(NotifyServiceProviderAgreementRequest req);

    @GenericDtxEndpoint
    @Description("Request Service Provider Agreement")
    RequestServiceProviderAgreementResponse requestServiceProviderAgreement(RequestServiceProviderAgreementRequest req);

    @Description("Retrieve Service Provider Agreement")
    RetrieveServiceProviderAgreementResponse retrieveServiceProviderAgreement(RetrieveServiceProviderAgreementRequest req);

    @GenericDtxEndpoint
    @Description("Update Service Provider Agreement")
    UpdateServiceProviderAgreementResponse updateServiceProviderAgreement(UpdateServiceProviderAgreementRequest req);
}