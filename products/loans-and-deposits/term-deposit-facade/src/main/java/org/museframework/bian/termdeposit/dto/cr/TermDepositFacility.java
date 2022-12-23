/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Term Deposit. */
package org.museframework.bian.termdeposit.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class TermDepositFacility {
    /*Reference to the corporate deposit account product instance*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productInstanceReference;

    /*The associated account number in any suitable format (e.g. IBAN)*/
    @MetaField
    private String termDepositAccountNumber;

    /*Reference to the account primary party/owner*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*Bank branch associated with the account for booking purposes*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object bankBranchLocationReference;

    /*The type of corporate deposit account (e.g. checking, student, small business)*/
    @MetaField
    private String accountType;

    /*The primary account currency*/
    @MetaField
    private String accountCurrency;

    /*Reference identifier linking the account to appropriate tax handling*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object taxReference;

    /*The definition of an applicable entitlement option*/
    @MetaField
    private String entitlementOptionDefinition;

    /*The setting for the entitlement option*/
    @MetaField
    private String entitlementOptionSetting;

    /*The definition of an applicable restriction option*/
    @MetaField
    private String restrictionOptionDefinition;

    /*The setting for the restriction option*/
    @MetaField
    private String restrictionOptionSetting;

    /*Definition of the associations to the account*/
    @MetaField
    private String associations;

    /*The type of association (e.g. guarantor, co-signer)*/
    @MetaField
    private String associationType;

    /*Description of the role, obligations or entitlements of the associated party*/
    @MetaField
    private String associationObligationEntitlement;

    /*Reference to the associated party*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object associationReference;

    /*Definition of the associations to the account*/
    @MetaField
    private String linkedAccounts;

    /*The type and purpose for the link*/
    @MetaField
    private String linkType;

    /*Details of the linked account*/
    @MetaField
    private String accountDetails;

    /*Position limits that are maintained by the account*/
    @MetaField
    private String positionLimits;

    /*The type of position maintained for the account (e.g. transaction credit/debit, netting, position)*/
    @MetaField
    private String positionLimitType;

    /*The position definition, associated limit settings and rules*/
    @MetaField
    private String positionLimitSettings;

    /*The corporate deposit calculated position*/
    @MetaField
    private String positionLimitValue;

    /*Key dates associated with the account (e.g. opening date, closing date)*/
    @MetaField
    private String dateType;

    /*Value of the date type*/
    @MetaField
    private String date;

    /*The schedule for generating product statements to schedule*/
    @MetaField
    private String statementsSchedule;

    /*The types of scheduled statement (e.g. balance/mini-statement/annual)*/
    @MetaField
    private String statementType;

    /*The types of transactions and transaction details to be included*/
    @MetaField
    private String statementTransactionType;

    /*The reporting period covered by the statement*/
    @MetaField
    private String statementPeriod;

    /*The statement content*/
    @MetaField
    private String statementReport;

    public void setProductInstanceReference(org.museframework.bian.classes.Object productInstanceReference) {
        this.productInstanceReference = productInstanceReference;
    }

    public org.museframework.bian.classes.Object getProductInstanceReference() {
        return productInstanceReference;
    }

    public void setTermDepositAccountNumber(String termDepositAccountNumber) {
        this.termDepositAccountNumber = termDepositAccountNumber;
    }

    public String getTermDepositAccountNumber() {
        return termDepositAccountNumber;
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

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountCurrency(String accountCurrency) {
        this.accountCurrency = accountCurrency;
    }

    public String getAccountCurrency() {
        return accountCurrency;
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

    public void setAssociations(String associations) {
        this.associations = associations;
    }

    public String getAssociations() {
        return associations;
    }

    public void setAssociationType(String associationType) {
        this.associationType = associationType;
    }

    public String getAssociationType() {
        return associationType;
    }

    public void setAssociationObligationEntitlement(String associationObligationEntitlement) {
        this.associationObligationEntitlement = associationObligationEntitlement;
    }

    public String getAssociationObligationEntitlement() {
        return associationObligationEntitlement;
    }

    public void setAssociationReference(org.museframework.bian.classes.Object associationReference) {
        this.associationReference = associationReference;
    }

    public org.museframework.bian.classes.Object getAssociationReference() {
        return associationReference;
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

    public void setStatementsSchedule(String statementsSchedule) {
        this.statementsSchedule = statementsSchedule;
    }

    public String getStatementsSchedule() {
        return statementsSchedule;
    }

    public void setStatementType(String statementType) {
        this.statementType = statementType;
    }

    public String getStatementType() {
        return statementType;
    }

    public void setStatementTransactionType(String statementTransactionType) {
        this.statementTransactionType = statementTransactionType;
    }

    public String getStatementTransactionType() {
        return statementTransactionType;
    }

    public void setStatementPeriod(String statementPeriod) {
        this.statementPeriod = statementPeriod;
    }

    public String getStatementPeriod() {
        return statementPeriod;
    }

    public void setStatementReport(String statementReport) {
        this.statementReport = statementReport;
    }

    public String getStatementReport() {
        return statementReport;
    }
}