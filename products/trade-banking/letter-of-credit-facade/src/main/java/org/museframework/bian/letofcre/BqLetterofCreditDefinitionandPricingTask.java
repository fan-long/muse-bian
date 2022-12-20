package org.museframework.bian.letofcre;

import org.museframework.bian.letofcre.dto.ExchangeLetterofCreditDefinitionandPricingTaskRequest;
import org.museframework.bian.letofcre.dto.ExchangeLetterofCreditDefinitionandPricingTaskResponse;
import org.museframework.bian.letofcre.dto.ExecuteLetterofCreditDefinitionandPricingTaskRequest;
import org.museframework.bian.letofcre.dto.ExecuteLetterofCreditDefinitionandPricingTaskResponse;
import org.museframework.bian.letofcre.dto.InitiateLetterofCreditDefinitionandPricingTaskRequest;
import org.museframework.bian.letofcre.dto.InitiateLetterofCreditDefinitionandPricingTaskResponse;
import org.museframework.bian.letofcre.dto.NotifyLetterofCreditDefinitionandPricingTaskRequest;
import org.museframework.bian.letofcre.dto.NotifyLetterofCreditDefinitionandPricingTaskResponse;
import org.museframework.bian.letofcre.dto.RequestLetterofCreditDefinitionandPricingTaskRequest;
import org.museframework.bian.letofcre.dto.RequestLetterofCreditDefinitionandPricingTaskResponse;
import org.museframework.bian.letofcre.dto.RetrieveLetterofCreditDefinitionandPricingTaskRequest;
import org.museframework.bian.letofcre.dto.RetrieveLetterofCreditDefinitionandPricingTaskResponse;
import org.museframework.bian.letofcre.dto.UpdateLetterofCreditDefinitionandPricingTaskRequest;
import org.museframework.bian.letofcre.dto.UpdateLetterofCreditDefinitionandPricingTaskResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Customer Collateral Allocation Task is a discrete action or task that is required in the execution of the Customer Collateral Allocation Task")
@GenericDomain(name="LetterofCredit", group="LetterofCreditDefinitionandPricingTask")
public interface BqLetterofCreditDefinitionandPricingTask {
    @GenericDtxEndpoint
    @Description("Exchange Letter of Credit Definition and Pricing Task")
    ExchangeLetterofCreditDefinitionandPricingTaskResponse exchangeLetterofCreditDefinitionandPricingTask(ExchangeLetterofCreditDefinitionandPricingTaskRequest req);

    @GenericDtxEndpoint
    @Description("Execute Letter of Credit Definition and Pricing Task")
    ExecuteLetterofCreditDefinitionandPricingTaskResponse executeLetterofCreditDefinitionandPricingTask(ExecuteLetterofCreditDefinitionandPricingTaskRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Letter of Credit Definition and Pricing Task")
    InitiateLetterofCreditDefinitionandPricingTaskResponse initiateLetterofCreditDefinitionandPricingTask(InitiateLetterofCreditDefinitionandPricingTaskRequest req);

    @Description("Notify Letter of Credit Definition and Pricing Task")
    NotifyLetterofCreditDefinitionandPricingTaskResponse notifyLetterofCreditDefinitionandPricingTask(NotifyLetterofCreditDefinitionandPricingTaskRequest req);

    @GenericDtxEndpoint
    @Description("Request Letter of Credit Definition and Pricing Task")
    RequestLetterofCreditDefinitionandPricingTaskResponse requestLetterofCreditDefinitionandPricingTask(RequestLetterofCreditDefinitionandPricingTaskRequest req);

    @Description("Retrieve Letter of Credit Definition and Pricing Task")
    RetrieveLetterofCreditDefinitionandPricingTaskResponse retrieveLetterofCreditDefinitionandPricingTask(RetrieveLetterofCreditDefinitionandPricingTaskRequest req);

    @GenericDtxEndpoint
    @Description("Update Letter of Credit Definition and Pricing Task")
    UpdateLetterofCreditDefinitionandPricingTaskResponse updateLetterofCreditDefinitionandPricingTask(UpdateLetterofCreditDefinitionandPricingTaskRequest req);
}