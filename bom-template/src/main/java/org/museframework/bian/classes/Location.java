/*The definition of an addressable space/position both in real and virtual environments with associated uses and entitlements*/
package org.museframework.bian.classes;

public class Location {
    /*A description of the property, particularly if it has landmark characteristics.*/
    private String locationDescription;

    /*Key dates associated with the directory entry (e.g. open date, refresh date).*/
    private String locationDateTime;

    /*The tracked status (e.g. under construction or repair, inhabited, vacant).*/
    private String locationStatus;

    /*Type of location (e.g. building, point of interest, virtual location/device).*/
    private org.museframework.bian.enumerations.Geographicalareatypevalues locationType;

    /*The planning or zoning status (e.g. residential, commercial, industrial).*/
    private String locationZoningType;

    /*The general purpose and neighborhood of the property  (e.g. residential, industrial, commercial).*/
    private String locationNeighborhoodType;

    /*The construction approach for a property at the location (e.g. era and architecture as might be used in valuation).*/
    private String locationConstructionType;

    /*The type of occupancy (e.g. residency, business, retail, entertainment).*/
    private String locationOccupancyType;

    /*The estimated (book) value of the property at the location - rental and purchase as appropriate.*/
    private String locationValue;

    /*An indication of the size or scale of the property where appropriate (e.g. 4 bedroom, 600 seat auditorium, 40 cover restaurant).*/
    private String locationCapacity;

    /**/
    private String locationIdentification;

    /**/
    private Address locationAddress;

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDateTime(String locationDateTime) {
        this.locationDateTime = locationDateTime;
    }

    public String getLocationDateTime() {
        return locationDateTime;
    }

    public void setLocationStatus(String locationStatus) {
        this.locationStatus = locationStatus;
    }

    public String getLocationStatus() {
        return locationStatus;
    }

    public void setLocationType(org.museframework.bian.enumerations.Geographicalareatypevalues locationType) {
        this.locationType = locationType;
    }

    public org.museframework.bian.enumerations.Geographicalareatypevalues getLocationType() {
        return locationType;
    }

    public void setLocationZoningType(String locationZoningType) {
        this.locationZoningType = locationZoningType;
    }

    public String getLocationZoningType() {
        return locationZoningType;
    }

    public void setLocationNeighborhoodType(String locationNeighborhoodType) {
        this.locationNeighborhoodType = locationNeighborhoodType;
    }

    public String getLocationNeighborhoodType() {
        return locationNeighborhoodType;
    }

    public void setLocationConstructionType(String locationConstructionType) {
        this.locationConstructionType = locationConstructionType;
    }

    public String getLocationConstructionType() {
        return locationConstructionType;
    }

    public void setLocationOccupancyType(String locationOccupancyType) {
        this.locationOccupancyType = locationOccupancyType;
    }

    public String getLocationOccupancyType() {
        return locationOccupancyType;
    }

    public void setLocationValue(String locationValue) {
        this.locationValue = locationValue;
    }

    public String getLocationValue() {
        return locationValue;
    }

    public void setLocationCapacity(String locationCapacity) {
        this.locationCapacity = locationCapacity;
    }

    public String getLocationCapacity() {
        return locationCapacity;
    }

    public void setLocationIdentification(String locationIdentification) {
        this.locationIdentification = locationIdentification;
    }

    public String getLocationIdentification() {
        return locationIdentification;
    }

    public void setLocationAddress(Address locationAddress) {
        this.locationAddress = locationAddress;
    }

    public Address getLocationAddress() {
        return locationAddress;
    }
}