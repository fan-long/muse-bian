package org.museframework.bian.marketresearch;

import org.museframework.bian.marketresearch.dto.ExecuteGeneralMarketResearchDirectoryEntryRequest;
import org.museframework.bian.marketresearch.dto.ExecuteGeneralMarketResearchDirectoryEntryResponse;
import org.museframework.bian.marketresearch.dto.RegisterGeneralMarketResearchDirectoryEntryRequest;
import org.museframework.bian.marketresearch.dto.RegisterGeneralMarketResearchDirectoryEntryResponse;
import org.museframework.bian.marketresearch.dto.RequestGeneralMarketResearchDirectoryEntryRequest;
import org.museframework.bian.marketresearch.dto.RequestGeneralMarketResearchDirectoryEntryResponse;
import org.museframework.bian.marketresearch.dto.RetrieveGeneralMarketResearchDirectoryEntryRequest;
import org.museframework.bian.marketresearch.dto.RetrieveGeneralMarketResearchDirectoryEntryResponse;
import org.museframework.bian.marketresearch.dto.UpdateGeneralMarketResearchDirectoryEntryRequest;
import org.museframework.bian.marketresearch.dto.UpdateGeneralMarketResearchDirectoryEntryResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Capture and maintain reference information about some type of entitity within Market Research.")
@GenericDomain(name="MarketResearch", group="GeneralMarketResearchDirectoryEntry")
public interface CrGeneralMarketResearchDirectoryEntry {
    @GenericDtxEndpoint
    @Description("InCR Register or establish a market research viewpoint")
    RegisterGeneralMarketResearchDirectoryEntryResponse registerGeneralMarketResearchDirectoryEntry(RegisterGeneralMarketResearchDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update the details or make-up of a market research viewpoint")
    UpdateGeneralMarketResearchDirectoryEntryResponse updateGeneralMarketResearchDirectoryEntry(UpdateGeneralMarketResearchDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Automatically extract details of a maintained market research viewpoint")
    ExecuteGeneralMarketResearchDirectoryEntryResponse executeGeneralMarketResearchDirectoryEntry(ExecuteGeneralMarketResearchDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request a viewpoint is refreshed or adjusted in some manner")
    RequestGeneralMarketResearchDirectoryEntryResponse requestGeneralMarketResearchDirectoryEntry(RequestGeneralMarketResearchDirectoryEntryRequest req);

    @Description("ReCR Retrieve details about and the content of a maintained market research viewpoint")
    RetrieveGeneralMarketResearchDirectoryEntryResponse retrieveGeneralMarketResearchDirectoryEntry(RetrieveGeneralMarketResearchDirectoryEntryRequest req);
}