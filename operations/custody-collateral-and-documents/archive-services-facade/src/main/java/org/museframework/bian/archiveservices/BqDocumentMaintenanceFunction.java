package org.museframework.bian.archiveservices;

import org.museframework.bian.archiveservices.dto.ExchangeDocumentMaintenanceFunctionRequest;
import org.museframework.bian.archiveservices.dto.ExchangeDocumentMaintenanceFunctionResponse;
import org.museframework.bian.archiveservices.dto.ExecuteDocumentMaintenanceFunctionRequest;
import org.museframework.bian.archiveservices.dto.ExecuteDocumentMaintenanceFunctionResponse;
import org.museframework.bian.archiveservices.dto.InitiateDocumentMaintenanceFunctionRequest;
import org.museframework.bian.archiveservices.dto.InitiateDocumentMaintenanceFunctionResponse;
import org.museframework.bian.archiveservices.dto.NotifyDocumentMaintenanceFunctionRequest;
import org.museframework.bian.archiveservices.dto.NotifyDocumentMaintenanceFunctionResponse;
import org.museframework.bian.archiveservices.dto.RequestDocumentMaintenanceFunctionRequest;
import org.museframework.bian.archiveservices.dto.RequestDocumentMaintenanceFunctionResponse;
import org.museframework.bian.archiveservices.dto.RetrieveDocumentMaintenanceFunctionRequest;
import org.museframework.bian.archiveservices.dto.RetrieveDocumentMaintenanceFunctionResponse;
import org.museframework.bian.archiveservices.dto.UpdateDocumentMaintenanceFunctionRequest;
import org.museframework.bian.archiveservices.dto.UpdateDocumentMaintenanceFunctionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An operational service or function supported within the Document Capture Function for doing Document Capture Function")
@GenericDomain(name="ArchiveServices", group="DocumentMaintenanceFunction")
public interface BqDocumentMaintenanceFunction {
    @GenericDtxEndpoint
    @Description("Exchange Document Maintenance Function")
    ExchangeDocumentMaintenanceFunctionResponse exchangeDocumentMaintenanceFunction(ExchangeDocumentMaintenanceFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Document Maintenance Function")
    ExecuteDocumentMaintenanceFunctionResponse executeDocumentMaintenanceFunction(ExecuteDocumentMaintenanceFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Document Maintenance Function")
    InitiateDocumentMaintenanceFunctionResponse initiateDocumentMaintenanceFunction(InitiateDocumentMaintenanceFunctionRequest req);

    @Description("Notify Document Maintenance Function")
    NotifyDocumentMaintenanceFunctionResponse notifyDocumentMaintenanceFunction(NotifyDocumentMaintenanceFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Request Document Maintenance Function")
    RequestDocumentMaintenanceFunctionResponse requestDocumentMaintenanceFunction(RequestDocumentMaintenanceFunctionRequest req);

    @Description("Retrieve Document Maintenance Function")
    RetrieveDocumentMaintenanceFunctionResponse retrieveDocumentMaintenanceFunction(RetrieveDocumentMaintenanceFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Update Document Maintenance Function")
    UpdateDocumentMaintenanceFunctionResponse updateDocumentMaintenanceFunction(UpdateDocumentMaintenanceFunctionRequest req);
}