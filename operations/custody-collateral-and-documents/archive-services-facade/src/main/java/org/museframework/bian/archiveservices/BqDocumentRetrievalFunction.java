package org.museframework.bian.archiveservices;

import org.museframework.bian.archiveservices.dto.ExchangeDocumentRetrievalFunctionRequest;
import org.museframework.bian.archiveservices.dto.ExchangeDocumentRetrievalFunctionResponse;
import org.museframework.bian.archiveservices.dto.ExecuteDocumentRetrievalFunctionRequest;
import org.museframework.bian.archiveservices.dto.ExecuteDocumentRetrievalFunctionResponse;
import org.museframework.bian.archiveservices.dto.InitiateDocumentRetrievalFunctionRequest;
import org.museframework.bian.archiveservices.dto.InitiateDocumentRetrievalFunctionResponse;
import org.museframework.bian.archiveservices.dto.NotifyDocumentRetrievalFunctionRequest;
import org.museframework.bian.archiveservices.dto.NotifyDocumentRetrievalFunctionResponse;
import org.museframework.bian.archiveservices.dto.RequestDocumentRetrievalFunctionRequest;
import org.museframework.bian.archiveservices.dto.RequestDocumentRetrievalFunctionResponse;
import org.museframework.bian.archiveservices.dto.RetrieveDocumentRetrievalFunctionRequest;
import org.museframework.bian.archiveservices.dto.RetrieveDocumentRetrievalFunctionResponse;
import org.museframework.bian.archiveservices.dto.UpdateDocumentRetrievalFunctionRequest;
import org.museframework.bian.archiveservices.dto.UpdateDocumentRetrievalFunctionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An operational service or function supported within the Document Capture Function for doing Document Capture Function")
@GenericDomain(name="ArchiveServices", group="DocumentRetrievalFunction")
public interface BqDocumentRetrievalFunction {
    @GenericDtxEndpoint
    @Description("Exchange Document Retrieval Function")
    ExchangeDocumentRetrievalFunctionResponse exchangeDocumentRetrievalFunction(ExchangeDocumentRetrievalFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Document Retrieval Function")
    ExecuteDocumentRetrievalFunctionResponse executeDocumentRetrievalFunction(ExecuteDocumentRetrievalFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Document Retrieval Function")
    InitiateDocumentRetrievalFunctionResponse initiateDocumentRetrievalFunction(InitiateDocumentRetrievalFunctionRequest req);

    @Description("Notify Document Retrieval Function")
    NotifyDocumentRetrievalFunctionResponse notifyDocumentRetrievalFunction(NotifyDocumentRetrievalFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Request Document Retrieval Function")
    RequestDocumentRetrievalFunctionResponse requestDocumentRetrievalFunction(RequestDocumentRetrievalFunctionRequest req);

    @Description("Retrieve Document Retrieval Function")
    RetrieveDocumentRetrievalFunctionResponse retrieveDocumentRetrievalFunction(RetrieveDocumentRetrievalFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Update Document Retrieval Function")
    UpdateDocumentRetrievalFunctionResponse updateDocumentRetrievalFunction(UpdateDocumentRetrievalFunctionRequest req);
}