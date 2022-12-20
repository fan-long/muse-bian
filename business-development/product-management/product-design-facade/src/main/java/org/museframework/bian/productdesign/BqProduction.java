package org.museframework.bian.productdesign;

import org.museframework.bian.productdesign.dto.ExecuteProductionRequest;
import org.museframework.bian.productdesign.dto.ExecuteProductionResponse;
import org.museframework.bian.productdesign.dto.RequestProductionRequest;
import org.museframework.bian.productdesign.dto.RequestProductionResponse;
import org.museframework.bian.productdesign.dto.RetrieveProductionRequest;
import org.museframework.bian.productdesign.dto.RetrieveProductionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main design elements/views making up the overall specification  Examples: Business Requirements")
@GenericDomain(name="ProductDesign", group="Production")
public interface BqProduction {
    @GenericDtxEndpoint
    @Description("ExBQ Get automated support for product or service specification deployment")
    ExecuteProductionResponse executeProduction(ExecuteProductionRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request production support for a product or service specification")
    RequestProductionResponse requestProduction(RequestProductionRequest req);

    @Description("ReBQ Retrieve details and documentation covering product or service production deployment")
    RetrieveProductionResponse retrieveProduction(RetrieveProductionRequest req);
}