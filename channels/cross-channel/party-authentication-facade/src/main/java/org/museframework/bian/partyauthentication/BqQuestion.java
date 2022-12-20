package org.museframework.bian.partyauthentication;

import org.museframework.bian.partyauthentication.dto.EvaluateQuestionRequest;
import org.museframework.bian.partyauthentication.dto.EvaluateQuestionResponse;
import org.museframework.bian.partyauthentication.dto.RetrieveQuestionRequest;
import org.museframework.bian.partyauthentication.dto.RetrieveQuestionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("All kind of verifications   Examples: Password verification")
@GenericDomain(name="PartyAuthentication", group="Question")
public interface BqQuestion {
    @GenericDtxEndpoint
    @Description("EvBQ Evaluate customer authenticity using secret questions")
    EvaluateQuestionResponse evaluateQuestion(EvaluateQuestionRequest req);

    @Description("ReBQ Retrieve details about a secret question evaluation")
    RetrieveQuestionResponse retrieveQuestion(RetrieveQuestionRequest req);
}