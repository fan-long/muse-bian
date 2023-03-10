/*Capture and maintain reference information about some type of entitity within Legal Entity Directory.*/
package org.museframework.bian.legentdir.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.LegalEntityDirectoryEntry
@MetaDto
public class LegalEntityDirectoryEntry {
    /*Reference to the legal entity that is the subject of the entry*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object legalEntityReference;

    /*Reference to the associated party (one or more linked by role to the legal entity)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Party partyReference;

    /*Key dates associated with the directory entry (e.g. open date, refresh date)*/
    @MetaField(ref=true)
    private org.museframework.bian.enumerations.Directoryentrydatetypevalues directoryEntryDateType;

    /*Value of the date type*/
    @MetaField(0)
    private String directoryEntryDate;

    public void setLegalEntityReference(org.museframework.bian.classes.Object legalEntityReference) {
        this.legalEntityReference = legalEntityReference;
    }

    public org.museframework.bian.classes.Object getLegalEntityReference() {
        return legalEntityReference;
    }

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