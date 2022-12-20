package org.museframework.bian.cusbehmod;

import org.museframework.bian.cusbehmod.dto.ExecuteProductionRequest;
import org.museframework.bian.cusbehmod.dto.ExecuteProductionResponse;
import org.museframework.bian.cusbehmod.dto.RequestProductionRequest;
import org.museframework.bian.cusbehmod.dto.RequestProductionResponse;
import org.museframework.bian.cusbehmod.dto.RetrieveProductionRequest;
import org.museframework.bian.cusbehmod.dto.RetrieveProductionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main design elements/views making up the overall specification  Examples: Business Requirements")
@GenericDomain(name="CustomerBehaviorModels", group="Production")
public interface BqProduction {
    @GenericDtxEndpoint
    @Description("ExBQ Get automated support for model deployment")
    ExecuteProductionResponse executeProduction(ExecuteProductionRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request production support for a deployed model")
    RequestProductionResponse requestProduction(RequestProductionRequest req);

    @Description("ReBQ Retrieve details and documentation covering model production deployment")
    RetrieveProductionResponse retrieveProduction(RetrieveProductionRequest req);
}