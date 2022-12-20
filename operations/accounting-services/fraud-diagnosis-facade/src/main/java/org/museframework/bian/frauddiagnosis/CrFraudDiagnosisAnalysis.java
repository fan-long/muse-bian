package org.museframework.bian.frauddiagnosis;

import org.museframework.bian.frauddiagnosis.dto.EvaluateFraudDiagnosisAnalysisRequest;
import org.museframework.bian.frauddiagnosis.dto.EvaluateFraudDiagnosisAnalysisResponse;
import org.museframework.bian.frauddiagnosis.dto.RetrieveFraudDiagnosisAnalysisRequest;
import org.museframework.bian.frauddiagnosis.dto.RetrieveFraudDiagnosisAnalysisResponse;
import org.museframework.bian.frauddiagnosis.dto.UpdateFraudDiagnosisAnalysisRequest;
import org.museframework.bian.frauddiagnosis.dto.UpdateFraudDiagnosisAnalysisResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Analyze the performance or behavior of some on-going activity or entity  within Fraud Diagnosis.  Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.  Analyze the performance or behavior of some on-going activity or entity. Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.")
@GenericDomain(name="FraudDiagnosis", group="FraudDiagnosisAnalysis")
public interface CrFraudDiagnosisAnalysis {
    @GenericDtxEndpoint
    @Description("EvCR Start a fraud diagnosis evaluation on a transaction")
    EvaluateFraudDiagnosisAnalysisResponse evaluateFraudDiagnosisAnalysis(EvaluateFraudDiagnosisAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details for an active fraud diagnosis")
    UpdateFraudDiagnosisAnalysisResponse updateFraudDiagnosisAnalysis(UpdateFraudDiagnosisAnalysisRequest req);

    @Description("ReCR Retrieve details about a fraud diagnosis")
    RetrieveFraudDiagnosisAnalysisResponse retrieveFraudDiagnosisAnalysis(RetrieveFraudDiagnosisAnalysisRequest req);
}