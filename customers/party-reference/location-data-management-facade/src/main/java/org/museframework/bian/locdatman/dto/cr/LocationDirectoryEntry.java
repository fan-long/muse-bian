/*Capture and maintain reference information about some type of entitity within Location Data Management.*/
package org.museframework.bian.locdatman.dto.cr;

public class LocationDirectoryEntry extends org.museframework.bian.classes.LocationDirectoryEntry {
    /*Reference to associated location (can be a physical or electronic location)*/
    private org.museframework.bian.classes.Location locationReference;

    /*Key dates associated with the directory entry (e.g. open date, refresh date)*/
    private org.museframework.bian.enumerations.Directoryentrydatetypevalues directoryEntryDateType;

    /*Value of the date type*/
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