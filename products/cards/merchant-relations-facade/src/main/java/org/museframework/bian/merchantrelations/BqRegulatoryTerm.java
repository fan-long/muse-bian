package org.museframework.bian.merchantrelations;

import org.museframework.bian.merchantrelations.dto.EvaluateRegulatoryTermRequest;
import org.museframework.bian.merchantrelations.dto.EvaluateRegulatoryTermResponse;
import org.museframework.bian.merchantrelations.dto.ExchangeRegulatoryTermRequest;
import org.museframework.bian.merchantrelations.dto.ExchangeRegulatoryTermResponse;
import org.museframework.bian.merchantrelations.dto.NotifyRegulatoryTermRequest;
import org.museframework.bian.merchantrelations.dto.NotifyRegulatoryTermResponse;
import org.museframework.bian.merchantrelations.dto.RequestRegulatoryTermRequest;
import org.museframework.bian.merchantrelations.dto.RequestRegulatoryTermResponse;
import org.museframework.bian.merchantrelations.dto.RetrieveRegulatoryTermRequest;
import org.museframework.bian.merchantrelations.dto.RetrieveRegulatoryTermResponse;
import org.museframework.bian.merchantrelations.dto.UpdateRegulatoryTermRequest;
import org.museframework.bian.merchantrelations.dto.UpdateRegulatoryTermResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Covers the legal considerations of the agreement")
@GenericDomain(name="MerchantRelations", group="RegulatoryTerm")
public interface BqRegulatoryTerm {
    @GenericDtxEndpoint
    @Description("Evaluate Regulatory Term")
    EvaluateRegulatoryTermResponse evaluateRegulatoryTerm(EvaluateRegulatoryTermRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Regulatory Term")
    ExchangeRegulatoryTermResponse exchangeRegulatoryTerm(ExchangeRegulatoryTermRequest req);

    @Description("Notify Regulatory Term")
    NotifyRegulatoryTermResponse notifyRegulatoryTerm(NotifyRegulatoryTermRequest req);

    @GenericDtxEndpoint
    @Description("Request Regulatory Term")
    RequestRegulatoryTermResponse requestRegulatoryTerm(RequestRegulatoryTermRequest req);

    @Description("Retrieve Regulatory Term")
    RetrieveRegulatoryTermResponse retrieveRegulatoryTerm(RetrieveRegulatoryTermRequest req);

    @GenericDtxEndpoint
    @Description("Update Regulatory Term")
    UpdateRegulatoryTermResponse updateRegulatoryTerm(UpdateRegulatoryTermRequest req);
}