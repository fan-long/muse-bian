package org.museframework.bian.corbandir;

import org.museframework.bian.corbandir.dto.RegisterCorrespondentBankDirectoryEntryRequest;
import org.museframework.bian.corbandir.dto.RegisterCorrespondentBankDirectoryEntryResponse;
import org.museframework.bian.corbandir.dto.RequestCorrespondentBankDirectoryEntryRequest;
import org.museframework.bian.corbandir.dto.RequestCorrespondentBankDirectoryEntryResponse;
import org.museframework.bian.corbandir.dto.RetrieveCorrespondentBankDirectoryEntryRequest;
import org.museframework.bian.corbandir.dto.RetrieveCorrespondentBankDirectoryEntryResponse;
import org.museframework.bian.corbandir.dto.UpdateCorrespondentBankDirectoryEntryRequest;
import org.museframework.bian.corbandir.dto.UpdateCorrespondentBankDirectoryEntryResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Capture and maintain reference information about some type of entitity within Correspondent Bank Data Management.")
@GenericDomain(name="CorrespondentBankDirectory", group="CorrespondentBankDirectoryEntry")
public interface CrCorrespondentBankDirectoryEntry {
    @GenericDtxEndpoint
    @Description("InCR Register a new correspondent bank in the catalog")
    RegisterCorrespondentBankDirectoryEntryResponse registerCorrespondentBankDirectoryEntry(RegisterCorrespondentBankDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of a correspondent bank in the catalog")
    UpdateCorrespondentBankDirectoryEntryResponse updateCorrespondentBankDirectoryEntry(UpdateCorrespondentBankDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request that an existing entry is updated or revised")
    RequestCorrespondentBankDirectoryEntryResponse requestCorrespondentBankDirectoryEntry(RequestCorrespondentBankDirectoryEntryRequest req);

    @Description("ReCR Retrieve correspondent bank details from the catalog")
    RetrieveCorrespondentBankDirectoryEntryResponse retrieveCorrespondentBankDirectoryEntry(RetrieveCorrespondentBankDirectoryEntryRequest req);
}