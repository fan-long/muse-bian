package org.museframework.bian.corporatefinance;

import org.museframework.bian.corporatefinance.dto.ExchangeCapitalStructuringTopicRequest;
import org.museframework.bian.corporatefinance.dto.ExchangeCapitalStructuringTopicResponse;
import org.museframework.bian.corporatefinance.dto.ExecuteCapitalStructuringTopicRequest;
import org.museframework.bian.corporatefinance.dto.ExecuteCapitalStructuringTopicResponse;
import org.museframework.bian.corporatefinance.dto.InitiateCapitalStructuringTopicRequest;
import org.museframework.bian.corporatefinance.dto.InitiateCapitalStructuringTopicResponse;
import org.museframework.bian.corporatefinance.dto.NotifyCapitalStructuringTopicRequest;
import org.museframework.bian.corporatefinance.dto.NotifyCapitalStructuringTopicResponse;
import org.museframework.bian.corporatefinance.dto.RequestCapitalStructuringTopicRequest;
import org.museframework.bian.corporatefinance.dto.RequestCapitalStructuringTopicResponse;
import org.museframework.bian.corporatefinance.dto.RetrieveCapitalStructuringTopicRequest;
import org.museframework.bian.corporatefinance.dto.RetrieveCapitalStructuringTopicResponse;
import org.museframework.bian.corporatefinance.dto.UpdateCapitalStructuringTopicRequest;
import org.museframework.bian.corporatefinance.dto.UpdateCapitalStructuringTopicResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Strategic Funding Topic advice is one specific topic that can be included in providing Strategic Funding Topic")
@GenericDomain(name="CorporateFinance", group="CapitalStructuringTopic")
public interface BqCapitalStructuringTopic {
    @GenericDtxEndpoint
    @Description("Exchange Capital Structuring Topic")
    ExchangeCapitalStructuringTopicResponse exchangeCapitalStructuringTopic(ExchangeCapitalStructuringTopicRequest req);

    @GenericDtxEndpoint
    @Description("Execute Capital Structuring Topic")
    ExecuteCapitalStructuringTopicResponse executeCapitalStructuringTopic(ExecuteCapitalStructuringTopicRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Capital Structuring Topic")
    InitiateCapitalStructuringTopicResponse initiateCapitalStructuringTopic(InitiateCapitalStructuringTopicRequest req);

    @Description("Notify Capital Structuring Topic")
    NotifyCapitalStructuringTopicResponse notifyCapitalStructuringTopic(NotifyCapitalStructuringTopicRequest req);

    @GenericDtxEndpoint
    @Description("Request Capital Structuring Topic")
    RequestCapitalStructuringTopicResponse requestCapitalStructuringTopic(RequestCapitalStructuringTopicRequest req);

    @Description("Retrieve Capital Structuring Topic")
    RetrieveCapitalStructuringTopicResponse retrieveCapitalStructuringTopic(RetrieveCapitalStructuringTopicRequest req);

    @GenericDtxEndpoint
    @Description("Update Capital Structuring Topic")
    UpdateCapitalStructuringTopicResponse updateCapitalStructuringTopic(UpdateCapitalStructuringTopicRequest req);
}