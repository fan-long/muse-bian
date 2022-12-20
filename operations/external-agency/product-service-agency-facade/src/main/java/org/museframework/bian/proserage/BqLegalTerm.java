package org.museframework.bian.proserage;

import org.museframework.bian.proserage.dto.EvaluateLegalTermRequest;
import org.museframework.bian.proserage.dto.EvaluateLegalTermResponse;
import org.museframework.bian.proserage.dto.ExchangeLegalTermRequest;
import org.museframework.bian.proserage.dto.ExchangeLegalTermResponse;
import org.museframework.bian.proserage.dto.NotifyLegalTermRequest;
import org.museframework.bian.proserage.dto.NotifyLegalTermResponse;
import org.museframework.bian.proserage.dto.RequestLegalTermRequest;
import org.museframework.bian.proserage.dto.RequestLegalTermResponse;
import org.museframework.bian.proserage.dto.RetrieveLegalTermRequest;
import org.museframework.bian.proserage.dto.RetrieveLegalTermResponse;
import org.museframework.bian.proserage.dto.UpdateLegalTermRequest;
import org.museframework.bian.proserage.dto.UpdateLegalTermResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Covers the legal considerations of the agreement")
@GenericDomain(name="ProductServiceAgency", group="LegalTerm")
public interface BqLegalTerm {
    @GenericDtxEndpoint
    @Description("Evaluate Legal Term")
    EvaluateLegalTermResponse evaluateLegalTerm(EvaluateLegalTermRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Legal Term")
    ExchangeLegalTermResponse exchangeLegalTerm(ExchangeLegalTermRequest req);

    @Description("Notify Legal Term")
    NotifyLegalTermResponse notifyLegalTerm(NotifyLegalTermRequest req);

    @GenericDtxEndpoint
    @Description("Request Legal Term")
    RequestLegalTermResponse requestLegalTerm(RequestLegalTermRequest req);

    @Description("Retrieve Legal Term")
    RetrieveLegalTermResponse retrieveLegalTerm(RetrieveLegalTermRequest req);

    @GenericDtxEndpoint
    @Description("Update Legal Term")
    UpdateLegalTermResponse updateLegalTerm(UpdateLegalTermRequest req);
}