/*To test or assess an entity, possibly against some formal qualification or certification requirement  within Product Quality Assurance. 

Examples: Perform regulatory tests on a proposed financial transaction and check a new offer conforms to an existing contractual agreement.*/
package org.museframework.bian.proquaass.dto.bq;

public class ProcessingErrorandIntegrityChecks {
    /*The required status/situation before the test can be applied*/
    private String processingErrorandIntegrityChecksPreconditions;

    /*The schedule and timing of the testing performed*/
    private String processingErrorandIntegrityChecksAnalysisSchedule;

    /*The test version employed*/
    private String processingErrorandIntegrityChecksVersionNumber;

    /*The Product and  Service Assessment specific  Business Service*/
    private org.museframework.bian.classes.BusinessService processingErrorandIntegrityChecks;

    /*Reference to the specific business service type*/
    private String processingErrorandIntegrityChecksServiceType;

    /*Description of the performed business service*/
    private String processingErrorandIntegrityChecksServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String processingErrorandIntegrityChecksServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String processingErrorandIntegrityChecksServiceWorkProduct;

    /**/
    private String processingErrorandIntegrityChecksServiceName;

    public void setProcessingErrorandIntegrityChecksPreconditions(String processingErrorandIntegrityChecksPreconditions) {
        this.processingErrorandIntegrityChecksPreconditions = processingErrorandIntegrityChecksPreconditions;
    }

    public String getProcessingErrorandIntegrityChecksPreconditions() {
        return processingErrorandIntegrityChecksPreconditions;
    }

    public void setProcessingErrorandIntegrityChecksAnalysisSchedule(String processingErrorandIntegrityChecksAnalysisSchedule) {
        this.processingErrorandIntegrityChecksAnalysisSchedule = processingErrorandIntegrityChecksAnalysisSchedule;
    }

    public String getProcessingErrorandIntegrityChecksAnalysisSchedule() {
        return processingErrorandIntegrityChecksAnalysisSchedule;
    }

    public void setProcessingErrorandIntegrityChecksVersionNumber(String processingErrorandIntegrityChecksVersionNumber) {
        this.processingErrorandIntegrityChecksVersionNumber = processingErrorandIntegrityChecksVersionNumber;
    }

    public String getProcessingErrorandIntegrityChecksVersionNumber() {
        return processingErrorandIntegrityChecksVersionNumber;
    }

    public void setProcessingErrorandIntegrityChecks(org.museframework.bian.classes.BusinessService processingErrorandIntegrityChecks) {
        this.processingErrorandIntegrityChecks = processingErrorandIntegrityChecks;
    }

    public org.museframework.bian.classes.BusinessService getProcessingErrorandIntegrityChecks() {
        return processingErrorandIntegrityChecks;
    }

    public void setProcessingErrorandIntegrityChecksServiceType(String processingErrorandIntegrityChecksServiceType) {
        this.processingErrorandIntegrityChecksServiceType = processingErrorandIntegrityChecksServiceType;
    }

    public String getProcessingErrorandIntegrityChecksServiceType() {
        return processingErrorandIntegrityChecksServiceType;
    }

    public void setProcessingErrorandIntegrityChecksServiceDescription(String processingErrorandIntegrityChecksServiceDescription) {
        this.processingErrorandIntegrityChecksServiceDescription = processingErrorandIntegrityChecksServiceDescription;
    }

    public String getProcessingErrorandIntegrityChecksServiceDescription() {
        return processingErrorandIntegrityChecksServiceDescription;
    }

    public void setProcessingErrorandIntegrityChecksServiceInputsandOuputs(String processingErrorandIntegrityChecksServiceInputsandOuputs) {
        this.processingErrorandIntegrityChecksServiceInputsandOuputs = processingErrorandIntegrityChecksServiceInputsandOuputs;
    }

    public String getProcessingErrorandIntegrityChecksServiceInputsandOuputs() {
        return processingErrorandIntegrityChecksServiceInputsandOuputs;
    }

    public void setProcessingErrorandIntegrityChecksServiceWorkProduct(String processingErrorandIntegrityChecksServiceWorkProduct) {
        this.processingErrorandIntegrityChecksServiceWorkProduct = processingErrorandIntegrityChecksServiceWorkProduct;
    }

    public String getProcessingErrorandIntegrityChecksServiceWorkProduct() {
        return processingErrorandIntegrityChecksServiceWorkProduct;
    }

    public void setProcessingErrorandIntegrityChecksServiceName(String processingErrorandIntegrityChecksServiceName) {
        this.processingErrorandIntegrityChecksServiceName = processingErrorandIntegrityChecksServiceName;
    }

    public String getProcessingErrorandIntegrityChecksServiceName() {
        return processingErrorandIntegrityChecksServiceName;
    }
}