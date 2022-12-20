/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.corporatetreasury.dto.bq;

public class Securitization {
    /*Policies and guidelines that determine when and how asset securitization will be considered*/
    private String bankSecuritizationPoliciesandguidelines;

    /*Reference to a selected group of bank balance sheet assets that are bundled into a tranche for securitization*/
    private org.museframework.bian.classes.Object securitizationTrancheReference;

    /*The record of the bundled balance sheet items that are to be securitized*/
    private String securitizationTrancheRecord;

    /*Description of a response initiated by corporate treasury*/
    private String securitizationTask;

    public void setBankSecuritizationPoliciesandguidelines(String bankSecuritizationPoliciesandguidelines) {
        this.bankSecuritizationPoliciesandguidelines = bankSecuritizationPoliciesandguidelines;
    }

    public String getBankSecuritizationPoliciesandguidelines() {
        return bankSecuritizationPoliciesandguidelines;
    }

    public void setSecuritizationTrancheReference(org.museframework.bian.classes.Object securitizationTrancheReference) {
        this.securitizationTrancheReference = securitizationTrancheReference;
    }

    public org.museframework.bian.classes.Object getSecuritizationTrancheReference() {
        return securitizationTrancheReference;
    }

    public void setSecuritizationTrancheRecord(String securitizationTrancheRecord) {
        this.securitizationTrancheRecord = securitizationTrancheRecord;
    }

    public String getSecuritizationTrancheRecord() {
        return securitizationTrancheRecord;
    }

    public void setSecuritizationTask(String securitizationTask) {
        this.securitizationTask = securitizationTask;
    }

    public String getSecuritizationTask() {
        return securitizationTask;
    }
}