package org.museframework.bian.mortgageloan;

import org.museframework.bian.mortgageloan.dto.InitiateFinancialInstrumentRequest;
import org.museframework.bian.mortgageloan.dto.InitiateFinancialInstrumentResponse;
import org.museframework.bian.mortgageloan.dto.RetrieveFinancialInstrumentRequest;
import org.museframework.bian.mortgageloan.dto.RetrieveFinancialInstrumentResponse;
import org.museframework.bian.mortgageloan.dto.UpdateFinancialInstrumentRequest;
import org.museframework.bian.mortgageloan.dto.UpdateFinancialInstrumentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="MortgageLoan", group="FinancialInstrument")
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