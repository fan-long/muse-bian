package org.museframework.bian.subcusagr;

import org.museframework.bian.subcusagr.dto.EvaluateRegulatoryTermRequest;
import org.museframework.bian.subcusagr.dto.EvaluateRegulatoryTermResponse;
import org.museframework.bian.subcusagr.dto.ExchangeRegulatoryTermRequest;
import org.museframework.bian.subcusagr.dto.ExchangeRegulatoryTermResponse;
import org.museframework.bian.subcusagr.dto.NotifyRegulatoryTermRequest;
import org.museframework.bian.subcusagr.dto.NotifyRegulatoryTermResponse;
import org.museframework.bian.subcusagr.dto.RequestRegulatoryTermRequest;
import org.museframework.bian.subcusagr.dto.RequestRegulatoryTermResponse;
import org.museframework.bian.subcusagr.dto.RetrieveRegulatoryTermRequest;
import org.museframework.bian.subcusagr.dto.RetrieveRegulatoryTermResponse;
import org.museframework.bian.subcusagr.dto.UpdateRegulatoryTermRequest;
import org.museframework.bian.subcusagr.dto.UpdateRegulatoryTermResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Covers the legal considerations of the agreement")
@GenericDomain(name="SubCustodianAgreement", group="RegulatoryTerm")
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