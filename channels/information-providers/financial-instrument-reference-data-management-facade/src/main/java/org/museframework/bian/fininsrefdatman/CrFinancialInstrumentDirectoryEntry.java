package org.museframework.bian.fininsrefdatman;

import org.museframework.bian.fininsrefdatman.dto.ControlFinancialInstrumentDirectoryEntryRequest;
import org.museframework.bian.fininsrefdatman.dto.ControlFinancialInstrumentDirectoryEntryResponse;
import org.museframework.bian.fininsrefdatman.dto.ExecuteFinancialInstrumentDirectoryEntryRequest;
import org.museframework.bian.fininsrefdatman.dto.ExecuteFinancialInstrumentDirectoryEntryResponse;
import org.museframework.bian.fininsrefdatman.dto.NotifyFinancialInstrumentDirectoryEntryRequest;
import org.museframework.bian.fininsrefdatman.dto.NotifyFinancialInstrumentDirectoryEntryResponse;
import org.museframework.bian.fininsrefdatman.dto.RegisterFinancialInstrumentDirectoryEntryRequest;
import org.museframework.bian.fininsrefdatman.dto.RegisterFinancialInstrumentDirectoryEntryResponse;
import org.museframework.bian.fininsrefdatman.dto.RequestFinancialInstrumentDirectoryEntryRequest;
import org.museframework.bian.fininsrefdatman.dto.RequestFinancialInstrumentDirectoryEntryResponse;
import org.museframework.bian.fininsrefdatman.dto.RetrieveFinancialInstrumentDirectoryEntryRequest;
import org.museframework.bian.fininsrefdatman.dto.RetrieveFinancialInstrumentDirectoryEntryResponse;
import org.museframework.bian.fininsrefdatman.dto.UpdateFinancialInstrumentDirectoryEntryRequest;
import org.museframework.bian.fininsrefdatman.dto.UpdateFinancialInstrumentDirectoryEntryResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Capture and maintain reference information about some type of entitity within Financial Instrument Reference Data Management.")
@GenericDomain(name="FinancialInstrumentReferenceDataManagement", group="FinancialInstrumentDirectoryEntry")
public interface CrFinancialInstrumentDirectoryEntry {
    @GenericDtxEndpoint
    @Description("Control Financial Instrument Directory Entry")
    ControlFinancialInstrumentDirectoryEntryResponse controlFinancialInstrumentDirectoryEntry(ControlFinancialInstrumentDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("Execute Financial Instrument Directory Entry")
    ExecuteFinancialInstrumentDirectoryEntryResponse executeFinancialInstrumentDirectoryEntry(ExecuteFinancialInstrumentDirectoryEntryRequest req);

    @Description("Notify Financial Instrument Directory Entry")
    NotifyFinancialInstrumentDirectoryEntryResponse notifyFinancialInstrumentDirectoryEntry(NotifyFinancialInstrumentDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("Register Financial Instrument Directory Entry")
    RegisterFinancialInstrumentDirectoryEntryResponse registerFinancialInstrumentDirectoryEntry(RegisterFinancialInstrumentDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("Request Financial Instrument Directory Entry")
    RequestFinancialInstrumentDirectoryEntryResponse requestFinancialInstrumentDirectoryEntry(RequestFinancialInstrumentDirectoryEntryRequest req);

    @Description("Retrieve Financial Instrument Directory Entry")
    RetrieveFinancialInstrumentDirectoryEntryResponse retrieveFinancialInstrumentDirectoryEntry(RetrieveFinancialInstrumentDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("Update Financial Instrument Directory Entry")
    UpdateFinancialInstrumentDirectoryEntryResponse updateFinancialInstrumentDirectoryEntry(UpdateFinancialInstrumentDirectoryEntryRequest req);
}