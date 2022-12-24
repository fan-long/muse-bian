/*Maintain an inventory or holding of some resource and make assignments/allocations as requested  within Issued Device Administration. 
Example: Track the inventory and administer the distribution of central cash holdings throughout the branch & ATM network.*/
package org.museframework.bian.issdevadm.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.IssuedDeviceAllocation
@MetaDto
public class IssuedDeviceAllocation {
    /*Reference to the holder of the issued device*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*Linked products and services, there can be many*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productInstanceReference;

    /*The type of device allocated (used to reference assignment type)*/
    @MetaField
    private String issuedDeviceType;

    /*Access/usage entitlements, can be by product instance (e.g. value, location, frequency and duration access constraints)*/
    @MetaField
    private String associatedPermissions;

    /*The date the issued device is registered*/
    @MetaField
    private String issueDate;

    /*The refresh period for the issued device*/
    @MetaField
    private String validFrom_ToDate;

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setProductInstanceReference(org.museframework.bian.classes.Object productInstanceReference) {
        this.productInstanceReference = productInstanceReference;
    }

    public org.museframework.bian.classes.Object getProductInstanceReference() {
        return productInstanceReference;
    }

    public void setIssuedDeviceType(String issuedDeviceType) {
        this.issuedDeviceType = issuedDeviceType;
    }

    public String getIssuedDeviceType() {
        return issuedDeviceType;
    }

    public void setAssociatedPermissions(String associatedPermissions) {
        this.associatedPermissions = associatedPermissions;
    }

    public String getAssociatedPermissions() {
        return associatedPermissions;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setValidFrom_ToDate(String validFrom_ToDate) {
        this.validFrom_ToDate = validFrom_ToDate;
    }

    public String getValidFrom_ToDate() {
        return validFrom_ToDate;
    }
}