package org.museframework.bian.loan;

import org.museframework.bian.loan.dto.ExecuteWithdrawalRequest;
import org.museframework.bian.loan.dto.ExecuteWithdrawalResponse;
import org.museframework.bian.loan.dto.RequestWithdrawalRequest;
import org.museframework.bian.loan.dto.RequestWithdrawalResponse;
import org.museframework.bian.loan.dto.RetrieveWithdrawalRequest;
import org.museframework.bian.loan.dto.RetrieveWithdrawalResponse;
import org.museframework.bian.loan.dto.UpdateWithdrawalRequest;
import org.museframework.bian.loan.dto.UpdateWithdrawalResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="Loan", group="Withdrawal")
public interface BqWithdrawal {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of a withdrawal from a loan")
    UpdateWithdrawalResponse updateWithdrawal(UpdateWithdrawalRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute an automated withdrawal against a loan")
    ExecuteWithdrawalResponse executeWithdrawal(ExecuteWithdrawalRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request handling of a withdrawal")
    RequestWithdrawalResponse requestWithdrawal(RequestWithdrawalRequest req);

    @Description("ReBQ Retrieve details about a loan withdrawal")
    RetrieveWithdrawalResponse retrieveWithdrawal(RetrieveWithdrawalRequest req);
}