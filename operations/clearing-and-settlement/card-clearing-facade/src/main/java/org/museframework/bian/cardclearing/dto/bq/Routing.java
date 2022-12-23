/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.cardclearing.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Routing {
    /*Details of the transaction routing processing*/
    @MetaField
    private String routingTaskResult;

    public void setRoutingTaskResult(String routingTaskResult) {
        this.routingTaskResult = routingTaskResult;
    }

    public String getRoutingTaskResult() {
        return routingTaskResult;
    }
}