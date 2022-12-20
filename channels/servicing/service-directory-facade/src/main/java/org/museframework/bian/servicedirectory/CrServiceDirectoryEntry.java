package org.museframework.bian.servicedirectory;

import org.museframework.bian.servicedirectory.dto.ControlServiceDirectoryEntryRequest;
import org.museframework.bian.servicedirectory.dto.ControlServiceDirectoryEntryResponse;
import org.museframework.bian.servicedirectory.dto.ExecuteServiceDirectoryEntryRequest;
import org.museframework.bian.servicedirectory.dto.ExecuteServiceDirectoryEntryResponse;
import org.museframework.bian.servicedirectory.dto.NotifyServiceDirectoryEntryRequest;
import org.museframework.bian.servicedirectory.dto.NotifyServiceDirectoryEntryResponse;
import org.museframework.bian.servicedirectory.dto.RegisterServiceDirectoryEntryRequest;
import org.museframework.bian.servicedirectory.dto.RegisterServiceDirectoryEntryResponse;
import org.museframework.bian.servicedirectory.dto.RequestServiceDirectoryEntryRequest;
import org.museframework.bian.servicedirectory.dto.RequestServiceDirectoryEntryResponse;
import org.museframework.bian.servicedirectory.dto.RetrieveServiceDirectoryEntryRequest;
import org.museframework.bian.servicedirectory.dto.RetrieveServiceDirectoryEntryResponse;
import org.museframework.bian.servicedirectory.dto.UpdateServiceDirectoryEntryRequest;
import org.museframework.bian.servicedirectory.dto.UpdateServiceDirectoryEntryResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Capture and maintain reference information about some type of entitity within Service Directory.")
@GenericDomain(name="ServiceDirectory", group="ServiceDirectoryEntry")
public interface CrServiceDirectoryEntry {
    @GenericDtxEndpoint
    @Description("Control Service Directory Entry")
    ControlServiceDirectoryEntryResponse controlServiceDirectoryEntry(ControlServiceDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("Execute Service Directory Entry")
    ExecuteServiceDirectoryEntryResponse executeServiceDirectoryEntry(ExecuteServiceDirectoryEntryRequest req);

    @Description("Notify Service Directory Entry")
    NotifyServiceDirectoryEntryResponse notifyServiceDirectoryEntry(NotifyServiceDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("Register Service Directory Entry")
    RegisterServiceDirectoryEntryResponse registerServiceDirectoryEntry(RegisterServiceDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("Request Service Directory Entry")
    RequestServiceDirectoryEntryResponse requestServiceDirectoryEntry(RequestServiceDirectoryEntryRequest req);

    @Description("Retrieve Service Directory Entry")
    RetrieveServiceDirectoryEntryResponse retrieveServiceDirectoryEntry(RetrieveServiceDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("Update Service Directory Entry")
    UpdateServiceDirectoryEntryResponse updateServiceDirectoryEntry(UpdateServiceDirectoryEntryRequest req);
}