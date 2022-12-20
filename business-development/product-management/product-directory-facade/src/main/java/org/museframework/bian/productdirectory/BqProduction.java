package org.museframework.bian.productdirectory;

import org.museframework.bian.productdirectory.dto.RegisterProductionRequest;
import org.museframework.bian.productdirectory.dto.RegisterProductionResponse;
import org.museframework.bian.productdirectory.dto.RetrieveProductionRequest;
import org.museframework.bian.productdirectory.dto.RetrieveProductionResponse;
import org.museframework.bian.productdirectory.dto.UpdateProductionRequest;
import org.museframework.bian.productdirectory.dto.UpdateProductionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An assertion or statement with regard to a concept, a characteristic.  Examples: Product pricing rules, Customer reference details  A descriptor can be atomic or composed. Prospect Management")
@GenericDomain(name="ProductDirectory", group="Production")
public interface BqProduction {
    @GenericDtxEndpoint
    @Description("InBQ Register a new product or service production details in the catalog")
    RegisterProductionResponse registerProduction(RegisterProductionRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of a product or service production details in the catalog")
    UpdateProductionResponse updateProduction(UpdateProductionRequest req);

    @Description("ReBQ Retrieve product or service production details from the catalog")
    RetrieveProductionResponse retrieveProduction(RetrieveProductionRequest req);
}