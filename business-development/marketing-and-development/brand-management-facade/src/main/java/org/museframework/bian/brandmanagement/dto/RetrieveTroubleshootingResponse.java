package org.museframework.bian.brandmanagement.dto;

public class RetrieveTroubleshootingResponse {
    private org.museframework.bian.brandmanagement.dto.bq.Troubleshooting troubleshooting;

    public void setTroubleshooting(org.museframework.bian.brandmanagement.dto.bq.Troubleshooting troubleshooting) {
        this.troubleshooting = troubleshooting;
    }

    public org.museframework.bian.brandmanagement.dto.bq.Troubleshooting getTroubleshooting() {
        return troubleshooting;
    }
}