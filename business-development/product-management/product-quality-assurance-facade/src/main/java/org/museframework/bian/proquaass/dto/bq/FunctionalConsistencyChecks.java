/*To test or assess an entity, possibly against some formal qualification or certification requirement  within Product Quality Assurance. 

Examples: Perform regulatory tests on a proposed financial transaction and check a new offer conforms to an existing contractual agreement.*/
package org.museframework.bian.proquaass.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class FunctionalConsistencyChecks {
    /*The required status/situation before the test can be applied*/
    @MetaField(0)
    private String functionalConsistencyChecksPreconditions;

    /*The schedule and timing of the testing performed*/
    @MetaField(0)
    private String functionalConsistencyChecksAnalysisSchedule;

    /*The test version employed*/
    @MetaField(0)
    private String functionalConsistencyChecksVersionNumber;

    /*The Product and  Service Assessment specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService functionalConsistencyChecks;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String functionalConsistencyChecksServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String functionalConsistencyChecksServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String functionalConsistencyChecksServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String functionalConsistencyChecksServiceWorkProduct;

    /**/
    @MetaField(0)
    private String functionalConsistencyChecksServiceName;

    public void setFunctionalConsistencyChecksPreconditions(String functionalConsistencyChecksPreconditions) {
        this.functionalConsistencyChecksPreconditions = functionalConsistencyChecksPreconditions;
    }

    public String getFunctionalConsistencyChecksPreconditions() {
        return functionalConsistencyChecksPreconditions;
    }

    public void setFunctionalConsistencyChecksAnalysisSchedule(String functionalConsistencyChecksAnalysisSchedule) {
        this.functionalConsistencyChecksAnalysisSchedule = functionalConsistencyChecksAnalysisSchedule;
    }

    public String getFunctionalConsistencyChecksAnalysisSchedule() {
        return functionalConsistencyChecksAnalysisSchedule;
    }

    public void setFunctionalConsistencyChecksVersionNumber(String functionalConsistencyChecksVersionNumber) {
        this.functionalConsistencyChecksVersionNumber = functionalConsistencyChecksVersionNumber;
    }

    public String getFunctionalConsistencyChecksVersionNumber() {
        return functionalConsistencyChecksVersionNumber;
    }

    public void setFunctionalConsistencyChecks(org.museframework.bian.classes.BusinessService functionalConsistencyChecks) {
        this.functionalConsistencyChecks = functionalConsistencyChecks;
    }

    public org.museframework.bian.classes.BusinessService getFunctionalConsistencyChecks() {
        return functionalConsistencyChecks;
    }

    public void setFunctionalConsistencyChecksServiceType(String functionalConsistencyChecksServiceType) {
        this.functionalConsistencyChecksServiceType = functionalConsistencyChecksServiceType;
    }

    public String getFunctionalConsistencyChecksServiceType() {
        return functionalConsistencyChecksServiceType;
    }

    public void setFunctionalConsistencyChecksServiceDescription(String functionalConsistencyChecksServiceDescription) {
        this.functionalConsistencyChecksServiceDescription = functionalConsistencyChecksServiceDescription;
    }

    public String getFunctionalConsistencyChecksServiceDescription() {
        return functionalConsistencyChecksServiceDescription;
    }

    public void setFunctionalConsistencyChecksServiceInputsandOuputs(String functionalConsistencyChecksServiceInputsandOuputs) {
        this.functionalConsistencyChecksServiceInputsandOuputs = functionalConsistencyChecksServiceInputsandOuputs;
    }

    public String getFunctionalConsistencyChecksServiceInputsandOuputs() {
        return functionalConsistencyChecksServiceInputsandOuputs;
    }

    public void setFunctionalConsistencyChecksServiceWorkProduct(String functionalConsistencyChecksServiceWorkProduct) {
        this.functionalConsistencyChecksServiceWorkProduct = functionalConsistencyChecksServiceWorkProduct;
    }

    public String getFunctionalConsistencyChecksServiceWorkProduct() {
        return functionalConsistencyChecksServiceWorkProduct;
    }

    public void setFunctionalConsistencyChecksServiceName(String functionalConsistencyChecksServiceName) {
        this.functionalConsistencyChecksServiceName = functionalConsistencyChecksServiceName;
    }

    public String getFunctionalConsistencyChecksServiceName() {
        return functionalConsistencyChecksServiceName;
    }
}