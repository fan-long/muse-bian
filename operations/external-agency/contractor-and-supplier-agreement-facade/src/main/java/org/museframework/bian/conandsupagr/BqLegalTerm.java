package org.museframework.bian.conandsupagr;

import org.museframework.bian.conandsupagr.dto.EvaluateLegalTermRequest;
import org.museframework.bian.conandsupagr.dto.EvaluateLegalTermResponse;
import org.museframework.bian.conandsupagr.dto.ExchangeLegalTermRequest;
import org.museframework.bian.conandsupagr.dto.ExchangeLegalTermResponse;
import org.museframework.bian.conandsupagr.dto.NotifyLegalTermRequest;
import org.museframework.bian.conandsupagr.dto.NotifyLegalTermResponse;
import org.museframework.bian.conandsupagr.dto.RequestLegalTermRequest;
import org.museframework.bian.conandsupagr.dto.RequestLegalTermResponse;
import org.museframework.bian.conandsupagr.dto.RetrieveLegalTermRequest;
import org.museframework.bian.conandsupagr.dto.RetrieveLegalTermResponse;
import org.museframework.bian.conandsupagr.dto.UpdateLegalTermRequest;
import org.museframework.bian.conandsupagr.dto.UpdateLegalTermResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Covers the regulatory considerations of the agreement")
@GenericDomain(name="ContractorandSupplierAgreement", group="LegalTerm")
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