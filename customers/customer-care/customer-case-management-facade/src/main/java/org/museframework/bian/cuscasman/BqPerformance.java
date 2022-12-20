package org.museframework.bian.cuscasman;

import org.museframework.bian.cuscasman.dto.RequestPerformanceRequest;
import org.museframework.bian.cuscasman.dto.RequestPerformanceResponse;
import org.museframework.bian.cuscasman.dto.RetrievePerformanceRequest;
import org.museframework.bian.cuscasman.dto.RetrievePerformanceResponse;
import org.museframework.bian.cuscasman.dto.UpdatePerformanceRequest;
import org.museframework.bian.cuscasman.dto.UpdatePerformanceResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more responsibilities or tasks under management  Examples: Relationship development, Troubleshooting")
@GenericDomain(name="CustomerCaseManagement", group="Performance")
public interface BqPerformance {
    @GenericDtxEndpoint
    @Description("UpBQ Update performance analysis related information")
    UpdatePerformanceResponse updatePerformance(UpdatePerformanceRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention in unit performance analysis")
    RequestPerformanceResponse requestPerformance(RequestPerformanceRequest req);

    @Description("ReBQ Retrieve details about business unit performance assessment activity")
    RetrievePerformanceResponse retrievePerformance(RetrievePerformanceRequest req);
}