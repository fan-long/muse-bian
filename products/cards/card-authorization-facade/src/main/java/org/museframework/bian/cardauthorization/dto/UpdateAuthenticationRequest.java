package org.museframework.bian.cardauthorization.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateAuthenticationRequest {
    @MetaField
    private String cardauthorizationid;

    @MetaField
    private String authenticationid;

    @MetaField(ref=true)
    private org.museframework.bian.cardauthorization.dto.bq.Authentication authentication;

    public void setCardauthorizationid(String cardauthorizationid) {
        this.cardauthorizationid = cardauthorizationid;
    }

    public String getCardauthorizationid() {
        return cardauthorizationid;
    }

    public void setAuthenticationid(String authenticationid) {
        this.authenticationid = authenticationid;
    }

    public String getAuthenticationid() {
        return authenticationid;
    }

    public void setAuthentication(org.museframework.bian.cardauthorization.dto.bq.Authentication authentication) {
        this.authentication = authentication;
    }

    public org.museframework.bian.cardauthorization.dto.bq.Authentication getAuthentication() {
        return authentication;
    }
}