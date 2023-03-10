package org.museframework.bian.partyauthentication.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class EvaluatePasswordRequest {
    @MetaField
    private String partyauthenticationid;

    @MetaField
    private String passwordid;

    @MetaField(ref=true)
    private org.museframework.bian.partyauthentication.dto.bq.Password password;

    public void setPartyauthenticationid(String partyauthenticationid) {
        this.partyauthenticationid = partyauthenticationid;
    }

    public String getPartyauthenticationid() {
        return partyauthenticationid;
    }

    public void setPasswordid(String passwordid) {
        this.passwordid = passwordid;
    }

    public String getPasswordid() {
        return passwordid;
    }

    public void setPassword(org.museframework.bian.partyauthentication.dto.bq.Password password) {
        this.password = password;
    }

    public org.museframework.bian.partyauthentication.dto.bq.Password getPassword() {
        return password;
    }
}