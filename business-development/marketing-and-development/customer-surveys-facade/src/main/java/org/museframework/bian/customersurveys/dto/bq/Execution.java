/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.customersurveys.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Execution {
    /*The type of work task (e.g. host focus group session, issue questionnaire)*/
    @MetaField
    private String customerSurveyExecutionWorkTaskType;

    /*Description of the task performed, includes summary of activities as necessary*/
    @MetaField
    private String customerSurveyExecutionWorkTaskDescription;

    /*File of consolidated notes, forms and documents for the work task*/
    @MetaField
    private String customerSurveyExecutionWorkTaskWorkProducts;

    /*Reference to associated documents (e.g. required legal disclosures for participants)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Details of the outcome or result of the work task - typically the captured survey response and any related feedback*/
    @MetaField
    private String customerSurveyExecutionWorkTaskResult;

    /*The date-time the customer survey execution*/
    @MetaField
    private String customerSurveyExecutionWorkTaskDate_Time;

    public void setCustomerSurveyExecutionWorkTaskType(String customerSurveyExecutionWorkTaskType) {
        this.customerSurveyExecutionWorkTaskType = customerSurveyExecutionWorkTaskType;
    }

    public String getCustomerSurveyExecutionWorkTaskType() {
        return customerSurveyExecutionWorkTaskType;
    }

    public void setCustomerSurveyExecutionWorkTaskDescription(String customerSurveyExecutionWorkTaskDescription) {
        this.customerSurveyExecutionWorkTaskDescription = customerSurveyExecutionWorkTaskDescription;
    }

    public String getCustomerSurveyExecutionWorkTaskDescription() {
        return customerSurveyExecutionWorkTaskDescription;
    }

    public void setCustomerSurveyExecutionWorkTaskWorkProducts(String customerSurveyExecutionWorkTaskWorkProducts) {
        this.customerSurveyExecutionWorkTaskWorkProducts = customerSurveyExecutionWorkTaskWorkProducts;
    }

    public String getCustomerSurveyExecutionWorkTaskWorkProducts() {
        return customerSurveyExecutionWorkTaskWorkProducts;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setCustomerSurveyExecutionWorkTaskResult(String customerSurveyExecutionWorkTaskResult) {
        this.customerSurveyExecutionWorkTaskResult = customerSurveyExecutionWorkTaskResult;
    }

    public String getCustomerSurveyExecutionWorkTaskResult() {
        return customerSurveyExecutionWorkTaskResult;
    }

    public void setCustomerSurveyExecutionWorkTaskDate_Time(String customerSurveyExecutionWorkTaskDate_Time) {
        this.customerSurveyExecutionWorkTaskDate_Time = customerSurveyExecutionWorkTaskDate_Time;
    }

    public String getCustomerSurveyExecutionWorkTaskDate_Time() {
        return customerSurveyExecutionWorkTaskDate_Time;
    }
}