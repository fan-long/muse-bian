package org.museframework.bian.customerbilling;

import org.museframework.bian.customerbilling.dto.RetrieveInvoicingRequest;
import org.museframework.bian.customerbilling.dto.RetrieveInvoicingResponse;
import org.museframework.bian.customerbilling.dto.UpdateInvoicingRequest;
import org.museframework.bian.customerbilling.dto.UpdateInvoicingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="CustomerBilling", group="Invoicing")
public interface BqInvoicing {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of a generated invoice")
    UpdateInvoicingResponse updateInvoicing(UpdateInvoicingRequest req);

    @Description("ReBQ Retrieve details about a sent invoice")
    RetrieveInvoicingResponse retrieveInvoicing(RetrieveInvoicingRequest req);
}