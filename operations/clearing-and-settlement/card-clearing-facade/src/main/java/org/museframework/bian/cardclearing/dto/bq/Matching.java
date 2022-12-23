/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.cardclearing.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Matching {
    /*Details of the transaction matching processing*/
    @MetaField
    private String matchingTaskResult;

    public void setMatchingTaskResult(String matchingTaskResult) {
        this.matchingTaskResult = matchingTaskResult;
    }

    public String getMatchingTaskResult() {
        return matchingTaskResult;
    }
}