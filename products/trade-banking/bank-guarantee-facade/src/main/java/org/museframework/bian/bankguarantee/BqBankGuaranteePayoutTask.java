package org.museframework.bian.bankguarantee;

import org.museframework.bian.bankguarantee.dto.ExchangeBankGuaranteePayoutTaskRequest;
import org.museframework.bian.bankguarantee.dto.ExchangeBankGuaranteePayoutTaskResponse;
import org.museframework.bian.bankguarantee.dto.ExecuteBankGuaranteePayoutTaskRequest;
import org.museframework.bian.bankguarantee.dto.ExecuteBankGuaranteePayoutTaskResponse;
import org.museframework.bian.bankguarantee.dto.InitiateBankGuaranteePayoutTaskRequest;
import org.museframework.bian.bankguarantee.dto.InitiateBankGuaranteePayoutTaskResponse;
import org.museframework.bian.bankguarantee.dto.NotifyBankGuaranteePayoutTaskRequest;
import org.museframework.bian.bankguarantee.dto.NotifyBankGuaranteePayoutTaskResponse;
import org.museframework.bian.bankguarantee.dto.RequestBankGuaranteePayoutTaskRequest;
import org.museframework.bian.bankguarantee.dto.RequestBankGuaranteePayoutTaskResponse;
import org.museframework.bian.bankguarantee.dto.RetrieveBankGuaranteePayoutTaskRequest;
import org.museframework.bian.bankguarantee.dto.RetrieveBankGuaranteePayoutTaskResponse;
import org.museframework.bian.bankguarantee.dto.UpdateBankGuaranteePayoutTaskRequest;
import org.museframework.bian.bankguarantee.dto.UpdateBankGuaranteePayoutTaskResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Customer Payment Task is a discrete action or task that is required in the execution of the Customer Payment Task")
@GenericDomain(name="BankGuarantee", group="BankGuaranteePayoutTask")
public interface BqBankGuaranteePayoutTask {
    @GenericDtxEndpoint
    @Description("Exchange Bank Guarantee Payout Task")
    ExchangeBankGuaranteePayoutTaskResponse exchangeBankGuaranteePayoutTask(ExchangeBankGuaranteePayoutTaskRequest req);

    @GenericDtxEndpoint
    @Description("Execute Bank Guarantee Payout Task")
    ExecuteBankGuaranteePayoutTaskResponse executeBankGuaranteePayoutTask(ExecuteBankGuaranteePayoutTaskRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Bank Guarantee Payout Task")
    InitiateBankGuaranteePayoutTaskResponse initiateBankGuaranteePayoutTask(InitiateBankGuaranteePayoutTaskRequest req);

    @Description("Notify Bank Guarantee Payout Task")
    NotifyBankGuaranteePayoutTaskResponse notifyBankGuaranteePayoutTask(NotifyBankGuaranteePayoutTaskRequest req);

    @GenericDtxEndpoint
    @Description("Request Bank Guarantee Payout Task")
    RequestBankGuaranteePayoutTaskResponse requestBankGuaranteePayoutTask(RequestBankGuaranteePayoutTaskRequest req);

    @Description("Retrieve Bank Guarantee Payout Task")
    RetrieveBankGuaranteePayoutTaskResponse retrieveBankGuaranteePayoutTask(RetrieveBankGuaranteePayoutTaskRequest req);

    @GenericDtxEndpoint
    @Description("Update Bank Guarantee Payout Task")
    UpdateBankGuaranteePayoutTaskResponse updateBankGuaranteePayoutTask(UpdateBankGuaranteePayoutTaskRequest req);
}