package org.museframework.bian.dirdebman;

import org.museframework.bian.dirdebman.dto.RegisterDirectDebitMandateDirectoryEntryRequest;
import org.museframework.bian.dirdebman.dto.RegisterDirectDebitMandateDirectoryEntryResponse;
import org.museframework.bian.dirdebman.dto.RetrieveDirectDebitMandateDirectoryEntryRequest;
import org.museframework.bian.dirdebman.dto.RetrieveDirectDebitMandateDirectoryEntryResponse;
import org.museframework.bian.dirdebman.dto.UpdateDirectDebitMandateDirectoryEntryRequest;
import org.museframework.bian.dirdebman.dto.UpdateDirectDebitMandateDirectoryEntryResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Capture and maintain reference information about some type of entitity within Direct Debit Mandate.")
@GenericDomain(name="DirectDebitMandate", group="DirectDebitMandateDirectoryEntry")
public interface CrDirectDebitMandateDirectoryEntry {
    @GenericDtxEndpoint
    @Description("InCR Register a new direct debit")
    RegisterDirectDebitMandateDirectoryEntryResponse registerDirectDebitMandateDirectoryEntry(RegisterDirectDebitMandateDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of an existing collection of DD mandates maintained for a corporate customer")
    UpdateDirectDebitMandateDirectoryEntryResponse updateDirectDebitMandateDirectoryEntry(UpdateDirectDebitMandateDirectoryEntryRequest req);

    @Description("ReCR Retrieve details about a collection of DD mandates")
    RetrieveDirectDebitMandateDirectoryEntryResponse retrieveDirectDebitMandateDirectoryEntry(RetrieveDirectDebitMandateDirectoryEntryRequest req);
}