package org.museframework.bian.legentdir;

import org.museframework.bian.legentdir.dto.ExecuteLegalEntityDirectoryEntryRequest;
import org.museframework.bian.legentdir.dto.ExecuteLegalEntityDirectoryEntryResponse;
import org.museframework.bian.legentdir.dto.RegisterLegalEntityDirectoryEntryRequest;
import org.museframework.bian.legentdir.dto.RegisterLegalEntityDirectoryEntryResponse;
import org.museframework.bian.legentdir.dto.RequestLegalEntityDirectoryEntryRequest;
import org.museframework.bian.legentdir.dto.RequestLegalEntityDirectoryEntryResponse;
import org.museframework.bian.legentdir.dto.RetrieveLegalEntityDirectoryEntryRequest;
import org.museframework.bian.legentdir.dto.RetrieveLegalEntityDirectoryEntryResponse;
import org.museframework.bian.legentdir.dto.UpdateLegalEntityDirectoryEntryRequest;
import org.museframework.bian.legentdir.dto.UpdateLegalEntityDirectoryEntryResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Capture and maintain reference information about some type of entitity within Legal Entity Directory.")
@GenericDomain(name="LegalEntityDirectory", group="LegalEntityDirectoryEntry")
public interface CrLegalEntityDirectoryEntry {
    @GenericDtxEndpoint
    @Description("InCR Register a new legal entity in the catalog")
    RegisterLegalEntityDirectoryEntryResponse registerLegalEntityDirectoryEntry(RegisterLegalEntityDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details about the legal entity directory entry")
    UpdateLegalEntityDirectoryEntryResponse updateLegalEntityDirectoryEntry(UpdateLegalEntityDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention with an entry (e.g. refresh content)")
    RequestLegalEntityDirectoryEntryResponse requestLegalEntityDirectoryEntry(RequestLegalEntityDirectoryEntryRequest req);

    @Description("ReCR Retrieve details about a legal entity directory entry")
    RetrieveLegalEntityDirectoryEntryResponse retrieveLegalEntityDirectoryEntry(RetrieveLegalEntityDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an automated action against an entry")
    ExecuteLegalEntityDirectoryEntryResponse executeLegalEntityDirectoryEntry(ExecuteLegalEntityDirectoryEntryRequest req);
}