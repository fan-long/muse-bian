/*Capture and maintain reference information about some type of entitity within Location Data Management.*/
package org.museframework.bian.locdatman.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.LocationDirectoryEntry
@MetaDto
public class LocationDirectoryEntry {
    /*Reference to associated location (can be a physical or electronic location)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Location locationReference;

    /*Key dates associated with the directory entry (e.g. open date, refresh date)*/
    @MetaField(ref=true)
    private org.museframework.bian.enumerations.Directoryentrydatetypevalues directoryEntryDateType;

    /*Value of the date type*/
    @MetaField(0)
    private String directoryEntryDate;

    public void setLocationReference(org.museframework.bian.classes.Location locationReference) {
        this.locationReference = locationReference;
    }

    public org.museframework.bian.classes.Location getLocationReference() {
        return locationReference;
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