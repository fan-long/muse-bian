package org.museframework.bian.commissions;

import org.museframework.bian.commissions.dto.ExchangeCalculationRequest;
import org.museframework.bian.commissions.dto.ExchangeCalculationResponse;
import org.museframework.bian.commissions.dto.RetrieveCalculationRequest;
import org.museframework.bian.commissions.dto.RetrieveCalculationResponse;
import org.museframework.bian.commissions.dto.UpdateCalculationRequest;
import org.museframework.bian.commissions.dto.UpdateCalculationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Commissions.  Example: Execute a payment transaction.")
@GenericDomain(name="Commissions", group="Calculation")
public interface BqCalculation {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Calculation processing")
    ExchangeCalculationResponse exchangeCalculation(ExchangeCalculationRequest req);

    @Description("ReBQ Retrieve details about any aspect of Calculation")
    RetrieveCalculationResponse retrieveCalculation(RetrieveCalculationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Calculation")
    UpdateCalculationResponse updateCalculation(UpdateCalculationRequest req);
}