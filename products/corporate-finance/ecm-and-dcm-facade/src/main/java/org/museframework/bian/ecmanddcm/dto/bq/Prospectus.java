/*The product features/services available with a financical facility*/
package org.museframework.bian.ecmanddcm.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Prospectus {
    /*Business unit and or employee responsible for the prospectus development*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*A record of the work done to develop the prospectus for the issuance (covers both private and public placements)*/
    @MetaField(0)
    private String prospectusWorkTaskRecord;

    /*The type of work task (e.g. financial analysis/comparison development, pricing negotiation, presentation development, legal/tax/compliance assurance)*/
    @MetaField(0)
    private String prospectusWorkTaskType;

    /*Description of the task performed*/
    @MetaField(0)
    private String prospectusWorkTaskDescription;

    /*File of consolidated notes, algorithms, financial market research, forms and documents for the work task*/
    @MetaField(0)
    private String prospectusWorkTaskWorkProducts;

    /*Reference to associated documents*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*The developed prospectus for the ECM/DCM instrument, including agreed pricing strategy*/
    @MetaField(0)
    private String prospectus;

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setProspectusWorkTaskRecord(String prospectusWorkTaskRecord) {
        this.prospectusWorkTaskRecord = prospectusWorkTaskRecord;
    }

    public String getProspectusWorkTaskRecord() {
        return prospectusWorkTaskRecord;
    }

    public void setProspectusWorkTaskType(String prospectusWorkTaskType) {
        this.prospectusWorkTaskType = prospectusWorkTaskType;
    }

    public String getProspectusWorkTaskType() {
        return prospectusWorkTaskType;
    }

    public void setProspectusWorkTaskDescription(String prospectusWorkTaskDescription) {
        this.prospectusWorkTaskDescription = prospectusWorkTaskDescription;
    }

    public String getProspectusWorkTaskDescription() {
        return prospectusWorkTaskDescription;
    }

    public void setProspectusWorkTaskWorkProducts(String prospectusWorkTaskWorkProducts) {
        this.prospectusWorkTaskWorkProducts = prospectusWorkTaskWorkProducts;
    }

    public String getProspectusWorkTaskWorkProducts() {
        return prospectusWorkTaskWorkProducts;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setProspectus(String prospectus) {
        this.prospectus = prospectus;
    }

    public String getProspectus() {
        return prospectus;
    }
}