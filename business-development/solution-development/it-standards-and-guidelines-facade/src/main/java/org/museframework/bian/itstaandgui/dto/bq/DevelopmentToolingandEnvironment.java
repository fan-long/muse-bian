/*The main design elements/views making up the overall specification

Examples: Business Requirements*/
package org.museframework.bian.itstaandgui.dto.bq;

public class DevelopmentToolingandEnvironment {
    /*The required status/situation before the specification aspect can be defined*/
    private String developmentToolingandEnvironmentPreconditions;

    /*The schedule and timing of the definition and update/revisions of the specification aspect*/
    private String developmentToolingandEnvironmentSpecificationSchedule;

    /*The current version, and version history as appropriate for the specification aspect*/
    private String developmentToolingandEnvironmentVersionNumber;

    /*The Technology Standards Specification specific  Business Service*/
    private org.museframework.bian.classes.BusinessService developmentToolingandEnvironment;

    /*Reference to the specific business service type*/
    private String developmentToolingandEnvironmentServiceType;

    /*Description of the performed business service*/
    private String developmentToolingandEnvironmentServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String developmentToolingandEnvironmentServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String developmentToolingandEnvironmentServiceWorkProduct;

    /**/
    private String developmentToolingandEnvironmentServiceName;

    public void setDevelopmentToolingandEnvironmentPreconditions(String developmentToolingandEnvironmentPreconditions) {
        this.developmentToolingandEnvironmentPreconditions = developmentToolingandEnvironmentPreconditions;
    }

    public String getDevelopmentToolingandEnvironmentPreconditions() {
        return developmentToolingandEnvironmentPreconditions;
    }

    public void setDevelopmentToolingandEnvironmentSpecificationSchedule(String developmentToolingandEnvironmentSpecificationSchedule) {
        this.developmentToolingandEnvironmentSpecificationSchedule = developmentToolingandEnvironmentSpecificationSchedule;
    }

    public String getDevelopmentToolingandEnvironmentSpecificationSchedule() {
        return developmentToolingandEnvironmentSpecificationSchedule;
    }

    public void setDevelopmentToolingandEnvironmentVersionNumber(String developmentToolingandEnvironmentVersionNumber) {
        this.developmentToolingandEnvironmentVersionNumber = developmentToolingandEnvironmentVersionNumber;
    }

    public String getDevelopmentToolingandEnvironmentVersionNumber() {
        return developmentToolingandEnvironmentVersionNumber;
    }

    public void setDevelopmentToolingandEnvironment(org.museframework.bian.classes.BusinessService developmentToolingandEnvironment) {
        this.developmentToolingandEnvironment = developmentToolingandEnvironment;
    }

    public org.museframework.bian.classes.BusinessService getDevelopmentToolingandEnvironment() {
        return developmentToolingandEnvironment;
    }

    public void setDevelopmentToolingandEnvironmentServiceType(String developmentToolingandEnvironmentServiceType) {
        this.developmentToolingandEnvironmentServiceType = developmentToolingandEnvironmentServiceType;
    }

    public String getDevelopmentToolingandEnvironmentServiceType() {
        return developmentToolingandEnvironmentServiceType;
    }

    public void setDevelopmentToolingandEnvironmentServiceDescription(String developmentToolingandEnvironmentServiceDescription) {
        this.developmentToolingandEnvironmentServiceDescription = developmentToolingandEnvironmentServiceDescription;
    }

    public String getDevelopmentToolingandEnvironmentServiceDescription() {
        return developmentToolingandEnvironmentServiceDescription;
    }

    public void setDevelopmentToolingandEnvironmentServiceInputsandOuputs(String developmentToolingandEnvironmentServiceInputsandOuputs) {
        this.developmentToolingandEnvironmentServiceInputsandOuputs = developmentToolingandEnvironmentServiceInputsandOuputs;
    }

    public String getDevelopmentToolingandEnvironmentServiceInputsandOuputs() {
        return developmentToolingandEnvironmentServiceInputsandOuputs;
    }

    public void setDevelopmentToolingandEnvironmentServiceWorkProduct(String developmentToolingandEnvironmentServiceWorkProduct) {
        this.developmentToolingandEnvironmentServiceWorkProduct = developmentToolingandEnvironmentServiceWorkProduct;
    }

    public String getDevelopmentToolingandEnvironmentServiceWorkProduct() {
        return developmentToolingandEnvironmentServiceWorkProduct;
    }

    public void setDevelopmentToolingandEnvironmentServiceName(String developmentToolingandEnvironmentServiceName) {
        this.developmentToolingandEnvironmentServiceName = developmentToolingandEnvironmentServiceName;
    }

    public String getDevelopmentToolingandEnvironmentServiceName() {
        return developmentToolingandEnvironmentServiceName;
    }
}