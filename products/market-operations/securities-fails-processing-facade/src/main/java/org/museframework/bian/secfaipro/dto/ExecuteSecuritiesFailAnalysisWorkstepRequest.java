package org.museframework.bian.secfaipro.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteSecuritiesFailAnalysisWorkstepRequest {
    @MetaField
    private String securitiesfailsprocessingid;

    @MetaField
    private String securitiesfailanalysisworkstepid;

    @MetaField(ref=true)
    private org.museframework.bian.secfaipro.dto.bq.SecuritiesFailAnalysisWorkstep securitiesFailAnalysisWorkstep;

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

    public void setSecuritiesFailAnalysisWorkstep(org.museframework.bian.secfaipro.dto.bq.SecuritiesFailAnalysisWorkstep securitiesFailAnalysisWorkstep) {
        this.securitiesFailAnalysisWorkstep = securitiesFailAnalysisWorkstep;
    }

    public org.museframework.bian.secfaipro.dto.bq.SecuritiesFailAnalysisWorkstep getSecuritiesFailAnalysisWorkstep() {
        return securitiesFailAnalysisWorkstep;
    }
}