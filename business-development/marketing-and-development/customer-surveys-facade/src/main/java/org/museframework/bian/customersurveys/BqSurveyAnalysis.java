package org.museframework.bian.customersurveys;

import org.museframework.bian.customersurveys.dto.InitiateSurveyAnalysisRequest;
import org.museframework.bian.customersurveys.dto.InitiateSurveyAnalysisResponse;
import org.museframework.bian.customersurveys.dto.RequestSurveyAnalysisRequest;
import org.museframework.bian.customersurveys.dto.RequestSurveyAnalysisResponse;
import org.museframework.bian.customersurveys.dto.RetrieveSurveyAnalysisRequest;
import org.museframework.bian.customersurveys.dto.RetrieveSurveyAnalysisResponse;
import org.museframework.bian.customersurveys.dto.UpdateSurveyAnalysisRequest;
import org.museframework.bian.customersurveys.dto.UpdateSurveyAnalysisResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="CustomerSurveys", group="SurveyAnalysis")
public interface BqSurveyAnalysis {
    @GenericDtxEndpoint
    @Description("InBQ Initiate survey result consolidation and analysis")
    InitiateSurveyAnalysisResponse initiateSurveyAnalysis(InitiateSurveyAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details about customer survey analysis")
    UpdateSurveyAnalysisResponse updateSurveyAnalysis(UpdateSurveyAnalysisRequest req);

    @GenericDtxEndpoint
    @Description("ReBQ Request manual intervention in survey analysis")
    RequestSurveyAnalysisResponse requestSurveyAnalysis(RequestSurveyAnalysisRequest req);

    @Description("ReBQ Retrieve details about a customer survey analysis")
    RetrieveSurveyAnalysisResponse retrieveSurveyAnalysis(RetrieveSurveyAnalysisRequest req);
}