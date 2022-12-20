package org.museframework.bian.merandacqadv;

import org.museframework.bian.merandacqadv.dto.ExchangeMACandidateSelectionandEvaluationTopicRequest;
import org.museframework.bian.merandacqadv.dto.ExchangeMACandidateSelectionandEvaluationTopicResponse;
import org.museframework.bian.merandacqadv.dto.ExecuteMACandidateSelectionandEvaluationTopicRequest;
import org.museframework.bian.merandacqadv.dto.ExecuteMACandidateSelectionandEvaluationTopicResponse;
import org.museframework.bian.merandacqadv.dto.InitiateMACandidateSelectionandEvaluationTopicRequest;
import org.museframework.bian.merandacqadv.dto.InitiateMACandidateSelectionandEvaluationTopicResponse;
import org.museframework.bian.merandacqadv.dto.NotifyMACandidateSelectionandEvaluationTopicRequest;
import org.museframework.bian.merandacqadv.dto.NotifyMACandidateSelectionandEvaluationTopicResponse;
import org.museframework.bian.merandacqadv.dto.RequestMACandidateSelectionandEvaluationTopicRequest;
import org.museframework.bian.merandacqadv.dto.RequestMACandidateSelectionandEvaluationTopicResponse;
import org.museframework.bian.merandacqadv.dto.RetrieveMACandidateSelectionandEvaluationTopicRequest;
import org.museframework.bian.merandacqadv.dto.RetrieveMACandidateSelectionandEvaluationTopicResponse;
import org.museframework.bian.merandacqadv.dto.UpdateMACandidateSelectionandEvaluationTopicRequest;
import org.museframework.bian.merandacqadv.dto.UpdateMACandidateSelectionandEvaluationTopicResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The M&A Candidate Selection and Evaluation Topic advice is one specific topic that can be included in providing M&A Candidate Selection and Evaluation Topic")
@GenericDomain(name="MergersandAcquisitionsAdvisory", group="MACandidateSelectionandEvaluationTopic")
public interface BqMACandidateSelectionandEvaluationTopic {
    @GenericDtxEndpoint
    @Description("Exchange M&A Candidate Selection and Evaluation Topic")
    ExchangeMACandidateSelectionandEvaluationTopicResponse exchangeMACandidateSelectionandEvaluationTopic(ExchangeMACandidateSelectionandEvaluationTopicRequest req);

    @GenericDtxEndpoint
    @Description("Execute M&A Candidate Selection and Evaluation Topic")
    ExecuteMACandidateSelectionandEvaluationTopicResponse executeMACandidateSelectionandEvaluationTopic(ExecuteMACandidateSelectionandEvaluationTopicRequest req);

    @GenericDtxEndpoint
    @Description("Initiate M&A Candidate Selection and Evaluation Topic")
    InitiateMACandidateSelectionandEvaluationTopicResponse initiateMACandidateSelectionandEvaluationTopic(InitiateMACandidateSelectionandEvaluationTopicRequest req);

    @Description("Notify M&A Candidate Selection and Evaluation Topic")
    NotifyMACandidateSelectionandEvaluationTopicResponse notifyMACandidateSelectionandEvaluationTopic(NotifyMACandidateSelectionandEvaluationTopicRequest req);

    @GenericDtxEndpoint
    @Description("Request M&A Candidate Selection and Evaluation Topic")
    RequestMACandidateSelectionandEvaluationTopicResponse requestMACandidateSelectionandEvaluationTopic(RequestMACandidateSelectionandEvaluationTopicRequest req);

    @Description("Retrieve M&A Candidate Selection and Evaluation Topic")
    RetrieveMACandidateSelectionandEvaluationTopicResponse retrieveMACandidateSelectionandEvaluationTopic(RetrieveMACandidateSelectionandEvaluationTopicRequest req);

    @GenericDtxEndpoint
    @Description("Update M&A Candidate Selection and Evaluation Topic")
    UpdateMACandidateSelectionandEvaluationTopicResponse updateMACandidateSelectionandEvaluationTopic(UpdateMACandidateSelectionandEvaluationTopicRequest req);
}