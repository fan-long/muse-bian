package org.museframework.bian.cusproandsereli.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteCustomerEligibilityAssessmentRequest {
    @MetaField
    private String customerproductandserviceeligibilityid;

    @MetaField(ref=true)
    private org.museframework.bian.cusproandsereli.dto.cr.CustomerEligibilityAssessment customerEligibilityAssessment;

    public void setCustomerproductandserviceeligibilityid(String customerproductandserviceeligibilityid) {
        this.customerproductandserviceeligibilityid = customerproductandserviceeligibilityid;
    }

    public String getCustomerproductandserviceeligibilityid() {
        return customerproductandserviceeligibilityid;
    }

    public void setCustomerEligibilityAssessment(org.museframework.bian.cusproandsereli.dto.cr.CustomerEligibilityAssessment customerEligibilityAssessment) {
        this.customerEligibilityAssessment = customerEligibilityAssessment;
    }

    public org.museframework.bian.cusproandsereli.dto.cr.CustomerEligibilityAssessment getCustomerEligibilityAssessment() {
        return customerEligibilityAssessment;
    }
}