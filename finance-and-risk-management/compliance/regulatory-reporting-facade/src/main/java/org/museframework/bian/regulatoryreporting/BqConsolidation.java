package org.museframework.bian.regulatoryreporting;

import org.museframework.bian.regulatoryreporting.dto.RetrieveConsolidationRequest;
import org.museframework.bian.regulatoryreporting.dto.RetrieveConsolidationResponse;
import org.museframework.bian.regulatoryreporting.dto.UpdateConsolidationRequest;
import org.museframework.bian.regulatoryreporting.dto.UpdateConsolidationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more clerical routines that are to be followed to administer the operational unit/function  Examples: Time-sheet recording")
@GenericDomain(name="RegulatoryReporting", group="Consolidation")
public interface BqConsolidation {
    @Description("ReBQ Retrieve consolidated information for review")
    RetrieveConsolidationResponse retrieveConsolidation(RetrieveConsolidationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update or augment consolidated information to support report generation")
    UpdateConsolidationResponse updateConsolidation(UpdateConsolidationRequest req);
}