/*Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues within Advanced Voice Services Management.*/
package org.museframework.bian.advvoiserman.dto.cr;

public class VoiceChannelManagementPlan extends org.museframework.bian.classes.VoiceChannelManagementPlan {
    /*The time period addressed by the management plan*/
    private String VChannelManagementPlanPeriod;

    /*The channel policies and guidelines for service users*/
    private String VChannelUsagePoliciesAndGuidelines;

    /*The default channel service configuration (Note this can be updated during operations with service calls to the channel operations service domain)*/
    private String VChannelServiceOperatingParameters;

    /*The Target and actual service performance goals that are tracked by channel management*/
    private String VChannelServicePerformanceGoals;

    /*The target and actual channel service schedule - recording planned and actual service availability and outages (includes any partial service access constraints or restrictions for a 24/7 service)*/
    private String VChannelServiceSchedule;

    public void setVChannelManagementPlanPeriod(String VChannelManagementPlanPeriod) {
        this.VChannelManagementPlanPeriod = VChannelManagementPlanPeriod;
    }

    public String getVChannelManagementPlanPeriod() {
        return VChannelManagementPlanPeriod;
    }

    public void setVChannelUsagePoliciesAndGuidelines(String VChannelUsagePoliciesAndGuidelines) {
        this.VChannelUsagePoliciesAndGuidelines = VChannelUsagePoliciesAndGuidelines;
    }

    public String getVChannelUsagePoliciesAndGuidelines() {
        return VChannelUsagePoliciesAndGuidelines;
    }

    public void setVChannelServiceOperatingParameters(String VChannelServiceOperatingParameters) {
        this.VChannelServiceOperatingParameters = VChannelServiceOperatingParameters;
    }

    public String getVChannelServiceOperatingParameters() {
        return VChannelServiceOperatingParameters;
    }

    public void setVChannelServicePerformanceGoals(String VChannelServicePerformanceGoals) {
        this.VChannelServicePerformanceGoals = VChannelServicePerformanceGoals;
    }

    public String getVChannelServicePerformanceGoals() {
        return VChannelServicePerformanceGoals;
    }

    public void setVChannelServiceSchedule(String VChannelServiceSchedule) {
        this.VChannelServiceSchedule = VChannelServiceSchedule;
    }

    public String getVChannelServiceSchedule() {
        return VChannelServiceSchedule;
    }
}