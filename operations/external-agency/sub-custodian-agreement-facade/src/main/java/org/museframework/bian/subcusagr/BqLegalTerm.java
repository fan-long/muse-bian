package org.museframework.bian.subcusagr;

import org.museframework.bian.subcusagr.dto.EvaluateLegalTermRequest;
import org.museframework.bian.subcusagr.dto.EvaluateLegalTermResponse;
import org.museframework.bian.subcusagr.dto.ExchangeLegalTermRequest;
import org.museframework.bian.subcusagr.dto.ExchangeLegalTermResponse;
import org.museframework.bian.subcusagr.dto.NotifyLegalTermRequest;
import org.museframework.bian.subcusagr.dto.NotifyLegalTermResponse;
import org.museframework.bian.subcusagr.dto.RequestLegalTermRequest;
import org.museframework.bian.subcusagr.dto.RequestLegalTermResponse;
import org.museframework.bian.subcusagr.dto.RetrieveLegalTermRequest;
import org.museframework.bian.subcusagr.dto.RetrieveLegalTermResponse;
import org.museframework.bian.subcusagr.dto.UpdateLegalTermRequest;
import org.museframework.bian.subcusagr.dto.UpdateLegalTermResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Covers the legal considerations of the agreement")
@GenericDomain(name="SubCustodianAgreement", group="LegalTerm")
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