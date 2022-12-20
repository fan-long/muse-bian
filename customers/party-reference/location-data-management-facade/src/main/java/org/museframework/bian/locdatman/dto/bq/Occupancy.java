/*"An assertion or statement with regard to a concept, a characteristic.

Examples: Product pricing rules, Customer reference details

A descriptor can be atomic or composed."
Prospect Management*/
package org.museframework.bian.locdatman.dto.bq;

public class Occupancy {
    /*Reference to the bank customer (if they are owner and/or occupier of the property at the location)*/
    private org.museframework.bian.classes.Object customerReference;

    /*Registered owner or title holder(s) of the property*/
    private String locationOwnerTitle;

    /*The estimated (book) value of the property at the location - rental and purchase as appropriate*/
    private String locationValue;

    /*The type of occupancy (e.g. residency, business, retail, entertainment)*/
    private String locationOccupierType;

    /*Known contact reference details of occupier (e.g. family name, company, retailer)*/
    private org.museframework.bian.classes.Object locationOccupierReference;

    /*Nature of the access terms or entitlement of the occupier (e.g. leasehold, rental, public access)*/
    private String locationOccupierTerms;

    /*Reference to a bank alliance partner with some kind of link association to the location (used for location based marketing)*/
    private org.museframework.bian.classes.Object alliancePartnerReference;

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setLocationOwnerTitle(String locationOwnerTitle) {
        this.locationOwnerTitle = locationOwnerTitle;
    }

    public String getLocationOwnerTitle() {
        return locationOwnerTitle;
    }

    public void setLocationValue(String locationValue) {
        this.locationValue = locationValue;
    }

    public String getLocationValue() {
        return locationValue;
    }

    public void setLocationOccupierType(String locationOccupierType) {
        this.locationOccupierType = locationOccupierType;
    }

    public String getLocationOccupierType() {
        return locationOccupierType;
    }

    public void setLocationOccupierReference(org.museframework.bian.classes.Object locationOccupierReference) {
        this.locationOccupierReference = locationOccupierReference;
    }

    public org.museframework.bian.classes.Object getLocationOccupierReference() {
        return locationOccupierReference;
    }

    public void setLocationOccupierTerms(String locationOccupierTerms) {
        this.locationOccupierTerms = locationOccupierTerms;
    }

    public String getLocationOccupierTerms() {
        return locationOccupierTerms;
    }

    public void setAlliancePartnerReference(org.museframework.bian.classes.Object alliancePartnerReference) {
        this.alliancePartnerReference = alliancePartnerReference;
    }

    public org.museframework.bian.classes.Object getAlliancePartnerReference() {
        return alliancePartnerReference;
    }
}