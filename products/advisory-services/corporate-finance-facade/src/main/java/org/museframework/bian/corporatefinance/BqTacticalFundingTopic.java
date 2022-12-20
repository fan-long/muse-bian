package org.museframework.bian.corporatefinance;

import org.museframework.bian.corporatefinance.dto.ExchangeTacticalFundingTopicRequest;
import org.museframework.bian.corporatefinance.dto.ExchangeTacticalFundingTopicResponse;
import org.museframework.bian.corporatefinance.dto.ExecuteTacticalFundingTopicRequest;
import org.museframework.bian.corporatefinance.dto.ExecuteTacticalFundingTopicResponse;
import org.museframework.bian.corporatefinance.dto.InitiateTacticalFundingTopicRequest;
import org.museframework.bian.corporatefinance.dto.InitiateTacticalFundingTopicResponse;
import org.museframework.bian.corporatefinance.dto.NotifyTacticalFundingTopicRequest;
import org.museframework.bian.corporatefinance.dto.NotifyTacticalFundingTopicResponse;
import org.museframework.bian.corporatefinance.dto.RequestTacticalFundingTopicRequest;
import org.museframework.bian.corporatefinance.dto.RequestTacticalFundingTopicResponse;
import org.museframework.bian.corporatefinance.dto.RetrieveTacticalFundingTopicRequest;
import org.museframework.bian.corporatefinance.dto.RetrieveTacticalFundingTopicResponse;
import org.museframework.bian.corporatefinance.dto.UpdateTacticalFundingTopicRequest;
import org.museframework.bian.corporatefinance.dto.UpdateTacticalFundingTopicResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Strategic Funding Topic advice is one specific topic that can be included in providing Strategic Funding Topic")
@GenericDomain(name="CorporateFinance", group="TacticalFundingTopic")
public interface BqTacticalFundingTopic {
    @GenericDtxEndpoint
    @Description("Exchange Tactical Funding Topic")
    ExchangeTacticalFundingTopicResponse exchangeTacticalFundingTopic(ExchangeTacticalFundingTopicRequest req);

    @GenericDtxEndpoint
    @Description("Execute Tactical Funding Topic")
    ExecuteTacticalFundingTopicResponse executeTacticalFundingTopic(ExecuteTacticalFundingTopicRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Tactical Funding Topic")
    InitiateTacticalFundingTopicResponse initiateTacticalFundingTopic(InitiateTacticalFundingTopicRequest req);

    @Description("Notify Tactical Funding Topic")
    NotifyTacticalFundingTopicResponse notifyTacticalFundingTopic(NotifyTacticalFundingTopicRequest req);

    @GenericDtxEndpoint
    @Description("Request Tactical Funding Topic")
    RequestTacticalFundingTopicResponse requestTacticalFundingTopic(RequestTacticalFundingTopicRequest req);

    @Description("Retrieve Tactical Funding Topic")
    RetrieveTacticalFundingTopicResponse retrieveTacticalFundingTopic(RetrieveTacticalFundingTopicRequest req);

    @GenericDtxEndpoint
    @Description("Update Tactical Funding Topic")
    UpdateTacticalFundingTopicResponse updateTacticalFundingTopic(UpdateTacticalFundingTopicRequest req);
}