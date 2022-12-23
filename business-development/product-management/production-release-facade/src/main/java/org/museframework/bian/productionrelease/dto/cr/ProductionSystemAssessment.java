/*To test or assess an entity, possibly against some formal qualification or certification requirement within Production Release. */
package org.museframework.bian.productionrelease.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ProductionSystemAssessment {
    /*The reference to and descriptive name of the production release system*/
    @MetaField
    private String productionReleaseName;

    /*Reference to the business units responsible for the testing and deployment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*The type of production release (e.g. production service update, new production system)*/
    @MetaField
    private String productionReleaseType;

    /*A description of the scope, goal and make-up of the production release*/
    @MetaField
    private String productionReleaseDescription;

    /*Details the types of production release tests to be and actually applied*/
    @MetaField
    private String productionReleaseTestProfile;

    /*The schedule for performing the range of release tests (planned and actual)*/
    @MetaField
    private String productionReleaseTestSchedule;

    /*The consolidated release evaluation combining the results of all underlying tests*/
    @MetaField
    private String productionReleaseConsolidationRecord;

    /*Reference to associated documents*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Key dates associated with the assessment (e.g. notification date, commencement  date, completion date)*/
    @MetaField
    private String dateType;

    /*Value of the specific date type*/
    @MetaField
    private String date;

    public void setProductionReleaseName(String productionReleaseName) {
        this.productionReleaseName = productionReleaseName;
    }

    public String getProductionReleaseName() {
        return productionReleaseName;
    }

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setProductionReleaseType(String productionReleaseType) {
        this.productionReleaseType = productionReleaseType;
    }

    public String getProductionReleaseType() {
        return productionReleaseType;
    }

    public void setProductionReleaseDescription(String productionReleaseDescription) {
        this.productionReleaseDescription = productionReleaseDescription;
    }

    public String getProductionReleaseDescription() {
        return productionReleaseDescription;
    }

    public void setProductionReleaseTestProfile(String productionReleaseTestProfile) {
        this.productionReleaseTestProfile = productionReleaseTestProfile;
    }

    public String getProductionReleaseTestProfile() {
        return productionReleaseTestProfile;
    }

    public void setProductionReleaseTestSchedule(String productionReleaseTestSchedule) {
        this.productionReleaseTestSchedule = productionReleaseTestSchedule;
    }

    public String getProductionReleaseTestSchedule() {
        return productionReleaseTestSchedule;
    }

    public void setProductionReleaseConsolidationRecord(String productionReleaseConsolidationRecord) {
        this.productionReleaseConsolidationRecord = productionReleaseConsolidationRecord;
    }

    public String getProductionReleaseConsolidationRecord() {
        return productionReleaseConsolidationRecord;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setDateType(String dateType) {
        this.dateType = dateType;
    }

    public String getDateType() {
        return dateType;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }
}