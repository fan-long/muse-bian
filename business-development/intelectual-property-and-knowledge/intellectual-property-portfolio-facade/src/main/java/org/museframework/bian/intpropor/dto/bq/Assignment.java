/*A collection of one or more clerical routines that are to be followed to administer the operational unit/function

Examples: Time-sheet recording*/
package org.museframework.bian.intpropor.dto.bq;

public class Assignment {
    /*The schedule capturing assignments for use/deployment of the intellectual property asset. This can include internal use and external licensed agreements*/
    private String intellectualPropertyAssetAssignmentSchedule;

    /*A record of assignments of the intellectual property both for internal use and for 3rd party licensing*/
    private String intellectualPropertyAssetAssignmentRecord;

    /*The type of assignment (e.g. internal, external license)*/
    private String intellectualPropertyAssetAssignmentType;

    /*Description of the assignment (e.g. allowed use, terms)*/
    private String intellectualPropertyAssetAssignmentDescription;

    /*Reference to associated documents*/
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Details of any charges levied and payments received made from licensing*/
    private String intellectualPropertyAssetAssignmentTransaction;

    public void setIntellectualPropertyAssetAssignmentSchedule(String intellectualPropertyAssetAssignmentSchedule) {
        this.intellectualPropertyAssetAssignmentSchedule = intellectualPropertyAssetAssignmentSchedule;
    }

    public String getIntellectualPropertyAssetAssignmentSchedule() {
        return intellectualPropertyAssetAssignmentSchedule;
    }

    public void setIntellectualPropertyAssetAssignmentRecord(String intellectualPropertyAssetAssignmentRecord) {
        this.intellectualPropertyAssetAssignmentRecord = intellectualPropertyAssetAssignmentRecord;
    }

    public String getIntellectualPropertyAssetAssignmentRecord() {
        return intellectualPropertyAssetAssignmentRecord;
    }

    public void setIntellectualPropertyAssetAssignmentType(String intellectualPropertyAssetAssignmentType) {
        this.intellectualPropertyAssetAssignmentType = intellectualPropertyAssetAssignmentType;
    }

    public String getIntellectualPropertyAssetAssignmentType() {
        return intellectualPropertyAssetAssignmentType;
    }

    public void setIntellectualPropertyAssetAssignmentDescription(String intellectualPropertyAssetAssignmentDescription) {
        this.intellectualPropertyAssetAssignmentDescription = intellectualPropertyAssetAssignmentDescription;
    }

    public String getIntellectualPropertyAssetAssignmentDescription() {
        return intellectualPropertyAssetAssignmentDescription;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setIntellectualPropertyAssetAssignmentTransaction(String intellectualPropertyAssetAssignmentTransaction) {
        this.intellectualPropertyAssetAssignmentTransaction = intellectualPropertyAssetAssignmentTransaction;
    }

    public String getIntellectualPropertyAssetAssignmentTransaction() {
        return intellectualPropertyAssetAssignmentTransaction;
    }
}