package org.museframework.bian.documentdirectory;

import org.museframework.bian.documentdirectory.dto.ExecuteDocumentVerificationPropertiesRequest;
import org.museframework.bian.documentdirectory.dto.ExecuteDocumentVerificationPropertiesResponse;
import org.museframework.bian.documentdirectory.dto.NotifyDocumentVerificationPropertiesRequest;
import org.museframework.bian.documentdirectory.dto.NotifyDocumentVerificationPropertiesResponse;
import org.museframework.bian.documentdirectory.dto.RegisterDocumentVerificationPropertiesRequest;
import org.museframework.bian.documentdirectory.dto.RegisterDocumentVerificationPropertiesResponse;
import org.museframework.bian.documentdirectory.dto.RequestDocumentVerificationPropertiesRequest;
import org.museframework.bian.documentdirectory.dto.RequestDocumentVerificationPropertiesResponse;
import org.museframework.bian.documentdirectory.dto.RetrieveDocumentVerificationPropertiesRequest;
import org.museframework.bian.documentdirectory.dto.RetrieveDocumentVerificationPropertiesResponse;
import org.museframework.bian.documentdirectory.dto.UpdateDocumentVerificationPropertiesRequest;
import org.museframework.bian.documentdirectory.dto.UpdateDocumentVerificationPropertiesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Document Update History Properties properties that represent a discrete aspect of the Document Update History Properties")
@GenericDomain(name="DocumentDirectory", group="DocumentVerificationProperties")
public interface BqDocumentVerificationProperties {
    @GenericDtxEndpoint
    @Description("Execute Document Verification Properties")
    ExecuteDocumentVerificationPropertiesResponse executeDocumentVerificationProperties(ExecuteDocumentVerificationPropertiesRequest req);

    @Description("Notify Document Verification Properties")
    NotifyDocumentVerificationPropertiesResponse notifyDocumentVerificationProperties(NotifyDocumentVerificationPropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Register Document Verification Properties")
    RegisterDocumentVerificationPropertiesResponse registerDocumentVerificationProperties(RegisterDocumentVerificationPropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Request Document Verification Properties")
    RequestDocumentVerificationPropertiesResponse requestDocumentVerificationProperties(RequestDocumentVerificationPropertiesRequest req);

    @Description("Retrieve Document Verification Properties")
    RetrieveDocumentVerificationPropertiesResponse retrieveDocumentVerificationProperties(RetrieveDocumentVerificationPropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Update Document Verification Properties")
    UpdateDocumentVerificationPropertiesResponse updateDocumentVerificationProperties(UpdateDocumentVerificationPropertiesRequest req);
}