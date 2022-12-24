/*Capture and maintain reference information about some type of entitity within Party Reference Data Directory.*/
package org.museframework.bian.parrefdatdir.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.PartyReferenceDataDirectoryEntry
@MetaDto
public class PartyReferenceDataDirectoryEntry {
    /*Reference to the associated customer (can currently be a person or a company)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Party partyReference;

    /*Key dates associated with the directory entry (e.g. open date, refresh date)*/
    @MetaField(ref=true)
    private org.museframework.bian.enumerations.Directoryentrydatetypevalues directoryEntryDateType;

    /*Value of the date type*/
    @MetaField
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