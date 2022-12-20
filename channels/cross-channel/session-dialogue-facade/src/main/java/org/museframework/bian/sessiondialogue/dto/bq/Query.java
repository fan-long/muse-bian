/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.sessiondialogue.dto.bq;

public class Query {
    /*The type of question/answer addressed in the session - e.g. branch location/hours*/
    private String queryType;

    /*Details the response and any customer reaction*/
    private String queryTaskResult;

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public String getQueryType() {
        return queryType;
    }

    public void setQueryTaskResult(String queryTaskResult) {
        this.queryTaskResult = queryTaskResult;
    }

    public String getQueryTaskResult() {
        return queryTaskResult;
    }
}