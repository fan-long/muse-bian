package org.museframework.bian.secfaipro.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateSecurityTradingFailsProcedureRequest {
    @MetaField(ref=true)
    private org.museframework.bian.secfaipro.dto.cr.SecurityTradingFailsProcedure securityTradingFailsProcedure;

    public void setSecurityTradingFailsProcedure(org.museframework.bian.secfaipro.dto.cr.SecurityTradingFailsProcedure securityTradingFailsProcedure) {
        this.securityTradingFailsProcedure = securityTradingFailsProcedure;
    }

    public org.museframework.bian.secfaipro.dto.cr.SecurityTradingFailsProcedure getSecurityTradingFailsProcedure() {
        return securityTradingFailsProcedure;
    }
}