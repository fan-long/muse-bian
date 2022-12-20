package org.museframework.bian.bracurdis;

import org.museframework.bian.bracurdis.dto.ExchangeDistributionPlanningRequest;
import org.museframework.bian.bracurdis.dto.ExchangeDistributionPlanningResponse;
import org.museframework.bian.bracurdis.dto.RequestDistributionPlanningRequest;
import org.museframework.bian.bracurdis.dto.RequestDistributionPlanningResponse;
import org.museframework.bian.bracurdis.dto.RetrieveDistributionPlanningRequest;
import org.museframework.bian.bracurdis.dto.RetrieveDistributionPlanningResponse;
import org.museframework.bian.bracurdis.dto.UpdateDistributionPlanningRequest;
import org.museframework.bian.bracurdis.dto.UpdateDistributionPlanningResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="BranchCurrencyDistribution", group="DistributionPlanning")
public interface BqDistributionPlanning {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Distribution Planning processing")
    ExchangeDistributionPlanningResponse exchangeDistributionPlanning(ExchangeDistributionPlanningRequest req);

    @Description("ReBQ Retrieve details about any aspect of Distribution Planning")
    RetrieveDistributionPlanningResponse retrieveDistributionPlanning(RetrieveDistributionPlanningRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Distribution Planning")
    RequestDistributionPlanningResponse requestDistributionPlanning(RequestDistributionPlanningRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Distribution Planning")
    UpdateDistributionPlanningResponse updateDistributionPlanning(UpdateDistributionPlanningRequest req);
}