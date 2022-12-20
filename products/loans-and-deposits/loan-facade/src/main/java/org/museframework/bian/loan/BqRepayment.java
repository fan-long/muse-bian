package org.museframework.bian.loan;

import org.museframework.bian.loan.dto.ExecuteRepaymentRequest;
import org.museframework.bian.loan.dto.ExecuteRepaymentResponse;
import org.museframework.bian.loan.dto.RequestRepaymentRequest;
import org.museframework.bian.loan.dto.RequestRepaymentResponse;
import org.museframework.bian.loan.dto.RetrieveRepaymentRequest;
import org.museframework.bian.loan.dto.RetrieveRepaymentResponse;
import org.museframework.bian.loan.dto.UpdateRepaymentRequest;
import org.museframework.bian.loan.dto.UpdateRepaymentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="Loan", group="Repayment")
public interface BqRepayment {
    @GenericDtxEndpoint
    @Description("UpBQ Update a repayment transaction made to the loan")
    UpdateRepaymentResponse updateRepayment(UpdateRepaymentRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute an automated repayment transaction")
    ExecuteRepaymentResponse executeRepayment(ExecuteRepaymentRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request handling of an exceptional repayment")
    RequestRepaymentResponse requestRepayment(RequestRepaymentRequest req);

    @Description("ReBQ Retrieve details about a loan repayment")
    RetrieveRepaymentResponse retrieveRepayment(RetrieveRepaymentRequest req);
}