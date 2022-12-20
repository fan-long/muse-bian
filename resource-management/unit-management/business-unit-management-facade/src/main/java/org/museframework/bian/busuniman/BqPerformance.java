package org.museframework.bian.busuniman;

import org.museframework.bian.busuniman.dto.RequestPerformanceRequest;
import org.museframework.bian.busuniman.dto.RequestPerformanceResponse;
import org.museframework.bian.busuniman.dto.RetrievePerformanceRequest;
import org.museframework.bian.busuniman.dto.RetrievePerformanceResponse;
import org.museframework.bian.busuniman.dto.UpdatePerformanceRequest;
import org.museframework.bian.busuniman.dto.UpdatePerformanceResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more responsibilities or tasks under management  Examples: Relationship development, Troubleshooting")
@GenericDomain(name="BusinessUnitManagement", group="Performance")
public interface BqPerformance {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of the activity analysis for the business unit")
    UpdatePerformanceResponse updatePerformance(UpdatePerformanceRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention in the business unit performance analysis (e.g. revise projections)")
    RequestPerformanceResponse requestPerformance(RequestPerformanceRequest req);

    @Description("ReBQ Retrieve details about the business unit activity analysis")
    RetrievePerformanceResponse retrievePerformance(RetrievePerformanceRequest req);
}