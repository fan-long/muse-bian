/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.accountrecovery.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Planning {
    /*Recovery tasks and targets added to the Account Recovery Case Resolution Schedule*/
    @MetaField(0)
    private String accountRecoveryPlan;

    /*Processing record for the planning task within the account recovery process*/
    @MetaField(0)
    private String accountRecoveryCasePlanningTaskRecord;

    public void setAccountRecoveryPlan(String accountRecoveryPlan) {
        this.accountRecoveryPlan = accountRecoveryPlan;
    }

    public String getAccountRecoveryPlan() {
        return accountRecoveryPlan;
    }

    public void setAccountRecoveryCasePlanningTaskRecord(String accountRecoveryCasePlanningTaskRecord) {
        this.accountRecoveryCasePlanningTaskRecord = accountRecoveryCasePlanningTaskRecord;
    }

    public String getAccountRecoveryCasePlanningTaskRecord() {
        return accountRecoveryCasePlanningTaskRecord;
    }
}