/*Maintain the terms and conditions that apply to a commercial relationship within Sales Product.


*/
package org.museframework.bian.salesproduct.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ProductandServiceAgreement {
    /*Reference to the sales product instance, i.e. the 'wrapped' product by its sold reference name*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productInstanceReference;

    /*Reference to the underlying product instance - this is the fulfillment vehicle that has amended/augmented features to 'create' the sold product*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object underlyingProductInstanceReference;

    /*Reference to the product primary party/owner*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*Bank branch associated with the product for booking purposes*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object bankBranchLocationReference;

    /*Reference identifier linking the investment account to appropriate tax handling*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object taxReference;

    /*The definition of an applicable entitlement option  (note the corresponding attribute for the base product instance will cross reference the sales product instance for applicable entitlements terms)*/
    @MetaField(0)
    private String entitlementOptionDefinition;

    /*The setting for the entitlement option*/
    @MetaField(0)
    private String entitlementOptionSetting;

    /*The definition of an applicable restriction option (note the corresponding attribute for the base product instance will cross reference the sales product instance for applicable restrictions terms)*/
    @MetaField(0)
    private String restrictionOptionDefinition;

    /*The setting for the restriction option*/
    @MetaField(0)
    private String restrictionOptionSetting;

    /*Definition of the associations to the sales product - this is in addition to the base product if appropriate*/
    @MetaField(0)
    private String linkedAccounts;

    /*The type and purpose for the link (e.g. guarantor, sweep)*/
    @MetaField(0)
    private String linkType;

    /*Details of the linked account*/
    @MetaField(0)
    private String accountDetails;

    /*Position limits that are maintained for the sales product as an aspect of the operational terms*/
    @MetaField(0)
    private String positionLimits;

    /*The type of position maintained for the sales product (e.g. transaction credit/debit, netting, position)*/
    @MetaField(0)
    private String positionLimitType;

    /*The position definition, associated limit settings and rules*/
    @MetaField(0)
    private String positionLimitSettings;

    /*The current calculated position*/
    @MetaField(0)
    private String positionLimitValue;

    /*Key dates associated with the sales product (e.g. opening date, closing date)*/
    @MetaField(0)
    private String dateType;

    /*Value of the date type*/
    @MetaField(0)
    private String date;

    public void setProductInstanceReference(org.museframework.bian.classes.Object productInstanceReference) {
        this.productInstanceReference = productInstanceReference;
    }

    public org.museframework.bian.classes.Object getProductInstanceReference() {
        return productInstanceReference;
    }

    public void setUnderlyingProductInstanceReference(org.museframework.bian.classes.Object underlyingProductInstanceReference) {
        this.underlyingProductInstanceReference = underlyingProductInstanceReference;
    }

    public org.museframework.bian.classes.Object getUnderlyingProductInstanceReference() {
        return underlyingProductInstanceReference;
    }

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setBankBranchLocationReference(org.museframework.bian.classes.Object bankBranchLocationReference) {
        this.bankBranchLocationReference = bankBranchLocationReference;
    }

    public org.museframework.bian.classes.Object getBankBranchLocationReference() {
        return bankBranchLocationReference;
    }

    public void setTaxReference(org.museframework.bian.classes.Object taxReference) {
        this.taxReference = taxReference;
    }

    public org.museframework.bian.classes.Object getTaxReference() {
        return taxReference;
    }

    public void setEntitlementOptionDefinition(String entitlementOptionDefinition) {
        this.entitlementOptionDefinition = entitlementOptionDefinition;
    }

    public String getEntitlementOptionDefinition() {
        return entitlementOptionDefinition;
    }

    public void setEntitlementOptionSetting(String entitlementOptionSetting) {
        this.entitlementOptionSetting = entitlementOptionSetting;
    }

    public String getEntitlementOptionSetting() {
        return entitlementOptionSetting;
    }

    public void setRestrictionOptionDefinition(String restrictionOptionDefinition) {
        this.restrictionOptionDefinition = restrictionOptionDefinition;
    }

    public String getRestrictionOptionDefinition() {
        return restrictionOptionDefinition;
    }

    public void setRestrictionOptionSetting(String restrictionOptionSetting) {
        this.restrictionOptionSetting = restrictionOptionSetting;
    }

    public String getRestrictionOptionSetting() {
        return restrictionOptionSetting;
    }

    public void setLinkedAccounts(String linkedAccounts) {
        this.linkedAccounts = linkedAccounts;
    }

    public String getLinkedAccounts() {
        return linkedAccounts;
    }

    public void setLinkType(String linkType) {
        this.linkType = linkType;
    }

    public String getLinkType() {
        return linkType;
    }

    public void setAccountDetails(String accountDetails) {
        this.accountDetails = accountDetails;
    }

    public String getAccountDetails() {
        return accountDetails;
    }

    public void setPositionLimits(String positionLimits) {
        this.positionLimits = positionLimits;
    }

    public String getPositionLimits() {
        return positionLimits;
    }

    public void setPositionLimitType(String positionLimitType) {
        this.positionLimitType = positionLimitType;
    }

    public String getPositionLimitType() {
        return positionLimitType;
    }

    public void setPositionLimitSettings(String positionLimitSettings) {
        this.positionLimitSettings = positionLimitSettings;
    }

    public String getPositionLimitSettings() {
        return positionLimitSettings;
    }

    public void setPositionLimitValue(String positionLimitValue) {
        this.positionLimitValue = positionLimitValue;
    }

    public String getPositionLimitValue() {
        return positionLimitValue;
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