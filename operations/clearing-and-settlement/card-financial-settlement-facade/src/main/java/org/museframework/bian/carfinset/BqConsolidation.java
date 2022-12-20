package org.museframework.bian.carfinset;

import org.museframework.bian.carfinset.dto.RetrieveConsolidationRequest;
import org.museframework.bian.carfinset.dto.RetrieveConsolidationResponse;
import org.museframework.bian.carfinset.dto.UpdateConsolidationRequest;
import org.museframework.bian.carfinset.dto.UpdateConsolidationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="CardFinancialSettlement", group="Consolidation")
public interface BqConsolidation {
    @GenericDtxEndpoint
    @Description("UpBQ Update consolidated transaction details for a settlement procedure")
    UpdateConsolidationResponse updateConsolidation(UpdateConsolidationRequest req);

    @Description("ReBQ Retrieve consolidated transaction details for a settlement procedure")
    RetrieveConsolidationResponse retrieveConsolidation(RetrieveConsolidationRequest req);
}