/*Maintain an inventory or holding of some resource and make assignments/allocations as requested  within Collateral Allocation Management. 
Example: Track the inventory and administer the distribution of central cash holdings throughout the branch & ATM network.*/
package org.museframework.bian.colallman.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.CollateralAssetAllocation
@MetaDto
public class CollateralAssetAllocation {
    /*Reference to the title owner of the collateral asset*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*The type of asset (e.g. building, machinery, inventory, financial instrument, art)*/
    @MetaField(0)
    private String collateralAssetType;

    /*Reference to the collateral item (e.g. address, account reference)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object collateralAssetReference;

    /*Description of significant details and properties of the asset*/
    @MetaField(0)
    private String collateralAssetDescription;

    /*Reference to the administration record of the asset item*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object collateralAssetAdministrationInstanceReference;

    /*A general status indicator for the asset (can cover multiple properties as needed)*/
    @MetaField(0)
    private String collateralAssetStatus;

    /*The current and historical valuation of the asset*/
    @MetaField(0)
    private String collateralAssetValuation;

    /*A record of past and current allocations of the collateral asset*/
    @MetaField(0)
    private String collateralAssetAllocationProfile;

    /*The date of the last valuation (and next planned valuation)*/
    @MetaField(0)
    private String collateralAssetValuationDate;

    /*The ratio of the valuation that can be used as collateral (depends on liquidity, title, etc.)*/
    @MetaField(0)
    private String collateralAssetLoantoValueRatio;

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setCollateralAssetType(String collateralAssetType) {
        this.collateralAssetType = collateralAssetType;
    }

    public String getCollateralAssetType() {
        return collateralAssetType;
    }

    public void setCollateralAssetReference(org.museframework.bian.classes.Object collateralAssetReference) {
        this.collateralAssetReference = collateralAssetReference;
    }

    public org.museframework.bian.classes.Object getCollateralAssetReference() {
        return collateralAssetReference;
    }

    public void setCollateralAssetDescription(String collateralAssetDescription) {
        this.collateralAssetDescription = collateralAssetDescription;
    }

    public String getCollateralAssetDescription() {
        return collateralAssetDescription;
    }

    public void setCollateralAssetAdministrationInstanceReference(org.museframework.bian.classes.Object collateralAssetAdministrationInstanceReference) {
        this.collateralAssetAdministrationInstanceReference = collateralAssetAdministrationInstanceReference;
    }

    public org.museframework.bian.classes.Object getCollateralAssetAdministrationInstanceReference() {
        return collateralAssetAdministrationInstanceReference;
    }

    public void setCollateralAssetStatus(String collateralAssetStatus) {
        this.collateralAssetStatus = collateralAssetStatus;
    }

    public String getCollateralAssetStatus() {
        return collateralAssetStatus;
    }

    public void setCollateralAssetValuation(String collateralAssetValuation) {
        this.collateralAssetValuation = collateralAssetValuation;
    }

    public String getCollateralAssetValuation() {
        return collateralAssetValuation;
    }

    public void setCollateralAssetAllocationProfile(String collateralAssetAllocationProfile) {
        this.collateralAssetAllocationProfile = collateralAssetAllocationProfile;
    }

    public String getCollateralAssetAllocationProfile() {
        return collateralAssetAllocationProfile;
    }

    public void setCollateralAssetValuationDate(String collateralAssetValuationDate) {
        this.collateralAssetValuationDate = collateralAssetValuationDate;
    }

    public String getCollateralAssetValuationDate() {
        return collateralAssetValuationDate;
    }

    public void setCollateralAssetLoantoValueRatio(String collateralAssetLoantoValueRatio) {
        this.collateralAssetLoantoValueRatio = collateralAssetLoantoValueRatio;
    }

    public String getCollateralAssetLoantoValueRatio() {
        return collateralAssetLoantoValueRatio;
    }
}