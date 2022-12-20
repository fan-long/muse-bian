package org.museframework.bian.serevehis.dto;

public class RetrieveSessionResponse {
    private org.museframework.bian.serevehis.dto.bq.Session session;

    public void setSession(org.museframework.bian.serevehis.dto.bq.Session session) {
        this.session = session;
    }

    public org.museframework.bian.serevehis.dto.bq.Session getSession() {
        return session;
    }
}