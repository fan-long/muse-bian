/*Handle and assign the day to day activities, capture time, costs and income for an operational unit within Intellectual Property Portfolio. 
*/
package org.museframework.bian.intpropor.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.IntellectualPropertyAdministrativePlan
@MetaDto
public class IntellectualPropertyAdministrativePlan {
    /*Reference to the intellectual property asset item*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object intellectualPropertyAssetReference;

    /*The details maintained for the intellectual property asset*/
    @MetaField
    private String intellectualPropertyAssetRecord;

    /*The type of asset (i.e. trade secrets, trademarks, copyrights, and patents.)*/
    @MetaField
    private String intellectualPropertyAssetType;

    /*Description of significant details and properties of the intellectual property asset*/
    @MetaField
    private String intellectualPropertyAssetDescription;

    /*Details of title ownership, including assigned usage rights*/
    @MetaField
    private String intellectualPropertyAssetTitle;

    /*Details of scope of coverage of the intellectual property asset (e.g. geographic coverage, allowed usage type coverage)*/
    @MetaField
    private String intellectualPropertyAssetJurisdiction;

    /*Reference to the original source of the intellectual property*/
    @MetaField
    private String intellectualPropertyAssetCreator;

    /*An indication or description of the commercial value of the intellectual property asset. This can combine a 'replacement' valuation and an licensing/assignment income assessment. The value can be an estimate and include actual realized income*/
    @MetaField
    private String intellectualPropertyAssetValuation;

    /*Reference to associated specification documents*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Key dates and times associated with the intellectual property asset (e.g. creation date, assignment date, valid until/expiry date)*/
    @MetaField
    private String dateType;

    /*Value of the date type*/
    @MetaField
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