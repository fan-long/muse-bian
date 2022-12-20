package org.museframework.bian.procamexe;

import org.museframework.bian.procamexe.dto.InitiateAnalysisFeedbackRequest;
import org.museframework.bian.procamexe.dto.InitiateAnalysisFeedbackResponse;
import org.museframework.bian.procamexe.dto.RequestAnalysisFeedbackRequest;
import org.museframework.bian.procamexe.dto.RequestAnalysisFeedbackResponse;
import org.museframework.bian.procamexe.dto.RetrieveAnalysisFeedbackRequest;
import org.museframework.bian.procamexe.dto.RetrieveAnalysisFeedbackResponse;
import org.museframework.bian.procamexe.dto.UpdateAnalysisFeedbackRequest;
import org.museframework.bian.procamexe.dto.UpdateAnalysisFeedbackResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="ProspectCampaignExecution", group="AnalysisFeedback")
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

    @Description("ReBQ Retrieve details about prospect campaign analysis activity")
    RetrieveAnalysisFeedbackResponse retrieveAnalysisFeedback(RetrieveAnalysisFeedbackRequest req);
}