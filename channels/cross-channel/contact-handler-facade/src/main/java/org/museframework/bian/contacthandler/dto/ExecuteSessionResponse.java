package org.museframework.bian.contacthandler.dto;

public class ExecuteSessionResponse {
    private org.museframework.bian.contacthandler.dto.bq.Session session;

    public void setSession(org.museframework.bian.contacthandler.dto.bq.Session session) {
        this.session = session;
    }

    public org.museframework.bian.contacthandler.dto.bq.Session getSession() {
        return session;
    }
}