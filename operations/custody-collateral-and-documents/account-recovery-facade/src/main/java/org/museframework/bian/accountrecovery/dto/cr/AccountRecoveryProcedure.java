/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Account Recovery. */
package org.museframework.bian.accountrecovery.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class AccountRecoveryProcedure {
    /*This is the type of recovery case (e.g. lapsed payment, collateral revaluation, credit)*/
    @MetaField
    private String accountRecoveryCaseType;

    /*Refers to the product instance associated with the account recovery case*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productInstanceReference;

    /*Refers to any new/replacement product established during the recovery/restructuring process*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object linkedProductInstanceReference;

    /*Reference to the customer associated with account recovery case - likely product 'owner'*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*The assigned customer relationship manager or unit for the case*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*Reference to the underlying account for the product instance being recovered*/
    @MetaField
    private String accountNumber;

    /*Location where the business is booked for reporting purposes*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object bankBranchLocationReference;

    /*Key dates associated with recovery (e.g. account open, account closing)*/
    @MetaField
    private String dateType;

    /*Key date time vale*/
    @MetaField
    private String date;

    /*Reference to involved and interested parties (e.g. guarantor/cosigner)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object involvedPartyReference;

    /*Details the involved party's role/association with the account/account holder*/
    @MetaField
    private String involvedPartyObligationEntitlement;

    /*The type of account being recovered (e.g. checking, mortgage)*/
    @MetaField
    private String accountType;

    /*The currency for the account*/
    @MetaField
    private String accountCurrency;

    /*Limits that are applied to the account  (e.g. transaction credit/debit, netting, position)*/
    @MetaField
    private String accountLimitType;

    /*Current position against limits*/
    @MetaField
    private String accountLimit;

    /*Any additional parties given access to the account  (allowed roles and actions against the product)*/
    @MetaField
    private String allowedAccess;

    /*Reference to a tax identifier associated with the customer/account for tax reporting*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object taxReference;

    /*Status of the recovery account  (e.g. pre-opened, active, dormant, pending for closing, blocked)*/
    @MetaField
    private String accountStatus;

    /*Lists the customer's collateral asset allocation status against different loan products known to the bank*/
    @MetaField
    private String collateralAssetAllocationProfile;

    /*The type of asset (e.g. building, machinery, inventory, financial instrument, art)*/
    @MetaField
    private String collateralType;

    /*Description of significant details and properties of the asset*/
    @MetaField
    private String collateralAssetDescription;

    /*Details of all transactions made against the account - not itemized here but referenced from fulfillment processing*/
    @MetaField
    private String transactionRecord;

    /*Work documentation, forms and schedules produced and referenced during the case*/
    @MetaField
    private String accountRecoveryCaseWorkProducts;

    /*Reference to documents referenced and generated through the case*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentReference;

    /*Record of customer correspondence/feedback associated with the account recovery process*/
    @MetaField
    private String customerCommentary;

    /*Target and actual dates for processing/resolution*/
    @MetaField
    private String accountRecoveryCaseResolutionSchedule;

    /*The status of the recovery case (e.g. in assessment, write-down, planning, negotiation, restructuring)*/
    @MetaField
    private String accountRecoveryCaseStatus;

    public void setAccountRecoveryCaseType(String accountRecoveryCaseType) {
        this.accountRecoveryCaseType = accountRecoveryCaseType;
    }

    public String getAccountRecoveryCaseType() {
        return accountRecoveryCaseType;
    }

    public void setProductInstanceReference(org.museframework.bian.classes.Object productInstanceReference) {
        this.productInstanceReference = productInstanceReference;
    }

    public org.museframework.bian.classes.Object getProductInstanceReference() {
        return productInstanceReference;
    }

    public void setLinkedProductInstanceReference(org.museframework.bian.classes.Object linkedProductInstanceReference) {
        this.linkedProductInstanceReference = linkedProductInstanceReference;
    }

    public org.museframework.bian.classes.Object getLinkedProductInstanceReference() {
        return linkedProductInstanceReference;
    }

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBankBranchLocationReference(org.museframework.bian.classes.Object bankBranchLocationReference) {
        this.bankBranchLocationReference = bankBranchLocationReference;
    }

    public org.museframework.bian.classes.Object getBankBranchLocationReference() {
        return bankBranchLocationReference;
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

    public void setInvolvedPartyReference(org.museframework.bian.classes.Object involvedPartyReference) {
        this.involvedPartyReference = involvedPartyReference;
    }

    public org.museframework.bian.classes.Object getInvolvedPartyReference() {
        return involvedPartyReference;
    }

    public void setInvolvedPartyObligationEntitlement(String involvedPartyObligationEntitlement) {
        this.involvedPartyObligationEntitlement = involvedPartyObligationEntitlement;
    }

    public String getInvolvedPartyObligationEntitlement() {
        return involvedPartyObligationEntitlement;
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

    public void setAccountLimitType(String accountLimitType) {
        this.accountLimitType = accountLimitType;
    }

    public String getAccountLimitType() {
        return accountLimitType;
    }

    public void setAccountLimit(String accountLimit) {
        this.accountLimit = accountLimit;
    }

    public String getAccountLimit() {
        return accountLimit;
    }

    public void setAllowedAccess(String allowedAccess) {
        this.allowedAccess = allowedAccess;
    }

    public String getAllowedAccess() {
        return allowedAccess;
    }

    public void setTaxReference(org.museframework.bian.classes.Object taxReference) {
        this.taxReference = taxReference;
    }

    public org.museframework.bian.classes.Object getTaxReference() {
        return taxReference;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setCollateralAssetAllocationProfile(String collateralAssetAllocationProfile) {
        this.collateralAssetAllocationProfile = collateralAssetAllocationProfile;
    }

    public String getCollateralAssetAllocationProfile() {
        return collateralAssetAllocationProfile;
    }

    public void setCollateralType(String collateralType) {
        this.collateralType = collateralType;
    }

    public String getCollateralType() {
        return collateralType;
    }

    public void setCollateralAssetDescription(String collateralAssetDescription) {
        this.collateralAssetDescription = collateralAssetDescription;
    }

    public String getCollateralAssetDescription() {
        return collateralAssetDescription;
    }

    public void setTransactionRecord(String transactionRecord) {
        this.transactionRecord = transactionRecord;
    }

    public String getTransactionRecord() {
        return transactionRecord;
    }

    public void setAccountRecoveryCaseWorkProducts(String accountRecoveryCaseWorkProducts) {
        this.accountRecoveryCaseWorkProducts = accountRecoveryCaseWorkProducts;
    }

    public String getAccountRecoveryCaseWorkProducts() {
        return accountRecoveryCaseWorkProducts;
    }

    public void setDocumentReference(org.museframework.bian.classes.Object documentReference) {
        this.documentReference = documentReference;
    }

    public org.museframework.bian.classes.Object getDocumentReference() {
        return documentReference;
    }

    public void setCustomerCommentary(String customerCommentary) {
        this.customerCommentary = customerCommentary;
    }

    public String getCustomerCommentary() {
        return customerCommentary;
    }

    public void setAccountRecoveryCaseResolutionSchedule(String accountRecoveryCaseResolutionSchedule) {
        this.accountRecoveryCaseResolutionSchedule = accountRecoveryCaseResolutionSchedule;
    }

    public String getAccountRecoveryCaseResolutionSchedule() {
        return accountRecoveryCaseResolutionSchedule;
    }

    public void setAccountRecoveryCaseStatus(String accountRecoveryCaseStatus) {
        this.accountRecoveryCaseStatus = accountRecoveryCaseStatus;
    }

    public String getAccountRecoveryCaseStatus() {
        return accountRecoveryCaseStatus;
    }
}