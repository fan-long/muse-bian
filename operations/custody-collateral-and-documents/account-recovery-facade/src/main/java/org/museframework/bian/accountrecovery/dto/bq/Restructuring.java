/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.accountrecovery.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Restructuring {
    /*Target dates for account restructuring/set-up added to the Account Recovery Case Resolution Schedule*/
    @MetaField
    private String accountRecoveryRestructuringSchedule;

    /*Processing record for the restructuring task within the account recovery process*/
    @MetaField
    private String accountRecoveryCaseRestructuringTaskRecord;

    public void setAccountRecoveryRestructuringSchedule(String accountRecoveryRestructuringSchedule) {
        this.accountRecoveryRestructuringSchedule = accountRecoveryRestructuringSchedule;
    }

    public String getAccountRecoveryRestructuringSchedule() {
        return accountRecoveryRestructuringSchedule;
    }

    public void setAccountRecoveryCaseRestructuringTaskRecord(String accountRecoveryCaseRestructuringTaskRecord) {
        this.accountRecoveryCaseRestructuringTaskRecord = accountRecoveryCaseRestructuringTaskRecord;
    }

    public String getAccountRecoveryCaseRestructuringTaskRecord() {
        return accountRecoveryCaseRestructuringTaskRecord;
    }
}