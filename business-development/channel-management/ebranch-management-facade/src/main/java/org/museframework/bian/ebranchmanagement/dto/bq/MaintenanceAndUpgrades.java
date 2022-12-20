/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.ebranchmanagement.dto.bq;

public class MaintenanceAndUpgrades {
    /*Planned platform maintenance and upgrade tasks (includes release and capacity upgrades)*/
    private String eBranchChannelMaintenanceandUpgradeSchedule;

    /*The type of work task (e.g. scheduled maintenance, version release, platform upgrade)*/
    private String eBranchChannelMaintenanceandUpgradeWorkTaskType;

    /*The make-up of the channel platform task performed, includes work plan, assignments, effort/expenditures and deliverables as appropriate*/
    private String eBranchChannelMaintenanceandUpgradeWorkTask;

    /*File of consolidated work notes, testing results, agreements etc. for the work task*/
    private String eBranchChannelMaintenanceandUpgradeWorkTaskWorkProducts;

    /*Details of the outcome or result of the work task (e.g. new version number installed, capacity upgrade in production)*/
    private String eBranchChannelMaintenanceandUpgradeWorkTaskResult;

    /*The key date-times associated with the work task (e.g. cutover date)*/
    private String eBranchChannelMaintenanceandUpgradeWorkTaskDate_Time;

    public void seteBranchChannelMaintenanceandUpgradeSchedule(String eBranchChannelMaintenanceandUpgradeSchedule) {
        this.eBranchChannelMaintenanceandUpgradeSchedule = eBranchChannelMaintenanceandUpgradeSchedule;
    }

    public String geteBranchChannelMaintenanceandUpgradeSchedule() {
        return eBranchChannelMaintenanceandUpgradeSchedule;
    }

    public void seteBranchChannelMaintenanceandUpgradeWorkTaskType(String eBranchChannelMaintenanceandUpgradeWorkTaskType) {
        this.eBranchChannelMaintenanceandUpgradeWorkTaskType = eBranchChannelMaintenanceandUpgradeWorkTaskType;
    }

    public String geteBranchChannelMaintenanceandUpgradeWorkTaskType() {
        return eBranchChannelMaintenanceandUpgradeWorkTaskType;
    }

    public void seteBranchChannelMaintenanceandUpgradeWorkTask(String eBranchChannelMaintenanceandUpgradeWorkTask) {
        this.eBranchChannelMaintenanceandUpgradeWorkTask = eBranchChannelMaintenanceandUpgradeWorkTask;
    }

    public String geteBranchChannelMaintenanceandUpgradeWorkTask() {
        return eBranchChannelMaintenanceandUpgradeWorkTask;
    }

    public void seteBranchChannelMaintenanceandUpgradeWorkTaskWorkProducts(String eBranchChannelMaintenanceandUpgradeWorkTaskWorkProducts) {
        this.eBranchChannelMaintenanceandUpgradeWorkTaskWorkProducts = eBranchChannelMaintenanceandUpgradeWorkTaskWorkProducts;
    }

    public String geteBranchChannelMaintenanceandUpgradeWorkTaskWorkProducts() {
        return eBranchChannelMaintenanceandUpgradeWorkTaskWorkProducts;
    }

    public void seteBranchChannelMaintenanceandUpgradeWorkTaskResult(String eBranchChannelMaintenanceandUpgradeWorkTaskResult) {
        this.eBranchChannelMaintenanceandUpgradeWorkTaskResult = eBranchChannelMaintenanceandUpgradeWorkTaskResult;
    }

    public String geteBranchChannelMaintenanceandUpgradeWorkTaskResult() {
        return eBranchChannelMaintenanceandUpgradeWorkTaskResult;
    }

    public void seteBranchChannelMaintenanceandUpgradeWorkTaskDate_Time(String eBranchChannelMaintenanceandUpgradeWorkTaskDate_Time) {
        this.eBranchChannelMaintenanceandUpgradeWorkTaskDate_Time = eBranchChannelMaintenanceandUpgradeWorkTaskDate_Time;
    }

    public String geteBranchChannelMaintenanceandUpgradeWorkTaskDate_Time() {
        return eBranchChannelMaintenanceandUpgradeWorkTaskDate_Time;
    }
}