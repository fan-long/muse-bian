package org.museframework.bian.merchandisingloan;

import org.museframework.bian.merchandisingloan.dto.InitiateFinancialInstrumentRequest;
import org.museframework.bian.merchandisingloan.dto.InitiateFinancialInstrumentResponse;
import org.museframework.bian.merchandisingloan.dto.RetrieveFinancialInstrumentRequest;
import org.museframework.bian.merchandisingloan.dto.RetrieveFinancialInstrumentResponse;
import org.museframework.bian.merchandisingloan.dto.UpdateFinancialInstrumentRequest;
import org.museframework.bian.merchandisingloan.dto.UpdateFinancialInstrumentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="MerchandisingLoan", group="FinancialInstrument")
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