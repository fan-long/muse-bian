/*To test or assess an entity, possibly against some formal qualification or certification requirement  within Product Quality Assurance. 

Examples: Perform regulatory tests on a proposed financial transaction and check a new offer conforms to an existing contractual agreement.*/
package org.museframework.bian.proquaass.dto.bq;

public class UsabilityChecks {
    /*The required status/situation before the test can be applied*/
    private String usabilityChecksPreconditions;

    /*The schedule and timing of the testing performed*/
    private String usabilityChecksAnalysisSchedule;

    /*The test version employed*/
    private String usabilityChecksVersionNumber;

    /*The Product and  Service Assessment specific  Business Service*/
    private org.museframework.bian.classes.BusinessService usabilityChecks;

    /*Reference to the specific business service type*/
    private String usabilityChecksServiceType;

    /*Description of the performed business service*/
    private String usabilityChecksServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String usabilityChecksServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String usabilityChecksServiceWorkProduct;

    /**/
    private String usabilityChecksServiceName;

    public void setUsabilityChecksPreconditions(String usabilityChecksPreconditions) {
        this.usabilityChecksPreconditions = usabilityChecksPreconditions;
    }

    public String getUsabilityChecksPreconditions() {
        return usabilityChecksPreconditions;
    }

    public void setUsabilityChecksAnalysisSchedule(String usabilityChecksAnalysisSchedule) {
        this.usabilityChecksAnalysisSchedule = usabilityChecksAnalysisSchedule;
    }

    public String getUsabilityChecksAnalysisSchedule() {
        return usabilityChecksAnalysisSchedule;
    }

    public void setUsabilityChecksVersionNumber(String usabilityChecksVersionNumber) {
        this.usabilityChecksVersionNumber = usabilityChecksVersionNumber;
    }

    public String getUsabilityChecksVersionNumber() {
        return usabilityChecksVersionNumber;
    }

    public void setUsabilityChecks(org.museframework.bian.classes.BusinessService usabilityChecks) {
        this.usabilityChecks = usabilityChecks;
    }

    public org.museframework.bian.classes.BusinessService getUsabilityChecks() {
        return usabilityChecks;
    }

    public void setUsabilityChecksServiceType(String usabilityChecksServiceType) {
        this.usabilityChecksServiceType = usabilityChecksServiceType;
    }

    public String getUsabilityChecksServiceType() {
        return usabilityChecksServiceType;
    }

    public void setUsabilityChecksServiceDescription(String usabilityChecksServiceDescription) {
        this.usabilityChecksServiceDescription = usabilityChecksServiceDescription;
    }

    public String getUsabilityChecksServiceDescription() {
        return usabilityChecksServiceDescription;
    }

    public void setUsabilityChecksServiceInputsandOuputs(String usabilityChecksServiceInputsandOuputs) {
        this.usabilityChecksServiceInputsandOuputs = usabilityChecksServiceInputsandOuputs;
    }

    public String getUsabilityChecksServiceInputsandOuputs() {
        return usabilityChecksServiceInputsandOuputs;
    }

    public void setUsabilityChecksServiceWorkProduct(String usabilityChecksServiceWorkProduct) {
        this.usabilityChecksServiceWorkProduct = usabilityChecksServiceWorkProduct;
    }

    public String getUsabilityChecksServiceWorkProduct() {
        return usabilityChecksServiceWorkProduct;
    }

    public void setUsabilityChecksServiceName(String usabilityChecksServiceName) {
        this.usabilityChecksServiceName = usabilityChecksServiceName;
    }

    public String getUsabilityChecksServiceName() {
        return usabilityChecksServiceName;
    }
}