package org.museframework.bian.bankguarantee;

import org.museframework.bian.bankguarantee.dto.ExchangeBankGuaranteeCollectionsTaskRequest;
import org.museframework.bian.bankguarantee.dto.ExchangeBankGuaranteeCollectionsTaskResponse;
import org.museframework.bian.bankguarantee.dto.ExecuteBankGuaranteeCollectionsTaskRequest;
import org.museframework.bian.bankguarantee.dto.ExecuteBankGuaranteeCollectionsTaskResponse;
import org.museframework.bian.bankguarantee.dto.InitiateBankGuaranteeCollectionsTaskRequest;
import org.museframework.bian.bankguarantee.dto.InitiateBankGuaranteeCollectionsTaskResponse;
import org.museframework.bian.bankguarantee.dto.NotifyBankGuaranteeCollectionsTaskRequest;
import org.museframework.bian.bankguarantee.dto.NotifyBankGuaranteeCollectionsTaskResponse;
import org.museframework.bian.bankguarantee.dto.RequestBankGuaranteeCollectionsTaskRequest;
import org.museframework.bian.bankguarantee.dto.RequestBankGuaranteeCollectionsTaskResponse;
import org.museframework.bian.bankguarantee.dto.RetrieveBankGuaranteeCollectionsTaskRequest;
import org.museframework.bian.bankguarantee.dto.RetrieveBankGuaranteeCollectionsTaskResponse;
import org.museframework.bian.bankguarantee.dto.UpdateBankGuaranteeCollectionsTaskRequest;
import org.museframework.bian.bankguarantee.dto.UpdateBankGuaranteeCollectionsTaskResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Customer Payment Task is a discrete action or task that is required in the execution of the Customer Payment Task")
@GenericDomain(name="BankGuarantee", group="BankGuaranteeCollectionsTask")
public interface BqBankGuaranteeCollectionsTask {
    @GenericDtxEndpoint
    @Description("Exchange Bank Guarantee Collections Task")
    ExchangeBankGuaranteeCollectionsTaskResponse exchangeBankGuaranteeCollectionsTask(ExchangeBankGuaranteeCollectionsTaskRequest req);

    @GenericDtxEndpoint
    @Description("Execute Bank Guarantee Collections Task")
    ExecuteBankGuaranteeCollectionsTaskResponse executeBankGuaranteeCollectionsTask(ExecuteBankGuaranteeCollectionsTaskRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Bank Guarantee Collections Task")
    InitiateBankGuaranteeCollectionsTaskResponse initiateBankGuaranteeCollectionsTask(InitiateBankGuaranteeCollectionsTaskRequest req);

    @Description("Notify Bank Guarantee Collections Task")
    NotifyBankGuaranteeCollectionsTaskResponse notifyBankGuaranteeCollectionsTask(NotifyBankGuaranteeCollectionsTaskRequest req);

    @GenericDtxEndpoint
    @Description("Request Bank Guarantee Collections Task")
    RequestBankGuaranteeCollectionsTaskResponse requestBankGuaranteeCollectionsTask(RequestBankGuaranteeCollectionsTaskRequest req);

    @Description("Retrieve Bank Guarantee Collections Task")
    RetrieveBankGuaranteeCollectionsTaskResponse retrieveBankGuaranteeCollectionsTask(RetrieveBankGuaranteeCollectionsTaskRequest req);

    @GenericDtxEndpoint
    @Description("Update Bank Guarantee Collections Task")
    UpdateBankGuaranteeCollectionsTaskResponse updateBankGuaranteeCollectionsTask(UpdateBankGuaranteeCollectionsTaskRequest req);
}