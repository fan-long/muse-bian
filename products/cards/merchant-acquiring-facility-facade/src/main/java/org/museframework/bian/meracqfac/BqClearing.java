package org.museframework.bian.meracqfac;

import org.museframework.bian.meracqfac.dto.ExecuteClearingRequest;
import org.museframework.bian.meracqfac.dto.ExecuteClearingResponse;
import org.museframework.bian.meracqfac.dto.RetrieveClearingRequest;
import org.museframework.bian.meracqfac.dto.RetrieveClearingResponse;
import org.museframework.bian.meracqfac.dto.UpdateClearingRequest;
import org.museframework.bian.meracqfac.dto.UpdateClearingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="MerchantAcquiringFacility", group="Clearing")
public interface BqClearing {
    @GenericDtxEndpoint
    @Description("UpBQ Update a clearing transaction booked against the account")
    UpdateClearingResponse updateClearing(UpdateClearingRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute a clearing transaction against the account")
    ExecuteClearingResponse executeClearing(ExecuteClearingRequest req);

    @Description("ReBQ Retrieve details about a clearing transaction")
    RetrieveClearingResponse retrieveClearing(RetrieveClearingRequest req);
}