package org.museframework.bian.productdirectory;

import org.museframework.bian.productdirectory.dto.RegisterOperationsRequest;
import org.museframework.bian.productdirectory.dto.RegisterOperationsResponse;
import org.museframework.bian.productdirectory.dto.RetrieveOperationsRequest;
import org.museframework.bian.productdirectory.dto.RetrieveOperationsResponse;
import org.museframework.bian.productdirectory.dto.UpdateOperationsRequest;
import org.museframework.bian.productdirectory.dto.UpdateOperationsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An assertion or statement with regard to a concept, a characteristic.  Examples: Product pricing rules, Customer reference details  A descriptor can be atomic or composed. Prospect Management")
@GenericDomain(name="ProductDirectory", group="Operations")
public interface BqOperations {
    @GenericDtxEndpoint
    @Description("InBQ Register a new product or service operations details in the catalog")
    RegisterOperationsResponse registerOperations(RegisterOperationsRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of a product or service operations details in the catalog")
    UpdateOperationsResponse updateOperations(UpdateOperationsRequest req);

    @Description("ReBQ Retrieve product or service operations details from the catalog")
    RetrieveOperationsResponse retrieveOperations(RetrieveOperationsRequest req);
}