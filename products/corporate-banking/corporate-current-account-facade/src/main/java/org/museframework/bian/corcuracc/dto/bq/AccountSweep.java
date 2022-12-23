/**/
package org.museframework.bian.corcuracc.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class AccountSweep {
    /*The type of sweep (e.g. periodic, threshold)*/
    @MetaField
    private String accountSweepType;

    /*Definition of the type of sweep*/
    @MetaField
    private String accountSweepDefinition;

    /*Sweep processing guidelines and scheduling rules*/
    @MetaField
    private String accountSweepApplicationSchedule;

    /*The set-up of the sweep facility*/
    @MetaField
    private String accountSweepConfiguration;

    /*The facility that the sweep is made to/from*/
    @MetaField
    private String targetAccount;

    /*Confirmation that the sweep processing is sanctioned as necessary*/
    @MetaField
    private String sweepMandate;

    /*Timing and or triggers for initiating sweep transaction*/
    @MetaField
    private String sweepProcessingSchedule;

    /*The transaction record for an applied sweep*/
    @MetaField
    private String sweepApplicationRecord;

    /*The facility that the sweep is made to/from*/
    @MetaField
    private String accountSweepTargetAccount;

    /*The amount transferred to or from the account*/
    @MetaField
    private String accountSweepAmount;

    /*The date and time the sweep is initiated*/
    @MetaField
    private String accountSweepExecutionDate;

    public void setAccountSweepType(String accountSweepType) {
        this.accountSweepType = accountSweepType;
    }

    public String getAccountSweepType() {
        return accountSweepType;
    }

    public void setAccountSweepDefinition(String accountSweepDefinition) {
        this.accountSweepDefinition = accountSweepDefinition;
    }

    public String getAccountSweepDefinition() {
        return accountSweepDefinition;
    }

    public void setAccountSweepApplicationSchedule(String accountSweepApplicationSchedule) {
        this.accountSweepApplicationSchedule = accountSweepApplicationSchedule;
    }

    public String getAccountSweepApplicationSchedule() {
        return accountSweepApplicationSchedule;
    }

    public void setAccountSweepConfiguration(String accountSweepConfiguration) {
        this.accountSweepConfiguration = accountSweepConfiguration;
    }

    public String getAccountSweepConfiguration() {
        return accountSweepConfiguration;
    }

    public void setTargetAccount(String targetAccount) {
        this.targetAccount = targetAccount;
    }

    public String getTargetAccount() {
        return targetAccount;
    }

    public void setSweepMandate(String sweepMandate) {
        this.sweepMandate = sweepMandate;
    }

    public String getSweepMandate() {
        return sweepMandate;
    }

    public void setSweepProcessingSchedule(String sweepProcessingSchedule) {
        this.sweepProcessingSchedule = sweepProcessingSchedule;
    }

    public String getSweepProcessingSchedule() {
        return sweepProcessingSchedule;
    }

    public void setSweepApplicationRecord(String sweepApplicationRecord) {
        this.sweepApplicationRecord = sweepApplicationRecord;
    }

    public String getSweepApplicationRecord() {
        return sweepApplicationRecord;
    }

    public void setAccountSweepTargetAccount(String accountSweepTargetAccount) {
        this.accountSweepTargetAccount = accountSweepTargetAccount;
    }

    public String getAccountSweepTargetAccount() {
        return accountSweepTargetAccount;
    }

    public void setAccountSweepAmount(String accountSweepAmount) {
        this.accountSweepAmount = accountSweepAmount;
    }

    public String getAccountSweepAmount() {
        return accountSweepAmount;
    }

    public void setAccountSweepExecutionDate(String accountSweepExecutionDate) {
        this.accountSweepExecutionDate = accountSweepExecutionDate;
    }

    public String getAccountSweepExecutionDate() {
        return accountSweepExecutionDate;
    }
}