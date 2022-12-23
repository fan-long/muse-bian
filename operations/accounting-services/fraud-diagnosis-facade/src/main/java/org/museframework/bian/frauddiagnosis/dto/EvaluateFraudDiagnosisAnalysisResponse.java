package org.museframework.bian.frauddiagnosis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class EvaluateFraudDiagnosisAnalysisResponse {
    @MetaField(ref=true)
    private org.museframework.bian.frauddiagnosis.dto.cr.FraudDiagnosisAnalysis fraudDiagnosisAnalysis;

    public void setFraudDiagnosisAnalysis(org.museframework.bian.frauddiagnosis.dto.cr.FraudDiagnosisAnalysis fraudDiagnosisAnalysis) {
        this.fraudDiagnosisAnalysis = fraudDiagnosisAnalysis;
    }

    public org.museframework.bian.frauddiagnosis.dto.cr.FraudDiagnosisAnalysis getFraudDiagnosisAnalysis() {
        return fraudDiagnosisAnalysis;
    }
}