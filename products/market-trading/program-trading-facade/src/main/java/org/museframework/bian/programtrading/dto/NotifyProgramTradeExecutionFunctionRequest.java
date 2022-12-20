package org.museframework.bian.programtrading.dto;

public class NotifyProgramTradeExecutionFunctionRequest {
    private String programtradingid;

    private String programtradeexecutionfunctionid;

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
}