package org.museframework.bian.counterpartyadministration.dto;

public class UpdateCounterpartyDirectoryEntryRequest {
    private String counterpartyadministrationid;

    private org.museframework.bian.counterpartyadministration.dto.cr.CounterpartyDirectoryEntry counterpartyDirectoryEntry;

    public void setCounterpartyadministrationid(String counterpartyadministrationid) {
        this.counterpartyadministrationid = counterpartyadministrationid;
    }

    public String getCounterpartyadministrationid() {
        return counterpartyadministrationid;
    }

    public void setCounterpartyDirectoryEntry(org.museframework.bian.counterpartyadministration.dto.cr.CounterpartyDirectoryEntry counterpartyDirectoryEntry) {
        this.counterpartyDirectoryEntry = counterpartyDirectoryEntry;
    }

    public org.museframework.bian.counterpartyadministration.dto.cr.CounterpartyDirectoryEntry getCounterpartyDirectoryEntry() {
        return counterpartyDirectoryEntry;
    }
}