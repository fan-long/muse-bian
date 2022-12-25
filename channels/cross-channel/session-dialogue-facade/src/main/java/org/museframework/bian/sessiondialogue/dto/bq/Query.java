/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.sessiondialogue.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Query {
    /*The type of question/answer addressed in the session - e.g. branch location/hours*/
    @MetaField(0)
    private String queryType;

    /*Details the response and any customer reaction*/
    @MetaField(0)
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