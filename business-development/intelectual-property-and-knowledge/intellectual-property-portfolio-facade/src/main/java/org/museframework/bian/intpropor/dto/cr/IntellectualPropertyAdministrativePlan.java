/*Handle and assign the day to day activities, capture time, costs and income for an operational unit within Intellectual Property Portfolio. 
*/
package org.museframework.bian.intpropor.dto.cr;

public class IntellectualPropertyAdministrativePlan extends org.museframework.bian.classes.IntellectualPropertyAdministrativePlan {
    /*Reference to the intellectual property asset item*/
    private org.museframework.bian.classes.Object intellectualPropertyAssetReference;

    /*The details maintained for the intellectual property asset*/
    private String intellectualPropertyAssetRecord;

    /*The type of asset (i.e. trade secrets, trademarks, copyrights, and patents.)*/
    private String intellectualPropertyAssetType;

    /*Description of significant details and properties of the intellectual property asset*/
    private String intellectualPropertyAssetDescription;

    /*Details of title ownership, including assigned usage rights*/
    private String intellectualPropertyAssetTitle;

    /*Details of scope of coverage of the intellectual property asset (e.g. geographic coverage, allowed usage type coverage)*/
    private String intellectualPropertyAssetJurisdiction;

    /*Reference to the original source of the intellectual property*/
    private String intellectualPropertyAssetCreator;

    /*An indication or description of the commercial value of the intellectual property asset. This can combine a 'replacement' valuation and an licensing/assignment income assessment. The value can be an estimate and include actual realized income*/
    private String intellectualPropertyAssetValuation;

    /*Reference to associated specification documents*/
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Key dates and times associated with the intellectual property asset (e.g. creation date, assignment date, valid until/expiry date)*/
    private String dateType;

    /*Value of the date type*/
    private String date;

    public void setIntellectualPropertyAssetReference(org.museframework.bian.classes.Object intellectualPropertyAssetReference) {
        this.intellectualPropertyAssetReference = intellectualPropertyAssetReference;
    }

    public org.museframework.bian.classes.Object getIntellectualPropertyAssetReference() {
        return intellectualPropertyAssetReference;
    }

    public void setIntellectualPropertyAssetRecord(String intellectualPropertyAssetRecord) {
        this.intellectualPropertyAssetRecord = intellectualPropertyAssetRecord;
    }

    public String getIntellectualPropertyAssetRecord() {
        return intellectualPropertyAssetRecord;
    }

    public void setIntellectualPropertyAssetType(String intellectualPropertyAssetType) {
        this.intellectualPropertyAssetType = intellectualPropertyAssetType;
    }

    public String getIntellectualPropertyAssetType() {
        return intellectualPropertyAssetType;
    }

    public void setIntellectualPropertyAssetDescription(String intellectualPropertyAssetDescription) {
        this.intellectualPropertyAssetDescription = intellectualPropertyAssetDescription;
    }

    public String getIntellectualPropertyAssetDescription() {
        return intellectualPropertyAssetDescription;
    }

    public void setIntellectualPropertyAssetTitle(String intellectualPropertyAssetTitle) {
        this.intellectualPropertyAssetTitle = intellectualPropertyAssetTitle;
    }

    public String getIntellectualPropertyAssetTitle() {
        return intellectualPropertyAssetTitle;
    }

    public void setIntellectualPropertyAssetJurisdiction(String intellectualPropertyAssetJurisdiction) {
        this.intellectualPropertyAssetJurisdiction = intellectualPropertyAssetJurisdiction;
    }

    public String getIntellectualPropertyAssetJurisdiction() {
        return intellectualPropertyAssetJurisdiction;
    }

    public void setIntellectualPropertyAssetCreator(String intellectualPropertyAssetCreator) {
        this.intellectualPropertyAssetCreator = intellectualPropertyAssetCreator;
    }

    public String getIntellectualPropertyAssetCreator() {
        return intellectualPropertyAssetCreator;
    }

    public void setIntellectualPropertyAssetValuation(String intellectualPropertyAssetValuation) {
        this.intellectualPropertyAssetValuation = intellectualPropertyAssetValuation;
    }

    public String getIntellectualPropertyAssetValuation() {
        return intellectualPropertyAssetValuation;
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