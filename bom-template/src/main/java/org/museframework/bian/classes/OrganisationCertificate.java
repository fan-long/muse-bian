/*A certification issued for an organisation. */
package org.museframework.bian.classes;

public class OrganisationCertificate {
    /**/
    private org.museframework.bian.enumerations.Organisationcertificatetypevalues organisationCertificateType;

    public void setOrganisationCertificateType(org.museframework.bian.enumerations.Organisationcertificatetypevalues organisationCertificateType) {
        this.organisationCertificateType = organisationCertificateType;
    }

    public org.museframework.bian.enumerations.Organisationcertificatetypevalues getOrganisationCertificateType() {
        return organisationCertificateType;
    }
}