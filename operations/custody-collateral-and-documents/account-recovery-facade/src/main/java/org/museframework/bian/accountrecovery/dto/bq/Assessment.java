/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.accountrecovery.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.Assessment
@MetaDto
public class Assessment {
    /*Processing record for the assessment task within the account recovery process*/
    @MetaField(0)
    private String accountRecoveryCaseAssessmentTaskRecord;

    public void setAccountRecoveryCaseAssessmentTaskRecord(String accountRecoveryCaseAssessmentTaskRecord) {
        this.accountRecoveryCaseAssessmentTaskRecord = accountRecoveryCaseAssessmentTaskRecord;
    }

    public String getAccountRecoveryCaseAssessmentTaskRecord() {
        return accountRecoveryCaseAssessmentTaskRecord;
    }
}