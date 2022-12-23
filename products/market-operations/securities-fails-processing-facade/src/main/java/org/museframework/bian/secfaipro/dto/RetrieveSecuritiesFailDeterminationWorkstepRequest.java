package org.museframework.bian.secfaipro.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveSecuritiesFailDeterminationWorkstepRequest {
    @MetaField
    private String securitiesfailsprocessingid;

    @MetaField
    private String securitiesfaildeterminationworkstepid;

    public void setSecuritiesfailsprocessingid(String securitiesfailsprocessingid) {
        this.securitiesfailsprocessingid = securitiesfailsprocessingid;
    }

    public String getSecuritiesfailsprocessingid() {
        return securitiesfailsprocessingid;
    }

    public void setSecuritiesfaildeterminationworkstepid(String securitiesfaildeterminationworkstepid) {
        this.securitiesfaildeterminationworkstepid = securitiesfaildeterminationworkstepid;
    }

    public String getSecuritiesfaildeterminationworkstepid() {
        return securitiesfaildeterminationworkstepid;
    }
}