/*The Option Instrument property properties that represent a discrete aspect of the Option Instrument property*/
package org.museframework.bian.fininsrefdatman.dto.bq;

public class FinancialInstrumentReferenceDataManagementOutcome {
    /**/
    private org.museframework.bian.classes.DirectoryEntry financialInstrumentReferenceDataManagementEntry;

    /**/
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