package org.museframework.bian.issdevtra.dto;

public class RetrieveInternalNotificationResponse {
    private org.museframework.bian.issdevtra.dto.bq.InternalNotification internalNotification;

    public void setInternalNotification(org.museframework.bian.issdevtra.dto.bq.InternalNotification internalNotification) {
        this.internalNotification = internalNotification;
    }

    public org.museframework.bian.issdevtra.dto.bq.InternalNotification getInternalNotification() {
        return internalNotification;
    }
}