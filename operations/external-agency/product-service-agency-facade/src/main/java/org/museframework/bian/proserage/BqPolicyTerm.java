package org.museframework.bian.proserage;

import org.museframework.bian.proserage.dto.EvaluatePolicyTermRequest;
import org.museframework.bian.proserage.dto.EvaluatePolicyTermResponse;
import org.museframework.bian.proserage.dto.ExchangePolicyTermRequest;
import org.museframework.bian.proserage.dto.ExchangePolicyTermResponse;
import org.museframework.bian.proserage.dto.NotifyPolicyTermRequest;
import org.museframework.bian.proserage.dto.NotifyPolicyTermResponse;
import org.museframework.bian.proserage.dto.RequestPolicyTermRequest;
import org.museframework.bian.proserage.dto.RequestPolicyTermResponse;
import org.museframework.bian.proserage.dto.RetrievePolicyTermRequest;
import org.museframework.bian.proserage.dto.RetrievePolicyTermResponse;
import org.museframework.bian.proserage.dto.UpdatePolicyTermRequest;
import org.museframework.bian.proserage.dto.UpdatePolicyTermResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Covers the legal considerations of the agreement")
@GenericDomain(name="ProductServiceAgency", group="PolicyTerm")
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