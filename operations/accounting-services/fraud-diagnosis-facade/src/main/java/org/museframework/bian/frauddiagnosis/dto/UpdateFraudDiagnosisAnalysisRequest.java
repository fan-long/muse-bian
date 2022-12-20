package org.museframework.bian.frauddiagnosis.dto;

public class UpdateFraudDiagnosisAnalysisRequest {
    private String frauddiagnosisid;

    private org.museframework.bian.frauddiagnosis.dto.cr.FraudDiagnosisAnalysis fraudDiagnosisAnalysis;

    public void setFrauddiagnosisid(String frauddiagnosisid) {
        this.frauddiagnosisid = frauddiagnosisid;
    }

    public String getFrauddiagnosisid() {
        return frauddiagnosisid;
    }

    public void setFraudDiagnosisAnalysis(org.museframework.bian.frauddiagnosis.dto.cr.FraudDiagnosisAnalysis fraudDiagnosisAnalysis) {
        this.fraudDiagnosisAnalysis = fraudDiagnosisAnalysis;
    }

    public org.museframework.bian.frauddiagnosis.dto.cr.FraudDiagnosisAnalysis getFraudDiagnosisAnalysis() {
        return fraudDiagnosisAnalysis;
    }
}