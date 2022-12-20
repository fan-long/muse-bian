/*Maintain a log of transactions or activity, typically a financial account/journal or a log of activity to support behavioral analysis  within Reward Points Account. 
Examples: Maintain a financial journal of transactions processed for a product or service and maintain a log of customer events and activity for subsequent analysis.*/
package org.museframework.bian.rewpoiacc.dto.cr;

public class RewardPointsLog {
    /*A Classification value that distinguishes between business service events logged within Reward Points Log*/
    private String rewardPointsLogParameterType;

    /*A selected optional business service as subject matter of Reward Points Log*/
    private String rewardPointsLogSelectedOption;

    /*The type of Reward Points Log*/
    private String rewardPointsLogType;

    /*Timetable to track RewardPoints*/
    private String rewardPointsLogSchedule;

    /*Reference to the log of (usage) ativities/events  of Reward Points Log*/
    private String rewardPointsLogUsageLog;

    /*Reference to the log of (update) ativities/events of Reward Points Log*/
    private String rewardPointsLogUpdateLog;

    /*Reference to the party who is involved in Reward Points Log*/
    private org.museframework.bian.classes.Object rewardPointsLogReference;

    /*Reference to the business unit which is involved in Reward Points Log*/
    private org.museframework.bian.classes.Object rewardPointsLogBusinessUnitReference;

    /*Reference to the customer who is involved in Reward Points Log*/
    private org.museframework.bian.classes.Object rewardPointsLogCustomerReference;

    /*The configuration of Reward Points Log*/
    private String rewardPointsLogServiceConfiguration;

    /*The position of Reward Points Log*/
    private String rewardPointsLogPosition;

    /*A classification value expressing the kind of position withing the Reward Points Log*/
    private String rewardPointsLogPositionType;

    /*Reference to the time limitation related to the position  of Reward Points Log*/
    private String rewardPointsLogPositionLimitTime;

    public void setRewardPointsLogParameterType(String rewardPointsLogParameterType) {
        this.rewardPointsLogParameterType = rewardPointsLogParameterType;
    }

    public String getRewardPointsLogParameterType() {
        return rewardPointsLogParameterType;
    }

    public void setRewardPointsLogSelectedOption(String rewardPointsLogSelectedOption) {
        this.rewardPointsLogSelectedOption = rewardPointsLogSelectedOption;
    }

    public String getRewardPointsLogSelectedOption() {
        return rewardPointsLogSelectedOption;
    }

    public void setRewardPointsLogType(String rewardPointsLogType) {
        this.rewardPointsLogType = rewardPointsLogType;
    }

    public String getRewardPointsLogType() {
        return rewardPointsLogType;
    }

    public void setRewardPointsLogSchedule(String rewardPointsLogSchedule) {
        this.rewardPointsLogSchedule = rewardPointsLogSchedule;
    }

    public String getRewardPointsLogSchedule() {
        return rewardPointsLogSchedule;
    }

    public void setRewardPointsLogUsageLog(String rewardPointsLogUsageLog) {
        this.rewardPointsLogUsageLog = rewardPointsLogUsageLog;
    }

    public String getRewardPointsLogUsageLog() {
        return rewardPointsLogUsageLog;
    }

    public void setRewardPointsLogUpdateLog(String rewardPointsLogUpdateLog) {
        this.rewardPointsLogUpdateLog = rewardPointsLogUpdateLog;
    }

    public String getRewardPointsLogUpdateLog() {
        return rewardPointsLogUpdateLog;
    }

    public void setRewardPointsLogReference(org.museframework.bian.classes.Object rewardPointsLogReference) {
        this.rewardPointsLogReference = rewardPointsLogReference;
    }

    public org.museframework.bian.classes.Object getRewardPointsLogReference() {
        return rewardPointsLogReference;
    }

    public void setRewardPointsLogBusinessUnitReference(org.museframework.bian.classes.Object rewardPointsLogBusinessUnitReference) {
        this.rewardPointsLogBusinessUnitReference = rewardPointsLogBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getRewardPointsLogBusinessUnitReference() {
        return rewardPointsLogBusinessUnitReference;
    }

    public void setRewardPointsLogCustomerReference(org.museframework.bian.classes.Object rewardPointsLogCustomerReference) {
        this.rewardPointsLogCustomerReference = rewardPointsLogCustomerReference;
    }

    public org.museframework.bian.classes.Object getRewardPointsLogCustomerReference() {
        return rewardPointsLogCustomerReference;
    }

    public void setRewardPointsLogServiceConfiguration(String rewardPointsLogServiceConfiguration) {
        this.rewardPointsLogServiceConfiguration = rewardPointsLogServiceConfiguration;
    }

    public String getRewardPointsLogServiceConfiguration() {
        return rewardPointsLogServiceConfiguration;
    }

    public void setRewardPointsLogPosition(String rewardPointsLogPosition) {
        this.rewardPointsLogPosition = rewardPointsLogPosition;
    }

    public String getRewardPointsLogPosition() {
        return rewardPointsLogPosition;
    }

    public void setRewardPointsLogPositionType(String rewardPointsLogPositionType) {
        this.rewardPointsLogPositionType = rewardPointsLogPositionType;
    }

    public String getRewardPointsLogPositionType() {
        return rewardPointsLogPositionType;
    }

    public void setRewardPointsLogPositionLimitTime(String rewardPointsLogPositionLimitTime) {
        this.rewardPointsLogPositionLimitTime = rewardPointsLogPositionLimitTime;
    }

    public String getRewardPointsLogPositionLimitTime() {
        return rewardPointsLogPositionLimitTime;
    }
}