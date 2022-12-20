package org.museframework.bian.documentdirectory;

import org.museframework.bian.documentdirectory.dto.ExecuteDocumentReferencePropertiesRequest;
import org.museframework.bian.documentdirectory.dto.ExecuteDocumentReferencePropertiesResponse;
import org.museframework.bian.documentdirectory.dto.NotifyDocumentReferencePropertiesRequest;
import org.museframework.bian.documentdirectory.dto.NotifyDocumentReferencePropertiesResponse;
import org.museframework.bian.documentdirectory.dto.RegisterDocumentReferencePropertiesRequest;
import org.museframework.bian.documentdirectory.dto.RegisterDocumentReferencePropertiesResponse;
import org.museframework.bian.documentdirectory.dto.RequestDocumentReferencePropertiesRequest;
import org.museframework.bian.documentdirectory.dto.RequestDocumentReferencePropertiesResponse;
import org.museframework.bian.documentdirectory.dto.RetrieveDocumentReferencePropertiesRequest;
import org.museframework.bian.documentdirectory.dto.RetrieveDocumentReferencePropertiesResponse;
import org.museframework.bian.documentdirectory.dto.UpdateDocumentReferencePropertiesRequest;
import org.museframework.bian.documentdirectory.dto.UpdateDocumentReferencePropertiesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Document Update History Properties properties that represent a discrete aspect of the Document Update History Properties")
@GenericDomain(name="DocumentDirectory", group="DocumentReferenceProperties")
public interface BqDocumentReferenceProperties {
    @GenericDtxEndpoint
    @Description("Execute Document Reference Properties")
    ExecuteDocumentReferencePropertiesResponse executeDocumentReferenceProperties(ExecuteDocumentReferencePropertiesRequest req);

    @Description("Notify Document Reference Properties")
    NotifyDocumentReferencePropertiesResponse notifyDocumentReferenceProperties(NotifyDocumentReferencePropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Register Document Reference Properties")
    RegisterDocumentReferencePropertiesResponse registerDocumentReferenceProperties(RegisterDocumentReferencePropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Request Document Reference Properties")
    RequestDocumentReferencePropertiesResponse requestDocumentReferenceProperties(RequestDocumentReferencePropertiesRequest req);

    @Description("Retrieve Document Reference Properties")
    RetrieveDocumentReferencePropertiesResponse retrieveDocumentReferenceProperties(RetrieveDocumentReferencePropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Update Document Reference Properties")
    UpdateDocumentReferencePropertiesResponse updateDocumentReferenceProperties(UpdateDocumentReferencePropertiesRequest req);
}