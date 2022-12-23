package org.museframework.bian.fininsrefdatman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateFinancialInstrumentDirectoryEntryRequest {
    @MetaField
    private String financialinstrumentreferencedatamanagementid;

    @MetaField(ref=true)
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