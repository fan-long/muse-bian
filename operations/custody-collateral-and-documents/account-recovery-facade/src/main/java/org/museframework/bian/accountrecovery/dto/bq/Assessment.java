/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.accountrecovery.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Assessment extends org.museframework.bian.classes.Assessment {
    /*Processing record for the assessment task within the account recovery process*/
    @MetaField
    private String accountRecoveryCaseAssessmentTaskRecord;

    public void setAccountRecoveryCaseAssessmentTaskRecord(String accountRecoveryCaseAssessmentTaskRecord) {
        this.accountRecoveryCaseAssessmentTaskRecord = accountRecoveryCaseAssessmentTaskRecord;
    }

    public String getAccountRecoveryCaseAssessmentTaskRecord() {
        return accountRecoveryCaseAssessmentTaskRecord;
    }
}