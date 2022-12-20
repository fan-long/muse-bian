package org.museframework.bian.sessiondialogue;

import org.museframework.bian.sessiondialogue.dto.InitiateSalesRequest;
import org.museframework.bian.sessiondialogue.dto.InitiateSalesResponse;
import org.museframework.bian.sessiondialogue.dto.RetrieveSalesRequest;
import org.museframework.bian.sessiondialogue.dto.RetrieveSalesResponse;
import org.museframework.bian.sessiondialogue.dto.UpdateSalesRequest;
import org.museframework.bian.sessiondialogue.dto.UpdateSalesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="SessionDialogue", group="Sales")
public interface BqSales {
    @GenericDtxEndpoint
    @Description("InBQ Initiate customer sales handling")
    InitiateSalesResponse initiateSales(InitiateSalesRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details for sales handling")
    UpdateSalesResponse updateSales(UpdateSalesRequest req);

    @Description("ReBQ Retrieve details about sales handling")
    RetrieveSalesResponse retrieveSales(RetrieveSalesRequest req);
}