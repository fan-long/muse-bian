package org.museframework.bian.marinfman;

import org.museframework.bian.marinfman.dto.RetrieveConsolidationRequest;
import org.museframework.bian.marinfman.dto.RetrieveConsolidationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more clerical routines that are to be followed to administer the operational unit/function  Examples: Time-sheet recording")
@GenericDomain(name="MarketInformationManagement", group="Consolidation")
public interface BqConsolidation {
    @Description("ReBQ Retrieve details about the consolidation of source data")
    RetrieveConsolidationResponse retrieveConsolidation(RetrieveConsolidationRequest req);
}