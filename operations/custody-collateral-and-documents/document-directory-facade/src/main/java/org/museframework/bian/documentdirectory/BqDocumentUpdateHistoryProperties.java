package org.museframework.bian.documentdirectory;

import org.museframework.bian.documentdirectory.dto.ExecuteDocumentUpdateHistoryPropertiesRequest;
import org.museframework.bian.documentdirectory.dto.ExecuteDocumentUpdateHistoryPropertiesResponse;
import org.museframework.bian.documentdirectory.dto.NotifyDocumentUpdateHistoryPropertiesRequest;
import org.museframework.bian.documentdirectory.dto.NotifyDocumentUpdateHistoryPropertiesResponse;
import org.museframework.bian.documentdirectory.dto.RegisterDocumentUpdateHistoryPropertiesRequest;
import org.museframework.bian.documentdirectory.dto.RegisterDocumentUpdateHistoryPropertiesResponse;
import org.museframework.bian.documentdirectory.dto.RequestDocumentUpdateHistoryPropertiesRequest;
import org.museframework.bian.documentdirectory.dto.RequestDocumentUpdateHistoryPropertiesResponse;
import org.museframework.bian.documentdirectory.dto.RetrieveDocumentUpdateHistoryPropertiesRequest;
import org.museframework.bian.documentdirectory.dto.RetrieveDocumentUpdateHistoryPropertiesResponse;
import org.museframework.bian.documentdirectory.dto.UpdateDocumentUpdateHistoryPropertiesRequest;
import org.museframework.bian.documentdirectory.dto.UpdateDocumentUpdateHistoryPropertiesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Document Update History Properties properties that represent a discrete aspect of the Document Update History Properties")
@GenericDomain(name="DocumentDirectory", group="DocumentUpdateHistoryProperties")
public interface BqDocumentUpdateHistoryProperties {
    @GenericDtxEndpoint
    @Description("Execute Document Update History Properties")
    ExecuteDocumentUpdateHistoryPropertiesResponse executeDocumentUpdateHistoryProperties(ExecuteDocumentUpdateHistoryPropertiesRequest req);

    @Description("Notify Document Update History Properties")
    NotifyDocumentUpdateHistoryPropertiesResponse notifyDocumentUpdateHistoryProperties(NotifyDocumentUpdateHistoryPropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Register Document Update History Properties")
    RegisterDocumentUpdateHistoryPropertiesResponse registerDocumentUpdateHistoryProperties(RegisterDocumentUpdateHistoryPropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Request Document Update History Properties")
    RequestDocumentUpdateHistoryPropertiesResponse requestDocumentUpdateHistoryProperties(RequestDocumentUpdateHistoryPropertiesRequest req);

    @Description("Retrieve Document Update History Properties")
    RetrieveDocumentUpdateHistoryPropertiesResponse retrieveDocumentUpdateHistoryProperties(RetrieveDocumentUpdateHistoryPropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Update Document Update History Properties")
    UpdateDocumentUpdateHistoryPropertiesResponse updateDocumentUpdateHistoryProperties(UpdateDocumentUpdateHistoryPropertiesRequest req);
}