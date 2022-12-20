package org.museframework.bian.consumerloan;

import org.museframework.bian.consumerloan.dto.RetrieveDisbursementRequest;
import org.museframework.bian.consumerloan.dto.RetrieveDisbursementResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="ConsumerLoan", group="Disbursement")
public interface BqDisbursement {
    @Description("ReBQ Retrieve details about a disbursement paid against a consumer loan")
    RetrieveDisbursementResponse retrieveDisbursement(RetrieveDisbursementRequest req);
}