package org.museframework.bian.custaxhan;

import org.museframework.bian.custaxhan.dto.RetrieveConsolidationRequest;
import org.museframework.bian.custaxhan.dto.RetrieveConsolidationResponse;
import org.museframework.bian.custaxhan.dto.UpdateConsolidationRequest;
import org.museframework.bian.custaxhan.dto.UpdateConsolidationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="CustomerTaxHandling", group="Consolidation")
public interface BqConsolidation {
    @GenericDtxEndpoint
    @Description("UpCR Update consolidated product reports")
    UpdateConsolidationResponse updateConsolidation(UpdateConsolidationRequest req);

    @Description("ReCR Retrieve details about the consolidated reports used for tax reporting")
    RetrieveConsolidationResponse retrieveConsolidation(RetrieveConsolidationRequest req);
}