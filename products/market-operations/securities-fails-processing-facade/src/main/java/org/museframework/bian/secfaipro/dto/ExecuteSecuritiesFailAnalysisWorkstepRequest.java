package org.museframework.bian.secfaipro.dto;

public class ExecuteSecuritiesFailAnalysisWorkstepRequest {
    private String securitiesfailsprocessingid;

    private String securitiesfailanalysisworkstepid;

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