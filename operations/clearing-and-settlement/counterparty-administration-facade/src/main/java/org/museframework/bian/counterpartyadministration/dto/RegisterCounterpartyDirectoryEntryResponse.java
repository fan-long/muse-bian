package org.museframework.bian.counterpartyadministration.dto;

public class RegisterCounterpartyDirectoryEntryResponse {
    private org.museframework.bian.counterpartyadministration.dto.cr.CounterpartyDirectoryEntry counterpartyDirectoryEntry;

    public void setCounterpartyDirectoryEntry(org.museframework.bian.counterpartyadministration.dto.cr.CounterpartyDirectoryEntry counterpartyDirectoryEntry) {
        this.counterpartyDirectoryEntry = counterpartyDirectoryEntry;
    }

    public org.museframework.bian.counterpartyadministration.dto.cr.CounterpartyDirectoryEntry getCounterpartyDirectoryEntry() {
        return counterpartyDirectoryEntry;
    }
}