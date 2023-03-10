/*"An assertion or statement with regard to a concept, a characteristic.

Examples: Product pricing rules, Customer reference details

A descriptor can be atomic or composed."
Prospect Management*/
package org.museframework.bian.locdatman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.Location
@MetaDto
public class Location {
    /*Type of location (e.g. building, point of interest, virtual location/device)*/
    @MetaField(0)
    private String locationType;

    /*Reference address for the location (e.g. postal address, email, coordinates)*/
    @MetaField(0)
    private String locationAddress;

    /*The coordinates in a form that can be used to match tracked parties to the location (e.g. for real-time marketing)*/
    @MetaField(0)
    private String locationCoordinates;

    /*A description of the property, particularly if it has landmark characteristics*/
    @MetaField(0)
    private String locationDescription;

    /*The construction approach for a property at the location (e.g. era and architecture as might be used in valuation)*/
    @MetaField(0)
    private String locationConstructionType;

    /*An indication of the size or scale of the property where appropriate (e.g. 4 bedroom, 600 seat auditorium, 40 cover restaurant)*/
    @MetaField(0)
    private String locationCapacity;

    /*The tracked status (e.g. under construction or repair, inhabited, vacant)*/
    @MetaField(0)
    private String locationStatus;

    /*The general purpose and neighborhood of the property  (e.g. residential, industrial, commercial)*/
    @MetaField(0)
    private String locationNeighborhoodType;

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationAddress(String locationAddress) {
        this.locationAddress = locationAddress;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public void setLocationCoordinates(String locationCoordinates) {
        this.locationCoordinates = locationCoordinates;
    }

    public String getLocationCoordinates() {
        return locationCoordinates;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationConstructionType(String locationConstructionType) {
        this.locationConstructionType = locationConstructionType;
    }

    public String getLocationConstructionType() {
        return locationConstructionType;
    }

    public void setLocationCapacity(String locationCapacity) {
        this.locationCapacity = locationCapacity;
    }

    public String getLocationCapacity() {
        return locationCapacity;
    }

    public void setLocationStatus(String locationStatus) {
        this.locationStatus = locationStatus;
    }

    public String getLocationStatus() {
        return locationStatus;
    }

    public void setLocationNeighborhoodType(String locationNeighborhoodType) {
        this.locationNeighborhoodType = locationNeighborhoodType;
    }

    public String getLocationNeighborhoodType() {
        return locationNeighborhoodType;
    }
}