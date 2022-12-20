package org.museframework.bian.consumerloan;

import org.museframework.bian.consumerloan.dto.ExecuteRepaymentRequest;
import org.museframework.bian.consumerloan.dto.ExecuteRepaymentResponse;
import org.museframework.bian.consumerloan.dto.RequestRepaymentRequest;
import org.museframework.bian.consumerloan.dto.RequestRepaymentResponse;
import org.museframework.bian.consumerloan.dto.RetrieveRepaymentRequest;
import org.museframework.bian.consumerloan.dto.RetrieveRepaymentResponse;
import org.museframework.bian.consumerloan.dto.UpdateRepaymentRequest;
import org.museframework.bian.consumerloan.dto.UpdateRepaymentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="ConsumerLoan", group="Repayment")
public interface BqRepayment {
    @GenericDtxEndpoint
    @Description("UpBQ Update a repayment transaction made to the consumer loan")
    UpdateRepaymentResponse updateRepayment(UpdateRepaymentRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute an automated repayment transaction")
    ExecuteRepaymentResponse executeRepayment(ExecuteRepaymentRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request handling of an exceptional repayment")
    RequestRepaymentResponse requestRepayment(RequestRepaymentRequest req);

    @Description("ReBQ Retrieve details about a consumer loan repayment")
    RetrieveRepaymentResponse retrieveRepayment(RetrieveRepaymentRequest req);
}