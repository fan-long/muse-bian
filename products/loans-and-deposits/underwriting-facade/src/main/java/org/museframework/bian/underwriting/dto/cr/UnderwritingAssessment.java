/*To test or assess an entity, possibly against some formal qualification or certification requirement within Underwriting. */
package org.museframework.bian.underwriting.dto.cr;

public class UnderwritingAssessment extends org.museframework.bian.classes.UnderwritingAssessment {
    /*Guidelines provided for applying for an underwriting decision - list submission requirements*/
    private String underwritingGuidelines;

    /*Outlines the employment details required*/
    private String requiredCustomerEmploymentHistoryDetails;

    /*Outlines the type of debt/asset details required*/
    private String requiredCustomerDebtAssetStatement;

    /*Outlines the required credit assessment details required*/
    private String requiredCustomerCreditAssessment;

    /*Outlines the details of collateral required*/
    private String requiredCollateralCoverage;

    /*Outlines the extent of the product usage history required*/
    private String requiredCustomerProductandServicePaymentHistory;

    /*Lists required documentation (e.g. for proof of identity, assets, collateral)*/
    private String requiredCustomerDocuments;

    /*…*/
    private String proposedTransactionDetails;

    /*The associated product instance for the underwriting decision*/
    private org.museframework.bian.classes.Object productInstanceReference;

    /*The proposed loan terms*/
    private String proposedLoanTerms;

    /*The proposed loan amount*/
    private String proposedLoanAmount;

    /*The purpose for the loan  (e.g. mortgage for primary residence/rental)*/
    private String loanPurpose;

    /*Reference to the applying customer*/
    private org.museframework.bian.classes.Object customerReference;

    /*Reference details known about the customer*/
    private org.museframework.bian.classes.Object customerReferenceDetails;

    /*Definition of the terms under which the customer eligible for the loan*/
    private String customerProductEligibilityTerms;

    /*The customer's employment record*/
    private String customerEmploymentHistory;

    /*The customers historical income statement (for individuals)*/
    private String customerIncomeStatement;

    /*Covers bank and known non-bank managed debts*/
    private String customerDebtStatement;

    /*Covers bank and known non-bank managed assets*/
    private String customerAssetStatement;

    /*Reference to the bank's credit assessment of the customer*/
    private String customerCreditAssessment;

    /*Reference to product reports covering payment history*/
    private String customerProductandServicePaymentHistory;

    /*Reference to the customers collateral holdings that are available*/
    private org.museframework.bian.classes.Object collateralItemReference;

    /*The type of collateral*/
    private String collateralItemType;

    /*The valuation of the collateral (applying the required loan to asset ratio)*/
    private String collateralItemValuation;

    /*Reference to associated documents of significance*/
    private org.museframework.bian.classes.Object documentReference;

    /*Details of the underwriting decision*/
    private String underwritingAssessmentDecision;

    /*Work documentation, forms and schedules produced and referenced during the task*/
    private String underwritingAssessmentWorkProduct;

    public void setUnderwritingGuidelines(String underwritingGuidelines) {
        this.underwritingGuidelines = underwritingGuidelines;
    }

    public String getUnderwritingGuidelines() {
        return underwritingGuidelines;
    }

    public void setRequiredCustomerEmploymentHistoryDetails(String requiredCustomerEmploymentHistoryDetails) {
        this.requiredCustomerEmploymentHistoryDetails = requiredCustomerEmploymentHistoryDetails;
    }

    public String getRequiredCustomerEmploymentHistoryDetails() {
        return requiredCustomerEmploymentHistoryDetails;
    }

    public void setRequiredCustomerDebtAssetStatement(String requiredCustomerDebtAssetStatement) {
        this.requiredCustomerDebtAssetStatement = requiredCustomerDebtAssetStatement;
    }

    public String getRequiredCustomerDebtAssetStatement() {
        return requiredCustomerDebtAssetStatement;
    }

    public void setRequiredCustomerCreditAssessment(String requiredCustomerCreditAssessment) {
        this.requiredCustomerCreditAssessment = requiredCustomerCreditAssessment;
    }

    public String getRequiredCustomerCreditAssessment() {
        return requiredCustomerCreditAssessment;
    }

    public void setRequiredCollateralCoverage(String requiredCollateralCoverage) {
        this.requiredCollateralCoverage = requiredCollateralCoverage;
    }

    public String getRequiredCollateralCoverage() {
        return requiredCollateralCoverage;
    }

    public void setRequiredCustomerProductandServicePaymentHistory(String requiredCustomerProductandServicePaymentHistory) {
        this.requiredCustomerProductandServicePaymentHistory = requiredCustomerProductandServicePaymentHistory;
    }

    public String getRequiredCustomerProductandServicePaymentHistory() {
        return requiredCustomerProductandServicePaymentHistory;
    }

