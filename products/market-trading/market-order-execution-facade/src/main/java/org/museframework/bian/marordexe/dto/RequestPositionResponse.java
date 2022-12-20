package org.museframework.bian.marordexe.dto;

public class RequestPositionResponse {
    private org.museframework.bian.marordexe.dto.bq.Position position;

    public void setPosition(org.museframework.bian.marordexe.dto.bq.Position position) {
        this.position = position;
    }

    public org.museframework.bian.marordexe.dto.bq.Position getPosition() {
        return position;
    }
}