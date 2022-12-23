package org.museframework.bian.secfaipro.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveSecuritiesFailAnalysisWorkstepRequest {
    @MetaField
    private String securitiesfailsprocessingid;

    @MetaField
    private String securitiesfailanalysisworkstepid;

    public void setSecuritiesfailsprocessingid(String securitiesfailsprocessingid) {
        this.securitiesfailsprocessingid = securitiesfailsprocessingid;
    }

    public String getSecuritiesfailsprocessingid() {
        return securitiesfailsprocessingid;
    }

    public void setSecuritiesfailanalysisworkstepid(String securitiesfailanalysisworkstepid) {
        this.securitiesfailanalysisworkstepid = securitiesfailanalysisworkstepid;
    }

    public String getSecuritiesfailanalysisworkstepid() {
        return securitiesfailanalysisworkstepid;
    }
}