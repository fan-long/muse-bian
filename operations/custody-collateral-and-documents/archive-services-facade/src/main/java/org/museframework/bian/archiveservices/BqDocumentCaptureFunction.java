package org.museframework.bian.archiveservices;

import org.museframework.bian.archiveservices.dto.ExchangeDocumentCaptureFunctionRequest;
import org.museframework.bian.archiveservices.dto.ExchangeDocumentCaptureFunctionResponse;
import org.museframework.bian.archiveservices.dto.ExecuteDocumentCaptureFunctionRequest;
import org.museframework.bian.archiveservices.dto.ExecuteDocumentCaptureFunctionResponse;
import org.museframework.bian.archiveservices.dto.InitiateDocumentCaptureFunctionRequest;
import org.museframework.bian.archiveservices.dto.InitiateDocumentCaptureFunctionResponse;
import org.museframework.bian.archiveservices.dto.NotifyDocumentCaptureFunctionRequest;
import org.museframework.bian.archiveservices.dto.NotifyDocumentCaptureFunctionResponse;
import org.museframework.bian.archiveservices.dto.RequestDocumentCaptureFunctionRequest;
import org.museframework.bian.archiveservices.dto.RequestDocumentCaptureFunctionResponse;
import org.museframework.bian.archiveservices.dto.RetrieveDocumentCaptureFunctionRequest;
import org.museframework.bian.archiveservices.dto.RetrieveDocumentCaptureFunctionResponse;
import org.museframework.bian.archiveservices.dto.UpdateDocumentCaptureFunctionRequest;
import org.museframework.bian.archiveservices.dto.UpdateDocumentCaptureFunctionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An operational service or function supported within the Document Capture Function for doing Document Capture Function")
@GenericDomain(name="ArchiveServices", group="DocumentCaptureFunction")
public interface BqDocumentCaptureFunction {
    @GenericDtxEndpoint
    @Description("Exchange Document Capture Function")
    ExchangeDocumentCaptureFunctionResponse exchangeDocumentCaptureFunction(ExchangeDocumentCaptureFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Document Capture Function")
    ExecuteDocumentCaptureFunctionResponse executeDocumentCaptureFunction(ExecuteDocumentCaptureFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Document Capture Function")
    InitiateDocumentCaptureFunctionResponse initiateDocumentCaptureFunction(InitiateDocumentCaptureFunctionRequest req);

    @Description("Notify Document Capture Function")
    NotifyDocumentCaptureFunctionResponse notifyDocumentCaptureFunction(NotifyDocumentCaptureFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Request Document Capture Function")
    RequestDocumentCaptureFunctionResponse requestDocumentCaptureFunction(RequestDocumentCaptureFunctionRequest req);

    @Description("Retrieve Document Capture Function")
    RetrieveDocumentCaptureFunctionResponse retrieveDocumentCaptureFunction(RetrieveDocumentCaptureFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Update Document Capture Function")
    UpdateDocumentCaptureFunctionResponse updateDocumentCaptureFunction(UpdateDocumentCaptureFunctionRequest req);
}