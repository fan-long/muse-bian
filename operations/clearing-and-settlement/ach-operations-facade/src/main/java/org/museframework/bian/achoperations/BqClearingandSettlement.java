package org.museframework.bian.achoperations;

import org.museframework.bian.achoperations.dto.InitiateClearingandSettlementRequest;
import org.museframework.bian.achoperations.dto.InitiateClearingandSettlementResponse;
import org.museframework.bian.achoperations.dto.RetrieveClearingandSettlementRequest;
import org.museframework.bian.achoperations.dto.RetrieveClearingandSettlementResponse;
import org.museframework.bian.achoperations.dto.UpdateClearingandSettlementRequest;
import org.museframework.bian.achoperations.dto.UpdateClearingandSettlementResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="ACHOperations", group="ClearingandSettlement")
public interface BqClearingandSettlement {
    @GenericDtxEndpoint
    @Description("InBQ Initiate an ACH transaction batch clearing and settlement processing")
    InitiateClearingandSettlementResponse initiateClearingandSettlement(InitiateClearingandSettlementRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update an ACH transaction batch in clearing and settlement")
    UpdateClearingandSettlementResponse updateClearingandSettlement(UpdateClearingandSettlementRequest req);

    @Description("ReBQ Retrieve details about an ACH transaction batch in clearing and settlement")
    RetrieveClearingandSettlementResponse retrieveClearingandSettlement(RetrieveClearingandSettlementRequest req);
}