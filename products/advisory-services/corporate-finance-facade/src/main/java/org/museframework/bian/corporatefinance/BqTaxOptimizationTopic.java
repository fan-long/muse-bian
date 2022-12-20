package org.museframework.bian.corporatefinance;

import org.museframework.bian.corporatefinance.dto.ExchangeTaxOptimizationTopicRequest;
import org.museframework.bian.corporatefinance.dto.ExchangeTaxOptimizationTopicResponse;
import org.museframework.bian.corporatefinance.dto.ExecuteTaxOptimizationTopicRequest;
import org.museframework.bian.corporatefinance.dto.ExecuteTaxOptimizationTopicResponse;
import org.museframework.bian.corporatefinance.dto.InitiateTaxOptimizationTopicRequest;
import org.museframework.bian.corporatefinance.dto.InitiateTaxOptimizationTopicResponse;
import org.museframework.bian.corporatefinance.dto.NotifyTaxOptimizationTopicRequest;
import org.museframework.bian.corporatefinance.dto.NotifyTaxOptimizationTopicResponse;
import org.museframework.bian.corporatefinance.dto.RequestTaxOptimizationTopicRequest;
import org.museframework.bian.corporatefinance.dto.RequestTaxOptimizationTopicResponse;
import org.museframework.bian.corporatefinance.dto.RetrieveTaxOptimizationTopicRequest;
import org.museframework.bian.corporatefinance.dto.RetrieveTaxOptimizationTopicResponse;
import org.museframework.bian.corporatefinance.dto.UpdateTaxOptimizationTopicRequest;
import org.museframework.bian.corporatefinance.dto.UpdateTaxOptimizationTopicResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Strategic Funding Topic advice is one specific topic that can be included in providing Strategic Funding Topic")
@GenericDomain(name="CorporateFinance", group="TaxOptimizationTopic")
public interface BqTaxOptimizationTopic {
    @GenericDtxEndpoint
    @Description("Exchange Tax Optimization Topic")
    ExchangeTaxOptimizationTopicResponse exchangeTaxOptimizationTopic(ExchangeTaxOptimizationTopicRequest req);

    @GenericDtxEndpoint
    @Description("Execute Tax Optimization Topic")
    ExecuteTaxOptimizationTopicResponse executeTaxOptimizationTopic(ExecuteTaxOptimizationTopicRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Tax Optimization Topic")
    InitiateTaxOptimizationTopicResponse initiateTaxOptimizationTopic(InitiateTaxOptimizationTopicRequest req);

    @Description("Notify Tax Optimization Topic")
    NotifyTaxOptimizationTopicResponse notifyTaxOptimizationTopic(NotifyTaxOptimizationTopicRequest req);

    @GenericDtxEndpoint
    @Description("Request Tax Optimization Topic")
    RequestTaxOptimizationTopicResponse requestTaxOptimizationTopic(RequestTaxOptimizationTopicRequest req);

    @Description("Retrieve Tax Optimization Topic")
    RetrieveTaxOptimizationTopicResponse retrieveTaxOptimizationTopic(RetrieveTaxOptimizationTopicRequest req);

    @GenericDtxEndpoint
    @Description("Update Tax Optimization Topic")
    UpdateTaxOptimizationTopicResponse updateTaxOptimizationTopic(UpdateTaxOptimizationTopicRequest req);
}