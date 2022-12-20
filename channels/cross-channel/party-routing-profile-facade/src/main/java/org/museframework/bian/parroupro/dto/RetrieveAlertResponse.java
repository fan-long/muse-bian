package org.museframework.bian.parroupro.dto;

public class RetrieveAlertResponse {
    private org.museframework.bian.parroupro.dto.bq.Alert alert;

    public void setAlert(org.museframework.bian.parroupro.dto.bq.Alert alert) {
        this.alert = alert;
    }

    public org.museframework.bian.parroupro.dto.bq.Alert getAlert() {
        return alert;
    }
}