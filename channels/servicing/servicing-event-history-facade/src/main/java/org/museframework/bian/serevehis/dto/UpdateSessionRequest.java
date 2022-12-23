package org.museframework.bian.serevehis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateSessionRequest {
    @MetaField
    private String servicingeventhistoryid;

    @MetaField
    private String sessionid;

    @MetaField(ref=true)
    private org.museframework.bian.serevehis.dto.bq.Session session;

    public void setServicingeventhistoryid(String servicingeventhistoryid) {
        this.servicingeventhistoryid = servicingeventhistoryid;
    }

    public String getServicingeventhistoryid() {
        return servicingeventhistoryid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }

    public String getSessionid() {
        return sessionid;
    }

    public void setSession(org.museframework.bian.serevehis.dto.bq.Session session) {
        this.session = session;
    }

    public org.museframework.bian.serevehis.dto.bq.Session getSession() {
        return session;
    }
}