/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.procamexe.dto.bq;

public class Execution {
    /*The type of work task (e.g. execute campaign through mailshot)*/
    private String prospectCampaignProcedureWorkTaskType;

    /*Description of the task performed, includes summary of activities as necessary for reference*/
    private String prospectCampaignProcedureWorkTaskDescription;

    /*File of consolidated notes, forms and documents for the work task*/
    private String prospectCampaignProcedureWorkTaskWorkProducts;

    /*Reference to associated documents*/
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Details of the outcome or result of the work task - can be the identification of prospects that have expressed an interest in becoming a customer*/
    private String prospectCampaignProcedureWorkTaskResult;

    /*The date-time the prospect campaign execution task is processed*/
    private String prospectCampaignProcedureWorkTaskDate_Time;

    public void setProspectCampaignProcedureWorkTaskType(String prospectCampaignProcedureWorkTaskType) {
        this.prospectCampaignProcedureWorkTaskType = prospectCampaignProcedureWorkTaskType;
    }

    public String getProspectCampaignProcedureWorkTaskType() {
        return prospectCampaignProcedureWorkTaskType;
    }

    public void setProspectCampaignProcedureWorkTaskDescription(String prospectCampaignProcedureWorkTaskDescription) {
        this.prospectCampaignProcedureWorkTaskDescription = prospectCampaignProcedureWorkTaskDescription;
    }

    public String getProspectCampaignProcedureWorkTaskDescription() {
        return prospectCampaignProcedureWorkTaskDescription;
    }

    public void setProspectCampaignProcedureWorkTaskWorkProducts(String prospectCampaignProcedureWorkTaskWorkProducts) {
        this.prospectCampaignProcedureWorkTaskWorkProducts = prospectCampaignProcedureWorkTaskWorkProducts;
    }

    public String getProspectCampaignProcedureWorkTaskWorkProducts() {
        return prospectCampaignProcedureWorkTaskWorkProducts;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setProspectCampaignProcedureWorkTaskResult(String prospectCampaignProcedureWorkTaskResult) {
        this.prospectCampaignProcedureWorkTaskResult = prospectCampaignProcedureWorkTaskResult;
    }

    public String getProspectCampaignProcedureWorkTaskResult() {
        return prospectCampaignProcedureWorkTaskResult;
    }

    public void setProspectCampaignProcedureWorkTaskDate_Time(String prospectCampaignProcedureWorkTaskDate_Time) {
        this.prospectCampaignProcedureWorkTaskDate_Time = prospectCampaignProcedureWorkTaskDate_Time;
    }

    public String getProspectCampaignProcedureWorkTaskDate_Time() {
        return prospectCampaignProcedureWorkTaskDate_Time;
    }
}