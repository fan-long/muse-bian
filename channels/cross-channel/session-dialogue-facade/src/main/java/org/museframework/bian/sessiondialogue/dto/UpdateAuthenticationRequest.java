package org.museframework.bian.sessiondialogue.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateAuthenticationRequest {
    @MetaField
    private String sessiondialogueid;

    @MetaField
    private String authenticationid;

    @MetaField(ref=true)
    private org.museframework.bian.sessiondialogue.dto.bq.Authentication authentication;

    public void setSessiondialogueid(String sessiondialogueid) {
        this.sessiondialogueid = sessiondialogueid;
    }

    public String getSessiondialogueid() {
        return sessiondialogueid;
    }

    public void setAuthenticationid(String authenticationid) {
        this.authenticationid = authenticationid;
    }

    public String getAuthenticationid() {
        return authenticationid;
    }

    public void setAuthentication(org.museframework.bian.sessiondialogue.dto.bq.Authentication authentication) {
        this.authentication = authentication;
    }

    public org.museframework.bian.sessiondialogue.dto.bq.Authentication getAuthentication() {
        return authentication;
    }
}