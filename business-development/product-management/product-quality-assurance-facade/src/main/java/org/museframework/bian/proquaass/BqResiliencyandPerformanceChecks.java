package org.museframework.bian.proquaass;

import org.museframework.bian.proquaass.dto.InitiateResiliencyandPerformanceChecksRequest;
import org.museframework.bian.proquaass.dto.InitiateResiliencyandPerformanceChecksResponse;
import org.museframework.bian.proquaass.dto.RetrieveResiliencyandPerformanceChecksRequest;
import org.museframework.bian.proquaass.dto.RetrieveResiliencyandPerformanceChecksResponse;
import org.museframework.bian.proquaass.dto.UpdateResiliencyandPerformanceChecksRequest;
import org.museframework.bian.proquaass.dto.UpdateResiliencyandPerformanceChecksResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("To test or assess an entity, possibly against some formal qualification or certification requirement  within Product Quality Assurance.   Examples: Perform regulatory tests on a proposed financial transaction and check a new offer conforms to an existing contractual agreement.")
@GenericDomain(name="ProductQualityAssurance", group="ResiliencyandPerformanceChecks")
public interface BqResiliencyandPerformanceChecks {
    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Resiliency and Performance Checks")
    InitiateResiliencyandPerformanceChecksResponse initiateResiliencyandPerformanceChecks(InitiateResiliencyandPerformanceChecksRequest req);

    @Description("ReBQ Retrieve details about any aspect of Resiliency and Performance Checks")
    RetrieveResiliencyandPerformanceChecksResponse retrieveResiliencyandPerformanceChecks(RetrieveResiliencyandPerformanceChecksRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Resiliency and Performance Checks")
    UpdateResiliencyandPerformanceChecksResponse updateResiliencyandPerformanceChecks(UpdateResiliencyandPerformanceChecksRequest req);
}