/*Create and maintain a design for a procedure, product/service model or other such entity  within Management Manual. 
Example: Create and maintain product designs and analytical models.*/
package org.museframework.bian.managementmanual.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class OperationalSecurityProceduresandGuidelines {
    /*The required status/situation before the specification aspect can be defined*/
    @MetaField
    private String operationalSecurityProceduresandGuidelinesPreconditions;

    /*The schedule and timing of the definition and update/revisions of the specification aspect*/
    @MetaField
    private String operationalSecurityProceduresandGuidelinesSpecificationSchedule;

    /*The current version, and version history as appropriate for the specification aspect*/
    @MetaField
    private String operationalSecurityProceduresandGuidelinesVersionNumber;

    /*The Management Manual Specification specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService operationalSecurityProceduresandGuidelines;

    /*Reference to the specific business service type*/
    @MetaField
    private String operationalSecurityProceduresandGuidelinesServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String operationalSecurityProceduresandGuidelinesServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String operationalSecurityProceduresandGuidelinesServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String operationalSecurityProceduresandGuidelinesServiceWorkProduct;

    /**/
    @MetaField
    private String operationalSecurityProceduresandGuidelinesServiceName;

    public void setOperationalSecurityProceduresandGuidelinesPreconditions(String operationalSecurityProceduresandGuidelinesPreconditions) {
        this.operationalSecurityProceduresandGuidelinesPreconditions = operationalSecurityProceduresandGuidelinesPreconditions;
    }

    public String getOperationalSecurityProceduresandGuidelinesPreconditions() {
        return operationalSecurityProceduresandGuidelinesPreconditions;
    }

    public void setOperationalSecurityProceduresandGuidelinesSpecificationSchedule(String operationalSecurityProceduresandGuidelinesSpecificationSchedule) {
        this.operationalSecurityProceduresandGuidelinesSpecificationSchedule = operationalSecurityProceduresandGuidelinesSpecificationSchedule;
    }

    public String getOperationalSecurityProceduresandGuidelinesSpecificationSchedule() {
        return operationalSecurityProceduresandGuidelinesSpecificationSchedule;
    }

    public void setOperationalSecurityProceduresandGuidelinesVersionNumber(String operationalSecurityProceduresandGuidelinesVersionNumber) {
        this.operationalSecurityProceduresandGuidelinesVersionNumber = operationalSecurityProceduresandGuidelinesVersionNumber;
    }

    public String getOperationalSecurityProceduresandGuidelinesVersionNumber() {
        return operationalSecurityProceduresandGuidelinesVersionNumber;
    }

    public void setOperationalSecurityProceduresandGuidelines(org.museframework.bian.classes.BusinessService operationalSecurityProceduresandGuidelines) {
        this.operationalSecurityProceduresandGuidelines = operationalSecurityProceduresandGuidelines;
    }

    public org.museframework.bian.classes.BusinessService getOperationalSecurityProceduresandGuidelines() {
        return operationalSecurityProceduresandGuidelines;
    }

    public void setOperationalSecurityProceduresandGuidelinesServiceType(String operationalSecurityProceduresandGuidelinesServiceType) {
        this.operationalSecurityProceduresandGuidelinesServiceType = operationalSecurityProceduresandGuidelinesServiceType;
    }

    public String getOperationalSecurityProceduresandGuidelinesServiceType() {
        return operationalSecurityProceduresandGuidelinesServiceType;
    }

    public void setOperationalSecurityProceduresandGuidelinesServiceDescription(String operationalSecurityProceduresandGuidelinesServiceDescription) {
        this.operationalSecurityProceduresandGuidelinesServiceDescription = operationalSecurityProceduresandGuidelinesServiceDescription;
    }

    public String getOperationalSecurityProceduresandGuidelinesServiceDescription() {
        return operationalSecurityProceduresandGuidelinesServiceDescription;
    }

    public void setOperationalSecurityProceduresandGuidelinesServiceInputsandOuputs(String operationalSecurityProceduresandGuidelinesServiceInputsandOuputs) {
        this.operationalSecurityProceduresandGuidelinesServiceInputsandOuputs = operationalSecurityProceduresandGuidelinesServiceInputsandOuputs;
    }

    public String getOperationalSecurityProceduresandGuidelinesServiceInputsandOuputs() {
        return operationalSecurityProceduresandGuidelinesServiceInputsandOuputs;
    }

    public void setOperationalSecurityProceduresandGuidelinesServiceWorkProduct(String operationalSecurityProceduresandGuidelinesServiceWorkProduct) {
        this.operationalSecurityProceduresandGuidelinesServiceWorkProduct = operationalSecurityProceduresandGuidelinesServiceWorkProduct;
    }

    public String getOperationalSecurityProceduresandGuidelinesServiceWorkProduct() {
        return operationalSecurityProceduresandGuidelinesServiceWorkProduct;
    }

    public void setOperationalSecurityProceduresandGuidelinesServiceName(String operationalSecurityProceduresandGuidelinesServiceName) {
        this.operationalSecurityProceduresandGuidelinesServiceName = operationalSecurityProceduresandGuidelinesServiceName;
    }

    public String getOperationalSecurityProceduresandGuidelinesServiceName() {
        return operationalSecurityProceduresandGuidelinesServiceName;
    }
}