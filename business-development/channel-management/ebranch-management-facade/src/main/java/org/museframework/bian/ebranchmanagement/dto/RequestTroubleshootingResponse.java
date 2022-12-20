package org.museframework.bian.ebranchmanagement.dto;

public class RequestTroubleshootingResponse {
    private org.museframework.bian.ebranchmanagement.dto.bq.Troubleshooting troubleshooting;

    public void setTroubleshooting(org.museframework.bian.ebranchmanagement.dto.bq.Troubleshooting troubleshooting) {
        this.troubleshooting = troubleshooting;
    }

    public org.museframework.bian.ebranchmanagement.dto.bq.Troubleshooting getTroubleshooting() {
        return troubleshooting;
    }
}