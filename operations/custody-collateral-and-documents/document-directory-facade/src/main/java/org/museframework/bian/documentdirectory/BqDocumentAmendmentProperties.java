package org.museframework.bian.documentdirectory;

import org.museframework.bian.documentdirectory.dto.ExecuteDocumentAmendmentPropertiesRequest;
import org.museframework.bian.documentdirectory.dto.ExecuteDocumentAmendmentPropertiesResponse;
import org.museframework.bian.documentdirectory.dto.NotifyDocumentAmendmentPropertiesRequest;
import org.museframework.bian.documentdirectory.dto.NotifyDocumentAmendmentPropertiesResponse;
import org.museframework.bian.documentdirectory.dto.RegisterDocumentAmendmentPropertiesRequest;
import org.museframework.bian.documentdirectory.dto.RegisterDocumentAmendmentPropertiesResponse;
import org.museframework.bian.documentdirectory.dto.RequestDocumentAmendmentPropertiesRequest;
import org.museframework.bian.documentdirectory.dto.RequestDocumentAmendmentPropertiesResponse;
import org.museframework.bian.documentdirectory.dto.RetrieveDocumentAmendmentPropertiesRequest;
import org.museframework.bian.documentdirectory.dto.RetrieveDocumentAmendmentPropertiesResponse;
import org.museframework.bian.documentdirectory.dto.UpdateDocumentAmendmentPropertiesRequest;
import org.museframework.bian.documentdirectory.dto.UpdateDocumentAmendmentPropertiesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Document Update History Properties properties that represent a discrete aspect of the Document Update History Properties")
@GenericDomain(name="DocumentDirectory", group="DocumentAmendmentProperties")
public interface BqDocumentAmendmentProperties {
    @GenericDtxEndpoint
    @Description("Execute Document Amendment Properties")
    ExecuteDocumentAmendmentPropertiesResponse executeDocumentAmendmentProperties(ExecuteDocumentAmendmentPropertiesRequest req);

    @Description("Notify Document Amendment Properties")
    NotifyDocumentAmendmentPropertiesResponse notifyDocumentAmendmentProperties(NotifyDocumentAmendmentPropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Register Document Amendment Properties")
    RegisterDocumentAmendmentPropertiesResponse registerDocumentAmendmentProperties(RegisterDocumentAmendmentPropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Request Document Amendment Properties")
    RequestDocumentAmendmentPropertiesResponse requestDocumentAmendmentProperties(RequestDocumentAmendmentPropertiesRequest req);

    @Description("Retrieve Document Amendment Properties")
    RetrieveDocumentAmendmentPropertiesResponse retrieveDocumentAmendmentProperties(RetrieveDocumentAmendmentPropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Update Document Amendment Properties")
    UpdateDocumentAmendmentPropertiesResponse updateDocumentAmendmentProperties(UpdateDocumentAmendmentPropertiesRequest req);
}