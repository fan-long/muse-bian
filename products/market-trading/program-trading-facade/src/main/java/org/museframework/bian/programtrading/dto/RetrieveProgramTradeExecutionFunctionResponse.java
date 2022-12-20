package org.museframework.bian.programtrading.dto;

public class RetrieveProgramTradeExecutionFunctionResponse {
    private org.museframework.bian.programtrading.dto.bq.ProgramTradeExecutionFunction programTradeExecutionFunction;

    public void setProgramTradeExecutionFunction(org.museframework.bian.programtrading.dto.bq.ProgramTradeExecutionFunction programTradeExecutionFunction) {
        this.programTradeExecutionFunction = programTradeExecutionFunction;
    }

    public org.museframework.bian.programtrading.dto.bq.ProgramTradeExecutionFunction getProgramTradeExecutionFunction() {
        return programTradeExecutionFunction;
    }
}