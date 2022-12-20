package org.museframework.bian.corporateloan;

import org.museframework.bian.corporateloan.dto.RetrieveDisbursementRequest;
import org.museframework.bian.corporateloan.dto.RetrieveDisbursementResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="CorporateLoan", group="Disbursement")
public interface BqDisbursement {
    @Description("ReBQ Retrieve details about a disbursement paid against a corporate loan")
    RetrieveDisbursementResponse retrieveDisbursement(RetrieveDisbursementRequest req);
}