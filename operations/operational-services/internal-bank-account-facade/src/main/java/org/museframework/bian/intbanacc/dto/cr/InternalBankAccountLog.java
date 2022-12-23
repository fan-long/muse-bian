/*Maintain a log of transactions or activity, typically a financial account/journal or a log of activity to support behavioral analysis within Internal Bank Account. */
package org.museframework.bian.intbanacc.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class InternalBankAccountLog {
    /*A Classification value that distinguishes between business service events logged within Internal Bank Account Log*/
    @MetaField
    private String internalBankAccountLogParameterType;

    /*A selected optional business service as subject matter of Internal Bank Account Log*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Service internalBankAccountLogSelectedOption;

    /*The type of Internal Bank Account Log*/
    @MetaField
    private String internalBankAccountLogType;

    /*Timetable to track Internal Bank Account Log*/
    @MetaField
    private String internalBankAccountLogSchedule;

    /*Reference to the log of (usage) ativities/events  of Internal Bank Account Log*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Log internalBankAccountLogUsageLog;

    /*Reference to the log of (update) ativities/events of Internal Bank Account Log*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Log internalBankAccountLogUpdateLog;

    /*Reference to the party who is involved in Internal Bank Account Log*/
    @MetaField
    private String internalBankAccountLogAssociatedParty;

    /*Reference to the business unit which is involved in Internal Bank Account Log*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessUnit internalBankAccountLogBusinessUnitReference;

    /*Reference to the customer who is involved in Internal Bank Account Log*/
    @MetaField
    private String internalBankAccountLogCustomerReference;

    /*The configuration of Internal Bank Account Log*/
    @MetaField
    private String internalBankAccountLogServiceConfiguration;

    /*The position of Internal Bank Account Log*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Position internalBankAccountLogPosition;

    /*A classification value expressing the kind of position withing the Internal Bank Account Log*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.PositionType internalBankAccountLogPositionType;

    /*Reference to the time limitation related to the position of Internal Bank Account Log*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.LimitArrangement internalBankAccountLogPositionLimitTime;

    /*An unique reference to an item or an occurrence of Internal Bank Account Log*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Log internalBankAccountLogReference;

    public void setInternalBankAccountLogParameterType(String internalBankAccountLogParameterType) {
        this.internalBankAccountLogParameterType = internalBankAccountLogParameterType;
    }

    public String getInternalBankAccountLogParameterType() {
        return internalBankAccountLogParameterType;
    }

    public void setInternalBankAccountLogSelectedOption(org.museframework.bian.classes.Service internalBankAccountLogSelectedOption) {
        this.internalBankAccountLogSelectedOption = internalBankAccountLogSelectedOption;
    }

    public org.museframework.bian.classes.Service getInternalBankAccountLogSelectedOption() {
        return internalBankAccountLogSelectedOption;
    }

    public void setInternalBankAccountLogType(String internalBankAccountLogType) {
        this.internalBankAccountLogType = internalBankAccountLogType;
    }

    public String getInternalBankAccountLogType() {
        return internalBankAccountLogType;
    }

    public void setInternalBankAccountLogSchedule(String internalBankAccountLogSchedule) {
        this.internalBankAccountLogSchedule = internalBankAccountLogSchedule;
    }

    public String getInternalBankAccountLogSchedule() {
        return internalBankAccountLogSchedule;
    }

    public void setInternalBankAccountLogUsageLog(org.museframework.bian.classes.Log internalBankAccountLogUsageLog) {
        this.internalBankAccountLogUsageLog = internalBankAccountLogUsageLog;
    }

    public org.museframework.bian.classes.Log getInternalBankAccountLogUsageLog() {
        return internalBankAccountLogUsageLog;
    }

    public void setInternalBankAccountLogUpdateLog(org.museframework.bian.classes.Log internalBankAccountLogUpdateLog) {
        this.internalBankAccountLogUpdateLog = internalBankAccountLogUpdateLog;
    }

    public org.museframework.bian.classes.Log getInternalBankAccountLogUpdateLog() {
        return internalBankAccountLogUpdateLog;
    }

    public void setInternalBankAccountLogAssociatedParty(String internalBankAccountLogAssociatedParty) {
        this.internalBankAccountLogAssociatedParty = internalBankAccountLogAssociatedParty;
    }

    public String getInternalBankAccountLogAssociatedParty() {
        return internalBankAccountLogAssociatedParty;
    }

    public void setInternalBankAccountLogBusinessUnitReference(org.museframework.bian.classes.BusinessUnit internalBankAccountLogBusinessUnitReference) {
        this.internalBankAccountLogBusinessUnitReference = internalBankAccountLogBusinessUnitReference;
    }

    public org.museframework.bian.classes.BusinessUnit getInternalBankAccountLogBusinessUnitReference() {
        return internalBankAccountLogBusinessUnitReference;
    }

    public void setInternalBankAccountLogCustomerReference(String internalBankAccountLogCustomerReference) {
        this.internalBankAccountLogCustomerReference = internalBankAccountLogCustomerReference;
    }

    public String getInternalBankAccountLogCustomerReference() {
        return internalBankAccountLogCustomerReference;
    }

    public void setInternalBankAccountLogServiceConfiguration(String internalBankAccountLogServiceConfiguration) {
        this.internalBankAccountLogServiceConfiguration = internalBankAccountLogServiceConfiguration;
    }

    public String getInternalBankAccountLogServiceConfiguration() {
        return internalBankAccountLogServiceConfiguration;
    }

    public void setInternalBankAccountLogPosition(org.museframework.bian.classes.Position internalBankAccountLogPosition) {
        this.internalBankAccountLogPosition = internalBankAccountLogPosition;
    }

    public org.museframework.bian.classes.Position getInternalBankAccountLogPosition() {
        return internalBankAccountLogPosition;
    }

    public void setInternalBankAccountLogPositionType(org.museframework.bian.classes.PositionType internalBankAccountLogPositionType) {
        this.internalBankAccountLogPositionType = internalBankAccountLogPositionType;
    }

    public org.museframework.bian.classes.PositionType getInternalBankAccountLogPositionType() {
        return internalBankAccountLogPositionType;
    }

    public void setInternalBankAccountLogPositionLimitTime(org.museframework.bian.classes.LimitArrangement internalBankAccountLogPositionLimitTime) {
        this.internalBankAccountLogPositionLimitTime = internalBankAccountLogPositionLimitTime;
    }

    public org.museframework.bian.classes.LimitArrangement getInternalBankAccountLogPositionLimitTime() {
        return internalBankAccountLogPositionLimitTime;
    }

    public void setInternalBankAccountLogReference(org.museframework.bian.classes.Log internalBankAccountLogReference) {
        this.internalBankAccountLogReference = internalBankAccountLogReference;
    }

    public org.museframework.bian.classes.Log getInternalBankAccountLogReference() {
        return internalBankAccountLogReference;
    }
}