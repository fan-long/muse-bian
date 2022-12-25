/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.accountrecovery.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Writedown {
    /*Booking to the appropriate asset/liability account required to reflect anticipated loss*/
    @MetaField(0)
    private String accountwrite_downtransaction;

    /*Processing record for the write-down task within the account recovery process*/
    @MetaField(0)
    private String accountRecoveryCaseWrite_downTaskRecord;

    public void setAccountwrite_downtransaction(String accountwrite_downtransaction) {
        this.accountwrite_downtransaction = accountwrite_downtransaction;
    }

    public String getAccountwrite_downtransaction() {
        return accountwrite_downtransaction;
    }

    public void setAccountRecoveryCaseWrite_downTaskRecord(String accountRecoveryCaseWrite_downTaskRecord) {
        this.accountRecoveryCaseWrite_downTaskRecord = accountRecoveryCaseWrite_downTaskRecord;
    }

    public String getAccountRecoveryCaseWrite_downTaskRecord() {
        return accountRecoveryCaseWrite_downTaskRecord;
    }
}