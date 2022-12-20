/*A collection of one or more clerical routines that are to be followed to administer the operational unit/function

Examples: Time-sheet recording*/
package org.museframework.bian.intpropor.dto.bq;

public class Maintenance {
    /*The schedule for maintenance tasks performed and to be performed (e.g. patent renewals)*/
    private String intellectualPropertyAssetMaintenanceSchedule;

    /*Reference to the intellectual property protection mechanism employed (e.g. copyright, trademark or patent reference number)*/
    private org.museframework.bian.classes.Object intellectualPropertyAssetProtectionReference;

    /*Reference to the registration entity for the intellectual property protection mechanism (e.g. U.S. Patent Office)*/
    private org.museframework.bian.classes.Object intellectualPropertyAssetRegistrationReference;

    /*A record of payments and other actions taken to maintain the asset*/
    private String intellectualPropertyAssetMaintenanceTaskRecord;

    /*The type of maintenance task (e.g. annual renewal)*/
    private String intellectualPropertyAssetMaintenanceTaskType;

    /*Description of the task performed*/
    private String intellectualPropertyAssetMaintenanceTaskDescription;

    /*File of consolidated notes, forms and documents for the maintenance task*/
    private String intellectualPropertyAssetMaintenanceTaskWorkProducts;

    /*Reference to associated documents*/
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Details of any payments made as part of maintenance*/
    private String intellectualPropertyAssetMaintenanceTransaction;

    public void setIntellectualPropertyAssetMaintenanceSchedule(String intellectualPropertyAssetMaintenanceSchedule) {
        this.intellectualPropertyAssetMaintenanceSchedule = intellectualPropertyAssetMaintenanceSchedule;
    }

    public String getIntellectualPropertyAssetMaintenanceSchedule() {
        return intellectualPropertyAssetMaintenanceSchedule;
    }

    public void setIntellectualPropertyAssetProtectionReference(org.museframework.bian.classes.Object intellectualPropertyAssetProtectionReference) {
        this.intellectualPropertyAssetProtectionReference = intellectualPropertyAssetProtectionReference;
    }

    public org.museframework.bian.classes.Object getIntellectualPropertyAssetProtectionReference() {
        return intellectualPropertyAssetProtectionReference;
    }

    public void setIntellectualPropertyAssetRegistrationReference(org.museframework.bian.classes.Object intellectualPropertyAssetRegistrationReference) {
        this.intellectualPropertyAssetRegistrationReference = intellectualPropertyAssetRegistrationReference;
    }

    public org.museframework.bian.classes.Object getIntellectualPropertyAssetRegistrationReference() {
        return intellectualPropertyAssetRegistrationReference;
    }

    public void setIntellectualPropertyAssetMaintenanceTaskRecord(String intellectualPropertyAssetMaintenanceTaskRecord) {
        this.intellectualPropertyAssetMaintenanceTaskRecord = intellectualPropertyAssetMaintenanceTaskRecord;
    }

    public String getIntellectualPropertyAssetMaintenanceTaskRecord() {
        return intellectualPropertyAssetMaintenanceTaskRecord;
    }

    public void setIntellectualPropertyAssetMaintenanceTaskType(String intellectualPropertyAssetMaintenanceTaskType) {
        this.intellectualPropertyAssetMaintenanceTaskType = intellectualPropertyAssetMaintenanceTaskType;
    }

    public String getIntellectualPropertyAssetMaintenanceTaskType() {
        return intellectualPropertyAssetMaintenanceTaskType;
    }

    public void setIntellectualPropertyAssetMaintenanceTaskDescription(String intellectualPropertyAssetMaintenanceTaskDescription) {
        this.intellectualPropertyAssetMaintenanceTaskDescription = intellectualPropertyAssetMaintenanceTaskDescription;
    }

    public String getIntellectualPropertyAssetMaintenanceTaskDescription() {
        return intellectualPropertyAssetMaintenanceTaskDescription;
    }

    public void setIntellectualPropertyAssetMaintenanceTaskWorkProducts(String intellectualPropertyAssetMaintenanceTaskWorkProducts) {
        this.intellectualPropertyAssetMaintenanceTaskWorkProducts = intellectualPropertyAssetMaintenanceTaskWorkProducts;
    }

    public String getIntellectualPropertyAssetMaintenanceTaskWorkProducts() {
        return intellectualPropertyAssetMaintenanceTaskWorkProducts;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setIntellectualPropertyAssetMaintenanceTransaction(String intellectualPropertyAssetMaintenanceTransaction) {
        this.intellectualPropertyAssetMaintenanceTransaction = intellectualPropertyAssetMaintenanceTransaction;
    }

    public String getIntellectualPropertyAssetMaintenanceTransaction() {
        return intellectualPropertyAssetMaintenanceTransaction;
    }
}