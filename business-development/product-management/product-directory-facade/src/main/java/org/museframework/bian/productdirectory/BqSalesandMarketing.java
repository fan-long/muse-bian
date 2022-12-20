package org.museframework.bian.productdirectory;

import org.museframework.bian.productdirectory.dto.RegisterSalesandMarketingRequest;
import org.museframework.bian.productdirectory.dto.RegisterSalesandMarketingResponse;
import org.museframework.bian.productdirectory.dto.RetrieveSalesandMarketingRequest;
import org.museframework.bian.productdirectory.dto.RetrieveSalesandMarketingResponse;
import org.museframework.bian.productdirectory.dto.UpdateSalesandMarketingRequest;
import org.museframework.bian.productdirectory.dto.UpdateSalesandMarketingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An assertion or statement with regard to a concept, a characteristic.  Examples: Product pricing rules, Customer reference details  A descriptor can be atomic or composed. Prospect Management")
@GenericDomain(name="ProductDirectory", group="SalesandMarketing")
public interface BqSalesandMarketing {
    @GenericDtxEndpoint
    @Description("InBQ Register a new product or service sales and marketing details in the catalog")
    RegisterSalesandMarketingResponse registerSalesandMarketing(RegisterSalesandMarketingRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of a product or service sales and marketing details in the catalog")
    UpdateSalesandMarketingResponse updateSalesandMarketing(UpdateSalesandMarketingRequest req);

    @Description("ReBQ Retrieve product or service sales and marketing details from the catalog")
    RetrieveSalesandMarketingResponse retrieveSalesandMarketing(RetrieveSalesandMarketingRequest req);
}