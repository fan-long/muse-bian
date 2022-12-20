package org.museframework.bian.finmarres;

import org.museframework.bian.finmarres.dto.ExecuteFinancialMarketResearchDirectoryEntryRequest;
import org.museframework.bian.finmarres.dto.ExecuteFinancialMarketResearchDirectoryEntryResponse;
import org.museframework.bian.finmarres.dto.RegisterFinancialMarketResearchDirectoryEntryRequest;
import org.museframework.bian.finmarres.dto.RegisterFinancialMarketResearchDirectoryEntryResponse;
import org.museframework.bian.finmarres.dto.RequestFinancialMarketResearchDirectoryEntryRequest;
import org.museframework.bian.finmarres.dto.RequestFinancialMarketResearchDirectoryEntryResponse;
import org.museframework.bian.finmarres.dto.RetrieveFinancialMarketResearchDirectoryEntryRequest;
import org.museframework.bian.finmarres.dto.RetrieveFinancialMarketResearchDirectoryEntryResponse;
import org.museframework.bian.finmarres.dto.UpdateFinancialMarketResearchDirectoryEntryRequest;
import org.museframework.bian.finmarres.dto.UpdateFinancialMarketResearchDirectoryEntryResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Capture and maintain reference information about some type of entitity within Financial Market Research.")
@GenericDomain(name="FinancialMarketResearch", group="FinancialMarketResearchDirectoryEntry")
public interface CrFinancialMarketResearchDirectoryEntry {
    @GenericDtxEndpoint
    @Description("InCR Register or establish a financial market research viewpoint")
    RegisterFinancialMarketResearchDirectoryEntryResponse registerFinancialMarketResearchDirectoryEntry(RegisterFinancialMarketResearchDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update the details or make-up of a financial market research viewpoint")
    UpdateFinancialMarketResearchDirectoryEntryResponse updateFinancialMarketResearchDirectoryEntry(UpdateFinancialMarketResearchDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Automatically extract details of a maintained financial market research viewpoint")
    ExecuteFinancialMarketResearchDirectoryEntryResponse executeFinancialMarketResearchDirectoryEntry(ExecuteFinancialMarketResearchDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request a viewpoint is refreshed or adjusted in some manner")
    RequestFinancialMarketResearchDirectoryEntryResponse requestFinancialMarketResearchDirectoryEntry(RequestFinancialMarketResearchDirectoryEntryRequest req);

    @Description("ReCR Retrieve details about and the content of a maintained financial market research viewpoint")
    RetrieveFinancialMarketResearchDirectoryEntryResponse retrieveFinancialMarketResearchDirectoryEntry(RetrieveFinancialMarketResearchDirectoryEntryRequest req);
}