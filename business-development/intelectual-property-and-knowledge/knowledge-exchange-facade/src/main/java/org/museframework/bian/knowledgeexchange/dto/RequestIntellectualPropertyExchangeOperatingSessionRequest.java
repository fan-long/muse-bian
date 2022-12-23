package org.museframework.bian.knowledgeexchange.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestIntellectualPropertyExchangeOperatingSessionRequest {
    @MetaField
    private String knowledgeexchangeid;

    @MetaField(ref=true)
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