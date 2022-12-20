/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.fraudresolution.dto.bq;

public class CaseResolution extends org.museframework.bian.classes.CaseResolution {
    /*Record sets out, defines and assigns resolution tasks*/
    private String fraudCaseResolutionRecord;

    /*Employee and or business unit responsible for the resolution*/
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*Reference to all correspondence (e.g. confirmation messages sent to involved parties, includes internal and external legal/law enforcement authorities)*/
    private org.museframework.bian.classes.Object correspondenceReference;

    /*Reference to any associated adjustment or chargeback transaction initiated by the resolution*/
    private org.museframework.bian.classes.Object adjustmentChargebackReference;

    /*Reference to the consortia notification transaction for fraud resultion activity*/
    private org.museframework.bian.classes.Object consortiaReportingInstanceReference;

    /*The document reference for associated documents*/
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Reference to any financial adjustments that are made during the case*/
    private org.museframework.bian.classes.Object paymentOrderReference;

    public void setFraudCaseResolutionRecord(String fraudCaseResolutionRecord) {
        this.fraudCaseResolutionRecord = fraudCaseResolutionRecord;
    }

    public String getFraudCaseResolutionRecord() {
        return fraudCaseResolutionRecord;
    }

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setCorrespondenceReference(org.museframework.bian.classes.Object correspondenceReference) {
        this.correspondenceReference = correspondenceReference;
    }

    public org.museframework.bian.classes.Object getCorrespondenceReference() {
        return correspondenceReference;
    }

    public void setAdjustmentChargebackReference(org.museframework.bian.classes.Object adjustmentChargebackReference) {
        this.adjustmentChargebackReference = adjustmentChargebackReference;
    }

    public org.museframework.bian.classes.Object getAdjustmentChargebackReference() {
        return adjustmentChargebackReference;
    }

    public void setConsortiaReportingInstanceReference(org.museframework.bian.classes.Object consortiaReportingInstanceReference) {
        this.consortiaReportingInstanceReference = consortiaReportingInstanceReference;
    }

    public org.museframework.bian.classes.Object getConsortiaReportingInstanceReference() {
        return consortiaReportingInstanceReference;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setPaymentOrderReference(org.museframework.bian.classes.Object paymentOrderReference) {
        this.paymentOrderReference = paymentOrderReference;
    }

    public org.museframework.bian.classes.Object getPaymentOrderReference() {
        return paymentOrderReference;
    }
}