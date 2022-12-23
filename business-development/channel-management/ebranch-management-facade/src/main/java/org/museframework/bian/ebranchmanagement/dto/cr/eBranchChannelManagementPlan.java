/*Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues within eBranch Management.*/
package org.museframework.bian.ebranchmanagement.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class eBranchChannelManagementPlan {
    /*The time period addressed by the management plan*/
    @MetaField
    private String eBranchChannelManagementPlanPeriod;

    /*The channel policies and guidelines for service users*/
    @MetaField
    private String eBranchChannelUsagePoliciesAndGuidelines;

    /*The default channel service configuration (Note this can be updated during operations with service calls to the channel operations service domain)*/
    @MetaField
    private String eBranchChannelServiceOperatingParameters;

    /*The target and actual service performance goals that are tracked by channel management*/
    @MetaField
    private String eBranchChannelServicePerformanceGoals;

    /*The target and actual channel service schedule - recording planned and actual service availability and outages (includes any partial service access constraints or restrictions for a 24/7 service)*/
    @MetaField
    private String eBranchChannelServiceSchedule;

    public void seteBranchChannelManagementPlanPeriod(String eBranchChannelManagementPlanPeriod) {
        this.eBranchChannelManagementPlanPeriod = eBranchChannelManagementPlanPeriod;
    }

    public String geteBranchChannelManagementPlanPeriod() {
        return eBranchChannelManagementPlanPeriod;
    }

    public void seteBranchChannelUsagePoliciesAndGuidelines(String eBranchChannelUsagePoliciesAndGuidelines) {
        this.eBranchChannelUsagePoliciesAndGuidelines = eBranchChannelUsagePoliciesAndGuidelines;
    }

    public String geteBranchChannelUsagePoliciesAndGuidelines() {
        return eBranchChannelUsagePoliciesAndGuidelines;
    }

    public void seteBranchChannelServiceOperatingParameters(String eBranchChannelServiceOperatingParameters) {
        this.eBranchChannelServiceOperatingParameters = eBranchChannelServiceOperatingParameters;
    }

    public String geteBranchChannelServiceOperatingParameters() {
        return eBranchChannelServiceOperatingParameters;
    }

    public void seteBranchChannelServicePerformanceGoals(String eBranchChannelServicePerformanceGoals) {
        this.eBranchChannelServicePerformanceGoals = eBranchChannelServicePerformanceGoals;
    }

    public String geteBranchChannelServicePerformanceGoals() {
        return eBranchChannelServicePerformanceGoals;
    }

    public void seteBranchChannelServiceSchedule(String eBranchChannelServiceSchedule) {
        this.eBranchChannelServiceSchedule = eBranchChannelServiceSchedule;
    }

    public String geteBranchChannelServiceSchedule() {
        return eBranchChannelServiceSchedule;
    }
}