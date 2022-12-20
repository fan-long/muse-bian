/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.cardclearing.dto.bq;

public class Routing {
    /*Details of the transaction routing processing*/
    private String routingTaskResult;

    public void setRoutingTaskResult(String routingTaskResult) {
        this.routingTaskResult = routingTaskResult;
    }

    public String getRoutingTaskResult() {
        return routingTaskResult;
    }
}