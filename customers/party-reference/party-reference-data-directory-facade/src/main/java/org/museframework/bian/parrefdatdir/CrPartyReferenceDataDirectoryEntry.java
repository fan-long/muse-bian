package org.museframework.bian.parrefdatdir;

import org.museframework.bian.parrefdatdir.dto.ExecutePartyReferenceDataDirectoryEntryRequest;
import org.museframework.bian.parrefdatdir.dto.ExecutePartyReferenceDataDirectoryEntryResponse;
import org.museframework.bian.parrefdatdir.dto.RegisterPartyReferenceDataDirectoryEntryRequest;
import org.museframework.bian.parrefdatdir.dto.RegisterPartyReferenceDataDirectoryEntryResponse;
import org.museframework.bian.parrefdatdir.dto.RequestPartyReferenceDataDirectoryEntryRequest;
import org.museframework.bian.parrefdatdir.dto.RequestPartyReferenceDataDirectoryEntryResponse;
import org.museframework.bian.parrefdatdir.dto.RetrievePartyReferenceDataDirectoryEntryRequest;
import org.museframework.bian.parrefdatdir.dto.RetrievePartyReferenceDataDirectoryEntryResponse;
import org.museframework.bian.parrefdatdir.dto.UpdatePartyReferenceDataDirectoryEntryRequest;
import org.museframework.bian.parrefdatdir.dto.UpdatePartyReferenceDataDirectoryEntryResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Capture and maintain reference information about some type of entitity within Party Reference Data Directory.")
@GenericDomain(name="PartyReferenceDataDirectory", group="PartyReferenceDataDirectoryEntry")
public interface CrPartyReferenceDataDirectoryEntry {
    @GenericDtxEndpoint
    @Description("InCR Register a customer entity in the catalog")
    RegisterPartyReferenceDataDirectoryEntryResponse registerPartyReferenceDataDirectoryEntry(RegisterPartyReferenceDataDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details about the customer's directory entry")
    UpdatePartyReferenceDataDirectoryEntryResponse updatePartyReferenceDataDirectoryEntry(UpdatePartyReferenceDataDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention with an entry (e.g. refresh content)")
    RequestPartyReferenceDataDirectoryEntryResponse requestPartyReferenceDataDirectoryEntry(RequestPartyReferenceDataDirectoryEntryRequest req);

    @Description("ReCR Retrieve details about a customer directory entry")
    RetrievePartyReferenceDataDirectoryEntryResponse retrievePartyReferenceDataDirectoryEntry(RetrievePartyReferenceDataDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an automated action against an entry")
    ExecutePartyReferenceDataDirectoryEntryResponse executePartyReferenceDataDirectoryEntry(ExecutePartyReferenceDataDirectoryEntryRequest req);
}