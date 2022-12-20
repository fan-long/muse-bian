package org.museframework.bian.corporateloan;

import org.museframework.bian.corporateloan.dto.ExecuteWithdrawalRequest;
import org.museframework.bian.corporateloan.dto.ExecuteWithdrawalResponse;
import org.museframework.bian.corporateloan.dto.RequestWithdrawalRequest;
import org.museframework.bian.corporateloan.dto.RequestWithdrawalResponse;
import org.museframework.bian.corporateloan.dto.RetrieveWithdrawalRequest;
import org.museframework.bian.corporateloan.dto.RetrieveWithdrawalResponse;
import org.museframework.bian.corporateloan.dto.UpdateWithdrawalRequest;
import org.museframework.bian.corporateloan.dto.UpdateWithdrawalResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="CorporateLoan", group="Withdrawal")
public interface BqWithdrawal {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of a withdrawal from a corporate loan")
    UpdateWithdrawalResponse updateWithdrawal(UpdateWithdrawalRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute an automated withdrawal against a corporate loan")
    ExecuteWithdrawalResponse executeWithdrawal(ExecuteWithdrawalRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request handling of a withdrawal")
    RequestWithdrawalResponse requestWithdrawal(RequestWithdrawalRequest req);

    @Description("ReBQ Retrieve details about a corporate loan withdrawal")
    RetrieveWithdrawalResponse retrieveWithdrawal(RetrieveWithdrawalRequest req);
}