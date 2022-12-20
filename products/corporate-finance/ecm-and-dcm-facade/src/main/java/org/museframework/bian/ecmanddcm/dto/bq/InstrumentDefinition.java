/*The product features/services available with a financical facility*/
package org.museframework.bian.ecmanddcm.dto.bq;

public class InstrumentDefinition {
    /*Business unit and or employee responsible for the financial instrument specification - (includes financial engineers, legal/regulatory and tax specialists as appropriate)*/
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*A record of the work done to define and agree the structure of the equity or debt instrument*/
    private String instrumentDefinitionWorkTaskRecord;

    /*The type of work task (e.g. financial engineering, tax optimization, regulatory compliance checks)*/
    private String instrumentDefinitionWorkTaskType;

    /*Description of the task performed*/
    private String instrumentDefinitionWorkTaskDescription;

    /*File of consolidated notes, algorithms, financial market research, forms and documents for the work task*/
    private String instrumentDefinitionWorkTaskWorkProducts;

    /*Reference to associated documents*/
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*The specification of the developed ECM/DCM instrument*/
    private String instrumentDefinitionSpecification;

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setInstrumentDefinitionWorkTaskRecord(String instrumentDefinitionWorkTaskRecord) {
        this.instrumentDefinitionWorkTaskRecord = instrumentDefinitionWorkTaskRecord;
    }

    public String getInstrumentDefinitionWorkTaskRecord() {
        return instrumentDefinitionWorkTaskRecord;
    }

    public void setInstrumentDefinitionWorkTaskType(String instrumentDefinitionWorkTaskType) {
        this.instrumentDefinitionWorkTaskType = instrumentDefinitionWorkTaskType;
    }

    public String getInstrumentDefinitionWorkTaskType() {
        return instrumentDefinitionWorkTaskType;
    }

    public void setInstrumentDefinitionWorkTaskDescription(String instrumentDefinitionWorkTaskDescription) {
        this.instrumentDefinitionWorkTaskDescription = instrumentDefinitionWorkTaskDescription;
    }

    public String getInstrumentDefinitionWorkTaskDescription() {
        return instrumentDefinitionWorkTaskDescription;
    }

    public void setInstrumentDefinitionWorkTaskWorkProducts(String instrumentDefinitionWorkTaskWorkProducts) {
        this.instrumentDefinitionWorkTaskWorkProducts = instrumentDefinitionWorkTaskWorkProducts;
    }

    public String getInstrumentDefinitionWorkTaskWorkProducts() {
        return instrumentDefinitionWorkTaskWorkProducts;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setInstrumentDefinitionSpecification(String instrumentDefinitionSpecification) {
        this.instrumentDefinitionSpecification = instrumentDefinitionSpecification;
    }

    public String getInstrumentDefinitionSpecification() {
        return instrumentDefinitionSpecification;
    }
}