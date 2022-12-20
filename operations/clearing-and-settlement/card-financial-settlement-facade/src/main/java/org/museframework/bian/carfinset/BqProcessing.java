package org.museframework.bian.carfinset;

import org.museframework.bian.carfinset.dto.RetrieveProcessingRequest;
import org.museframework.bian.carfinset.dto.RetrieveProcessingResponse;
import org.museframework.bian.carfinset.dto.UpdateProcessingRequest;
import org.museframework.bian.carfinset.dto.UpdateProcessingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="CardFinancialSettlement", group="Processing")
public interface BqProcessing {
    @GenericDtxEndpoint
    @Description("UpBQ Update processing transaction details for a settlement procedure")
    UpdateProcessingResponse updateProcessing(UpdateProcessingRequest req);

    @Description("ReBQ Retrieve processing transaction details for a settlement procedure")
    RetrieveProcessingResponse retrieveProcessing(RetrieveProcessingRequest req);
}