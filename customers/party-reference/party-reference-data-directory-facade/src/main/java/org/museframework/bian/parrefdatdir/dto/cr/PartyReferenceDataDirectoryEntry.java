/*Capture and maintain reference information about some type of entitity within Party Reference Data Directory.*/
package org.museframework.bian.parrefdatdir.dto.cr;

public class PartyReferenceDataDirectoryEntry extends org.museframework.bian.classes.PartyReferenceDataDirectoryEntry {
    /*Reference to the associated customer (can currently be a person or a company)*/
    private org.museframework.bian.classes.Party partyReference;

    /*Key dates associated with the directory entry (e.g. open date, refresh date)*/
    private org.museframework.bian.enumerations.Directoryentrydatetypevalues directoryEntryDateType;

    /*Value of the date type*/
    private String directoryEntryDate;

    public void setPartyReference(org.museframework.bian.classes.Party partyReference) {
        this.partyReference = partyReference;
    }

    public org.museframework.bian.classes.Party getPartyReference() {
        return partyReference;
    }

    public void setDirectoryEntryDateType(org.museframework.bian.enumerations.Directoryentrydatetypevalues directoryEntryDateType) {
        this.directoryEntryDateType = directoryEntryDateType;
    }

    public org.museframework.bian.enumerations.Directoryentrydatetypevalues getDirectoryEntryDateType() {
        return directoryEntryDateType;
    }

    public void setDirectoryEntryDate(String directoryEntryDate) {
        this.directoryEntryDate = directoryEntryDate;
    }

    public String getDirectoryEntryDate() {
        return directoryEntryDate;
    }
}