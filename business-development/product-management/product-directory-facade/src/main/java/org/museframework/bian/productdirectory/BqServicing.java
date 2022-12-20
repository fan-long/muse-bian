package org.museframework.bian.productdirectory;

import org.museframework.bian.productdirectory.dto.RegisterServicingRequest;
import org.museframework.bian.productdirectory.dto.RegisterServicingResponse;
import org.museframework.bian.productdirectory.dto.RetrieveServicingRequest;
import org.museframework.bian.productdirectory.dto.RetrieveServicingResponse;
import org.museframework.bian.productdirectory.dto.UpdateServicingRequest;
import org.museframework.bian.productdirectory.dto.UpdateServicingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An assertion or statement with regard to a concept, a characteristic.  Examples: Product pricing rules, Customer reference details  A descriptor can be atomic or composed. Prospect Management")
@GenericDomain(name="ProductDirectory", group="Servicing")
public interface BqServicing {
    @GenericDtxEndpoint
    @Description("InBQ Register a new product or service servicing details in the catalog")
    RegisterServicingResponse registerServicing(RegisterServicingRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of a product or service servicing details in the catalog")
    UpdateServicingResponse updateServicing(UpdateServicingRequest req);

    @Description("ReBQ Retrieve product or service servicing details from the catalog")
    RetrieveServicingResponse retrieveServicing(RetrieveServicingRequest req);
}