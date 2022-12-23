/*The Option Instrument property properties that represent a discrete aspect of the Option Instrument property*/
package org.museframework.bian.fininsrefdatman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class FinancialInstrumentReferenceDataManagementOutcome {
    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.DirectoryEntry financialInstrumentReferenceDataManagementEntry;

    /**/
    @MetaField
    private String financialInstrumentReferenceDataManagementWorkProduct;

    public void setFinancialInstrumentReferenceDataManagementEntry(org.museframework.bian.classes.DirectoryEntry financialInstrumentReferenceDataManagementEntry) {
        this.financialInstrumentReferenceDataManagementEntry = financialInstrumentReferenceDataManagementEntry;
    }

    public org.museframework.bian.classes.DirectoryEntry getFinancialInstrumentReferenceDataManagementEntry() {
        return financialInstrumentReferenceDataManagementEntry;
    }

    public void setFinancialInstrumentReferenceDataManagementWorkProduct(String financialInstrumentReferenceDataManagementWorkProduct) {
        this.financialInstrumentReferenceDataManagementWorkProduct = financialInstrumentReferenceDataManagementWorkProduct;
    }

    public String getFinancialInstrumentReferenceDataManagementWorkProduct() {
        return financialInstrumentReferenceDataManagementWorkProduct;
    }
}