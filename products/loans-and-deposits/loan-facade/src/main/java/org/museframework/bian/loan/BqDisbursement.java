package org.museframework.bian.loan;

import org.museframework.bian.loan.dto.RetrieveDisbursementRequest;
import org.museframework.bian.loan.dto.RetrieveDisbursementResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="Loan", group="Disbursement")
public interface BqDisbursement {
    @Description("ReBQ Retrieve details about a disbursement paid against a loan")
    RetrieveDisbursementResponse retrieveDisbursement(RetrieveDisbursementRequest req);
}