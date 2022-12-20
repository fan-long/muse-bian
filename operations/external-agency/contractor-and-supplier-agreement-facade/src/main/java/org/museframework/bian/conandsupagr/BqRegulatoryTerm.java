package org.museframework.bian.conandsupagr;

import org.museframework.bian.conandsupagr.dto.EvaluateRegulatoryTermRequest;
import org.museframework.bian.conandsupagr.dto.EvaluateRegulatoryTermResponse;
import org.museframework.bian.conandsupagr.dto.ExchangeRegulatoryTermRequest;
import org.museframework.bian.conandsupagr.dto.ExchangeRegulatoryTermResponse;
import org.museframework.bian.conandsupagr.dto.NotifyRegulatoryTermRequest;
import org.museframework.bian.conandsupagr.dto.NotifyRegulatoryTermResponse;
import org.museframework.bian.conandsupagr.dto.RequestRegulatoryTermRequest;
import org.museframework.bian.conandsupagr.dto.RequestRegulatoryTermResponse;
import org.museframework.bian.conandsupagr.dto.RetrieveRegulatoryTermRequest;
import org.museframework.bian.conandsupagr.dto.RetrieveRegulatoryTermResponse;
import org.museframework.bian.conandsupagr.dto.UpdateRegulatoryTermRequest;
import org.museframework.bian.conandsupagr.dto.UpdateRegulatoryTermResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Covers the regulatory considerations of the agreement")
@GenericDomain(name="ContractorandSupplierAgreement", group="RegulatoryTerm")
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