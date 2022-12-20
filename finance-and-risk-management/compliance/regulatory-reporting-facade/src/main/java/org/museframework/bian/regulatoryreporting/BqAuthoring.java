package org.museframework.bian.regulatoryreporting;

import org.museframework.bian.regulatoryreporting.dto.CaptureAuthoringRequest;
import org.museframework.bian.regulatoryreporting.dto.CaptureAuthoringResponse;
import org.museframework.bian.regulatoryreporting.dto.RetrieveAuthoringRequest;
import org.museframework.bian.regulatoryreporting.dto.RetrieveAuthoringResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more clerical routines that are to be followed to administer the operational unit/function  Examples: Time-sheet recording")
@GenericDomain(name="RegulatoryReporting", group="Authoring")
public interface BqAuthoring {
    @GenericDtxEndpoint
    @Description("CaBQ Provide transaction records as required to support regulatory reporting")
    CaptureAuthoringResponse captureAuthoring(CaptureAuthoringRequest req);

    @Description("ReBQ Retrieve regulatory reporting detail and reports for review")
    RetrieveAuthoringResponse retrieveAuthoring(RetrieveAuthoringRequest req);
}