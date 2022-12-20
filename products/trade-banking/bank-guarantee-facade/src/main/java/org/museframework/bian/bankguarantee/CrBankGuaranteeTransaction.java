package org.museframework.bian.bankguarantee;

import org.museframework.bian.bankguarantee.dto.ControlBankGuaranteeTransactionRequest;
import org.museframework.bian.bankguarantee.dto.ControlBankGuaranteeTransactionResponse;
import org.museframework.bian.bankguarantee.dto.ExchangeBankGuaranteeTransactionRequest;
import org.museframework.bian.bankguarantee.dto.ExchangeBankGuaranteeTransactionResponse;
import org.museframework.bian.bankguarantee.dto.NotifyBankGuaranteeTransactionRequest;
import org.museframework.bian.bankguarantee.dto.NotifyBankGuaranteeTransactionResponse;
import org.museframework.bian.bankguarantee.dto.RequestBankGuaranteeTransactionRequest;
import org.museframework.bian.bankguarantee.dto.RequestBankGuaranteeTransactionResponse;
import org.museframework.bian.bankguarantee.dto.RetrieveBankGuaranteeTransactionRequest;
import org.museframework.bian.bankguarantee.dto.RetrieveBankGuaranteeTransactionResponse;
import org.museframework.bian.bankguarantee.dto.UpdateBankGuaranteeTransactionRequest;
import org.museframework.bian.bankguarantee.dto.UpdateBankGuaranteeTransactionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing within Bank Guarantee. ")
@GenericDomain(name="BankGuarantee", group="BankGuaranteeTransaction")
public interface CrBankGuaranteeTransaction {
    @GenericDtxEndpoint
    @Description("Control Bank Guarantee Transaction")
    ControlBankGuaranteeTransactionResponse controlBankGuaranteeTransaction(ControlBankGuaranteeTransactionRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Bank Guarantee Transaction")
    ExchangeBankGuaranteeTransactionResponse exchangeBankGuaranteeTransaction(ExchangeBankGuaranteeTransactionRequest req);

    @Description("Notify Bank Guarantee Transaction")
    NotifyBankGuaranteeTransactionResponse notifyBankGuaranteeTransaction(NotifyBankGuaranteeTransactionRequest req);

    @GenericDtxEndpoint
    @Description("Request Bank Guarantee Transaction")
    RequestBankGuaranteeTransactionResponse requestBankGuaranteeTransaction(RequestBankGuaranteeTransactionRequest req);

    @Description("Retrieve Bank Guarantee Transaction")
    RetrieveBankGuaranteeTransactionResponse retrieveBankGuaranteeTransaction(RetrieveBankGuaranteeTransactionRequest req);

    @GenericDtxEndpoint
    @Description("Update Bank Guarantee Transaction")
    UpdateBankGuaranteeTransactionResponse updateBankGuaranteeTransaction(UpdateBankGuaranteeTransactionRequest req);
}