/*Create and maintain a design for a procedure, product/service model or other such entity  within Management Manual. 
Example: Create and maintain product designs and analytical models.*/
package org.museframework.bian.managementmanual.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class LegalandRegulatoryObligationsandGuidelines {
    /*The required status/situation before the specification aspect can be defined*/
    @MetaField
    private String legalandRegulatoryObligationsandGuidelinesPreconditions;

    /*The schedule and timing of the definition and update/revisions of the specification aspect*/
    @MetaField
    private String legalandRegulatoryObligationsandGuidelinesSpecificationSchedule;

    /*The current version, and version history as appropriate for the specification aspect*/
    @MetaField
    private String legalandRegulatoryObligationsandGuidelinesVersionNumber;

    /*The Management Manual Specification specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService legalandRegulatoryObligationsandGuidelines;

    /*Reference to the specific business service type*/
    @MetaField
    private String legalandRegulatoryObligationsandGuidelinesServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String legalandRegulatoryObligationsandGuidelinesServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String legalandRegulatoryObligationsandGuidelinesServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String legalandRegulatoryObligationsandGuidelinesServiceWorkProduct;

    /**/
    @MetaField
    private String legalandRegulatoryObligationsandGuidelinesServiceName;

    public void setLegalandRegulatoryObligationsandGuidelinesPreconditions(String legalandRegulatoryObligationsandGuidelinesPreconditions) {
        this.legalandRegulatoryObligationsandGuidelinesPreconditions = legalandRegulatoryObligationsandGuidelinesPreconditions;
    }

    public String getLegalandRegulatoryObligationsandGuidelinesPreconditions() {
        return legalandRegulatoryObligationsandGuidelinesPreconditions;
    }

    public void setLegalandRegulatoryObligationsandGuidelinesSpecificationSchedule(String legalandRegulatoryObligationsandGuidelinesSpecificationSchedule) {
        this.legalandRegulatoryObligationsandGuidelinesSpecificationSchedule = legalandRegulatoryObligationsandGuidelinesSpecificationSchedule;
    }

    public String getLegalandRegulatoryObligationsandGuidelinesSpecificationSchedule() {
        return legalandRegulatoryObligationsandGuidelinesSpecificationSchedule;
    }

    public void setLegalandRegulatoryObligationsandGuidelinesVersionNumber(String legalandRegulatoryObligationsandGuidelinesVersionNumber) {
        this.legalandRegulatoryObligationsandGuidelinesVersionNumber = legalandRegulatoryObligationsandGuidelinesVersionNumber;
    }

    public String getLegalandRegulatoryObligationsandGuidelinesVersionNumber() {
        return legalandRegulatoryObligationsandGuidelinesVersionNumber;
    }

    public void setLegalandRegulatoryObligationsandGuidelines(org.museframework.bian.classes.BusinessService legalandRegulatoryObligationsandGuidelines) {
        this.legalandRegulatoryObligationsandGuidelines = legalandRegulatoryObligationsandGuidelines;
    }

    public org.museframework.bian.classes.BusinessService getLegalandRegulatoryObligationsandGuidelines() {
        return legalandRegulatoryObligationsandGuidelines;
    }

    public void setLegalandRegulatoryObligationsandGuidelinesServiceType(String legalandRegulatoryObligationsandGuidelinesServiceType) {
        this.legalandRegulatoryObligationsandGuidelinesServiceType = legalandRegulatoryObligationsandGuidelinesServiceType;
    }

    public String getLegalandRegulatoryObligationsandGuidelinesServiceType() {
        return legalandRegulatoryObligationsandGuidelinesServiceType;
    }

    public void setLegalandRegulatoryObligationsandGuidelinesServiceDescription(String legalandRegulatoryObligationsandGuidelinesServiceDescription) {
        this.legalandRegulatoryObligationsandGuidelinesServiceDescription = legalandRegulatoryObligationsandGuidelinesServiceDescription;
    }

    public String getLegalandRegulatoryObligationsandGuidelinesServiceDescription() {
        return legalandRegulatoryObligationsandGuidelinesServiceDescription;
    }

    public void setLegalandRegulatoryObligationsandGuidelinesServiceInputsandOuputs(String legalandRegulatoryObligationsandGuidelinesServiceInputsandOuputs) {
        this.legalandRegulatoryObligationsandGuidelinesServiceInputsandOuputs = legalandRegulatoryObligationsandGuidelinesServiceInputsandOuputs;
    }

    public String getLegalandRegulatoryObligationsandGuidelinesServiceInputsandOuputs() {
        return legalandRegulatoryObligationsandGuidelinesServiceInputsandOuputs;
    }

    public void setLegalandRegulatoryObligationsandGuidelinesServiceWorkProduct(String legalandRegulatoryObligationsandGuidelinesServiceWorkProduct) {
        this.legalandRegulatoryObligationsandGuidelinesServiceWorkProduct = legalandRegulatoryObligationsandGuidelinesServiceWorkProduct;
    }

    public String getLegalandRegulatoryObligationsandGuidelinesServiceWorkProduct() {
        return legalandRegulatoryObligationsandGuidelinesServiceWorkProduct;
    }

    public void setLegalandRegulatoryObligationsandGuidelinesServiceName(String legalandRegulatoryObligationsandGuidelinesServiceName) {
        this.legalandRegulatoryObligationsandGuidelinesServiceName = legalandRegulatoryObligationsandGuidelinesServiceName;
    }

    public String getLegalandRegulatoryObligationsandGuidelinesServiceName() {
        return legalandRegulatoryObligationsandGuidelinesServiceName;
    }
}