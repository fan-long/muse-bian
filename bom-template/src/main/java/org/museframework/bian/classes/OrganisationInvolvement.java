/*Party who plays a role in the organisation. */
package org.museframework.bian.classes;

public class OrganisationInvolvement {
    /**/
    private org.museframework.bian.enumerations.Organisationinvolvementtypevalues organisationInvolvementType;

    public void setOrganisationInvolvementType(org.museframework.bian.enumerations.Organisationinvolvementtypevalues organisationInvolvementType) {
        this.organisationInvolvementType = organisationInvolvementType;
    }

    public org.museframework.bian.enumerations.Organisationinvolvementtypevalues getOrganisationInvolvementType() {
        return organisationInvolvementType;
    }
}