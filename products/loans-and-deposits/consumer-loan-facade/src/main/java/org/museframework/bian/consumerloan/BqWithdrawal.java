package org.museframework.bian.consumerloan;

import org.museframework.bian.consumerloan.dto.ExecuteWithdrawalRequest;
import org.museframework.bian.consumerloan.dto.ExecuteWithdrawalResponse;
import org.museframework.bian.consumerloan.dto.RequestWithdrawalRequest;
import org.museframework.bian.consumerloan.dto.RequestWithdrawalResponse;
import org.museframework.bian.consumerloan.dto.RetrieveWithdrawalRequest;
import org.museframework.bian.consumerloan.dto.RetrieveWithdrawalResponse;
import org.museframework.bian.consumerloan.dto.UpdateWithdrawalRequest;
import org.museframework.bian.consumerloan.dto.UpdateWithdrawalResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="ConsumerLoan", group="Withdrawal")
public interface BqWithdrawal {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of a withdrawal from a consumer loan")
    UpdateWithdrawalResponse updateWithdrawal(UpdateWithdrawalRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute an automated withdrawal against a consumer loan")
    ExecuteWithdrawalResponse executeWithdrawal(ExecuteWithdrawalRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request handling of a withdrawal (e.g. negotiate an exception)")
    RequestWithdrawalResponse requestWithdrawal(RequestWithdrawalRequest req);

    @Description("ReBQ Retrieve details about a consumer loan withdrawal")
    RetrieveWithdrawalResponse retrieveWithdrawal(RetrieveWithdrawalRequest req);
}