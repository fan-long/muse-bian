/**/
package org.museframework.bian.cusproandsereli.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class EligibilityCheck {
    /*The result of the eligibility assessment for the requested product/service - details any eligibility considerations or requirements and the applicable terms*/
    @MetaField(0)
    private String customerProductandServiceEligibilityAssessmentResult;

    public void setCustomerProductandServiceEligibilityAssessmentResult(String customerProductandServiceEligibilityAssessmentResult) {
        this.customerProductandServiceEligibilityAssessmentResult = customerProductandServiceEligibilityAssessmentResult;
    }

    public String getCustomerProductandServiceEligibilityAssessmentResult() {
        return customerProductandServiceEligibilityAssessmentResult;
    }
}