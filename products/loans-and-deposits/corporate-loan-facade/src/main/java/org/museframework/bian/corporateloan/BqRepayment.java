package org.museframework.bian.corporateloan;

import org.museframework.bian.corporateloan.dto.ExecuteRepaymentRequest;
import org.museframework.bian.corporateloan.dto.ExecuteRepaymentResponse;
import org.museframework.bian.corporateloan.dto.RequestRepaymentRequest;
import org.museframework.bian.corporateloan.dto.RequestRepaymentResponse;
import org.museframework.bian.corporateloan.dto.RetrieveRepaymentRequest;
import org.museframework.bian.corporateloan.dto.RetrieveRepaymentResponse;
import org.museframework.bian.corporateloan.dto.UpdateRepaymentRequest;
import org.museframework.bian.corporateloan.dto.UpdateRepaymentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="CorporateLoan", group="Repayment")
public interface BqRepayment {
    @GenericDtxEndpoint
    @Description("UpBQ Update a repayment transaction made to the corporate loan")
    UpdateRepaymentResponse updateRepayment(UpdateRepaymentRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute an automated repayment transaction")
    ExecuteRepaymentResponse executeRepayment(ExecuteRepaymentRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request handling of an exceptional repayment")
    RequestRepaymentResponse requestRepayment(RequestRepaymentRequest req);

    @Description("ReBQ Retrieve details about a corporate loan repayment")
    RetrieveRepaymentResponse retrieveRepayment(RetrieveRepaymentRequest req);
}