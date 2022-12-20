package org.museframework.bian.conadvser;

import org.museframework.bian.conadvser.dto.InitiateFinancialPlanningRequest;
import org.museframework.bian.conadvser.dto.InitiateFinancialPlanningResponse;
import org.museframework.bian.conadvser.dto.RetrieveFinancialPlanningRequest;
import org.museframework.bian.conadvser.dto.RetrieveFinancialPlanningResponse;
import org.museframework.bian.conadvser.dto.UpdateFinancialPlanningRequest;
import org.museframework.bian.conadvser.dto.UpdateFinancialPlanningResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="ConsumerAdvisoryServices", group="FinancialPlanning")
public interface BqFinancialPlanning {
    @GenericDtxEndpoint
    @Description("InBQ Initiate financial planning advisory session")
    InitiateFinancialPlanningResponse initiateFinancialPlanning(InitiateFinancialPlanningRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details about a financial planning advisory session")
    UpdateFinancialPlanningResponse updateFinancialPlanning(UpdateFinancialPlanningRequest req);

    @Description("ReBQ Retrieve details about a financial planning advisory session")
    RetrieveFinancialPlanningResponse retrieveFinancialPlanning(RetrieveFinancialPlanningRequest req);
}