/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Customer Surveys. */
package org.museframework.bian.customersurveys.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.CustomerSurveyProcedure
@MetaDto
public class CustomerSurveyProcedure {
    /*The type or category of customer survey (e.g. questionnaire, in context solicitation, focus group)*/
    @MetaField(0)
    private String customerSurveyType;

    /*A description of the customer survey that clarifies the sought customer insights, survey mechanism and target reviewers*/
    @MetaField(0)
    private String customerSurveyDescription;

    /*Reference to the business unit responsible for the survey execution*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*Details of the deployment set-up/configuration of the customer survey*/
    @MetaField(0)
    private String customerSurveyProcedureSet_up;

    /*The customer survey version number used*/
    @MetaField(0)
    private String customerSurveyProcedureVersionNumber;

    /*The customer survey processing schedule, covering survey definition, reviewer selection, survey execution and subsequent analysis. Note for some integrated surveys this can be an on-going activity that attempts provides a constant stream of feedback relating to specific activities/services rather than a specific event*/
    @MetaField(0)
    private String customerSurveySchedule;

    /*Inventory record of any consumables that are to be used in the execution of the customer survey*/
    @MetaField(0)
    private String customerSurveyConsumablesInventory;

    /*The type of consumable item associated with the customer survey (e.g. questionnaire, participation incentive gift)*/
    @MetaField(0)
    private String customerSurveyConsumableType;

    /*The tracked inventory of the consumable item*/
    @MetaField(0)
    private String customerSurveyConsumableHolding;

    /*Key dates associated with the customer survey process (e.g. initiation date, version revision date, completion date)*/
    @MetaField(0)
    private String dateType;

    /*Value of the date type*/
    @MetaField(0)
    private String date;

    /*The result/impact of the customer survey (will include summary of customer survey activity, survey response data and survey findings presentation analysis)*/
    @MetaField(0)
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