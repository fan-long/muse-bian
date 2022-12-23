/*Maintain a log of transactions or activity, typically a financial account/journal or a log of activity to support behavioral analysis within Credit Card Position Keeping. */
package org.museframework.bian.crecarposkee.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CreditCardPositionLog {
    /*A Classification value that distinguishes between business service events logged within Credit Card Position Log*/
    @MetaField
    private String creditCardPositionLogParameterType;

    /*A selected optional business service as subject matter of Credit Card Position Log*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Service creditCardPositionLogSelectedOption;

    /*The type of Credit Card Position Log*/
    @MetaField
    private String creditCardPositionLogType;

    /*Timetable to track Credit Card Position Log*/
    @MetaField
    private String creditCardPositionLogSchedule;

    /*Reference to the log of (usage) ativities/events  of Credit Card Position Log*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Log creditCardPositionLogUsageLog;

    /*Reference to the log of (update) ativities/events of Credit Card Position Log*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Log creditCardPositionLogUpdateLog;

    /*Reference to the party who is involved in Credit Card Position Log*/
    @MetaField
    private String creditCardPositionLogAssociatedParty;

    /*Reference to the business unit which is involved in Credit Card Position Log*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessUnit creditCardPositionLogBusinessUnitReference;

    /*Reference to the customer who is involved in Credit Card Position Log*/
    @MetaField
    private String creditCardPositionLogCustomerReference;

    /*The configuration of Credit Card Position Log*/
    @MetaField
    private String creditCardPositionLogServiceConfiguration;

    /*The position of Credit Card Position Log*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Position creditCardPositionLogPosition;

    /*A classification value expressing the kind of position withing the Credit Card Position Log*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.PositionType creditCardPositionLogPositionType;

    /*Reference to the time limitation related to the position of Credit Card Position Log*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.LimitArrangement creditCardPositionLogPositionLimitTime;

    /*An unique reference to an item or an occurrence of Credit Card Position Log*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Log creditCardPositionLogReference;

    public void setCreditCardPositionLogParameterType(String creditCardPositionLogParameterType) {
        this.creditCardPositionLogParameterType = creditCardPositionLogParameterType;
    }

    public String getCreditCardPositionLogParameterType() {
        return creditCardPositionLogParameterType;
    }

    public void setCreditCardPositionLogSelectedOption(org.museframework.bian.classes.Service creditCardPositionLogSelectedOption) {
        this.creditCardPositionLogSelectedOption = creditCardPositionLogSelectedOption;
    }

    public org.museframework.bian.classes.Service getCreditCardPositionLogSelectedOption() {
        return creditCardPositionLogSelectedOption;
    }

    public void setCreditCardPositionLogType(String creditCardPositionLogType) {
        this.creditCardPositionLogType = creditCardPositionLogType;
    }

    public String getCreditCardPositionLogType() {
        return creditCardPositionLogType;
    }

    public void setCreditCardPositionLogSchedule(String creditCardPositionLogSchedule) {
        this.creditCardPositionLogSchedule = creditCardPositionLogSchedule;
    }

    public String getCreditCardPositionLogSchedule() {
        return creditCardPositionLogSchedule;
    }

    public void setCreditCardPositionLogUsageLog(org.museframework.bian.classes.Log creditCardPositionLogUsageLog) {
        this.creditCardPositionLogUsageLog = creditCardPositionLogUsageLog;
    }

    public org.museframework.bian.classes.Log getCreditCardPositionLogUsageLog() {
        return creditCardPositionLogUsageLog;
    }

    public void setCreditCardPositionLogUpdateLog(org.museframework.bian.classes.Log creditCardPositionLogUpdateLog) {
        this.creditCardPositionLogUpdateLog = creditCardPositionLogUpdateLog;
    }

    public org.museframework.bian.classes.Log getCreditCardPositionLogUpdateLog() {
        return creditCardPositionLogUpdateLog;
    }

    public void setCreditCardPositionLogAssociatedParty(String creditCardPositionLogAssociatedParty) {
        this.creditCardPositionLogAssociatedParty = creditCardPositionLogAssociatedParty;
    }

    public String getCreditCardPositionLogAssociatedParty() {
        return creditCardPositionLogAssociatedParty;
    }

    public void setCreditCardPositionLogBusinessUnitReference(org.museframework.bian.classes.BusinessUnit creditCardPositionLogBusinessUnitReference) {
        this.creditCardPositionLogBusinessUnitReference = creditCardPositionLogBusinessUnitReference;
    }

    public org.museframework.bian.classes.BusinessUnit getCreditCardPositionLogBusinessUnitReference() {
        return creditCardPositionLogBusinessUnitReference;
    }

    public void setCreditCardPositionLogCustomerReference(String creditCardPositionLogCustomerReference) {
        this.creditCardPositionLogCustomerReference = creditCardPositionLogCustomerReference;
    }

    public String getCreditCardPositionLogCustomerReference() {
        return creditCardPositionLogCustomerReference;
    }

    public void setCreditCardPositionLogServiceConfiguration(String creditCardPositionLogServiceConfiguration) {
        this.creditCardPositionLogServiceConfiguration = creditCardPositionLogServiceConfiguration;
    }

    public String getCreditCardPositionLogServiceConfiguration() {
        return creditCardPositionLogServiceConfiguration;
    }

    public void setCreditCardPositionLogPosition(org.museframework.bian.classes.Position creditCardPositionLogPosition) {
        this.creditCardPositionLogPosition = creditCardPositionLogPosition;
    }

    public org.museframework.bian.classes.Position getCreditCardPositionLogPosition() {
        return creditCardPositionLogPosition;
    }

    public void setCreditCardPositionLogPositionType(org.museframework.bian.classes.PositionType creditCardPositionLogPositionType) {
        this.creditCardPositionLogPositionType = creditCardPositionLogPositionType;
    }

    public org.museframework.bian.classes.PositionType getCreditCardPositionLogPositionType() {
        return creditCardPositionLogPositionType;
    }

    public void setCreditCardPositionLogPositionLimitTime(org.museframework.bian.classes.LimitArrangement creditCardPositionLogPositionLimitTime) {
        this.creditCardPositionLogPositionLimitTime = creditCardPositionLogPositionLimitTime;
    }

    public org.museframework.bian.classes.LimitArrangement getCreditCardPositionLogPositionLimitTime() {
        return creditCardPositionLogPositionLimitTime;
    }

    public void setCreditCardPositionLogReference(org.museframework.bian.classes.Log creditCardPositionLogReference) {
        this.creditCardPositionLogReference = creditCardPositionLogReference;
    }

    public org.museframework.bian.classes.Log getCreditCardPositionLogReference() {
        return creditCardPositionLogReference;
    }
}