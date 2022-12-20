package org.museframework.bian.cuscamexe;

import org.museframework.bian.cuscamexe.dto.InitiateAnalysisFeedbackRequest;
import org.museframework.bian.cuscamexe.dto.InitiateAnalysisFeedbackResponse;
import org.museframework.bian.cuscamexe.dto.RequestAnalysisFeedbackRequest;
import org.museframework.bian.cuscamexe.dto.RequestAnalysisFeedbackResponse;
import org.museframework.bian.cuscamexe.dto.RetrieveAnalysisFeedbackRequest;
import org.museframework.bian.cuscamexe.dto.RetrieveAnalysisFeedbackResponse;
import org.museframework.bian.cuscamexe.dto.UpdateAnalysisFeedbackRequest;
import org.museframework.bian.cuscamexe.dto.UpdateAnalysisFeedbackResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="CustomerCampaignExecution", group="AnalysisFeedback")
public interface BqAnalysisFeedback {
    @GenericDtxEndpoint
    @Description("InBQ Initiate campaign execution analysis")
    InitiateAnalysisFeedbackResponse initiateAnalysisFeedback(InitiateAnalysisFeedbackRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of campaign execution activity/performance analysis")
    UpdateAnalysisFeedbackResponse updateAnalysisFeedback(UpdateAnalysisFeedbackRequest req);

    @GenericDtxEndpoint
    @Description("ReBQ Request manual intervention in campaign analysis")
    RequestAnalysisFeedbackResponse requestAnalysisFeedback(RequestAnalysisFeedbackRequest req);

    @Description("ReBQ Retrieve details about customer campaign analysis activity")
    RetrieveAnalysisFeedbackResponse retrieveAnalysisFeedback(RetrieveAnalysisFeedbackRequest req);
}