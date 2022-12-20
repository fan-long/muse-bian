/*Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues within Contact Center Management.*/
package org.museframework.bian.concenman.dto.cr;

public class ContactCenterManagementPlan extends org.museframework.bian.classes.ContactCenterManagementPlan {
    /*The time period addressed by the management plan (typically this will include setting the default daily operating goals and arrangements for the contact center that is periodically updated)*/
    private String contactCenterManagementPlanPeriod;

    /*The policies and guidelines for contact center employees and service users*/
    private String contactCenterUsagePoliciesAndGuidelines;

    /*The target and actual service performance goals that are tracked by contact center management*/
    private String contactCenterServicePerformanceGoals;

    /*The target and actual contact center service schedule - recording planned and actual service availability and outages (includes any partial service access constraints or restrictions for a 24/7 service)*/
    private String contactCenterServiceSchedule;

    /*The default contact center operational configuration (Note this can include some latitude for position assignment changes to be made during day to day operations with service calls to the Contact Center Operations service domain)*/
    private String contactCenterServiceOperatingConfiguration;

    /*Details the number and skill profile of the contact center staff (target and actual)*/
    private String contactCenterResourcePlan;

    /*Details of staff training and certification activity*/
    private String contactCenterTrainingPlan;

    public void setContactCenterManagementPlanPeriod(String contactCenterManagementPlanPeriod) {
        this.contactCenterManagementPlanPeriod = contactCenterManagementPlanPeriod;
    }

    public String getContactCenterManagementPlanPeriod() {
        return contactCenterManagementPlanPeriod;
    }

    public void setContactCenterUsagePoliciesAndGuidelines(String contactCenterUsagePoliciesAndGuidelines) {
        this.contactCenterUsagePoliciesAndGuidelines = contactCenterUsagePoliciesAndGuidelines;
    }

    public String getContactCenterUsagePoliciesAndGuidelines() {
        return contactCenterUsagePoliciesAndGuidelines;
    }

    public void setContactCenterServicePerformanceGoals(String contactCenterServicePerformanceGoals) {
        this.contactCenterServicePerformanceGoals = contactCenterServicePerformanceGoals;
    }

    public String getContactCenterServicePerformanceGoals() {
        return contactCenterServicePerformanceGoals;
    }

    public void setContactCenterServiceSchedule(String contactCenterServiceSchedule) {
        this.contactCenterServiceSchedule = contactCenterServiceSchedule;
    }

    public String getContactCenterServiceSchedule() {
        return contactCenterServiceSchedule;
    }

    public void setContactCenterServiceOperatingConfiguration(String contactCenterServiceOperatingConfiguration) {
        this.contactCenterServiceOperatingConfiguration = contactCenterServiceOperatingConfiguration;
    }

    public String getContactCenterServiceOperatingConfiguration() {
        return contactCenterServiceOperatingConfiguration;
    }

    public void setContactCenterResourcePlan(String contactCenterResourcePlan) {
        this.contactCenterResourcePlan = contactCenterResourcePlan;
    }

    public String getContactCenterResourcePlan() {
        return contactCenterResourcePlan;
    }

    public void setContactCenterTrainingPlan(String contactCenterTrainingPlan) {
        this.contactCenterTrainingPlan = contactCenterTrainingPlan;
    }

    public String getContactCenterTrainingPlan() {
        return contactCenterTrainingPlan;
    }
}