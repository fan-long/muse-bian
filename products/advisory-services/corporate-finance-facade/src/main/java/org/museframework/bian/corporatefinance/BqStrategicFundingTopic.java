package org.museframework.bian.corporatefinance;

import org.museframework.bian.corporatefinance.dto.ExchangeStrategicFundingTopicRequest;
import org.museframework.bian.corporatefinance.dto.ExchangeStrategicFundingTopicResponse;
import org.museframework.bian.corporatefinance.dto.ExecuteStrategicFundingTopicRequest;
import org.museframework.bian.corporatefinance.dto.ExecuteStrategicFundingTopicResponse;
import org.museframework.bian.corporatefinance.dto.InitiateStrategicFundingTopicRequest;
import org.museframework.bian.corporatefinance.dto.InitiateStrategicFundingTopicResponse;
import org.museframework.bian.corporatefinance.dto.NotifyStrategicFundingTopicRequest;
import org.museframework.bian.corporatefinance.dto.NotifyStrategicFundingTopicResponse;
import org.museframework.bian.corporatefinance.dto.RequestStrategicFundingTopicRequest;
import org.museframework.bian.corporatefinance.dto.RequestStrategicFundingTopicResponse;
import org.museframework.bian.corporatefinance.dto.RetrieveStrategicFundingTopicRequest;
import org.museframework.bian.corporatefinance.dto.RetrieveStrategicFundingTopicResponse;
import org.museframework.bian.corporatefinance.dto.UpdateStrategicFundingTopicRequest;
import org.museframework.bian.corporatefinance.dto.UpdateStrategicFundingTopicResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Strategic Funding Topic advice is one specific topic that can be included in providing Strategic Funding Topic")
@GenericDomain(name="CorporateFinance", group="StrategicFundingTopic")
public interface BqStrategicFundingTopic {
    @GenericDtxEndpoint
    @Description("Exchange Strategic Funding Topic")
    ExchangeStrategicFundingTopicResponse exchangeStrategicFundingTopic(ExchangeStrategicFundingTopicRequest req);

    @GenericDtxEndpoint
    @Description("Execute Strategic Funding Topic")
    ExecuteStrategicFundingTopicResponse executeStrategicFundingTopic(ExecuteStrategicFundingTopicRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Strategic Funding Topic")
    InitiateStrategicFundingTopicResponse initiateStrategicFundingTopic(InitiateStrategicFundingTopicRequest req);

    @Description("Notify Strategic Funding Topic")
    NotifyStrategicFundingTopicResponse notifyStrategicFundingTopic(NotifyStrategicFundingTopicRequest req);

    @GenericDtxEndpoint
    @Description("Request Strategic Funding Topic")
    RequestStrategicFundingTopicResponse requestStrategicFundingTopic(RequestStrategicFundingTopicRequest req);

    @Description("Retrieve Strategic Funding Topic")
    RetrieveStrategicFundingTopicResponse retrieveStrategicFundingTopic(RetrieveStrategicFundingTopicRequest req);

    @GenericDtxEndpoint
    @Description("Update Strategic Funding Topic")
    UpdateStrategicFundingTopicResponse updateStrategicFundingTopic(UpdateStrategicFundingTopicRequest req);
}