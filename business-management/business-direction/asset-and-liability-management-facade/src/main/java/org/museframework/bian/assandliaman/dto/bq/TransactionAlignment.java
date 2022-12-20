/*A collection of goals and objectives for the enterprise and its main divisions

Example: Increase marketshare*/
package org.museframework.bian.assandliaman.dto.bq;

public class TransactionAlignment {
    /*Business unit responsible for proposing the major transaction*/
    private org.museframework.bian.classes.Object businessUnitReference;

    /*Identifies the source or originator of the transaction*/
    private org.museframework.bian.classes.Object proposedTransactionOriginatorReference;

    /*The type of financial transaction (e.g. project finance, acquisition)*/
    private String proposedTransactionType;

    /*Any necessary details describing the purpose or reference properties of the transaction*/
    private String proposedTransactionDescription;

    /*The overall volume or value of the transaction included projected cash flows over the intended duration*/
    private String proposedTransactionAmount;

    /*An analysis of the financial risks associated with the transaction (e.g. market scenario based impact on P&L)*/
    private String proposedTransactionRiskAssessment;

    /*Reference to associated documents*/
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Reference to the correspondence generated for the transaction*/
    private org.museframework.bian.classes.Object correspondenceInstanceReference;

    /*Key dates and times associated with the financial transaction (e.g. proposal, decision by/expiry)*/
    private String dateType;

    /*Value of the date type*/
    private String date;

    /*The decision as to whether the transaction is approved within policy including any required changes as may be needed to comply*/
    private String assetAndLiabilityAlignmentAssessment;

    public void setBusinessUnitReference(org.museframework.bian.classes.Object businessUnitReference) {
        this.businessUnitReference = businessUnitReference;
    }

    public org.museframework.bian.classes.Object getBusinessUnitReference() {
        return businessUnitReference;
    }

    public void setProposedTransactionOriginatorReference(org.museframework.bian.classes.Object proposedTransactionOriginatorReference) {
        this.proposedTransactionOriginatorReference = proposedTransactionOriginatorReference;
    }

    public org.museframework.bian.classes.Object getProposedTransactionOriginatorReference() {
        return proposedTransactionOriginatorReference;
    }

    public void setProposedTransactionType(String proposedTransactionType) {
        this.proposedTransactionType = proposedTransactionType;
    }

    public String getProposedTransactionType() {
        return proposedTransactionType;
    }

    public void setProposedTransactionDescription(String proposedTransactionDescription) {
        this.proposedTransactionDescription = proposedTransactionDescription;
    }

    public String getProposedTransactionDescription() {
        return proposedTransactionDescription;
    }

    public void setProposedTransactionAmount(String proposedTransactionAmount) {
        this.proposedTransactionAmount = proposedTransactionAmount;
    }

    public String getProposedTransactionAmount() {
        return proposedTransactionAmount;
    }

    public void setProposedTransactionRiskAssessment(String proposedTransactionRiskAssessment) {
        this.proposedTransactionRiskAssessment = proposedTransactionRiskAssessment;
    }

    public String getProposedTransactionRiskAssessment() {
        return proposedTransactionRiskAssessment;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setCorrespondenceInstanceReference(org.museframework.bian.classes.Object correspondenceInstanceReference) {
        this.correspondenceInstanceReference = correspondenceInstanceReference;
    }

    public org.museframework.bian.classes.Object getCorrespondenceInstanceReference() {
        return correspondenceInstanceReference;
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

    public void setAssetAndLiabilityAlignmentAssessment(String assetAndLiabilityAlignmentAssessment) {
        this.assetAndLiabilityAlignmentAssessment = assetAndLiabilityAlignmentAssessment;
    }

    public String getAssetAndLiabilityAlignmentAssessment() {
        return assetAndLiabilityAlignmentAssessment;
    }
}