    public void setRequiredCustomerDocuments(String requiredCustomerDocuments) {
        this.requiredCustomerDocuments = requiredCustomerDocuments;
    }

    public String getRequiredCustomerDocuments() {
        return requiredCustomerDocuments;
    }

    public void setProposedTransactionDetails(String proposedTransactionDetails) {
        this.proposedTransactionDetails = proposedTransactionDetails;
    }

    public String getProposedTransactionDetails() {
        return proposedTransactionDetails;
    }

    public void setProductInstanceReference(org.museframework.bian.classes.Object productInstanceReference) {
        this.productInstanceReference = productInstanceReference;
    }

    public org.museframework.bian.classes.Object getProductInstanceReference() {
        return productInstanceReference;
    }

    public void setProposedLoanTerms(String proposedLoanTerms) {
        this.proposedLoanTerms = proposedLoanTerms;
    }

    public String getProposedLoanTerms() {
        return proposedLoanTerms;
    }

    public void setProposedLoanAmount(String proposedLoanAmount) {
        this.proposedLoanAmount = proposedLoanAmount;
    }

    public String getProposedLoanAmount() {
        return proposedLoanAmount;
    }

    public void setLoanPurpose(String loanPurpose) {
        this.loanPurpose = loanPurpose;
    }

    public String getLoanPurpose() {
        return loanPurpose;
    }

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setCustomerReferenceDetails(org.museframework.bian.classes.Object customerReferenceDetails) {
        this.customerReferenceDetails = customerReferenceDetails;
    }

    public org.museframework.bian.classes.Object getCustomerReferenceDetails() {
        return customerReferenceDetails;
    }

    public void setCustomerProductEligibilityTerms(String customerProductEligibilityTerms) {
        this.customerProductEligibilityTerms = customerProductEligibilityTerms;
    }

    public String getCustomerProductEligibilityTerms() {
        return customerProductEligibilityTerms;
    }

    public void setCustomerEmploymentHistory(String customerEmploymentHistory) {
        this.customerEmploymentHistory = customerEmploymentHistory;
    }

    public String getCustomerEmploymentHistory() {
        return customerEmploymentHistory;
    }

    public void setCustomerIncomeStatement(String customerIncomeStatement) {
        this.customerIncomeStatement = customerIncomeStatement;
    }

    public String getCustomerIncomeStatement() {
        return customerIncomeStatement;
    }

    public void setCustomerDebtStatement(String customerDebtStatement) {
        this.customerDebtStatement = customerDebtStatement;
    }

    public String getCustomerDebtStatement() {
        return customerDebtStatement;
    }

    public void setCustomerAssetStatement(String customerAssetStatement) {
        this.customerAssetStatement = customerAssetStatement;
    }

    public String getCustomerAssetStatement() {
        return customerAssetStatement;
    }

    public void setCustomerCreditAssessment(String customerCreditAssessment) {
        this.customerCreditAssessment = customerCreditAssessment;
    }

    public String getCustomerCreditAssessment() {
        return customerCreditAssessment;
    }

    public void setCustomerProductandServicePaymentHistory(String customerProductandServicePaymentHistory) {
        this.customerProductandServicePaymentHistory = customerProductandServicePaymentHistory;
    }

    public String getCustomerProductandServicePaymentHistory() {
        return customerProductandServicePaymentHistory;
    }

    public void setCollateralItemReference(org.museframework.bian.classes.Object collateralItemReference) {
        this.collateralItemReference = collateralItemReference;
    }

    public org.museframework.bian.classes.Object getCollateralItemReference() {
        return collateralItemReference;
    }

    public void setCollateralItemType(String collateralItemType) {
        this.collateralItemType = collateralItemType;
    }

    public String getCollateralItemType() {
        return collateralItemType;
    }

    public void setCollateralItemValuation(String collateralItemValuation) {
        this.collateralItemValuation = collateralItemValuation;
    }

    public String getCollateralItemValuation() {
        return collateralItemValuation;
    }

    public void setDocumentReference(org.museframework.bian.classes.Object documentReference) {
        this.documentReference = documentReference;
    }

    public org.museframework.bian.classes.Object getDocumentReference() {
        return documentReference;
    }

    public void setUnderwritingAssessmentDecision(String underwritingAssessmentDecision) {
        this.underwritingAssessmentDecision = underwritingAssessmentDecision;
    }

    public String getUnderwritingAssessmentDecision() {
        return underwritingAssessmentDecision;
    }

    public void setUnderwritingAssessmentWorkProduct(String underwritingAssessmentWorkProduct) {
        this.underwritingAssessmentWorkProduct = underwritingAssessmentWorkProduct;
    }

    public String getUnderwritingAssessmentWorkProduct() {
        return underwritingAssessmentWorkProduct;
    }
}