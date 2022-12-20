package org.museframework.bian.documentdirectory;

import org.museframework.bian.documentdirectory.dto.ExecuteDocumentVersionPropertiesRequest;
import org.museframework.bian.documentdirectory.dto.ExecuteDocumentVersionPropertiesResponse;
import org.museframework.bian.documentdirectory.dto.NotifyDocumentVersionPropertiesRequest;
import org.museframework.bian.documentdirectory.dto.NotifyDocumentVersionPropertiesResponse;
import org.museframework.bian.documentdirectory.dto.RegisterDocumentVersionPropertiesRequest;
import org.museframework.bian.documentdirectory.dto.RegisterDocumentVersionPropertiesResponse;
import org.museframework.bian.documentdirectory.dto.RequestDocumentVersionPropertiesRequest;
import org.museframework.bian.documentdirectory.dto.RequestDocumentVersionPropertiesResponse;
import org.museframework.bian.documentdirectory.dto.RetrieveDocumentVersionPropertiesRequest;
import org.museframework.bian.documentdirectory.dto.RetrieveDocumentVersionPropertiesResponse;
import org.museframework.bian.documentdirectory.dto.UpdateDocumentVersionPropertiesRequest;
import org.museframework.bian.documentdirectory.dto.UpdateDocumentVersionPropertiesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Document Update History Properties properties that represent a discrete aspect of the Document Update History Properties")
@GenericDomain(name="DocumentDirectory", group="DocumentVersionProperties")
public interface BqDocumentVersionProperties {
    @GenericDtxEndpoint
    @Description("Execute Document Version Properties")
    ExecuteDocumentVersionPropertiesResponse executeDocumentVersionProperties(ExecuteDocumentVersionPropertiesRequest req);

    @Description("Notify Document Version Properties")
    NotifyDocumentVersionPropertiesResponse notifyDocumentVersionProperties(NotifyDocumentVersionPropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Register Document Version Properties")
    RegisterDocumentVersionPropertiesResponse registerDocumentVersionProperties(RegisterDocumentVersionPropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Request Document Version Properties")
    RequestDocumentVersionPropertiesResponse requestDocumentVersionProperties(RequestDocumentVersionPropertiesRequest req);

    @Description("Retrieve Document Version Properties")
    RetrieveDocumentVersionPropertiesResponse retrieveDocumentVersionProperties(RetrieveDocumentVersionPropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Update Document Version Properties")
    UpdateDocumentVersionPropertiesResponse updateDocumentVersionProperties(UpdateDocumentVersionPropertiesRequest req);
}