/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Credit Facility. */
package org.museframework.bian.creditfacility.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CreditLineFacility {
    /*Reference to the credit facility product instance*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productInstanceReference;

    /*The associated credit facility account number in any suitable format*/
    @MetaField(0)
    private String creditFacilityNumber;

    /*Reference to the account primary party/owner*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*The legal entity reference for the borrower, likely to be the same as the corporate customer*/
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

    /*Reference to collections/delinquency processing made against the credit facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object delinquencyCollectionReference;

    /*Bank branch associated with the facility for booking purposes*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object bankBranchLocationReference;

    /*Bank accounting unit associated with the facility for booking purposes*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object bankAccountingUnitReference;

    /*The specific type of credit facility (e.g. term, revolving, letter of credit, retail)*/
    @MetaField(0)
    private String creditFacilityType;

    /*The amount of the credit facility*/
    @MetaField(0)
    private String creditFacilityAmount;

    /*The currency for the facility*/
    @MetaField(0)
    private String creditFacilityCurrency;

    /*The rate type to be applied to the credit facility*/
    @MetaField(0)
    private String creditFacilityRateType;

    /*The applicable rate for the credit facility*/
    @MetaField(0)
    private String creditFacilityApplicableRate;

    /*The type of repayment arrangement in place (e.g. structured, revolving)*/
    @MetaField(0)
    private String repaymentType;

    /*The type of interest to be applied (e.g. prime plus)*/
    @MetaField(0)
    private String interestType;

    /*The accrual method applied to interest calculations*/
    @MetaField(0)
    private String interestAccrualMethod;

    /*The origination date for the credit facility*/
    @MetaField(0)
    private String creditFacilityOriginationDate;

    /*The planned maturity date of the credit facility*/
    @MetaField(0)
    private String creditFacilityMaturityDate;

    /*Reference to allocated collateral*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object collateralReference;

    /*The collateral value applied to the credit facility loan*/
    @MetaField(0)
    private String collateralAllocation;

    /*Reference identifier linking the account to appropriate tax handling*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object taxReference;

    /*Access terms that apply (e.g. allowed drawdown terms, repayment)*/
    @MetaField(0)
    private String creditFacilityAccessTerms;

    /*Details the one or more underlying loans made against the facility*/
    @MetaField(0)
    private String creditFacilityUnderlyingDrawdown;

    /*Reference to the underlying loan*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object drawdownReference;

    /*Record of the underlying loan details*/
    @MetaField(0)
    private String drawdownRecord;

    /*The underlying loan transaction details*/
    @MetaField(0)
    private String drawdownLoanTransaction;

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

    /*Definition of the involved parties or associations to the facility*/
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

    /*The schedule for repayments*/
    @MetaField(0)
    private String creditFacilityRepaymentSchedule;

    /*A statement maintained tracking repayments*/
    @MetaField(0)
    private String stagedRepaymentStatement;

    /*A record of customer correspondence/feedback*/
    @MetaField(0)
    private String customerCommentary;

    /*The outstanding balance available for the credit facility*/
    @MetaField(0)
    private String creditFacilityOutstandingBalance;

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

    public void setCreditFacilityNumber(String creditFacilityNumber) {
        this.creditFacilityNumber = creditFacilityNumber;
    }

    public String getCreditFacilityNumber() {
        return creditFacilityNumber;
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

    public void setCreditFacilityType(String creditFacilityType) {
        this.creditFacilityType = creditFacilityType;
    }

    public String getCreditFacilityType() {
        return creditFacilityType;
    }

    public void setCreditFacilityAmount(String creditFacilityAmount) {
        this.creditFacilityAmount = creditFacilityAmount;
    }

    public String getCreditFacilityAmount() {
        return creditFacilityAmount;
    }

    public void setCreditFacilityCurrency(String creditFacilityCurrency) {
        this.creditFacilityCurrency = creditFacilityCurrency;
    }

    public String getCreditFacilityCurrency() {
        return creditFacilityCurrency;
    }

    public void setCreditFacilityRateType(String creditFacilityRateType) {
        this.creditFacilityRateType = creditFacilityRateType;
    }

    public String getCreditFacilityRateType() {
        return creditFacilityRateType;
    }

    public void setCreditFacilityApplicableRate(String creditFacilityApplicableRate) {
        this.creditFacilityApplicableRate = creditFacilityApplicableRate;
    }

    public String getCreditFacilityApplicableRate() {
        return creditFacilityApplicableRate;
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

    public void setCreditFacilityOriginationDate(String creditFacilityOriginationDate) {
        this.creditFacilityOriginationDate = creditFacilityOriginationDate;
    }

    public String getCreditFacilityOriginationDate() {
        return creditFacilityOriginationDate;
    }

    public void setCreditFacilityMaturityDate(String creditFacilityMaturityDate) {
        this.creditFacilityMaturityDate = creditFacilityMaturityDate;
    }

    public String getCreditFacilityMaturityDate() {
        return creditFacilityMaturityDate;
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

    public void setCreditFacilityAccessTerms(String creditFacilityAccessTerms) {
        this.creditFacilityAccessTerms = creditFacilityAccessTerms;
    }

    public String getCreditFacilityAccessTerms() {
        return creditFacilityAccessTerms;
    }

    public void setCreditFacilityUnderlyingDrawdown(String creditFacilityUnderlyingDrawdown) {
        this.creditFacilityUnderlyingDrawdown = creditFacilityUnderlyingDrawdown;
    }

    public String getCreditFacilityUnderlyingDrawdown() {
        return creditFacilityUnderlyingDrawdown;
    }

    public void setDrawdownReference(org.museframework.bian.classes.Object drawdownReference) {
        this.drawdownReference = drawdownReference;
    }

    public org.museframework.bian.classes.Object getDrawdownReference() {
        return drawdownReference;
    }

    public void setDrawdownRecord(String drawdownRecord) {
        this.drawdownRecord = drawdownRecord;
    }

    public String getDrawdownRecord() {
        return drawdownRecord;
    }

    public void setDrawdownLoanTransaction(String drawdownLoanTransaction) {
        this.drawdownLoanTransaction = drawdownLoanTransaction;
    }

    public String getDrawdownLoanTransaction() {
        return drawdownLoanTransaction;
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

    public void setCreditFacilityRepaymentSchedule(String creditFacilityRepaymentSchedule) {
        this.creditFacilityRepaymentSchedule = creditFacilityRepaymentSchedule;
    }

    public String getCreditFacilityRepaymentSchedule() {
        return creditFacilityRepaymentSchedule;
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

    public void setCreditFacilityOutstandingBalance(String creditFacilityOutstandingBalance) {
        this.creditFacilityOutstandingBalance = creditFacilityOutstandingBalance;
    }

    public String getCreditFacilityOutstandingBalance() {
        return creditFacilityOutstandingBalance;
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