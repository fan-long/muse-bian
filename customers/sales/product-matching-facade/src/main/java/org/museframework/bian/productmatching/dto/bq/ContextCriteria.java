/*To test or assess an entity, possibly against some formal qualification or certification requirement  within Product Matching. 

Examples: Perform regulatory tests on a proposed financial transaction and check a new offer conforms to an existing contractual agreement.*/
package org.museframework.bian.productmatching.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ContextCriteria {
    /*The required status/situation before the test can be applied*/
    @MetaField
    private String contextCriteriaPreconditions;

    /*The schedule and timing of the testing performed*/
    @MetaField
    private String contextCriteriaAnalysisSchedule;

    /*The test version employed*/
    @MetaField
    private String contextCriteriaVersionNumber;

    /*The Product/Customer Combination Assessment specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService contextCriteria;

    /*Reference to the specific business service type*/
    @MetaField
    private String contextCriteriaServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String contextCriteriaServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String contextCriteriaServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String contextCriteriaServiceWorkProduct;

    /**/
    @MetaField
    private String contextCriteriaServiceName;

    public void setContextCriteriaPreconditions(String contextCriteriaPreconditions) {
        this.contextCriteriaPreconditions = contextCriteriaPreconditions;
    }

    public String getContextCriteriaPreconditions() {
        return contextCriteriaPreconditions;
    }

    public void setContextCriteriaAnalysisSchedule(String contextCriteriaAnalysisSchedule) {
        this.contextCriteriaAnalysisSchedule = contextCriteriaAnalysisSchedule;
    }

    public String getContextCriteriaAnalysisSchedule() {
        return contextCriteriaAnalysisSchedule;
    }

    public void setContextCriteriaVersionNumber(String contextCriteriaVersionNumber) {
        this.contextCriteriaVersionNumber = contextCriteriaVersionNumber;
    }

    public String getContextCriteriaVersionNumber() {
        return contextCriteriaVersionNumber;
    }

    public void setContextCriteria(org.museframework.bian.classes.BusinessService contextCriteria) {
        this.contextCriteria = contextCriteria;
    }

    public org.museframework.bian.classes.BusinessService getContextCriteria() {
        return contextCriteria;
    }

    public void setContextCriteriaServiceType(String contextCriteriaServiceType) {
        this.contextCriteriaServiceType = contextCriteriaServiceType;
    }

    public String getContextCriteriaServiceType() {
        return contextCriteriaServiceType;
    }

    public void setContextCriteriaServiceDescription(String contextCriteriaServiceDescription) {
        this.contextCriteriaServiceDescription = contextCriteriaServiceDescription;
    }

    public String getContextCriteriaServiceDescription() {
        return contextCriteriaServiceDescription;
    }

    public void setContextCriteriaServiceInputsandOuputs(String contextCriteriaServiceInputsandOuputs) {
        this.contextCriteriaServiceInputsandOuputs = contextCriteriaServiceInputsandOuputs;
    }

    public String getContextCriteriaServiceInputsandOuputs() {
        return contextCriteriaServiceInputsandOuputs;
    }

    public void setContextCriteriaServiceWorkProduct(String contextCriteriaServiceWorkProduct) {
        this.contextCriteriaServiceWorkProduct = contextCriteriaServiceWorkProduct;
    }

    public String getContextCriteriaServiceWorkProduct() {
        return contextCriteriaServiceWorkProduct;
    }

    public void setContextCriteriaServiceName(String contextCriteriaServiceName) {
        this.contextCriteriaServiceName = contextCriteriaServiceName;
    }

    public String getContextCriteriaServiceName() {
        return contextCriteriaServiceName;
    }
}