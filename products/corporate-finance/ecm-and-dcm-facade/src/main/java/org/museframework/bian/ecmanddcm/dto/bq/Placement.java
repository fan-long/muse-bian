/*The product features/services available with a financical facility*/
package org.museframework.bian.ecmanddcm.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Placement {
    /*Business unit and or employee responsible for the placement road show and issuance transaction*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*List of target investors for private placement*/
    @MetaField(0)
    private String prospectList;

    /*The schedule and details of investor presentations*/
    @MetaField(0)
    private String placementRoadshowSchedule;

    /*A record of the work done to place the instrument in the private or public markets as appropriate*/
    @MetaField(0)
    private String placementWorkTaskRecord;

    /*The type of work task (e.g. prospect scheduling, presentation, negotiation)*/
    @MetaField(0)
    private String placementWorkTaskType;

    /*Description of the task performed*/
    @MetaField(0)
    private String placementWorkTaskDescription;

    /*File of consolidated notes, forms and documents used and generated through the work task*/
    @MetaField(0)
    private String placementWorkTaskWorkProducts;

    /*Reference to associated documents*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*The consolidated details of the investments obtained for the issuance - details investor participation for private placement and primary market transaction references for public offerings*/
    @MetaField(0)
    private String placementTransaction;

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setProspectList(String prospectList) {
        this.prospectList = prospectList;
    }

    public String getProspectList() {
        return prospectList;
    }

    public void setPlacementRoadshowSchedule(String placementRoadshowSchedule) {
        this.placementRoadshowSchedule = placementRoadshowSchedule;
    }

    public String getPlacementRoadshowSchedule() {
        return placementRoadshowSchedule;
    }

    public void setPlacementWorkTaskRecord(String placementWorkTaskRecord) {
        this.placementWorkTaskRecord = placementWorkTaskRecord;
    }

    public String getPlacementWorkTaskRecord() {
        return placementWorkTaskRecord;
    }

    public void setPlacementWorkTaskType(String placementWorkTaskType) {
        this.placementWorkTaskType = placementWorkTaskType;
    }

    public String getPlacementWorkTaskType() {
        return placementWorkTaskType;
    }

    public void setPlacementWorkTaskDescription(String placementWorkTaskDescription) {
        this.placementWorkTaskDescription = placementWorkTaskDescription;
    }

    public String getPlacementWorkTaskDescription() {
        return placementWorkTaskDescription;
    }

    public void setPlacementWorkTaskWorkProducts(String placementWorkTaskWorkProducts) {
        this.placementWorkTaskWorkProducts = placementWorkTaskWorkProducts;
    }

    public String getPlacementWorkTaskWorkProducts() {
        return placementWorkTaskWorkProducts;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setPlacementTransaction(String placementTransaction) {
        this.placementTransaction = placementTransaction;
    }

    public String getPlacementTransaction() {
        return placementTransaction;
    }
}