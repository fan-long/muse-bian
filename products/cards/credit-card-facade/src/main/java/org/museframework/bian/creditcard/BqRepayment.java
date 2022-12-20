package org.museframework.bian.creditcard;

import org.museframework.bian.creditcard.dto.ExecuteRepaymentRequest;
import org.museframework.bian.creditcard.dto.ExecuteRepaymentResponse;
import org.museframework.bian.creditcard.dto.RetrieveRepaymentRequest;
import org.museframework.bian.creditcard.dto.RetrieveRepaymentResponse;
import org.museframework.bian.creditcard.dto.UpdateRepaymentRequest;
import org.museframework.bian.creditcard.dto.UpdateRepaymentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="CreditCard", group="Repayment")
public interface BqRepayment {
    @GenericDtxEndpoint
    @Description("UpBQ Update a repayment transaction (bill payment)")
    UpdateRepaymentResponse updateRepayment(UpdateRepaymentRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute a repayment transaction against the card account")
    ExecuteRepaymentResponse executeRepayment(ExecuteRepaymentRequest req);

    @Description("ReBQ Retrieve detail about a repayment transaction")
    RetrieveRepaymentResponse retrieveRepayment(RetrieveRepaymentRequest req);
}