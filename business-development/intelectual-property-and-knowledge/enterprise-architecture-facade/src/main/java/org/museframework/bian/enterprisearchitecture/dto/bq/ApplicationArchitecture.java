/*Create and maintain a design for a procedure, product/service model or other such entity  within Business Architecture. 
Example: Create and maintain product designs and analytical models.*/
package org.museframework.bian.enterprisearchitecture.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ApplicationArchitecture {
    /*The required status/situation before the specification aspect can be defined*/
    @MetaField(0)
    private String applicationArchitecturePreconditions;

    /*The schedule and timing of the definition and update/revisions of the specification aspect*/
    @MetaField(0)
    private String applicationArchitectureSpecificationSchedule;

    /*The current version, and version history as appropriate for the specification aspect*/
    @MetaField(0)
    private String applicationArchitectureVersionNumber;

    /*The Business Architecture Specification specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService applicationArchitecture;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String applicationArchitectureServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String applicationArchitectureServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String applicationArchitectureServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String applicationArchitectureServiceWorkProduct;

    /**/
    @MetaField(0)
    private String applicationArchitectureServiceName;

    public void setApplicationArchitecturePreconditions(String applicationArchitecturePreconditions) {
        this.applicationArchitecturePreconditions = applicationArchitecturePreconditions;
    }

    public String getApplicationArchitecturePreconditions() {
        return applicationArchitecturePreconditions;
    }

    public void setApplicationArchitectureSpecificationSchedule(String applicationArchitectureSpecificationSchedule) {
        this.applicationArchitectureSpecificationSchedule = applicationArchitectureSpecificationSchedule;
    }

    public String getApplicationArchitectureSpecificationSchedule() {
        return applicationArchitectureSpecificationSchedule;
    }

    public void setApplicationArchitectureVersionNumber(String applicationArchitectureVersionNumber) {
        this.applicationArchitectureVersionNumber = applicationArchitectureVersionNumber;
    }

    public String getApplicationArchitectureVersionNumber() {
        return applicationArchitectureVersionNumber;
    }

    public void setApplicationArchitecture(org.museframework.bian.classes.BusinessService applicationArchitecture) {
        this.applicationArchitecture = applicationArchitecture;
    }

    public org.museframework.bian.classes.BusinessService getApplicationArchitecture() {
        return applicationArchitecture;
    }

    public void setApplicationArchitectureServiceType(String applicationArchitectureServiceType) {
        this.applicationArchitectureServiceType = applicationArchitectureServiceType;
    }

    public String getApplicationArchitectureServiceType() {
        return applicationArchitectureServiceType;
    }

    public void setApplicationArchitectureServiceDescription(String applicationArchitectureServiceDescription) {
        this.applicationArchitectureServiceDescription = applicationArchitectureServiceDescription;
    }

    public String getApplicationArchitectureServiceDescription() {
        return applicationArchitectureServiceDescription;
    }

    public void setApplicationArchitectureServiceInputsandOuputs(String applicationArchitectureServiceInputsandOuputs) {
        this.applicationArchitectureServiceInputsandOuputs = applicationArchitectureServiceInputsandOuputs;
    }

    public String getApplicationArchitectureServiceInputsandOuputs() {
        return applicationArchitectureServiceInputsandOuputs;
    }

    public void setApplicationArchitectureServiceWorkProduct(String applicationArchitectureServiceWorkProduct) {
        this.applicationArchitectureServiceWorkProduct = applicationArchitectureServiceWorkProduct;
    }

    public String getApplicationArchitectureServiceWorkProduct() {
        return applicationArchitectureServiceWorkProduct;
    }

    public void setApplicationArchitectureServiceName(String applicationArchitectureServiceName) {
        this.applicationArchitectureServiceName = applicationArchitectureServiceName;
    }

    public String getApplicationArchitectureServiceName() {
        return applicationArchitectureServiceName;
    }
}