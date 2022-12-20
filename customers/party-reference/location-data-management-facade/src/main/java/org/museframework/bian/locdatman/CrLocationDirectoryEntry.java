package org.museframework.bian.locdatman;

import org.museframework.bian.locdatman.dto.ExecuteLocationDirectoryEntryRequest;
import org.museframework.bian.locdatman.dto.ExecuteLocationDirectoryEntryResponse;
import org.museframework.bian.locdatman.dto.RegisterLocationDirectoryEntryRequest;
import org.museframework.bian.locdatman.dto.RegisterLocationDirectoryEntryResponse;
import org.museframework.bian.locdatman.dto.RequestLocationDirectoryEntryRequest;
import org.museframework.bian.locdatman.dto.RequestLocationDirectoryEntryResponse;
import org.museframework.bian.locdatman.dto.RetrieveLocationDirectoryEntryRequest;
import org.museframework.bian.locdatman.dto.RetrieveLocationDirectoryEntryResponse;
import org.museframework.bian.locdatman.dto.UpdateLocationDirectoryEntryRequest;
import org.museframework.bian.locdatman.dto.UpdateLocationDirectoryEntryResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Capture and maintain reference information about some type of entitity within Location Data Management.")
@GenericDomain(name="LocationDataManagement", group="LocationDirectoryEntry")
public interface CrLocationDirectoryEntry {
    @GenericDtxEndpoint
    @Description("InCR Register a location in the catalog")
    RegisterLocationDirectoryEntryResponse registerLocationDirectoryEntry(RegisterLocationDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details about the location's directory entry")
    UpdateLocationDirectoryEntryResponse updateLocationDirectoryEntry(UpdateLocationDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention with an entry (e.g. refresh content)")
    RequestLocationDirectoryEntryResponse requestLocationDirectoryEntry(RequestLocationDirectoryEntryRequest req);

    @Description("ReCR Retrieve details about a location directory entry")
    RetrieveLocationDirectoryEntryResponse retrieveLocationDirectoryEntry(RetrieveLocationDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an automated action against an entry")
    ExecuteLocationDirectoryEntryResponse executeLocationDirectoryEntry(ExecuteLocationDirectoryEntryRequest req);
}