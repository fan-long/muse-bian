package org.museframework.bian.bankdrafts;

import org.museframework.bian.bankdrafts.dto.ExchangeBankGuaranteedPaymentSpecificationTaskRequest;
import org.museframework.bian.bankdrafts.dto.ExchangeBankGuaranteedPaymentSpecificationTaskResponse;
import org.museframework.bian.bankdrafts.dto.ExecuteBankGuaranteedPaymentSpecificationTaskRequest;
import org.museframework.bian.bankdrafts.dto.ExecuteBankGuaranteedPaymentSpecificationTaskResponse;
import org.museframework.bian.bankdrafts.dto.InitiateBankGuaranteedPaymentSpecificationTaskRequest;
import org.museframework.bian.bankdrafts.dto.InitiateBankGuaranteedPaymentSpecificationTaskResponse;
import org.museframework.bian.bankdrafts.dto.NotifyBankGuaranteedPaymentSpecificationTaskRequest;
import org.museframework.bian.bankdrafts.dto.NotifyBankGuaranteedPaymentSpecificationTaskResponse;
import org.museframework.bian.bankdrafts.dto.RequestBankGuaranteedPaymentSpecificationTaskRequest;
import org.museframework.bian.bankdrafts.dto.RequestBankGuaranteedPaymentSpecificationTaskResponse;
import org.museframework.bian.bankdrafts.dto.RetrieveBankGuaranteedPaymentSpecificationTaskRequest;
import org.museframework.bian.bankdrafts.dto.RetrieveBankGuaranteedPaymentSpecificationTaskResponse;
import org.museframework.bian.bankdrafts.dto.UpdateBankGuaranteedPaymentSpecificationTaskRequest;
import org.museframework.bian.bankdrafts.dto.UpdateBankGuaranteedPaymentSpecificationTaskResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Customer Payment Task is a discrete action or task that is required in the execution of the Customer Payment Task")
@GenericDomain(name="BankDrafts", group="BankGuaranteedPaymentSpecificationTask")
public interface BqBankGuaranteedPaymentSpecificationTask {
    @GenericDtxEndpoint
    @Description("Exchange Bank Guaranteed Payment Specification Task")
    ExchangeBankGuaranteedPaymentSpecificationTaskResponse exchangeBankGuaranteedPaymentSpecificationTask(ExchangeBankGuaranteedPaymentSpecificationTaskRequest req);

    @GenericDtxEndpoint
    @Description("Execute Bank Guaranteed Payment Specification Task")
    ExecuteBankGuaranteedPaymentSpecificationTaskResponse executeBankGuaranteedPaymentSpecificationTask(ExecuteBankGuaranteedPaymentSpecificationTaskRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Bank Guaranteed Payment Specification Task")
    InitiateBankGuaranteedPaymentSpecificationTaskResponse initiateBankGuaranteedPaymentSpecificationTask(InitiateBankGuaranteedPaymentSpecificationTaskRequest req);

    @Description("Notify Bank Guaranteed Payment Specification Task")
    NotifyBankGuaranteedPaymentSpecificationTaskResponse notifyBankGuaranteedPaymentSpecificationTask(NotifyBankGuaranteedPaymentSpecificationTaskRequest req);

    @GenericDtxEndpoint
    @Description("Request Bank Guaranteed Payment Specification Task")
    RequestBankGuaranteedPaymentSpecificationTaskResponse requestBankGuaranteedPaymentSpecificationTask(RequestBankGuaranteedPaymentSpecificationTaskRequest req);

    @Description("Retrieve Bank Guaranteed Payment Specification Task")
    RetrieveBankGuaranteedPaymentSpecificationTaskResponse retrieveBankGuaranteedPaymentSpecificationTask(RetrieveBankGuaranteedPaymentSpecificationTaskRequest req);

    @GenericDtxEndpoint
    @Description("Update Bank Guaranteed Payment Specification Task")
    UpdateBankGuaranteedPaymentSpecificationTaskResponse updateBankGuaranteedPaymentSpecificationTask(UpdateBankGuaranteedPaymentSpecificationTaskRequest req);
}