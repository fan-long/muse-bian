package org.museframework.bian.partyauthentication;

import org.museframework.bian.partyauthentication.dto.EvaluateDocumentRequest;
import org.museframework.bian.partyauthentication.dto.EvaluateDocumentResponse;
import org.museframework.bian.partyauthentication.dto.RetrieveDocumentRequest;
import org.museframework.bian.partyauthentication.dto.RetrieveDocumentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("All kind of verifications   Examples: Password verification")
@GenericDomain(name="PartyAuthentication", group="Document")
public interface BqDocument {
    @GenericDtxEndpoint
    @Description("EvBQ Evaluate customer authenticity using documents")
    EvaluateDocumentResponse evaluateDocument(EvaluateDocumentRequest req);

    @Description("ReBQ Retrieve details about a document evaluation")
    RetrieveDocumentResponse retrieveDocument(RetrieveDocumentRequest req);
}