package org.museframework.bian.fininsrefdatman.dto;

public class RegisterFinancialInstrumentDirectoryEntryRequest {
    private org.museframework.bian.fininsrefdatman.dto.cr.FinancialInstrumentDirectoryEntry financialInstrumentDirectoryEntry;

    public void setFinancialInstrumentDirectoryEntry(org.museframework.bian.fininsrefdatman.dto.cr.FinancialInstrumentDirectoryEntry financialInstrumentDirectoryEntry) {
        this.financialInstrumentDirectoryEntry = financialInstrumentDirectoryEntry;
    }

    public org.museframework.bian.fininsrefdatman.dto.cr.FinancialInstrumentDirectoryEntry getFinancialInstrumentDirectoryEntry() {
        return financialInstrumentDirectoryEntry;
    }
}