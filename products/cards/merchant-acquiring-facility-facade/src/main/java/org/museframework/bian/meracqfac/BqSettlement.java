package org.museframework.bian.meracqfac;

import org.museframework.bian.meracqfac.dto.ExecuteSettlementRequest;
import org.museframework.bian.meracqfac.dto.ExecuteSettlementResponse;
import org.museframework.bian.meracqfac.dto.RetrieveSettlementRequest;
import org.museframework.bian.meracqfac.dto.RetrieveSettlementResponse;
import org.museframework.bian.meracqfac.dto.UpdateSettlementRequest;
import org.museframework.bian.meracqfac.dto.UpdateSettlementResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="MerchantAcquiringFacility", group="Settlement")
public interface BqSettlement {
    @GenericDtxEndpoint
    @Description("UpBQ Update a settlement transaction booked against the account")
    UpdateSettlementResponse updateSettlement(UpdateSettlementRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute a settlement transaction against the account")
    ExecuteSettlementResponse executeSettlement(ExecuteSettlementRequest req);

    @Description("ReBQ Retrieve details about a settlement transaction")
    RetrieveSettlementResponse retrieveSettlement(RetrieveSettlementRequest req);
}