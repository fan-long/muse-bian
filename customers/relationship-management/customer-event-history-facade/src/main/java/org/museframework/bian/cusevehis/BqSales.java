package org.museframework.bian.cusevehis;

import org.museframework.bian.cusevehis.dto.CaptureSalesRequest;
import org.museframework.bian.cusevehis.dto.CaptureSalesResponse;
import org.museframework.bian.cusevehis.dto.RetrieveSalesRequest;
import org.museframework.bian.cusevehis.dto.RetrieveSalesResponse;
import org.museframework.bian.cusevehis.dto.UpdateSalesRequest;
import org.museframework.bian.cusevehis.dto.UpdateSalesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of the events/transactions recorded by the log  Examples: Customer life event, Servicing event")
@GenericDomain(name="CustomerEventHistory", group="Sales")
public interface BqSales {
    @GenericDtxEndpoint
    @Description("UpBQ Update captured sales event details")
    UpdateSalesResponse updateSales(UpdateSalesRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture sales event details")
    CaptureSalesResponse captureSales(CaptureSalesRequest req);

    @Description("ReBQ Retrieve sales event details")
    RetrieveSalesResponse retrieveSales(RetrieveSalesRequest req);
}