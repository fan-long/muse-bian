/*Handle and assign the day to day activities, capture time, costs and income for an operational unit within Collateral Asset Administration. 
*/
package org.museframework.bian.colassadm.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.CollateralAssetAdministrativePlan
@MetaDto
public class CollateralAssetAdministrativePlan {
    /*Reference to the collateral asset item*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object collateralAssetReference;

    /*The details maintained for the asset*/
    @MetaField
    private String collateralAssetRecord;

    /*The type of asset (e.g. building, machinery, inventory, financial instrument, art)*/
    @MetaField
    private String collateralAssetType;

    /*Key properties of the asset that might influence administration and maintenance (e.g. rarity)*/
    @MetaField
    private String collateralAssetProperties;

    /*Description of significant details and properties of the asset*/
    @MetaField
    private String collateralAssetDescription;

    /*Details of title*/
    @MetaField
    private String collateralAssetTitle;

    /*Breakdown of ownership where an asset has multiple owners with different entitlements*/
    @MetaField
    private String collateralAssetOwnership;

    /*Parties with same for of interest (e.g. custodian, insurer, user)*/
    @MetaField
    private String collateralAssetInterestedParties;

    /*The location the asset is stored*/
    @MetaField
    private String collateralAssetLocation;

    /*The jurisdiction that governs title and access to the asset*/
    @MetaField
    private String collateralAssetJurisdiction;

    /*Reference to supporting documentation*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object collateralAssetDocumentReference;

    /*The type of document relating to the asset*/
    @MetaField
    private String collateralAssetDocumentType;

    /*Details of insurance arrangements covering the asset, including duration and renewal*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object collateralAssetInsuranceReference;

    /*When the asset was provided as collateral*/
    @MetaField
    private String collateralAssetPledgedDate;

    /*Historical and current valuation, including loan to value ratios/qualifiers*/
    @MetaField
    private String collateralAssetValuationHistory;

    /*The schedule for maintaining an up to date valuation*/
    @MetaField
    private String collateralAssetValuationSchedule;

    /*The schedule planned and actual for undertaking asset maintenance checks)*/
    @MetaField
    private String collateralAssetMaintenanceSchedule;

    /*A general status indicator for the asset (can cover multiple properties as necessary)*/
    @MetaField
    private String collateralAssetStatus;

    public void setCollateralAssetReference(org.museframework.bian.classes.Object collateralAssetReference) {
        this.collateralAssetReference = collateralAssetReference;
    }

    public org.museframework.bian.classes.Object getCollateralAssetReference() {
        return collateralAssetReference;
    }

    public void setCollateralAssetRecord(String collateralAssetRecord) {
        this.collateralAssetRecord = collateralAssetRecord;
    }

    public String getCollateralAssetRecord() {
        return collateralAssetRecord;
    }

    public void setCollateralAssetType(String collateralAssetType) {
        this.collateralAssetType = collateralAssetType;
    }

    public String getCollateralAssetType() {
        return collateralAssetType;
    }

    public void setCollateralAssetProperties(String collateralAssetProperties) {
        this.collateralAssetProperties = collateralAssetProperties;
    }

    public String getCollateralAssetProperties() {
        return collateralAssetProperties;
    }

    public void setCollateralAssetDescription(String collateralAssetDescription) {
        this.collateralAssetDescription = collateralAssetDescription;
    }

    public String getCollateralAssetDescription() {
        return collateralAssetDescription;
    }

    public void setCollateralAssetTitle(String collateralAssetTitle) {
        this.collateralAssetTitle = collateralAssetTitle;
    }

    public String getCollateralAssetTitle() {
        return collateralAssetTitle;
    }

    public void setCollateralAssetOwnership(String collateralAssetOwnership) {
        this.collateralAssetOwnership = collateralAssetOwnership;
    }

    public String getCollateralAssetOwnership() {
        return collateralAssetOwnership;
    }

    public void setCollateralAssetInterestedParties(String collateralAssetInterestedParties) {
        this.collateralAssetInterestedParties = collateralAssetInterestedParties;
    }

    public String getCollateralAssetInterestedParties() {
        return collateralAssetInterestedParties;
    }

    public void setCollateralAssetLocation(String collateralAssetLocation) {
        this.collateralAssetLocation = collateralAssetLocation;
    }

    public String getCollateralAssetLocation() {
        return collateralAssetLocation;
    }

    public void setCollateralAssetJurisdiction(String collateralAssetJurisdiction) {
        this.collateralAssetJurisdiction = collateralAssetJurisdiction;
    }

    public String getCollateralAssetJurisdiction() {
        return collateralAssetJurisdiction;
    }

    public void setCollateralAssetDocumentReference(org.museframework.bian.classes.Object collateralAssetDocumentReference) {
        this.collateralAssetDocumentReference = collateralAssetDocumentReference;
    }

    public org.museframework.bian.classes.Object getCollateralAssetDocumentReference() {
        return collateralAssetDocumentReference;
    }

    public void setCollateralAssetDocumentType(String collateralAssetDocumentType) {
        this.collateralAssetDocumentType = collateralAssetDocumentType;
    }

    public String getCollateralAssetDocumentType() {
        return collateralAssetDocumentType;
    }

    public void setCollateralAssetInsuranceReference(org.museframework.bian.classes.Object collateralAssetInsuranceReference) {
        this.collateralAssetInsuranceReference = collateralAssetInsuranceReference;
    }

    public org.museframework.bian.classes.Object getCollateralAssetInsuranceReference() {
        return collateralAssetInsuranceReference;
    }

    public void setCollateralAssetPledgedDate(String collateralAssetPledgedDate) {
        this.collateralAssetPledgedDate = collateralAssetPledgedDate;
    }

    public String getCollateralAssetPledgedDate() {
        return collateralAssetPledgedDate;
    }

    public void setCollateralAssetValuationHistory(String collateralAssetValuationHistory) {
        this.collateralAssetValuationHistory = collateralAssetValuationHistory;
    }

    public String getCollateralAssetValuationHistory() {
        return collateralAssetValuationHistory;
    }

    public void setCollateralAssetValuationSchedule(String collateralAssetValuationSchedule) {
        this.collateralAssetValuationSchedule = collateralAssetValuationSchedule;
    }

    public String getCollateralAssetValuationSchedule() {
        return collateralAssetValuationSchedule;
    }

    public void setCollateralAssetMaintenanceSchedule(String collateralAssetMaintenanceSchedule) {
        this.collateralAssetMaintenanceSchedule = collateralAssetMaintenanceSchedule;
    }

    public String getCollateralAssetMaintenanceSchedule() {
        return collateralAssetMaintenanceSchedule;
    }

    public void setCollateralAssetStatus(String collateralAssetStatus) {
        this.collateralAssetStatus = collateralAssetStatus;
    }

    public String getCollateralAssetStatus() {
        return collateralAssetStatus;
    }
}