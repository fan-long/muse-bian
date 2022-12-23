/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.customersurveys.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ReviewerSelection {
    /*Details the selection criteria used to identify candidate customer reviewers*/
    @MetaField
    private String customerSurveySelectionCriteria;

    /*Reference to the customer selected as a survey candidate*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerSurveyCandidateReference;

    public void setCustomerSurveySelectionCriteria(String customerSurveySelectionCriteria) {
        this.customerSurveySelectionCriteria = customerSurveySelectionCriteria;
    }

    public String getCustomerSurveySelectionCriteria() {
        return customerSurveySelectionCriteria;
    }

    public void setCustomerSurveyCandidateReference(org.museframework.bian.classes.Object customerSurveyCandidateReference) {
        this.customerSurveyCandidateReference = customerSurveyCandidateReference;
    }

    public org.museframework.bian.classes.Object getCustomerSurveyCandidateReference() {
        return customerSurveyCandidateReference;
    }
}