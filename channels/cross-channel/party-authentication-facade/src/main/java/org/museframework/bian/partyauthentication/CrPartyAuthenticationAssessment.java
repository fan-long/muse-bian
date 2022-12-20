package org.museframework.bian.partyauthentication;

import org.museframework.bian.partyauthentication.dto.EvaluatePartyAuthenticationAssessmentRequest;
import org.museframework.bian.partyauthentication.dto.EvaluatePartyAuthenticationAssessmentResponse;
import org.museframework.bian.partyauthentication.dto.ExecutePartyAuthenticationAssessmentRequest;
import org.museframework.bian.partyauthentication.dto.ExecutePartyAuthenticationAssessmentResponse;
import org.museframework.bian.partyauthentication.dto.RequestPartyAuthenticationAssessmentRequest;
import org.museframework.bian.partyauthentication.dto.RequestPartyAuthenticationAssessmentResponse;
import org.museframework.bian.partyauthentication.dto.RetrievePartyAuthenticationAssessmentRequest;
import org.museframework.bian.partyauthentication.dto.RetrievePartyAuthenticationAssessmentResponse;
import org.museframework.bian.partyauthentication.dto.UpdatePartyAuthenticationAssessmentRequest;
import org.museframework.bian.partyauthentication.dto.UpdatePartyAuthenticationAssessmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("To test or assess an entity, possibly against some formal qualification or certification requirement within Party Authentication. ")
@GenericDomain(name="PartyAuthentication", group="PartyAuthenticationAssessment")
public interface CrPartyAuthenticationAssessment {
    @GenericDtxEndpoint
    @Description("EvCR Evaluate a customer's authenticity")
    EvaluatePartyAuthenticationAssessmentResponse evaluatePartyAuthenticationAssessment(EvaluatePartyAuthenticationAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of a customer authentication assessment")
    UpdatePartyAuthenticationAssessmentResponse updatePartyAuthenticationAssessment(UpdatePartyAuthenticationAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an automated action for an assessment (e.g. submit data)")
    ExecutePartyAuthenticationAssessmentResponse executePartyAuthenticationAssessment(ExecutePartyAuthenticationAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual interventions in an assessment (e.g. engage specialist)")
    RequestPartyAuthenticationAssessmentResponse requestPartyAuthenticationAssessment(RequestPartyAuthenticationAssessmentRequest req);

    @Description("ReCR Retrieve details about an authentication assessment")
    RetrievePartyAuthenticationAssessmentResponse retrievePartyAuthenticationAssessment(RetrievePartyAuthenticationAssessmentRequest req);
}