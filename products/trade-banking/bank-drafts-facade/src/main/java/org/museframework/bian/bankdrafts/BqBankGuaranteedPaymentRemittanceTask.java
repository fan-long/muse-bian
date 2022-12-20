package org.museframework.bian.bankdrafts;

import org.museframework.bian.bankdrafts.dto.ExchangeBankGuaranteedPaymentRemittanceTaskRequest;
import org.museframework.bian.bankdrafts.dto.ExchangeBankGuaranteedPaymentRemittanceTaskResponse;
import org.museframework.bian.bankdrafts.dto.ExecuteBankGuaranteedPaymentRemittanceTaskRequest;
import org.museframework.bian.bankdrafts.dto.ExecuteBankGuaranteedPaymentRemittanceTaskResponse;
import org.museframework.bian.bankdrafts.dto.InitiateBankGuaranteedPaymentRemittanceTaskRequest;
import org.museframework.bian.bankdrafts.dto.InitiateBankGuaranteedPaymentRemittanceTaskResponse;
import org.museframework.bian.bankdrafts.dto.NotifyBankGuaranteedPaymentRemittanceTaskRequest;
import org.museframework.bian.bankdrafts.dto.NotifyBankGuaranteedPaymentRemittanceTaskResponse;
import org.museframework.bian.bankdrafts.dto.RequestBankGuaranteedPaymentRemittanceTaskRequest;
import org.museframework.bian.bankdrafts.dto.RequestBankGuaranteedPaymentRemittanceTaskResponse;
import org.museframework.bian.bankdrafts.dto.RetrieveBankGuaranteedPaymentRemittanceTaskRequest;
import org.museframework.bian.bankdrafts.dto.RetrieveBankGuaranteedPaymentRemittanceTaskResponse;
import org.museframework.bian.bankdrafts.dto.UpdateBankGuaranteedPaymentRemittanceTaskRequest;
import org.museframework.bian.bankdrafts.dto.UpdateBankGuaranteedPaymentRemittanceTaskResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Customer Payment Task is a discrete action or task that is required in the execution of the Customer Payment Task")
@GenericDomain(name="BankDrafts", group="BankGuaranteedPaymentRemittanceTask")
public interface BqBankGuaranteedPaymentRemittanceTask {
    @GenericDtxEndpoint
    @Description("Exchange Bank Guaranteed Payment Remittance Task")
    ExchangeBankGuaranteedPaymentRemittanceTaskResponse exchangeBankGuaranteedPaymentRemittanceTask(ExchangeBankGuaranteedPaymentRemittanceTaskRequest req);

    @GenericDtxEndpoint
    @Description("Execute Bank Guaranteed Payment Remittance Task")
    ExecuteBankGuaranteedPaymentRemittanceTaskResponse executeBankGuaranteedPaymentRemittanceTask(ExecuteBankGuaranteedPaymentRemittanceTaskRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Bank Guaranteed Payment Remittance Task")
    InitiateBankGuaranteedPaymentRemittanceTaskResponse initiateBankGuaranteedPaymentRemittanceTask(InitiateBankGuaranteedPaymentRemittanceTaskRequest req);

    @Description("Notify Bank Guaranteed Payment Remittance Task")
    NotifyBankGuaranteedPaymentRemittanceTaskResponse notifyBankGuaranteedPaymentRemittanceTask(NotifyBankGuaranteedPaymentRemittanceTaskRequest req);

    @GenericDtxEndpoint
    @Description("Request Bank Guaranteed Payment Remittance Task")
    RequestBankGuaranteedPaymentRemittanceTaskResponse requestBankGuaranteedPaymentRemittanceTask(RequestBankGuaranteedPaymentRemittanceTaskRequest req);

    @Description("Retrieve Bank Guaranteed Payment Remittance Task")
    RetrieveBankGuaranteedPaymentRemittanceTaskResponse retrieveBankGuaranteedPaymentRemittanceTask(RetrieveBankGuaranteedPaymentRemittanceTaskRequest req);

    @GenericDtxEndpoint
    @Description("Update Bank Guaranteed Payment Remittance Task")
    UpdateBankGuaranteedPaymentRemittanceTaskResponse updateBankGuaranteedPaymentRemittanceTask(UpdateBankGuaranteedPaymentRemittanceTaskRequest req);
}