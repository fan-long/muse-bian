/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.fraudresolution.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CaseAnalysis {
    /*The result of the case analysis*/
    @MetaField(0)
    private String fraudCaseRootCause;

    public void setFraudCaseRootCause(String fraudCaseRootCause) {
        this.fraudCaseRootCause = fraudCaseRootCause;
    }

    public String getFraudCaseRootCause() {
        return fraudCaseRootCause;
    }
}