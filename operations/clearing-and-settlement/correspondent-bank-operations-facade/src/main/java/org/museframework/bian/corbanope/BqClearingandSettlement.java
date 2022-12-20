package org.museframework.bian.corbanope;

import org.museframework.bian.corbanope.dto.RequestClearingandSettlementRequest;
import org.museframework.bian.corbanope.dto.RequestClearingandSettlementResponse;
import org.museframework.bian.corbanope.dto.RetrieveClearingandSettlementRequest;
import org.museframework.bian.corbanope.dto.RetrieveClearingandSettlementResponse;
import org.museframework.bian.corbanope.dto.UpdateClearingandSettlementRequest;
import org.museframework.bian.corbanope.dto.UpdateClearingandSettlementResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="CorrespondentBankOperations", group="ClearingandSettlement")
public interface BqClearingandSettlement {
    @GenericDtxEndpoint
    @Description("Update a clearing and settlement transaction")
    UpdateClearingandSettlementResponse updateClearingandSettlement(UpdateClearingandSettlementRequest req);

    @GenericDtxEndpoint
    @Description("Request clearing and settlement processing for a correspondent")
    RequestClearingandSettlementResponse requestClearingandSettlement(RequestClearingandSettlementRequest req);

    @Description("Retrieve clearing and settlement activity with a correspondent")
    RetrieveClearingandSettlementResponse retrieveClearingandSettlement(RetrieveClearingandSettlementRequest req);
}