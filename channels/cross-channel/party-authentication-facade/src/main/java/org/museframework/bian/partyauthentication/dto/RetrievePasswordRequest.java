package org.museframework.bian.partyauthentication.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrievePasswordRequest {
    @MetaField
    private String partyauthenticationid;

    @MetaField
    private String passwordid;

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
}