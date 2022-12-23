/*Create and maintain a design for a procedure, product/service model or other such entity  within Business Architecture. 
Example: Create and maintain product designs and analytical models.*/
package org.museframework.bian.enterprisearchitecture.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class TechnologyInfrastructure {
    /*The required status/situation before the specification aspect can be defined*/
    @MetaField
    private String technologyInfrastructurePreconditions;

    /*The schedule and timing of the definition and update/revisions of the specification aspect*/
    @MetaField
    private String technologyInfrastructureSpecificationSchedule;

    /*The current version, and version history as appropriate for the specification aspect*/
    @MetaField
    private String technologyInfrastructureVersionNumber;

    /*The Business Architecture Specification specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService technologyInfrastructure;

    /*Reference to the specific business service type*/
    @MetaField
    private String technologyInfrastructureServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String technologyInfrastructureServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String technologyInfrastructureServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String technologyInfrastructureServiceWorkProduct;

    /**/
    @MetaField
    private String technologyInfrastructureServiceName;

    public void setTechnologyInfrastructurePreconditions(String technologyInfrastructurePreconditions) {
        this.technologyInfrastructurePreconditions = technologyInfrastructurePreconditions;
    }

    public String getTechnologyInfrastructurePreconditions() {
        return technologyInfrastructurePreconditions;
    }

    public void setTechnologyInfrastructureSpecificationSchedule(String technologyInfrastructureSpecificationSchedule) {
        this.technologyInfrastructureSpecificationSchedule = technologyInfrastructureSpecificationSchedule;
    }

    public String getTechnologyInfrastructureSpecificationSchedule() {
        return technologyInfrastructureSpecificationSchedule;
    }

    public void setTechnologyInfrastructureVersionNumber(String technologyInfrastructureVersionNumber) {
        this.technologyInfrastructureVersionNumber = technologyInfrastructureVersionNumber;
    }

    public String getTechnologyInfrastructureVersionNumber() {
        return technologyInfrastructureVersionNumber;
    }

    public void setTechnologyInfrastructure(org.museframework.bian.classes.BusinessService technologyInfrastructure) {
        this.technologyInfrastructure = technologyInfrastructure;
    }

    public org.museframework.bian.classes.BusinessService getTechnologyInfrastructure() {
        return technologyInfrastructure;
    }

    public void setTechnologyInfrastructureServiceType(String technologyInfrastructureServiceType) {
        this.technologyInfrastructureServiceType = technologyInfrastructureServiceType;
    }

    public String getTechnologyInfrastructureServiceType() {
        return technologyInfrastructureServiceType;
    }

    public void setTechnologyInfrastructureServiceDescription(String technologyInfrastructureServiceDescription) {
        this.technologyInfrastructureServiceDescription = technologyInfrastructureServiceDescription;
    }

    public String getTechnologyInfrastructureServiceDescription() {
        return technologyInfrastructureServiceDescription;
    }

    public void setTechnologyInfrastructureServiceInputsandOuputs(String technologyInfrastructureServiceInputsandOuputs) {
        this.technologyInfrastructureServiceInputsandOuputs = technologyInfrastructureServiceInputsandOuputs;
    }

    public String getTechnologyInfrastructureServiceInputsandOuputs() {
        return technologyInfrastructureServiceInputsandOuputs;
    }

    public void setTechnologyInfrastructureServiceWorkProduct(String technologyInfrastructureServiceWorkProduct) {
        this.technologyInfrastructureServiceWorkProduct = technologyInfrastructureServiceWorkProduct;
    }

    public String getTechnologyInfrastructureServiceWorkProduct() {
        return technologyInfrastructureServiceWorkProduct;
    }

    public void setTechnologyInfrastructureServiceName(String technologyInfrastructureServiceName) {
        this.technologyInfrastructureServiceName = technologyInfrastructureServiceName;
    }

    public String getTechnologyInfrastructureServiceName() {
        return technologyInfrastructureServiceName;
    }
}