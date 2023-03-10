/*To test or assess an entity, possibly against some formal qualification or certification requirement  within Product Quality Assurance. 

Examples: Perform regulatory tests on a proposed financial transaction and check a new offer conforms to an existing contractual agreement.*/
package org.museframework.bian.proquaass.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ResiliencyandPerformanceChecks {
    /*The required status/situation before the test can be applied*/
    @MetaField(0)
    private String resiliencyandPerformanceChecksPreconditions;

    /*The schedule and timing of the testing performed*/
    @MetaField(0)
    private String resiliencyandPerformanceChecksAnalysisSchedule;

    /*The test version employed*/
    @MetaField(0)
    private String resiliencyandPerformanceChecksVersionNumber;

    /*The Product and  Service Assessment specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService resiliencyandPerformanceChecks;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String resiliencyandPerformanceChecksServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String resiliencyandPerformanceChecksServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String resiliencyandPerformanceChecksServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String resiliencyandPerformanceChecksServiceWorkProduct;

    /**/
    @MetaField(0)
    private String resiliencyandPerformanceChecksServiceName;

    public void setResiliencyandPerformanceChecksPreconditions(String resiliencyandPerformanceChecksPreconditions) {
        this.resiliencyandPerformanceChecksPreconditions = resiliencyandPerformanceChecksPreconditions;
    }

    public String getResiliencyandPerformanceChecksPreconditions() {
        return resiliencyandPerformanceChecksPreconditions;
    }

    public void setResiliencyandPerformanceChecksAnalysisSchedule(String resiliencyandPerformanceChecksAnalysisSchedule) {
        this.resiliencyandPerformanceChecksAnalysisSchedule = resiliencyandPerformanceChecksAnalysisSchedule;
    }

    public String getResiliencyandPerformanceChecksAnalysisSchedule() {
        return resiliencyandPerformanceChecksAnalysisSchedule;
    }

    public void setResiliencyandPerformanceChecksVersionNumber(String resiliencyandPerformanceChecksVersionNumber) {
        this.resiliencyandPerformanceChecksVersionNumber = resiliencyandPerformanceChecksVersionNumber;
    }

    public String getResiliencyandPerformanceChecksVersionNumber() {
        return resiliencyandPerformanceChecksVersionNumber;
    }

    public void setResiliencyandPerformanceChecks(org.museframework.bian.classes.BusinessService resiliencyandPerformanceChecks) {
        this.resiliencyandPerformanceChecks = resiliencyandPerformanceChecks;
    }

    public org.museframework.bian.classes.BusinessService getResiliencyandPerformanceChecks() {
        return resiliencyandPerformanceChecks;
    }

    public void setResiliencyandPerformanceChecksServiceType(String resiliencyandPerformanceChecksServiceType) {
        this.resiliencyandPerformanceChecksServiceType = resiliencyandPerformanceChecksServiceType;
    }

    public String getResiliencyandPerformanceChecksServiceType() {
        return resiliencyandPerformanceChecksServiceType;
    }

    public void setResiliencyandPerformanceChecksServiceDescription(String resiliencyandPerformanceChecksServiceDescription) {
        this.resiliencyandPerformanceChecksServiceDescription = resiliencyandPerformanceChecksServiceDescription;
    }

    public String getResiliencyandPerformanceChecksServiceDescription() {
        return resiliencyandPerformanceChecksServiceDescription;
    }

    public void setResiliencyandPerformanceChecksServiceInputsandOuputs(String resiliencyandPerformanceChecksServiceInputsandOuputs) {
        this.resiliencyandPerformanceChecksServiceInputsandOuputs = resiliencyandPerformanceChecksServiceInputsandOuputs;
    }

    public String getResiliencyandPerformanceChecksServiceInputsandOuputs() {
        return resiliencyandPerformanceChecksServiceInputsandOuputs;
    }

    public void setResiliencyandPerformanceChecksServiceWorkProduct(String resiliencyandPerformanceChecksServiceWorkProduct) {
        this.resiliencyandPerformanceChecksServiceWorkProduct = resiliencyandPerformanceChecksServiceWorkProduct;
    }

    public String getResiliencyandPerformanceChecksServiceWorkProduct() {
        return resiliencyandPerformanceChecksServiceWorkProduct;
    }

    public void setResiliencyandPerformanceChecksServiceName(String resiliencyandPerformanceChecksServiceName) {
        this.resiliencyandPerformanceChecksServiceName = resiliencyandPerformanceChecksServiceName;
    }

    public String getResiliencyandPerformanceChecksServiceName() {
        return resiliencyandPerformanceChecksServiceName;
    }
}