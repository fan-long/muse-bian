package org.museframework.bian.marinfman;

import org.museframework.bian.marinfman.dto.RetrieveImprovementRequest;
import org.museframework.bian.marinfman.dto.RetrieveImprovementResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more clerical routines that are to be followed to administer the operational unit/function  Examples: Time-sheet recording")
@GenericDomain(name="MarketInformationManagement", group="Improvement")
public interface BqImprovement {
    @Description("ReBQ Retrieve details about the data improvement activities")
    RetrieveImprovementResponse retrieveImprovement(RetrieveImprovementRequest req);
}