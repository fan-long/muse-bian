package org.museframework.bian.marordexe.dto;

public class RetrievePositionRequest {
    private String marketorderexecutionid;

    private String positionid;

    public void setMarketorderexecutionid(String marketorderexecutionid) {
        this.marketorderexecutionid = marketorderexecutionid;
    }

    public String getMarketorderexecutionid() {
        return marketorderexecutionid;
    }

    public void setPositionid(String positionid) {
        this.positionid = positionid;
    }

    public String getPositionid() {
        return positionid;
    }
}