package org.museframework.bian.cardcase;

import org.museframework.bian.cardcase.dto.RetrieveConsolidationRequest;
import org.museframework.bian.cardcase.dto.RetrieveConsolidationResponse;
import org.museframework.bian.cardcase.dto.UpdateConsolidationRequest;
import org.museframework.bian.cardcase.dto.UpdateConsolidationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="CardCase", group="Consolidation")
public interface BqConsolidation {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of the consolidation in a card case")
    UpdateConsolidationResponse updateConsolidation(UpdateConsolidationRequest req);

    @Description("ReBQ Retrieve details about the consolidation analysis of a card case")
    RetrieveConsolidationResponse retrieveConsolidation(RetrieveConsolidationRequest req);
}