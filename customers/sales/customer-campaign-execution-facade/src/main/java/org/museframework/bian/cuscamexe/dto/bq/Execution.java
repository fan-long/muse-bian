/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.cuscamexe.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Execution {
    /*The type of work task (e.g. execute campaign in contact center)*/
    @MetaField
    private String customerCampaignProcedureWorkTaskType;

    /*Description of the task performed, includes summary of activities as necessary for reference*/
    @MetaField
    private String customerCampaignProcedureWorkTaskDescription;

    /*File of consolidated notes, forms and documents for the work task*/
    @MetaField
    private String customerCampaignProcedureWorkTaskWorkProducts;

    /*Reference to associated documents*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Details of the outcome or result of the work task - can be the identification of a lead/opportunity*/
    @MetaField
    private String customerCampaignProcedureWorkTaskResult;

    /*The date-time the customer campaign execution task is processed*/
    @MetaField
    private String customerCampaignProcedureWorkTaskDate_Time;

    public void setCustomerCampaignProcedureWorkTaskType(String customerCampaignProcedureWorkTaskType) {
        this.customerCampaignProcedureWorkTaskType = customerCampaignProcedureWorkTaskType;
    }

    public String getCustomerCampaignProcedureWorkTaskType() {
        return customerCampaignProcedureWorkTaskType;
    }

    public void setCustomerCampaignProcedureWorkTaskDescription(String customerCampaignProcedureWorkTaskDescription) {
        this.customerCampaignProcedureWorkTaskDescription = customerCampaignProcedureWorkTaskDescription;
    }

    public String getCustomerCampaignProcedureWorkTaskDescription() {
        return customerCampaignProcedureWorkTaskDescription;
    }

    public void setCustomerCampaignProcedureWorkTaskWorkProducts(String customerCampaignProcedureWorkTaskWorkProducts) {
        this.customerCampaignProcedureWorkTaskWorkProducts = customerCampaignProcedureWorkTaskWorkProducts;
    }

    public String getCustomerCampaignProcedureWorkTaskWorkProducts() {
        return customerCampaignProcedureWorkTaskWorkProducts;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setCustomerCampaignProcedureWorkTaskResult(String customerCampaignProcedureWorkTaskResult) {
        this.customerCampaignProcedureWorkTaskResult = customerCampaignProcedureWorkTaskResult;
    }

    public String getCustomerCampaignProcedureWorkTaskResult() {
        return customerCampaignProcedureWorkTaskResult;
    }

    public void setCustomerCampaignProcedureWorkTaskDate_Time(String customerCampaignProcedureWorkTaskDate_Time) {
        this.customerCampaignProcedureWorkTaskDate_Time = customerCampaignProcedureWorkTaskDate_Time;
    }

    public String getCustomerCampaignProcedureWorkTaskDate_Time() {
        return customerCampaignProcedureWorkTaskDate_Time;
    }
}