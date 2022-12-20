package org.museframework.bian.documentdirectory;

import org.museframework.bian.documentdirectory.dto.ControlDocumentDirectoryEntryRequest;
import org.museframework.bian.documentdirectory.dto.ControlDocumentDirectoryEntryResponse;
import org.museframework.bian.documentdirectory.dto.ExecuteDocumentDirectoryEntryRequest;
import org.museframework.bian.documentdirectory.dto.ExecuteDocumentDirectoryEntryResponse;
import org.museframework.bian.documentdirectory.dto.NotifyDocumentDirectoryEntryRequest;
import org.museframework.bian.documentdirectory.dto.NotifyDocumentDirectoryEntryResponse;
import org.museframework.bian.documentdirectory.dto.RegisterDocumentDirectoryEntryRequest;
import org.museframework.bian.documentdirectory.dto.RegisterDocumentDirectoryEntryResponse;
import org.museframework.bian.documentdirectory.dto.RequestDocumentDirectoryEntryRequest;
import org.museframework.bian.documentdirectory.dto.RequestDocumentDirectoryEntryResponse;
import org.museframework.bian.documentdirectory.dto.RetrieveDocumentDirectoryEntryRequest;
import org.museframework.bian.documentdirectory.dto.RetrieveDocumentDirectoryEntryResponse;
import org.museframework.bian.documentdirectory.dto.UpdateDocumentDirectoryEntryRequest;
import org.museframework.bian.documentdirectory.dto.UpdateDocumentDirectoryEntryResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Capture and maintain reference information about some type of entitity within Document Library.")
@GenericDomain(name="DocumentDirectory", group="DocumentDirectoryEntry")
public interface CrDocumentDirectoryEntry {
    @GenericDtxEndpoint
    @Description("Request Document Directory Entry")
    RequestDocumentDirectoryEntryResponse requestDocumentDirectoryEntry(RequestDocumentDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("Control Document Directory Entry")
    ControlDocumentDirectoryEntryResponse controlDocumentDirectoryEntry(ControlDocumentDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("Execute Document Directory Entry")
    ExecuteDocumentDirectoryEntryResponse executeDocumentDirectoryEntry(ExecuteDocumentDirectoryEntryRequest req);

    @Description("Notify Document Directory Entry")
    NotifyDocumentDirectoryEntryResponse notifyDocumentDirectoryEntry(NotifyDocumentDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("Register Document Directory Entry")
    RegisterDocumentDirectoryEntryResponse registerDocumentDirectoryEntry(RegisterDocumentDirectoryEntryRequest req);

    @Description("Retrieve Document Directory Entry")
    RetrieveDocumentDirectoryEntryResponse retrieveDocumentDirectoryEntry(RetrieveDocumentDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("Update Document Directory Entry")
    UpdateDocumentDirectoryEntryResponse updateDocumentDirectoryEntry(UpdateDocumentDirectoryEntryRequest req);
}