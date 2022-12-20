package org.museframework.bian.secfaipro.dto;

public class ExecuteSecuritiesFailDeterminationWorkstepRequest {
    private String securitiesfailsprocessingid;

    private String securitiesfaildeterminationworkstepid;

    private org.museframework.bian.secfaipro.dto.bq.SecuritiesFailDeterminationWorkstep securitiesFailDeterminationWorkstep;

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

    public void setSecuritiesFailDeterminationWorkstep(org.museframework.bian.secfaipro.dto.bq.SecuritiesFailDeterminationWorkstep securitiesFailDeterminationWorkstep) {
        this.securitiesFailDeterminationWorkstep = securitiesFailDeterminationWorkstep;
    }

    public org.museframework.bian.secfaipro.dto.bq.SecuritiesFailDeterminationWorkstep getSecuritiesFailDeterminationWorkstep() {
        return securitiesFailDeterminationWorkstep;
    }
}