package org.museframework.bian.productdirectory;

import org.museframework.bian.productdirectory.dto.RegisterProductDirectoryEntryRequest;
import org.museframework.bian.productdirectory.dto.RegisterProductDirectoryEntryResponse;
import org.museframework.bian.productdirectory.dto.RequestProductDirectoryEntryRequest;
import org.museframework.bian.productdirectory.dto.RequestProductDirectoryEntryResponse;
import org.museframework.bian.productdirectory.dto.RetrieveProductDirectoryEntryRequest;
import org.museframework.bian.productdirectory.dto.RetrieveProductDirectoryEntryResponse;
import org.museframework.bian.productdirectory.dto.UpdateProductDirectoryEntryRequest;
import org.museframework.bian.productdirectory.dto.UpdateProductDirectoryEntryResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Capture and maintain reference information about some type of entitity within Product Directory.")
@GenericDomain(name="ProductDirectory", group="ProductDirectoryEntry")
public interface CrProductDirectoryEntry {
    @GenericDtxEndpoint
    @Description("InCR Register a new product or service in the catalog")
    RegisterProductDirectoryEntryResponse registerProductDirectoryEntry(RegisterProductDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of a product or service in the catalog")
    UpdateProductDirectoryEntryResponse updateProductDirectoryEntry(UpdateProductDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request that an existing entry is updated or revised")
    RequestProductDirectoryEntryResponse requestProductDirectoryEntry(RequestProductDirectoryEntryRequest req);

    @Description("ReCR Retrieve product or service details from the catalog")
    RetrieveProductDirectoryEntryResponse retrieveProductDirectoryEntry(RetrieveProductDirectoryEntryRequest req);
}