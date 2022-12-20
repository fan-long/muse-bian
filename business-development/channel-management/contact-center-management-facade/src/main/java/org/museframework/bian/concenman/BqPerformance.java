package org.museframework.bian.concenman;

import org.museframework.bian.concenman.dto.RequestPerformanceRequest;
import org.museframework.bian.concenman.dto.RequestPerformanceResponse;
import org.museframework.bian.concenman.dto.RetrievePerformanceRequest;
import org.museframework.bian.concenman.dto.RetrievePerformanceResponse;
import org.museframework.bian.concenman.dto.UpdatePerformanceRequest;
import org.museframework.bian.concenman.dto.UpdatePerformanceResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more responsibilities or tasks under management  Examples: Relationship development, Troubleshooting")
@GenericDomain(name="ContactCenterManagement", group="Performance")
public interface BqPerformance {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of the activity analysis for the contact center")
    UpdatePerformanceResponse updatePerformance(UpdatePerformanceRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention in the contact center performance analysis (e.g. revise projections)")
    RequestPerformanceResponse requestPerformance(RequestPerformanceRequest req);

    @Description("ReBQ Retrieve details about the contact center activity analysis")
    RetrievePerformanceResponse retrievePerformance(RetrievePerformanceRequest req);
}