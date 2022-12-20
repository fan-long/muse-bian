package org.museframework.bian.bankguarantee;

import org.museframework.bian.bankguarantee.dto.ExchangeBankGuaranteeIssuanceandBookingTaskRequest;
import org.museframework.bian.bankguarantee.dto.ExchangeBankGuaranteeIssuanceandBookingTaskResponse;
import org.museframework.bian.bankguarantee.dto.ExecuteBankGuaranteeIssuanceandBookingTaskRequest;
import org.museframework.bian.bankguarantee.dto.ExecuteBankGuaranteeIssuanceandBookingTaskResponse;
import org.museframework.bian.bankguarantee.dto.InitiateBankGuaranteeIssuanceandBookingTaskRequest;
import org.museframework.bian.bankguarantee.dto.InitiateBankGuaranteeIssuanceandBookingTaskResponse;
import org.museframework.bian.bankguarantee.dto.NotifyBankGuaranteeIssuanceandBookingTaskRequest;
import org.museframework.bian.bankguarantee.dto.NotifyBankGuaranteeIssuanceandBookingTaskResponse;
import org.museframework.bian.bankguarantee.dto.RequestBankGuaranteeIssuanceandBookingTaskRequest;
import org.museframework.bian.bankguarantee.dto.RequestBankGuaranteeIssuanceandBookingTaskResponse;
import org.museframework.bian.bankguarantee.dto.RetrieveBankGuaranteeIssuanceandBookingTaskRequest;
import org.museframework.bian.bankguarantee.dto.RetrieveBankGuaranteeIssuanceandBookingTaskResponse;
import org.museframework.bian.bankguarantee.dto.UpdateBankGuaranteeIssuanceandBookingTaskRequest;
import org.museframework.bian.bankguarantee.dto.UpdateBankGuaranteeIssuanceandBookingTaskResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Customer Payment Task is a discrete action or task that is required in the execution of the Customer Payment Task")
@GenericDomain(name="BankGuarantee", group="BankGuaranteeIssuanceandBookingTask")
public interface BqBankGuaranteeIssuanceandBookingTask {
    @GenericDtxEndpoint
    @Description("Exchange Bank Guarantee Issuance and Booking Task")
    ExchangeBankGuaranteeIssuanceandBookingTaskResponse exchangeBankGuaranteeIssuanceandBookingTask(ExchangeBankGuaranteeIssuanceandBookingTaskRequest req);

    @GenericDtxEndpoint
    @Description("Execute Bank Guarantee Issuance and Booking Task")
    ExecuteBankGuaranteeIssuanceandBookingTaskResponse executeBankGuaranteeIssuanceandBookingTask(ExecuteBankGuaranteeIssuanceandBookingTaskRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Bank Guarantee Issuance and Booking Task")
    InitiateBankGuaranteeIssuanceandBookingTaskResponse initiateBankGuaranteeIssuanceandBookingTask(InitiateBankGuaranteeIssuanceandBookingTaskRequest req);

    @Description("Notify Bank Guarantee Issuance and Booking Task")
    NotifyBankGuaranteeIssuanceandBookingTaskResponse notifyBankGuaranteeIssuanceandBookingTask(NotifyBankGuaranteeIssuanceandBookingTaskRequest req);

    @GenericDtxEndpoint
    @Description("Request Bank Guarantee Issuance and Booking Task")
    RequestBankGuaranteeIssuanceandBookingTaskResponse requestBankGuaranteeIssuanceandBookingTask(RequestBankGuaranteeIssuanceandBookingTaskRequest req);

    @Description("Retrieve Bank Guarantee Issuance and Booking Task")
    RetrieveBankGuaranteeIssuanceandBookingTaskResponse retrieveBankGuaranteeIssuanceandBookingTask(RetrieveBankGuaranteeIssuanceandBookingTaskRequest req);

    @GenericDtxEndpoint
    @Description("Update Bank Guarantee Issuance and Booking Task")
    UpdateBankGuaranteeIssuanceandBookingTaskResponse updateBankGuaranteeIssuanceandBookingTask(UpdateBankGuaranteeIssuanceandBookingTaskRequest req);
}