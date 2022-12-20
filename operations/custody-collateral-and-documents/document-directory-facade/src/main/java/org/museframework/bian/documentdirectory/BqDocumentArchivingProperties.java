package org.museframework.bian.documentdirectory;

import org.museframework.bian.documentdirectory.dto.ExecuteDocumentArchivingPropertiesRequest;
import org.museframework.bian.documentdirectory.dto.ExecuteDocumentArchivingPropertiesResponse;
import org.museframework.bian.documentdirectory.dto.NotifyDocumentArchivingPropertiesRequest;
import org.museframework.bian.documentdirectory.dto.NotifyDocumentArchivingPropertiesResponse;
import org.museframework.bian.documentdirectory.dto.RegisterDocumentArchivingPropertiesRequest;
import org.museframework.bian.documentdirectory.dto.RegisterDocumentArchivingPropertiesResponse;
import org.museframework.bian.documentdirectory.dto.RequestDocumentArchivingPropertiesRequest;
import org.museframework.bian.documentdirectory.dto.RequestDocumentArchivingPropertiesResponse;
import org.museframework.bian.documentdirectory.dto.RetrieveDocumentArchivingPropertiesRequest;
import org.museframework.bian.documentdirectory.dto.RetrieveDocumentArchivingPropertiesResponse;
import org.museframework.bian.documentdirectory.dto.UpdateDocumentArchivingPropertiesRequest;
import org.museframework.bian.documentdirectory.dto.UpdateDocumentArchivingPropertiesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Document Update History Properties properties that represent a discrete aspect of the Document Update History Properties")
@GenericDomain(name="DocumentDirectory", group="DocumentArchivingProperties")
public interface BqDocumentArchivingProperties {
    @GenericDtxEndpoint
    @Description("Execute Document Archiving Properties")
    ExecuteDocumentArchivingPropertiesResponse executeDocumentArchivingProperties(ExecuteDocumentArchivingPropertiesRequest req);

    @Description("Notify Document Archiving Properties")
    NotifyDocumentArchivingPropertiesResponse notifyDocumentArchivingProperties(NotifyDocumentArchivingPropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Register Document Archiving Properties")
    RegisterDocumentArchivingPropertiesResponse registerDocumentArchivingProperties(RegisterDocumentArchivingPropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Request Document Archiving Properties")
    RequestDocumentArchivingPropertiesResponse requestDocumentArchivingProperties(RequestDocumentArchivingPropertiesRequest req);

    @Description("Retrieve Document Archiving Properties")
    RetrieveDocumentArchivingPropertiesResponse retrieveDocumentArchivingProperties(RetrieveDocumentArchivingPropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Update Document Archiving Properties")
    UpdateDocumentArchivingPropertiesResponse updateDocumentArchivingProperties(UpdateDocumentArchivingPropertiesRequest req);
}