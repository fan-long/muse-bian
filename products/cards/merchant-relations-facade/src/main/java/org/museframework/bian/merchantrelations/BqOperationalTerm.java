package org.museframework.bian.merchantrelations;

import org.museframework.bian.merchantrelations.dto.EvaluateOperationalTermRequest;
import org.museframework.bian.merchantrelations.dto.EvaluateOperationalTermResponse;
import org.museframework.bian.merchantrelations.dto.ExchangeOperationalTermRequest;
import org.museframework.bian.merchantrelations.dto.ExchangeOperationalTermResponse;
import org.museframework.bian.merchantrelations.dto.NotifyOperationalTermRequest;
import org.museframework.bian.merchantrelations.dto.NotifyOperationalTermResponse;
import org.museframework.bian.merchantrelations.dto.RequestOperationalTermRequest;
import org.museframework.bian.merchantrelations.dto.RequestOperationalTermResponse;
import org.museframework.bian.merchantrelations.dto.RetrieveOperationalTermRequest;
import org.museframework.bian.merchantrelations.dto.RetrieveOperationalTermResponse;
import org.museframework.bian.merchantrelations.dto.UpdateOperationalTermRequest;
import org.museframework.bian.merchantrelations.dto.UpdateOperationalTermResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Covers the legal considerations of the agreement")
@GenericDomain(name="MerchantRelations", group="OperationalTerm")
public interface BqOperationalTerm {
    @GenericDtxEndpoint
    @Description("Evaluate Operational Term")
    EvaluateOperationalTermResponse evaluateOperationalTerm(EvaluateOperationalTermRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Operational Term")
    ExchangeOperationalTermResponse exchangeOperationalTerm(ExchangeOperationalTermRequest req);

    @Description("Notify Operational Term")
    NotifyOperationalTermResponse notifyOperationalTerm(NotifyOperationalTermRequest req);

    @GenericDtxEndpoint
    @Description("Request Operational Term")
    RequestOperationalTermResponse requestOperationalTerm(RequestOperationalTermRequest req);

    @Description("Retrieve Operational Term")
    RetrieveOperationalTermResponse retrieveOperationalTerm(RetrieveOperationalTermRequest req);

    @GenericDtxEndpoint
    @Description("Update Operational Term")
    UpdateOperationalTermResponse updateOperationalTerm(UpdateOperationalTermRequest req);
}