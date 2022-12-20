package org.museframework.bian.knowledgeexchange.dto;

public class ExchangeIntellectualPropertyExchangeOperatingSessionRequest {
    private String knowledgeexchangeid;

    private org.museframework.bian.knowledgeexchange.dto.cr.IntellectualPropertyExchangeOperatingSession intellectualPropertyExchangeOperatingSession;

    public void setKnowledgeexchangeid(String knowledgeexchangeid) {
        this.knowledgeexchangeid = knowledgeexchangeid;
    }

    public String getKnowledgeexchangeid() {
        return knowledgeexchangeid;
    }

    public void setIntellectualPropertyExchangeOperatingSession(org.museframework.bian.knowledgeexchange.dto.cr.IntellectualPropertyExchangeOperatingSession intellectualPropertyExchangeOperatingSession) {
        this.intellectualPropertyExchangeOperatingSession = intellectualPropertyExchangeOperatingSession;
    }

    public org.museframework.bian.knowledgeexchange.dto.cr.IntellectualPropertyExchangeOperatingSession getIntellectualPropertyExchangeOperatingSession() {
        return intellectualPropertyExchangeOperatingSession;
    }
}