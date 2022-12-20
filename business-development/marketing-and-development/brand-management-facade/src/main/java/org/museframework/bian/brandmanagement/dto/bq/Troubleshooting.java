/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.brandmanagement.dto.bq;

public class Troubleshooting extends org.museframework.bian.classes.Troubleshooting {
    /*The type of event that threatens the brand (e.g. production issue, legal issue, employee action, marketing conflict)*/
    private String brandImpactEventType;

    /*The structured task/work plan followed to address the issue*/
    private String brandImpactTroubleshootingTask;

    /*Detailed description of the event and situation leading to the brand exposure*/
    private String brandImpactEventDescription;

    /*Schedule of actions taken to mitigate the event (plan and actual)*/
    private String brandImpactEventResponseSchedule;

    /*Actions taken to mitigate the event (e.g. press release, other communications, corrective/compensatory actions*/
    private String brandImpactEventResponseAction;

    /*File of consolidated notes, assessments, interview notes etc. and recommendations arising from the work*/
    private String brandImpactEventWorkProducts;

    /*Details of the outcome or result of the work task - assessing any lasting impact and evaluating the effectiveness of any mitigating actions*/
    private String brandImpactEventWorkTaskResult;

    /*Key dates associated with the troubleshooting activity*/
    private String brandImpactEventWorkTaskDate_Time;

    public void setBrandImpactEventType(String brandImpactEventType) {
        this.brandImpactEventType = brandImpactEventType;
    }

    public String getBrandImpactEventType() {
        return brandImpactEventType;
    }

    public void setBrandImpactTroubleshootingTask(String brandImpactTroubleshootingTask) {
        this.brandImpactTroubleshootingTask = brandImpactTroubleshootingTask;
    }

    public String getBrandImpactTroubleshootingTask() {
        return brandImpactTroubleshootingTask;
    }

    public void setBrandImpactEventDescription(String brandImpactEventDescription) {
        this.brandImpactEventDescription = brandImpactEventDescription;
    }

    public String getBrandImpactEventDescription() {
        return brandImpactEventDescription;
    }

    public void setBrandImpactEventResponseSchedule(String brandImpactEventResponseSchedule) {
        this.brandImpactEventResponseSchedule = brandImpactEventResponseSchedule;
    }

    public String getBrandImpactEventResponseSchedule() {
        return brandImpactEventResponseSchedule;
    }

    public void setBrandImpactEventResponseAction(String brandImpactEventResponseAction) {
        this.brandImpactEventResponseAction = brandImpactEventResponseAction;
    }

    public String getBrandImpactEventResponseAction() {
        return brandImpactEventResponseAction;
    }

    public void setBrandImpactEventWorkProducts(String brandImpactEventWorkProducts) {
        this.brandImpactEventWorkProducts = brandImpactEventWorkProducts;
    }

    public String getBrandImpactEventWorkProducts() {
        return brandImpactEventWorkProducts;
    }

    public void setBrandImpactEventWorkTaskResult(String brandImpactEventWorkTaskResult) {
        this.brandImpactEventWorkTaskResult = brandImpactEventWorkTaskResult;
    }

    public String getBrandImpactEventWorkTaskResult() {
        return brandImpactEventWorkTaskResult;
    }

    public void setBrandImpactEventWorkTaskDate_Time(String brandImpactEventWorkTaskDate_Time) {
        this.brandImpactEventWorkTaskDate_Time = brandImpactEventWorkTaskDate_Time;
    }

    public String getBrandImpactEventWorkTaskDate_Time() {
        return brandImpactEventWorkTaskDate_Time;
    }
}