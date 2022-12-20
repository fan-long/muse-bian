package org.museframework.bian.fininsrefdatman.dto;

public class RequestFinancialInstrumentDirectoryEntryRequest {
    private String financialinstrumentreferencedatamanagementid;

    private org.museframework.bian.fininsrefdatman.dto.cr.FinancialInstrumentDirectoryEntry financialInstrumentDirectoryEntry;

    public void setFinancialinstrumentreferencedatamanagementid(String financialinstrumentreferencedatamanagementid) {
        this.financialinstrumentreferencedatamanagementid = financialinstrumentreferencedatamanagementid;
    }

    public String getFinancialinstrumentreferencedatamanagementid() {
        return financialinstrumentreferencedatamanagementid;
    }

    public void setFinancialInstrumentDirectoryEntry(org.museframework.bian.fininsrefdatman.dto.cr.FinancialInstrumentDirectoryEntry financialInstrumentDirectoryEntry) {
        this.financialInstrumentDirectoryEntry = financialInstrumentDirectoryEntry;
    }

    public org.museframework.bian.fininsrefdatman.dto.cr.FinancialInstrumentDirectoryEntry getFinancialInstrumentDirectoryEntry() {
        return financialInstrumentDirectoryEntry;
    }
}