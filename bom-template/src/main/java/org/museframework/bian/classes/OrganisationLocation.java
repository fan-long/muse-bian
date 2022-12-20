/*A Place to locate an organisation. */
package org.museframework.bian.classes;

public class OrganisationLocation {
    /**/
    private org.museframework.bian.enumerations.Organisationlocationtypevalues organisationLocationType;

    public void setOrganisationLocationType(org.museframework.bian.enumerations.Organisationlocationtypevalues organisationLocationType) {
        this.organisationLocationType = organisationLocationType;
    }

    public org.museframework.bian.enumerations.Organisationlocationtypevalues getOrganisationLocationType() {
        return organisationLocationType;
    }
}