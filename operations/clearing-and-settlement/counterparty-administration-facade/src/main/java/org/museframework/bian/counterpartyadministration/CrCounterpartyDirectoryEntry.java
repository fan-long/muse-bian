package org.museframework.bian.counterpartyadministration;

import org.museframework.bian.counterpartyadministration.dto.ControlCounterpartyDirectoryEntryRequest;
import org.museframework.bian.counterpartyadministration.dto.ControlCounterpartyDirectoryEntryResponse;
import org.museframework.bian.counterpartyadministration.dto.ExecuteCounterpartyDirectoryEntryRequest;
import org.museframework.bian.counterpartyadministration.dto.ExecuteCounterpartyDirectoryEntryResponse;
import org.museframework.bian.counterpartyadministration.dto.NotifyCounterpartyDirectoryEntryRequest;
import org.museframework.bian.counterpartyadministration.dto.NotifyCounterpartyDirectoryEntryResponse;
import org.museframework.bian.counterpartyadministration.dto.RegisterCounterpartyDirectoryEntryRequest;
import org.museframework.bian.counterpartyadministration.dto.RegisterCounterpartyDirectoryEntryResponse;
import org.museframework.bian.counterpartyadministration.dto.RequestCounterpartyDirectoryEntryRequest;
import org.museframework.bian.counterpartyadministration.dto.RequestCounterpartyDirectoryEntryResponse;
import org.museframework.bian.counterpartyadministration.dto.RetrieveCounterpartyDirectoryEntryRequest;
import org.museframework.bian.counterpartyadministration.dto.RetrieveCounterpartyDirectoryEntryResponse;
import org.museframework.bian.counterpartyadministration.dto.UpdateCounterpartyDirectoryEntryRequest;
import org.museframework.bian.counterpartyadministration.dto.UpdateCounterpartyDirectoryEntryResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Capture and maintain reference information about some type of entitity within Counterparty Administration.")
@GenericDomain(name="CounterpartyAdministration", group="CounterpartyDirectoryEntry")
public interface CrCounterpartyDirectoryEntry {
    @GenericDtxEndpoint
    @Description("Control Counterparty Directory Entry")
    ControlCounterpartyDirectoryEntryResponse controlCounterpartyDirectoryEntry(ControlCounterpartyDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("Execute Counterparty Directory Entry")
    ExecuteCounterpartyDirectoryEntryResponse executeCounterpartyDirectoryEntry(ExecuteCounterpartyDirectoryEntryRequest req);

    @Description("Notify Counterparty Directory Entry")
    NotifyCounterpartyDirectoryEntryResponse notifyCounterpartyDirectoryEntry(NotifyCounterpartyDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("Register Counterparty Directory Entry")
    RegisterCounterpartyDirectoryEntryResponse registerCounterpartyDirectoryEntry(RegisterCounterpartyDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("Request Counterparty Directory Entry")
    RequestCounterpartyDirectoryEntryResponse requestCounterpartyDirectoryEntry(RequestCounterpartyDirectoryEntryRequest req);

    @Description("Retrieve Counterparty Directory Entry")
    RetrieveCounterpartyDirectoryEntryResponse retrieveCounterpartyDirectoryEntry(RetrieveCounterpartyDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("Update Counterparty Directory Entry")
    UpdateCounterpartyDirectoryEntryResponse updateCounterpartyDirectoryEntry(UpdateCounterpartyDirectoryEntryRequest req);
}