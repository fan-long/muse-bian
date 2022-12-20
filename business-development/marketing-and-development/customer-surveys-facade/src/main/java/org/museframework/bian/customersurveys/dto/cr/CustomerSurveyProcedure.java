/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Customer Surveys. */
package org.museframework.bian.customersurveys.dto.cr;

public class CustomerSurveyProcedure extends org.museframework.bian.classes.CustomerSurveyProcedure {
    /*The type or category of customer survey (e.g. questionnaire, in context solicitation, focus group)*/
    private String customerSurveyType;

    /*A description of the customer survey that clarifies the sought customer insights, survey mechanism and target reviewers*/
    private String customerSurveyDescription;

    /*Reference to the business unit responsible for the survey execution*/
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*Details of the deployment set-up/configuration of the customer survey*/
    private String customerSurveyProcedureSet_up;

    /*The customer survey version number used*/
    private String customerSurveyProcedureVersionNumber;

    /*The customer survey processing schedule, covering survey definition, reviewer selection, survey execution and subsequent analysis. Note for some integrated surveys this can be an on-going activity that attempts provides a constant stream of feedback relating to specific activities/services rather than a specific event*/
    private String customerSurveySchedule;

    /*Inventory record of any consumables that are to be used in the execution of the customer survey*/
    private String customerSurveyConsumablesInventory;

    /*The type of consumable item associated with the customer survey (e.g. questionnaire, participation incentive gift)*/
    private String customerSurveyConsumableType;

    /*The tracked inventory of the consumable item*/
    private String customerSurveyConsumableHolding;

    /*Key dates associated with the customer survey process (e.g. initiation date, version revision date, completion date)*/
    private String dateType;

    /*Value of the date type*/
    private String date;

    /*The result/impact of the customer survey (will include summary of customer survey activity, survey response data and survey findings presentation analysis)*/
    private String customerSurveyProcedureResult;

    public void setCustomerSurveyType(String customerSurveyType) {
        this.customerSurveyType = customerSurveyType;
    }

    public String getCustomerSurveyType() {
        return customerSurveyType;
    }

    public void setCustomerSurveyDescription(String customerSurveyDescription) {
        this.customerSurveyDescription = customerSurveyDescription;
    }

    public String getCustomerSurveyDescription() {
        return customerSurveyDescription;
    }

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setCustomerSurveyProcedureSet_up(String customerSurveyProcedureSet_up) {
        this.customerSurveyProcedureSet_up = customerSurveyProcedureSet_up;
    }

    public String getCustomerSurveyProcedureSet_up() {
        return customerSurveyProcedureSet_up;
    }

    public void setCustomerSurveyProcedureVersionNumber(String customerSurveyProcedureVersionNumber) {
        this.customerSurveyProcedureVersionNumber = customerSurveyProcedureVersionNumber;
    }

    public String getCustomerSurveyProcedureVersionNumber() {
        return customerSurveyProcedureVersionNumber;
    }

    public void setCustomerSurveySchedule(String customerSurveySchedule) {
        this.customerSurveySchedule = customerSurveySchedule;
    }

    public String getCustomerSurveySchedule() {
        return customerSurveySchedule;
    }

    public void setCustomerSurveyConsumablesInventory(String customerSurveyConsumablesInventory) {
        this.customerSurveyConsumablesInventory = customerSurveyConsumablesInventory;
    }

    public String getCustomerSurveyConsumablesInventory() {
        return customerSurveyConsumablesInventory;
    }

    public void setCustomerSurveyConsumableType(String customerSurveyConsumableType) {
        this.customerSurveyConsumableType = customerSurveyConsumableType;
    }

    public String getCustomerSurveyConsumableType() {
        return customerSurveyConsumableType;
    }

    public void setCustomerSurveyConsumableHolding(String customerSurveyConsumableHolding) {
        this.customerSurveyConsumableHolding = customerSurveyConsumableHolding;
    }

    public String getCustomerSurveyConsumableHolding() {
        return customerSurveyConsumableHolding;
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

    public void setCustomerSurveyProcedureResult(String customerSurveyProcedureResult) {
        this.customerSurveyProcedureResult = customerSurveyProcedureResult;
    }

    public String getCustomerSurveyProcedureResult() {
        return customerSurveyProcedureResult;
    }
}