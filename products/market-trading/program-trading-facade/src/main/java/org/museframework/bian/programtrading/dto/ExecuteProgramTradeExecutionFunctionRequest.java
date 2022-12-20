package org.museframework.bian.programtrading.dto;

public class ExecuteProgramTradeExecutionFunctionRequest {
    private String programtradingid;

    private String programtradeexecutionfunctionid;

    private org.museframework.bian.programtrading.dto.bq.ProgramTradeExecutionFunction programTradeExecutionFunction;

    public void setProgramtradingid(String programtradingid) {
        this.programtradingid = programtradingid;
    }

    public String getProgramtradingid() {
        return programtradingid;
    }

    public void setProgramtradeexecutionfunctionid(String programtradeexecutionfunctionid) {
        this.programtradeexecutionfunctionid = programtradeexecutionfunctionid;
    }

    public String getProgramtradeexecutionfunctionid() {
        return programtradeexecutionfunctionid;
    }

    public void setProgramTradeExecutionFunction(org.museframework.bian.programtrading.dto.bq.ProgramTradeExecutionFunction programTradeExecutionFunction) {
        this.programTradeExecutionFunction = programTradeExecutionFunction;
    }

    public org.museframework.bian.programtrading.dto.bq.ProgramTradeExecutionFunction getProgramTradeExecutionFunction() {
        return programTradeExecutionFunction;
    }
}