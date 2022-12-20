package org.museframework.bian.cardcase;

import org.museframework.bian.cardcase.dto.RetrieveArbitrationRequest;
import org.museframework.bian.cardcase.dto.RetrieveArbitrationResponse;
import org.museframework.bian.cardcase.dto.UpdateArbitrationRequest;
import org.museframework.bian.cardcase.dto.UpdateArbitrationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="CardCase", group="Arbitration")
public interface BqArbitration {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of the arbitration request of a card case")
    UpdateArbitrationResponse updateArbitration(UpdateArbitrationRequest req);

    @Description("ReBQ Retrieve details about the arbitration request for a card case")
    RetrieveArbitrationResponse retrieveArbitration(RetrieveArbitrationRequest req);
}