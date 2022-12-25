/*Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues within Customer Case Management.*/
package org.museframework.bian.cuscasman.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.CustomerCaseManagementPlan
@MetaDto
public class CustomerCaseManagementPlan {
    /*The time period addressed by the management plan. This may define required actions and target performance over a fixed period or can be a 'rolling' plan that is continually refined based on experience*/
    @MetaField(0)
    private String customerCaseManagementPlanPeriod;

    /*The specific policies and guidelines for case resolution employees*/
    @MetaField(0)
    private String customerCasePoliciesAndGuidelines;

    /*The target and actual service performance goals that are tracked by customer case management*/
    @MetaField(0)
    private String customerCaseServicePerformanceGoals;

    /*The target and actual customer case service schedule - recording planned and actual service availability and expected throughput/productivity*/
    @MetaField(0)
    private String customerCaseServiceSchedule;

    /*The set-up/organization for the customer case business function (covers operational and management/oversight roles and responsibilities)*/
    @MetaField(0)
    private String customerCaseServiceOperatingConfiguration;

    /*Details the number and skill/qualification profile of the customer case handling staff (target and actual)*/
    @MetaField(0)
    private String customerCaseResourcePlan;

    /*Details of staff training and certification activity (planned and actual)*/
    @MetaField(0)
    private String customerCaseTrainingPlan;

    public void setCustomerCaseManagementPlanPeriod(String customerCaseManagementPlanPeriod) {
        this.customerCaseManagementPlanPeriod = customerCaseManagementPlanPeriod;
    }

    public String getCustomerCaseManagementPlanPeriod() {
        return customerCaseManagementPlanPeriod;
    }

    public void setCustomerCasePoliciesAndGuidelines(String customerCasePoliciesAndGuidelines) {
        this.customerCasePoliciesAndGuidelines = customerCasePoliciesAndGuidelines;
    }

    public String getCustomerCasePoliciesAndGuidelines() {
        return customerCasePoliciesAndGuidelines;
    }

    public void setCustomerCaseServicePerformanceGoals(String customerCaseServicePerformanceGoals) {
        this.customerCaseServicePerformanceGoals = customerCaseServicePerformanceGoals;
    }

    public String getCustomerCaseServicePerformanceGoals() {
        return customerCaseServicePerformanceGoals;
    }

    public void setCustomerCaseServiceSchedule(String customerCaseServiceSchedule) {
        this.customerCaseServiceSchedule = customerCaseServiceSchedule;
    }

    public String getCustomerCaseServiceSchedule() {
        return customerCaseServiceSchedule;
    }

    public void setCustomerCaseServiceOperatingConfiguration(String customerCaseServiceOperatingConfiguration) {
        this.customerCaseServiceOperatingConfiguration = customerCaseServiceOperatingConfiguration;
    }

    public String getCustomerCaseServiceOperatingConfiguration() {
        return customerCaseServiceOperatingConfiguration;
    }

    public void setCustomerCaseResourcePlan(String customerCaseResourcePlan) {
        this.customerCaseResourcePlan = customerCaseResourcePlan;
    }

    public String getCustomerCaseResourcePlan() {
        return customerCaseResourcePlan;
    }

    public void setCustomerCaseTrainingPlan(String customerCaseTrainingPlan) {
        this.customerCaseTrainingPlan = customerCaseTrainingPlan;
    }

    public String getCustomerCaseTrainingPlan() {
        return customerCaseTrainingPlan;
    }
}