/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Delinquent Account Handling. */
package org.museframework.bian.delacchan.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class DelinquentAccountProcedure {
    /*The linked credit product reference*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productInstanceReference;

    /*The associated account number in any suitable format (e.g. IBAN)*/
    @MetaField(0)
    private String productAccountNumber;

    /*The type of product*/
    @MetaField(0)
    private String productandServiceType;

    /*Reference to the account primary party/owner*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*Bank branch associated with the account for booking purposes*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object bankBranchLocationReference;

    /*Reference to an issued device associated with the facility (such as a card or key fob)*/
    @MetaField(0)
    private String issuedDevice;

    /*The primary account currency*/
    @MetaField(0)
    private String accountCurrency;

    /*Reference identifier linking the account to appropriate tax handling*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object taxReference;

    /*Definition of the associations to the account*/
    @MetaField(0)
    private String associations;

    /*The type of association (e.g. guarantor, co-signer)*/
    @MetaField(0)
    private String associationType;

    /*Description of the role, obligations or entitlements of the associated party*/
    @MetaField(0)
    private String associationObligationEntitlement;

    /*Reference to the associated party*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object associationReference;

    /*Definition of the associations to the account*/
    @MetaField(0)
    private String linkedAccounts;

    /*The type and purpose for the link*/
    @MetaField(0)
    private String linkType;

    /*Details of the linked account*/
    @MetaField(0)
    private String accountDetails;

    /*Position limits that are maintained by the account*/
    @MetaField(0)
    private String positionLimits;

    /*The type of position maintained for the account (e.g. transaction credit/debit, netting, position)*/
    @MetaField(0)
    private String positionLimitType;

    /*The position definition, associated limit settings and rules*/
    @MetaField(0)
    private String positionLimitSettings;

    /*The current calculated position*/
    @MetaField(0)
    private String positionLimitValue;

    /*Reference to the customer's collateral holdings and allocations*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object collateralAssetAllocationInstanceReference;

    /*Record of collateral applied to the customer products*/
    @MetaField(0)
    private String collateralAssetAllocationProfile;

    /*Key dates associated with the account (e.g. opening date, closing date)*/
    @MetaField(0)
    private String dateType;

    /*Value of the date type*/
    @MetaField(0)
    private String date;

    /*Customer billing transactions (and associated payments)*/
    @MetaField(0)
    private String billingTransactions;

    /*Reference to individual transactions*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object billingTransactionReference;

    /*Payments deposited to the account*/
    @MetaField(0)
    private String paymentTransactions;

    /*Reference to individual transactions*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object paymentTransactionReference;

    /*Product execution transactions (payments)*/
    @MetaField(0)
    private String productTransactions;

    /*Reference to individual transactions*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productTransactionReference;

    /*Interest accrued against the account*/
    @MetaField(0)
    private String interestTransactions;

    /*Reference to individual transactions*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object interestTransactionReference;

    /*Fees applied against the account*/
    @MetaField(0)
    private String feeTransactions;

    /*Reference to individual transactions*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object feeTransactionReference;

    /*Reference to a linked credit plan if applicable*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object creditPlanReference;

    /*The credit plan type (e.g. (Cash, Credit, Charge, Balance Transfer, Promotions, Securitized, etc.)*/
    @MetaField(0)
    private String creditPlanType;

    /*Details the schedule of actions to be applied to the delinquent account*/
    @MetaField(0)
    private String delinquentAccountProcessingSchedule;

    public void setProductInstanceReference(org.museframework.bian.classes.Object productInstanceReference) {
        this.productInstanceReference = productInstanceReference;
    }

    public org.museframework.bian.classes.Object getProductInstanceReference() {
        return productInstanceReference;
    }

    public void setProductAccountNumber(String productAccountNumber) {
        this.productAccountNumber = productAccountNumber;
    }

    public String getProductAccountNumber() {
        return productAccountNumber;
    }

    public void setProductandServiceType(String productandServiceType) {
        this.productandServiceType = productandServiceType;
    }

    public String getProductandServiceType() {
        return productandServiceType;
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

    public void setIssuedDevice(String issuedDevice) {
        this.issuedDevice = issuedDevice;
    }

    public String getIssuedDevice() {
        return issuedDevice;
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

    public void setCollateralAssetAllocationInstanceReference(org.museframework.bian.classes.Object collateralAssetAllocationInstanceReference) {
        this.collateralAssetAllocationInstanceReference = collateralAssetAllocationInstanceReference;
    }

    public org.museframework.bian.classes.Object getCollateralAssetAllocationInstanceReference() {
        return collateralAssetAllocationInstanceReference;
    }

    public void setCollateralAssetAllocationProfile(String collateralAssetAllocationProfile) {
        this.collateralAssetAllocationProfile = collateralAssetAllocationProfile;
    }

    public String getCollateralAssetAllocationProfile() {
        return collateralAssetAllocationProfile;
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

    public void setBillingTransactions(String billingTransactions) {
        this.billingTransactions = billingTransactions;
    }

    public String getBillingTransactions() {
        return billingTransactions;
    }

    public void setBillingTransactionReference(org.museframework.bian.classes.Object billingTransactionReference) {
        this.billingTransactionReference = billingTransactionReference;
    }

    public org.museframework.bian.classes.Object getBillingTransactionReference() {
        return billingTransactionReference;
    }

    public void setPaymentTransactions(String paymentTransactions) {
        this.paymentTransactions = paymentTransactions;
    }

    public String getPaymentTransactions() {
        return paymentTransactions;
    }

    public void setPaymentTransactionReference(org.museframework.bian.classes.Object paymentTransactionReference) {
        this.paymentTransactionReference = paymentTransactionReference;
    }

    public org.museframework.bian.classes.Object getPaymentTransactionReference() {
        return paymentTransactionReference;
    }

    public void setProductTransactions(String productTransactions) {
        this.productTransactions = productTransactions;
    }

    public String getProductTransactions() {
        return productTransactions;
    }

    public void setProductTransactionReference(org.museframework.bian.classes.Object productTransactionReference) {
        this.productTransactionReference = productTransactionReference;
    }

    public org.museframework.bian.classes.Object getProductTransactionReference() {
        return productTransactionReference;
    }

    public void setInterestTransactions(String interestTransactions) {
        this.interestTransactions = interestTransactions;
    }

    public String getInterestTransactions() {
        return interestTransactions;
    }

    public void setInterestTransactionReference(org.museframework.bian.classes.Object interestTransactionReference) {
        this.interestTransactionReference = interestTransactionReference;
    }

    public org.museframework.bian.classes.Object getInterestTransactionReference() {
        return interestTransactionReference;
    }

    public void setFeeTransactions(String feeTransactions) {
        this.feeTransactions = feeTransactions;
    }

    public String getFeeTransactions() {
        return feeTransactions;
    }

    public void setFeeTransactionReference(org.museframework.bian.classes.Object feeTransactionReference) {
        this.feeTransactionReference = feeTransactionReference;
    }

    public org.museframework.bian.classes.Object getFeeTransactionReference() {
        return feeTransactionReference;
    }

    public void setCreditPlanReference(org.museframework.bian.classes.Object creditPlanReference) {
        this.creditPlanReference = creditPlanReference;
    }

    public org.museframework.bian.classes.Object getCreditPlanReference() {
        return creditPlanReference;
    }

    public void setCreditPlanType(String creditPlanType) {
        this.creditPlanType = creditPlanType;
    }

    public String getCreditPlanType() {
        return creditPlanType;
    }

    public void setDelinquentAccountProcessingSchedule(String delinquentAccountProcessingSchedule) {
        this.delinquentAccountProcessingSchedule = delinquentAccountProcessingSchedule;
    }

    public String getDelinquentAccountProcessingSchedule() {
        return delinquentAccountProcessingSchedule;
    }
}