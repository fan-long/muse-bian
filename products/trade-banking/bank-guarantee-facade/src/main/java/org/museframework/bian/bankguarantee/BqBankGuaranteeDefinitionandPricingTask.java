package org.museframework.bian.bankguarantee;

import org.museframework.bian.bankguarantee.dto.ExchangeBankGuaranteeDefinitionandPricingTaskRequest;
import org.museframework.bian.bankguarantee.dto.ExchangeBankGuaranteeDefinitionandPricingTaskResponse;
import org.museframework.bian.bankguarantee.dto.ExecuteBankGuaranteeDefinitionandPricingTaskRequest;
import org.museframework.bian.bankguarantee.dto.ExecuteBankGuaranteeDefinitionandPricingTaskResponse;
import org.museframework.bian.bankguarantee.dto.InitiateBankGuaranteeDefinitionandPricingTaskRequest;
import org.museframework.bian.bankguarantee.dto.InitiateBankGuaranteeDefinitionandPricingTaskResponse;
import org.museframework.bian.bankguarantee.dto.NotifyBankGuaranteeDefinitionandPricingTaskRequest;
import org.museframework.bian.bankguarantee.dto.NotifyBankGuaranteeDefinitionandPricingTaskResponse;
import org.museframework.bian.bankguarantee.dto.RequestBankGuaranteeDefinitionandPricingTaskRequest;
import org.museframework.bian.bankguarantee.dto.RequestBankGuaranteeDefinitionandPricingTaskResponse;
import org.museframework.bian.bankguarantee.dto.RetrieveBankGuaranteeDefinitionandPricingTaskRequest;
import org.museframework.bian.bankguarantee.dto.RetrieveBankGuaranteeDefinitionandPricingTaskResponse;
import org.museframework.bian.bankguarantee.dto.UpdateBankGuaranteeDefinitionandPricingTaskRequest;
import org.museframework.bian.bankguarantee.dto.UpdateBankGuaranteeDefinitionandPricingTaskResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Customer Payment Task is a discrete action or task that is required in the execution of the Customer Payment Task")
@GenericDomain(name="BankGuarantee", group="BankGuaranteeDefinitionandPricingTask")
public interface BqBankGuaranteeDefinitionandPricingTask {
    @GenericDtxEndpoint
    @Description("Exchange Bank Guarantee Definition and Pricing Task")
    ExchangeBankGuaranteeDefinitionandPricingTaskResponse exchangeBankGuaranteeDefinitionandPricingTask(ExchangeBankGuaranteeDefinitionandPricingTaskRequest req);

    @GenericDtxEndpoint
    @Description("Execute Bank Guarantee Definition and Pricing Task")
    ExecuteBankGuaranteeDefinitionandPricingTaskResponse executeBankGuaranteeDefinitionandPricingTask(ExecuteBankGuaranteeDefinitionandPricingTaskRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Bank Guarantee Definition and Pricing Task")
    InitiateBankGuaranteeDefinitionandPricingTaskResponse initiateBankGuaranteeDefinitionandPricingTask(InitiateBankGuaranteeDefinitionandPricingTaskRequest req);

    @Description("Notify Bank Guarantee Definition and Pricing Task")
    NotifyBankGuaranteeDefinitionandPricingTaskResponse notifyBankGuaranteeDefinitionandPricingTask(NotifyBankGuaranteeDefinitionandPricingTaskRequest req);

    @GenericDtxEndpoint
    @Description("Request Bank Guarantee Definition and Pricing Task")
    RequestBankGuaranteeDefinitionandPricingTaskResponse requestBankGuaranteeDefinitionandPricingTask(RequestBankGuaranteeDefinitionandPricingTaskRequest req);

    @Description("Retrieve Bank Guarantee Definition and Pricing Task")
    RetrieveBankGuaranteeDefinitionandPricingTaskResponse retrieveBankGuaranteeDefinitionandPricingTask(RetrieveBankGuaranteeDefinitionandPricingTaskRequest req);

    @GenericDtxEndpoint
    @Description("Update Bank Guarantee Definition and Pricing Task")
    UpdateBankGuaranteeDefinitionandPricingTaskResponse updateBankGuaranteeDefinitionandPricingTask(UpdateBankGuaranteeDefinitionandPricingTaskRequest req);
}