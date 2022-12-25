/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Consumer Loan. */
package org.museframework.bian.consumerloan.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ConsumerLoanFacility {
    /*Reference to the loan product instance*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productInstanceReference;

    /*The associated loan account number in any suitable format*/
    @MetaField(0)
    private String consumerLoanNumber;

    /*Reference to the account primary party/owner*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*The legal entity reference for the borrower, likely to be the same as customer*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object partyReference;

    /*Reference to the associated customer agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerAgreementReference;

    /*Reference to an associated credit assessment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerCreditAssessmentReference;

    /*Reference to applicable insurance arrangements*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object insuranceReference;

    /*Reference to collections/delinquency processing made against the loan*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object delinquencyCollectionReference;

    /*Bank branch associated with the account for booking purposes*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object bankBranchLocationReference;

    /*Bank accounting unit associated with the account for booking purposes*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object bankAccountingUnitReference;

    /*The specific type of loan (e.g. term, revolving, evergreen)*/
    @MetaField(0)
    private String loanType;

    /*The amount of the loan*/
    @MetaField(0)
    private String loanAmount;

    /*The currency for the loan account*/
    @MetaField(0)
    private String loanCurrency;

    /*The rate type to be applied to the loan*/
    @MetaField(0)
    private String loanRateType;

    /*The applicable rate for the loan*/
    @MetaField(0)
    private String loanApplicableRate;

    /*The type of repayment arrangement in place (e.g. structured)*/
    @MetaField(0)
    private String repaymentType;

    /*The type of interest to be applied (e.g. prime plus)*/
    @MetaField(0)
    private String interestType;

    /*The accrual method applied to interest calculations*/
    @MetaField(0)
    private String interestAccrualMethod;

    /*The origination date for the loan*/
    @MetaField(0)
    private String loanOriginationDate;

    /*The planned maturity date of the loan*/
    @MetaField(0)
    private String loanMaturityDate;

    /*Reference to allocated collateral*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object collateralReference;

    /*The collateral value applied to the loan*/
    @MetaField(0)
    private String collateralAllocation;

    /*Reference identifier linking the account to appropriate tax handling*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object taxReference;

    /*Access terms that apply (e.g. allowed payments/withdrawals)*/
    @MetaField(0)
    private String loanAccessTerms;

    /*The definition of an applicable entitlement option*/
    @MetaField(0)
    private String entitlementOptionDefinition;

    /*The setting for the entitlement option*/
    @MetaField(0)
    private String entitlementOptionSetting;

    /*The definition of an applicable restriction option*/
    @MetaField(0)
    private String restrictionOptionDefinition;

    /*The setting for the restriction option*/
    @MetaField(0)
    private String restrictionOptionSetting;

    /*Definition of the involved parties or associations to the account*/
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

    /*The schedule for loan repayments*/
    @MetaField(0)
    private String loanRepaymentSchedule;

    /*A statement maintained tracking repayments*/
    @MetaField(0)
    private String stagedRepaymentStatement;

    /*A record of customer correspondence/feedback*/
    @MetaField(0)
    private String customerCommentary;

    /*The outstanding balance*/
    @MetaField(0)
    private String loanOutstandingBalance;

    /*Key dates associated with the account (e.g. opening date, closing date)*/
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

    public void setConsumerLoanNumber(String consumerLoanNumber) {
        this.consumerLoanNumber = consumerLoanNumber;
    }

    public String getConsumerLoanNumber() {
        return consumerLoanNumber;
    }

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setPartyReference(org.museframework.bian.classes.Object partyReference) {
        this.partyReference = partyReference;
    }

    public org.museframework.bian.classes.Object getPartyReference() {
        return partyReference;
    }

    public void setCustomerAgreementReference(org.museframework.bian.classes.Object customerAgreementReference) {
        this.customerAgreementReference = customerAgreementReference;
    }

    public org.museframework.bian.classes.Object getCustomerAgreementReference() {
        return customerAgreementReference;
    }

    public void setCustomerCreditAssessmentReference(org.museframework.bian.classes.Object customerCreditAssessmentReference) {
        this.customerCreditAssessmentReference = customerCreditAssessmentReference;
    }

    public org.museframework.bian.classes.Object getCustomerCreditAssessmentReference() {
        return customerCreditAssessmentReference;
    }

    public void setInsuranceReference(org.museframework.bian.classes.Object insuranceReference) {
        this.insuranceReference = insuranceReference;
    }

    public org.museframework.bian.classes.Object getInsuranceReference() {
        return insuranceReference;
    }

    public void setDelinquencyCollectionReference(org.museframework.bian.classes.Object delinquencyCollectionReference) {
        this.delinquencyCollectionReference = delinquencyCollectionReference;
    }

    public org.museframework.bian.classes.Object getDelinquencyCollectionReference() {
        return delinquencyCollectionReference;
    }

    public void setBankBranchLocationReference(org.museframework.bian.classes.Object bankBranchLocationReference) {
        this.bankBranchLocationReference = bankBranchLocationReference;
    }

    public org.museframework.bian.classes.Object getBankBranchLocationReference() {
        return bankBranchLocationReference;
    }

    public void setBankAccountingUnitReference(org.museframework.bian.classes.Object bankAccountingUnitReference) {
        this.bankAccountingUnitReference = bankAccountingUnitReference;
    }

    public org.museframework.bian.classes.Object getBankAccountingUnitReference() {
        return bankAccountingUnitReference;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getLoanAmount() {
        return loanAmount;
    }

    public void setLoanCurrency(String loanCurrency) {
        this.loanCurrency = loanCurrency;
    }

    public String getLoanCurrency() {
        return loanCurrency;
    }

    public void setLoanRateType(String loanRateType) {
        this.loanRateType = loanRateType;
    }

    public String getLoanRateType() {
        return loanRateType;
    }

    public void setLoanApplicableRate(String loanApplicableRate) {
        this.loanApplicableRate = loanApplicableRate;
    }

    public String getLoanApplicableRate() {
        return loanApplicableRate;
    }

    public void setRepaymentType(String repaymentType) {
        this.repaymentType = repaymentType;
    }

    public String getRepaymentType() {
        return repaymentType;
    }

    public void setInterestType(String interestType) {
        this.interestType = interestType;
    }

    public String getInterestType() {
        return interestType;
    }

    public void setInterestAccrualMethod(String interestAccrualMethod) {
        this.interestAccrualMethod = interestAccrualMethod;
    }

    public String getInterestAccrualMethod() {
        return interestAccrualMethod;
    }

    public void setLoanOriginationDate(String loanOriginationDate) {
        this.loanOriginationDate = loanOriginationDate;
    }

    public String getLoanOriginationDate() {
        return loanOriginationDate;
    }

    public void setLoanMaturityDate(String loanMaturityDate) {
        this.loanMaturityDate = loanMaturityDate;
    }

    public String getLoanMaturityDate() {
        return loanMaturityDate;
    }

    public void setCollateralReference(org.museframework.bian.classes.Object collateralReference) {
        this.collateralReference = collateralReference;
    }

    public org.museframework.bian.classes.Object getCollateralReference() {
        return collateralReference;
    }

    public void setCollateralAllocation(String collateralAllocation) {
        this.collateralAllocation = collateralAllocation;
    }

    public String getCollateralAllocation() {
        return collateralAllocation;
    }

    public void setTaxReference(org.museframework.bian.classes.Object taxReference) {
        this.taxReference = taxReference;
    }

    public org.museframework.bian.classes.Object getTaxReference() {
        return taxReference;
    }

    public void setLoanAccessTerms(String loanAccessTerms) {
        this.loanAccessTerms = loanAccessTerms;
    }

    public String getLoanAccessTerms() {
        return loanAccessTerms;
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

    public void setLoanRepaymentSchedule(String loanRepaymentSchedule) {
        this.loanRepaymentSchedule = loanRepaymentSchedule;
    }

    public String getLoanRepaymentSchedule() {
        return loanRepaymentSchedule;
    }

    public void setStagedRepaymentStatement(String stagedRepaymentStatement) {
        this.stagedRepaymentStatement = stagedRepaymentStatement;
    }

    public String getStagedRepaymentStatement() {
        return stagedRepaymentStatement;
    }

    public void setCustomerCommentary(String customerCommentary) {
        this.customerCommentary = customerCommentary;
    }

    public String getCustomerCommentary() {
        return customerCommentary;
    }

    public void setLoanOutstandingBalance(String loanOutstandingBalance) {
        this.loanOutstandingBalance = loanOutstandingBalance;
    }

    public String getLoanOutstandingBalance() {
        return loanOutstandingBalance;
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