package org.museframework.bian.contacthandler.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateSessionRequest {
    @MetaField
    private String contacthandlerid;

    @MetaField
    private String sessionid;

    @MetaField(ref=true)
    private org.museframework.bian.contacthandler.dto.bq.Session session;

    public void setContacthandlerid(String contacthandlerid) {
        this.contacthandlerid = contacthandlerid;
    }

    public String getContacthandlerid() {
        return contacthandlerid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }

    public String getSessionid() {
        return sessionid;
    }

    public void setSession(org.museframework.bian.contacthandler.dto.bq.Session session) {
        this.session = session;
    }

    public org.museframework.bian.contacthandler.dto.bq.Session getSession() {
        return session;
    }
}