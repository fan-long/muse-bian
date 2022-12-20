package org.museframework.bian.parlifman;

import org.museframework.bian.parlifman.dto.ExecuteDocumentationRequest;
import org.museframework.bian.parlifman.dto.ExecuteDocumentationResponse;
import org.museframework.bian.parlifman.dto.RequestDocumentationRequest;
import org.museframework.bian.parlifman.dto.RequestDocumentationResponse;
import org.museframework.bian.parlifman.dto.RetrieveDocumentationRequest;
import org.museframework.bian.parlifman.dto.RetrieveDocumentationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="PartyLifecycleManagement", group="Documentation")
public interface BqDocumentation {
    @GenericDtxEndpoint
    @Description("ExBQ Execute an automated action (e.g. input data about a document)")
    ExecuteDocumentationResponse executeDocumentation(ExecuteDocumentationRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention (e.g. handle a document exchange)")
    RequestDocumentationResponse requestDocumentation(RequestDocumentationRequest req);

    @Description("ReBQ Retrieve details about document processing for a party life-cycle procedure")
    RetrieveDocumentationResponse retrieveDocumentation(RetrieveDocumentationRequest req);
}