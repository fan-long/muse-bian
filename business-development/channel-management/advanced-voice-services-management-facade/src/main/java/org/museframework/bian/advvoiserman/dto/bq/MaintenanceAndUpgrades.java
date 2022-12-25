/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.advvoiserman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class MaintenanceAndUpgrades {
    /*Planned platform maintenance and upgrade tasks (includes release and capacity upgrades)*/
    @MetaField(0)
    private String VChannelMaintenanceandUpgradeSchedule;

    /*The type of work task (e.g. scheduled maintenance, version release, platform upgrade)*/
    @MetaField(0)
    private String VChannelMaintenanceandUpgradeWorkTaskType;

    /*The make-up of the channel platform task performed, includes work plan, assignments, effort/expenditures and deliverables as appropriate*/
    @MetaField(0)
    private String VChannelMaintenanceandUpgradeWorkTask;

    /*File of consolidated work notes, testing results, agreements etc. for the work task*/
    @MetaField(0)
    private String VChannelMaintenanceandUpgradeWorkTaskWorkProducts;

    /*Details of the outcome or result of the work task (e.g. new version number installed, capacity upgrade in production)*/
    @MetaField(0)
    private String VChannelMaintenanceandUpgradeWorkTaskResult;

    /*The key date-times associated with the work task (e.g. cutover date)*/
    @MetaField(0)
    private String VChannelMaintenanceandUpgradeWorkTaskDate_Time;

    public void setVChannelMaintenanceandUpgradeSchedule(String VChannelMaintenanceandUpgradeSchedule) {
        this.VChannelMaintenanceandUpgradeSchedule = VChannelMaintenanceandUpgradeSchedule;
    }

    public String getVChannelMaintenanceandUpgradeSchedule() {
        return VChannelMaintenanceandUpgradeSchedule;
    }

    public void setVChannelMaintenanceandUpgradeWorkTaskType(String VChannelMaintenanceandUpgradeWorkTaskType) {
        this.VChannelMaintenanceandUpgradeWorkTaskType = VChannelMaintenanceandUpgradeWorkTaskType;
    }

    public String getVChannelMaintenanceandUpgradeWorkTaskType() {
        return VChannelMaintenanceandUpgradeWorkTaskType;
    }

    public void setVChannelMaintenanceandUpgradeWorkTask(String VChannelMaintenanceandUpgradeWorkTask) {
        this.VChannelMaintenanceandUpgradeWorkTask = VChannelMaintenanceandUpgradeWorkTask;
    }

    public String getVChannelMaintenanceandUpgradeWorkTask() {
        return VChannelMaintenanceandUpgradeWorkTask;
    }

    public void setVChannelMaintenanceandUpgradeWorkTaskWorkProducts(String VChannelMaintenanceandUpgradeWorkTaskWorkProducts) {
        this.VChannelMaintenanceandUpgradeWorkTaskWorkProducts = VChannelMaintenanceandUpgradeWorkTaskWorkProducts;
    }

    public String getVChannelMaintenanceandUpgradeWorkTaskWorkProducts() {
        return VChannelMaintenanceandUpgradeWorkTaskWorkProducts;
    }

    public void setVChannelMaintenanceandUpgradeWorkTaskResult(String VChannelMaintenanceandUpgradeWorkTaskResult) {
        this.VChannelMaintenanceandUpgradeWorkTaskResult = VChannelMaintenanceandUpgradeWorkTaskResult;
    }

    public String getVChannelMaintenanceandUpgradeWorkTaskResult() {
        return VChannelMaintenanceandUpgradeWorkTaskResult;
    }

    public void setVChannelMaintenanceandUpgradeWorkTaskDate_Time(String VChannelMaintenanceandUpgradeWorkTaskDate_Time) {
        this.VChannelMaintenanceandUpgradeWorkTaskDate_Time = VChannelMaintenanceandUpgradeWorkTaskDate_Time;
    }

    public String getVChannelMaintenanceandUpgradeWorkTaskDate_Time() {
        return VChannelMaintenanceandUpgradeWorkTaskDate_Time;
    }
}