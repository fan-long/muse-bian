/*"An assertion or statement with regard to a concept, a characteristic.

Examples: Product pricing rules, Customer reference details

A descriptor can be atomic or composed."
Prospect Management*/
package org.museframework.bian.legentdir.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Associations {
    /*Reference to the associated entity (e.g. company or individual)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object legalEntityAssociationReference;

    /*Nature or type of association (e.g. corporate or familial)*/
    @MetaField
    private String legalEntityAssociationType;

    /*Description of the association and applicable obligations  (e.g. shareholder, director, guardian, guarantor)*/
    @MetaField
    private String legalEntityAssociationObligation;

    /*Reference the parent entity if applicable*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object parentLegalEntityReference;

    /*Reference the subsidiary entity if applicable*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object subsidiaryLegalEntityReference;

    /*List of major shareholders and shareholdings of significance*/
    @MetaField
    private String shareholdingProfile;

    public void setLegalEntityAssociationReference(org.museframework.bian.classes.Object legalEntityAssociationReference) {
        this.legalEntityAssociationReference = legalEntityAssociationReference;
    }

    public org.museframework.bian.classes.Object getLegalEntityAssociationReference() {
        return legalEntityAssociationReference;
    }

    public void setLegalEntityAssociationType(String legalEntityAssociationType) {
        this.legalEntityAssociationType = legalEntityAssociationType;
    }

    public String getLegalEntityAssociationType() {
        return legalEntityAssociationType;
    }

    public void setLegalEntityAssociationObligation(String legalEntityAssociationObligation) {
        this.legalEntityAssociationObligation = legalEntityAssociationObligation;
    }

    public String getLegalEntityAssociationObligation() {
        return legalEntityAssociationObligation;
    }

    public void setParentLegalEntityReference(org.museframework.bian.classes.Object parentLegalEntityReference) {
        this.parentLegalEntityReference = parentLegalEntityReference;
    }

    public org.museframework.bian.classes.Object getParentLegalEntityReference() {
        return parentLegalEntityReference;
    }

    public void setSubsidiaryLegalEntityReference(org.museframework.bian.classes.Object subsidiaryLegalEntityReference) {
        this.subsidiaryLegalEntityReference = subsidiaryLegalEntityReference;
    }

    public org.museframework.bian.classes.Object getSubsidiaryLegalEntityReference() {
        return subsidiaryLegalEntityReference;
    }

    public void setShareholdingProfile(String shareholdingProfile) {
        this.shareholdingProfile = shareholdingProfile;
    }

    public String getShareholdingProfile() {
        return shareholdingProfile;
    }
}