/*An entry in a directory. 

A registry of items recording key reference information and properties relating to each. (BIAN SL)*/
package org.museframework.bian.classes;

public class DirectoryEntry {
    /**/
    private org.museframework.bian.enumerations.Directoryentrydatetypevalues directoryEntryDateType;

    /**/
    private String directoryEntryDate;

    /**/
    private String directoryEntryStatus;

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

    public void setDirectoryEntryStatus(String directoryEntryStatus) {
        this.directoryEntryStatus = directoryEntryStatus;
    }

    public String getDirectoryEntryStatus() {
        return directoryEntryStatus;
    }
}