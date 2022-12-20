/*A place to locate a party. */
package org.museframework.bian.classes;

public class PartyLocation {
    /*The use a party makes of a location

e.g. domicile, correspondence address*/
    private String partyLocationRole;

    /**/
    private org.museframework.bian.enumerations.Partylocationtypevalues partyLocationType;

    /**/
    private Location locationReference;

    /**/
    private Party partyReference;

    public void setPartyLocationRole(String partyLocationRole) {
        this.partyLocationRole = partyLocationRole;
    }

    public String getPartyLocationRole() {
        return partyLocationRole;
    }

    public void setPartyLocationType(org.museframework.bian.enumerations.Partylocationtypevalues partyLocationType) {
        this.partyLocationType = partyLocationType;
    }

    public org.museframework.bian.enumerations.Partylocationtypevalues getPartyLocationType() {
        return partyLocationType;
    }

    public void setLocationReference(Location locationReference) {
        this.locationReference = locationReference;
    }

    public Location getLocationReference() {
        return locationReference;
    }

    public void setPartyReference(Party partyReference) {
        this.partyReference = partyReference;
    }

    public Party getPartyReference() {
        return partyReference;
    }
}