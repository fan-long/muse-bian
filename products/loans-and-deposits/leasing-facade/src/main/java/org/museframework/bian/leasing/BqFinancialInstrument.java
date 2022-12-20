package org.museframework.bian.leasing;

import org.museframework.bian.leasing.dto.InitiateFinancialInstrumentRequest;
import org.museframework.bian.leasing.dto.InitiateFinancialInstrumentResponse;
import org.museframework.bian.leasing.dto.RetrieveFinancialInstrumentRequest;
import org.museframework.bian.leasing.dto.RetrieveFinancialInstrumentResponse;
import org.museframework.bian.leasing.dto.UpdateFinancialInstrumentRequest;
import org.museframework.bian.leasing.dto.UpdateFinancialInstrumentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Leasing.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="Leasing", group="FinancialInstrument")
public interface BqFinancialInstrument {
    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Financial Instrument")
    InitiateFinancialInstrumentResponse initiateFinancialInstrument(InitiateFinancialInstrumentRequest req);

    @Description("ReBQ Retrieve details about any aspect of Financial Instrument")
    RetrieveFinancialInstrumentResponse retrieveFinancialInstrument(RetrieveFinancialInstrumentRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Financial Instrument")
    UpdateFinancialInstrumentResponse updateFinancialInstrument(UpdateFinancialInstrumentRequest req);
}