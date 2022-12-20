package org.museframework.bian.frauddiagnosis.dto;

public class EvaluateFraudDiagnosisAnalysisResponse {
    private org.museframework.bian.frauddiagnosis.dto.cr.FraudDiagnosisAnalysis fraudDiagnosisAnalysis;

    public void setFraudDiagnosisAnalysis(org.museframework.bian.frauddiagnosis.dto.cr.FraudDiagnosisAnalysis fraudDiagnosisAnalysis) {
        this.fraudDiagnosisAnalysis = fraudDiagnosisAnalysis;
    }

    public org.museframework.bian.frauddiagnosis.dto.cr.FraudDiagnosisAnalysis getFraudDiagnosisAnalysis() {
        return fraudDiagnosisAnalysis;
    }
}