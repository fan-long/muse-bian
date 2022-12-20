/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.cardclearing.dto.bq;

public class Matching {
    /*Details of the transaction matching processing*/
    private String matchingTaskResult;

    public void setMatchingTaskResult(String matchingTaskResult) {
        this.matchingTaskResult = matchingTaskResult;
    }

    public String getMatchingTaskResult() {
        return matchingTaskResult;
    }
}