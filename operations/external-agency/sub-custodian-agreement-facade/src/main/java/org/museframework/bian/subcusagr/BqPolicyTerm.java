package org.museframework.bian.subcusagr;

import org.museframework.bian.subcusagr.dto.EvaluatePolicyTermRequest;
import org.museframework.bian.subcusagr.dto.EvaluatePolicyTermResponse;
import org.museframework.bian.subcusagr.dto.ExchangePolicyTermRequest;
import org.museframework.bian.subcusagr.dto.ExchangePolicyTermResponse;
import org.museframework.bian.subcusagr.dto.NotifyPolicyTermRequest;
import org.museframework.bian.subcusagr.dto.NotifyPolicyTermResponse;
import org.museframework.bian.subcusagr.dto.RequestPolicyTermRequest;
import org.museframework.bian.subcusagr.dto.RequestPolicyTermResponse;
import org.museframework.bian.subcusagr.dto.RetrievePolicyTermRequest;
import org.museframework.bian.subcusagr.dto.RetrievePolicyTermResponse;
import org.museframework.bian.subcusagr.dto.UpdatePolicyTermRequest;
import org.museframework.bian.subcusagr.dto.UpdatePolicyTermResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Covers the legal considerations of the agreement")
@GenericDomain(name="SubCustodianAgreement", group="PolicyTerm")
public interface BqPolicyTerm {
    @GenericDtxEndpoint
    @Description("Evaluate Policy Term")
    EvaluatePolicyTermResponse evaluatePolicyTerm(EvaluatePolicyTermRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Policy Term")
    ExchangePolicyTermResponse exchangePolicyTerm(ExchangePolicyTermRequest req);

    @Description("Notify Policy Term")
    NotifyPolicyTermResponse notifyPolicyTerm(NotifyPolicyTermRequest req);

    @GenericDtxEndpoint
    @Description("Request Policy Term")
    RequestPolicyTermResponse requestPolicyTerm(RequestPolicyTermRequest req);

    @Description("Retrieve Policy Term")
    RetrievePolicyTermResponse retrievePolicyTerm(RetrievePolicyTermRequest req);

    @GenericDtxEndpoint
    @Description("Update Policy Term")
    UpdatePolicyTermResponse updatePolicyTerm(UpdatePolicyTermRequest req);
}