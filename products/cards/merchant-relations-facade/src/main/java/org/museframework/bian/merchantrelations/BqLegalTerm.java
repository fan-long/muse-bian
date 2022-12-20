package org.museframework.bian.merchantrelations;

import org.museframework.bian.merchantrelations.dto.EvaluateLegalTermRequest;
import org.museframework.bian.merchantrelations.dto.EvaluateLegalTermResponse;
import org.museframework.bian.merchantrelations.dto.ExchangeLegalTermRequest;
import org.museframework.bian.merchantrelations.dto.ExchangeLegalTermResponse;
import org.museframework.bian.merchantrelations.dto.NotifyLegalTermRequest;
import org.museframework.bian.merchantrelations.dto.NotifyLegalTermResponse;
import org.museframework.bian.merchantrelations.dto.RequestLegalTermRequest;
import org.museframework.bian.merchantrelations.dto.RequestLegalTermResponse;
import org.museframework.bian.merchantrelations.dto.RetrieveLegalTermRequest;
import org.museframework.bian.merchantrelations.dto.RetrieveLegalTermResponse;
import org.museframework.bian.merchantrelations.dto.UpdateLegalTermRequest;
import org.museframework.bian.merchantrelations.dto.UpdateLegalTermResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Covers the legal considerations of the agreement")
@GenericDomain(name="MerchantRelations", group="LegalTerm")
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