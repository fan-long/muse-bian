/*Create and maintain a design for a procedure, product/service model or other such entity  within Business Architecture. 
Example: Create and maintain product designs and analytical models.*/
package org.museframework.bian.enterprisearchitecture.dto.bq;

public class InformationArchitecture {
    /*The required status/situation before the specification aspect can be defined*/
    private String informationArchitecturePreconditions;

    /*The schedule and timing of the definition and update/revisions of the specification aspect*/
    private String informationArchitectureSpecificationSchedule;

    /*The current version, and version history as appropriate for the specification aspect*/
    private String informationArchitectureVersionNumber;

    /*The Business Architecture Specification specific  Business Service*/
    private org.museframework.bian.classes.BusinessService informationArchitecture;

    /*Reference to the specific business service type*/
    private String informationArchitectureServiceType;

    /*Description of the performed business service*/
    private String informationArchitectureServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String informationArchitectureServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String informationArchitectureServiceWorkProduct;

    /**/
    private String informationArchitectureServiceName;

    public void setInformationArchitecturePreconditions(String informationArchitecturePreconditions) {
        this.informationArchitecturePreconditions = informationArchitecturePreconditions;
    }

    public String getInformationArchitecturePreconditions() {
        return informationArchitecturePreconditions;
    }

    public void setInformationArchitectureSpecificationSchedule(String informationArchitectureSpecificationSchedule) {
        this.informationArchitectureSpecificationSchedule = informationArchitectureSpecificationSchedule;
    }

    public String getInformationArchitectureSpecificationSchedule() {
        return informationArchitectureSpecificationSchedule;
    }

    public void setInformationArchitectureVersionNumber(String informationArchitectureVersionNumber) {
        this.informationArchitectureVersionNumber = informationArchitectureVersionNumber;
    }

    public String getInformationArchitectureVersionNumber() {
        return informationArchitectureVersionNumber;
    }

    public void setInformationArchitecture(org.museframework.bian.classes.BusinessService informationArchitecture) {
        this.informationArchitecture = informationArchitecture;
    }

    public org.museframework.bian.classes.BusinessService getInformationArchitecture() {
        return informationArchitecture;
    }

    public void setInformationArchitectureServiceType(String informationArchitectureServiceType) {
        this.informationArchitectureServiceType = informationArchitectureServiceType;
    }

    public String getInformationArchitectureServiceType() {
        return informationArchitectureServiceType;
    }

    public void setInformationArchitectureServiceDescription(String informationArchitectureServiceDescription) {
        this.informationArchitectureServiceDescription = informationArchitectureServiceDescription;
    }

    public String getInformationArchitectureServiceDescription() {
        return informationArchitectureServiceDescription;
    }

    public void setInformationArchitectureServiceInputsandOuputs(String informationArchitectureServiceInputsandOuputs) {
        this.informationArchitectureServiceInputsandOuputs = informationArchitectureServiceInputsandOuputs;
    }

    public String getInformationArchitectureServiceInputsandOuputs() {
        return informationArchitectureServiceInputsandOuputs;
    }

    public void setInformationArchitectureServiceWorkProduct(String informationArchitectureServiceWorkProduct) {
        this.informationArchitectureServiceWorkProduct = informationArchitectureServiceWorkProduct;
    }

    public String getInformationArchitectureServiceWorkProduct() {
        return informationArchitectureServiceWorkProduct;
    }

    public void setInformationArchitectureServiceName(String informationArchitectureServiceName) {
        this.informationArchitectureServiceName = informationArchitectureServiceName;
    }

    public String getInformationArchitectureServiceName() {
        return informationArchitectureServiceName;
    }
}