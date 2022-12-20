/*structure/make-up of an organizational entity

Organised structure that is set up for a particular purpose. For example, a business, government body, department, charity, or financial institution. ISO20022*/
package org.museframework.bian.classes;

public class Organisation {
    /*Description of the structure of a company. ISO20022*/
    private String organisationStructure;

    /**/
    private String organisationIdentification;

    /*Sector of business of the organisation, for example, pharmaceutical. (ISO20022)*/
    private String organisationSector;

    /**/
    private String legalEntityIndicator;

    /**/
    private String organisationDate;

    /**/
    private org.museframework.bian.enumerations.Organisationtypevalues organisationType;

    public void setOrganisationStructure(String organisationStructure) {
        this.organisationStructure = organisationStructure;
    }

    public String getOrganisationStructure() {
        return organisationStructure;
    }

    public void setOrganisationIdentification(String organisationIdentification) {
        this.organisationIdentification = organisationIdentification;
    }

    public String getOrganisationIdentification() {
        return organisationIdentification;
    }

    public void setOrganisationSector(String organisationSector) {
        this.organisationSector = organisationSector;
    }

    public String getOrganisationSector() {
        return organisationSector;
    }

    public void setLegalEntityIndicator(String legalEntityIndicator) {
        this.legalEntityIndicator = legalEntityIndicator;
    }

    public String getLegalEntityIndicator() {
        return legalEntityIndicator;
    }

    public void setOrganisationDate(String organisationDate) {
        this.organisationDate = organisationDate;
    }

    public String getOrganisationDate() {
        return organisationDate;
    }

    public void setOrganisationType(org.museframework.bian.enumerations.Organisationtypevalues organisationType) {
        this.organisationType = organisationType;
    }

    public org.museframework.bian.enumerations.Organisationtypevalues getOrganisationType() {
        return organisationType;
    }
}