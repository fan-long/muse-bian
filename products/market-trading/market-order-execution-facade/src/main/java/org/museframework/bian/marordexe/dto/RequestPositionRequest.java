package org.museframework.bian.marordexe.dto;

public class RequestPositionRequest {
    private String marketorderexecutionid;

    private String positionid;

    private org.museframework.bian.marordexe.dto.bq.Position position;

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

    public void setPosition(org.museframework.bian.marordexe.dto.bq.Position position) {
        this.position = position;
    }

    public org.museframework.bian.marordexe.dto.bq.Position getPosition() {
        return position;
    }
}