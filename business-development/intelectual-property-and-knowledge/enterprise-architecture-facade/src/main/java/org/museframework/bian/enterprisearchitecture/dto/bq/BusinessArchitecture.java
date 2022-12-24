/*Create and maintain a design for a procedure, product/service model or other such entity  within Business Architecture. 
Example: Create and maintain product designs and analytical models.*/
package org.museframework.bian.enterprisearchitecture.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.BusinessArchitecture
@MetaDto
public class BusinessArchitecture {
    /*The required status/situation before the specification aspect can be defined*/
    @MetaField
    private String businessArchitecturePreconditions;

    /*The schedule and timing of the definition and update/revisions of the specification aspect*/
    @MetaField
    private String businessArchitectureSpecificationSchedule;

    /*The current version, and version history as appropriate for the specification aspect*/
    @MetaField
    private String businessArchitectureVersionNumber;

    /*The Business Architecture Specification specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessArchitecture;

    /*Reference to the specific business service type*/
    @MetaField
    private String businessArchitectureServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String businessArchitectureServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String businessArchitectureServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String businessArchitectureServiceWorkProduct;

    /**/
    @MetaField
    private String businessArchitectureServiceName;

    public void setBusinessArchitecturePreconditions(String businessArchitecturePreconditions) {
        this.businessArchitecturePreconditions = businessArchitecturePreconditions;
    }

    public String getBusinessArchitecturePreconditions() {
        return businessArchitecturePreconditions;
    }

    public void setBusinessArchitectureSpecificationSchedule(String businessArchitectureSpecificationSchedule) {
        this.businessArchitectureSpecificationSchedule = businessArchitectureSpecificationSchedule;
    }

    public String getBusinessArchitectureSpecificationSchedule() {
        return businessArchitectureSpecificationSchedule;
    }

    public void setBusinessArchitectureVersionNumber(String businessArchitectureVersionNumber) {
        this.businessArchitectureVersionNumber = businessArchitectureVersionNumber;
    }

    public String getBusinessArchitectureVersionNumber() {
        return businessArchitectureVersionNumber;
    }

    public void setBusinessArchitecture(org.museframework.bian.classes.BusinessService businessArchitecture) {
        this.businessArchitecture = businessArchitecture;
    }

    public org.museframework.bian.classes.BusinessService getBusinessArchitecture() {
        return businessArchitecture;
    }

    public void setBusinessArchitectureServiceType(String businessArchitectureServiceType) {
        this.businessArchitectureServiceType = businessArchitectureServiceType;
    }

    public String getBusinessArchitectureServiceType() {
        return businessArchitectureServiceType;
    }

    public void setBusinessArchitectureServiceDescription(String businessArchitectureServiceDescription) {
        this.businessArchitectureServiceDescription = businessArchitectureServiceDescription;
    }

    public String getBusinessArchitectureServiceDescription() {
        return businessArchitectureServiceDescription;
    }

    public void setBusinessArchitectureServiceInputsandOuputs(String businessArchitectureServiceInputsandOuputs) {
        this.businessArchitectureServiceInputsandOuputs = businessArchitectureServiceInputsandOuputs;
    }

    public String getBusinessArchitectureServiceInputsandOuputs() {
        return businessArchitectureServiceInputsandOuputs;
    }

    public void setBusinessArchitectureServiceWorkProduct(String businessArchitectureServiceWorkProduct) {
        this.businessArchitectureServiceWorkProduct = businessArchitectureServiceWorkProduct;
    }

    public String getBusinessArchitectureServiceWorkProduct() {
        return businessArchitectureServiceWorkProduct;
    }

    public void setBusinessArchitectureServiceName(String businessArchitectureServiceName) {
        this.businessArchitectureServiceName = businessArchitectureServiceName;
    }

    public String getBusinessArchitectureServiceName() {
        return businessArchitectureServiceName;
    }
}