/*Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues within Business Unit Management.*/
package org.museframework.bian.busuniman.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class BusinessUnitManagementPlan extends org.museframework.bian.classes.BusinessUnitManagementPlan {
    /*The time period addressed by the management plan (typically this will include setting the default daily operating goals and arrangements for the business unit that is periodically updated)*/
    @MetaField
    private String businessUnitManagementPlanPeriod;

    /*The policies and guidelines for business unit employees and service users*/
    @MetaField
    private String businessUnitUsagePoliciesAndGuidelines;

    /*The target and actual business unit performance goals that are tracked by business unit management*/
    @MetaField
    private String businessUnitPerformanceGoals;

    /*The target and actual business unit operating schedule - recording planned and actual business activity*/
    @MetaField
    private String businessUnitOperatingSchedule;

    /*The assigned roles and responsibilities and associated work/delivery responsibilities for the staff making up the business unit*/
    @MetaField
    private String businessUnitOperatingOrganization;

    /*Details the number and skill profile of the business unit staff (target and actual)*/
    @MetaField
    private String businessUnitResourcePlan;

    /*Details of staff training and certification as appropriate*/
    @MetaField
    private String businessUnitTrainingPlan;

    public void setBusinessUnitManagementPlanPeriod(String businessUnitManagementPlanPeriod) {
        this.businessUnitManagementPlanPeriod = businessUnitManagementPlanPeriod;
    }

    public String getBusinessUnitManagementPlanPeriod() {
        return businessUnitManagementPlanPeriod;
    }

    public void setBusinessUnitUsagePoliciesAndGuidelines(String businessUnitUsagePoliciesAndGuidelines) {
        this.businessUnitUsagePoliciesAndGuidelines = businessUnitUsagePoliciesAndGuidelines;
    }

    public String getBusinessUnitUsagePoliciesAndGuidelines() {
        return businessUnitUsagePoliciesAndGuidelines;
    }

    public void setBusinessUnitPerformanceGoals(String businessUnitPerformanceGoals) {
        this.businessUnitPerformanceGoals = businessUnitPerformanceGoals;
    }

    public String getBusinessUnitPerformanceGoals() {
        return businessUnitPerformanceGoals;
    }

    public void setBusinessUnitOperatingSchedule(String businessUnitOperatingSchedule) {
        this.businessUnitOperatingSchedule = businessUnitOperatingSchedule;
    }

    public String getBusinessUnitOperatingSchedule() {
        return businessUnitOperatingSchedule;
    }

    public void setBusinessUnitOperatingOrganization(String businessUnitOperatingOrganization) {
        this.businessUnitOperatingOrganization = businessUnitOperatingOrganization;
    }

    public String getBusinessUnitOperatingOrganization() {
        return businessUnitOperatingOrganization;
    }

    public void setBusinessUnitResourcePlan(String businessUnitResourcePlan) {
        this.businessUnitResourcePlan = businessUnitResourcePlan;
    }

    public String getBusinessUnitResourcePlan() {
        return businessUnitResourcePlan;
    }

    public void setBusinessUnitTrainingPlan(String businessUnitTrainingPlan) {
        this.businessUnitTrainingPlan = businessUnitTrainingPlan;
    }

    public String getBusinessUnitTrainingPlan() {
        return businessUnitTrainingPlan;
    }
}