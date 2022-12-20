package org.museframework.bian.brokeredproduct;

import org.museframework.bian.brokeredproduct.dto.ExchangeProductionPerformanceAssessmentDutyRequest;
import org.museframework.bian.brokeredproduct.dto.ExchangeProductionPerformanceAssessmentDutyResponse;
import org.museframework.bian.brokeredproduct.dto.GrantProductionPerformanceAssessmentDutyRequest;
import org.museframework.bian.brokeredproduct.dto.GrantProductionPerformanceAssessmentDutyResponse;
import org.museframework.bian.brokeredproduct.dto.NotifyProductionPerformanceAssessmentDutyRequest;
import org.museframework.bian.brokeredproduct.dto.NotifyProductionPerformanceAssessmentDutyResponse;
import org.museframework.bian.brokeredproduct.dto.RequestProductionPerformanceAssessmentDutyRequest;
import org.museframework.bian.brokeredproduct.dto.RequestProductionPerformanceAssessmentDutyResponse;
import org.museframework.bian.brokeredproduct.dto.RetrieveProductionPerformanceAssessmentDutyRequest;
import org.museframework.bian.brokeredproduct.dto.RetrieveProductionPerformanceAssessmentDutyResponse;
import org.museframework.bian.brokeredproduct.dto.UpdateProductionPerformanceAssessmentDutyRequest;
import org.museframework.bian.brokeredproduct.dto.UpdateProductionPerformanceAssessmentDutyResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Production Performance Assessment Duty is a specific role or responsibility that is one aspect of Production Performance Assessment Duty")
@GenericDomain(name="BrokeredProduct", group="ProductionPerformanceAssessmentDuty")
public interface BqProductionPerformanceAssessmentDuty {
    @GenericDtxEndpoint
    @Description("Exchange Production Performance Assessment Duty")
    ExchangeProductionPerformanceAssessmentDutyResponse exchangeProductionPerformanceAssessmentDuty(ExchangeProductionPerformanceAssessmentDutyRequest req);

    @GenericDtxEndpoint
    @Description("Grant Production Performance Assessment Duty")
    GrantProductionPerformanceAssessmentDutyResponse grantProductionPerformanceAssessmentDuty(GrantProductionPerformanceAssessmentDutyRequest req);

    @Description("Notify Production Performance Assessment Duty")
    NotifyProductionPerformanceAssessmentDutyResponse notifyProductionPerformanceAssessmentDuty(NotifyProductionPerformanceAssessmentDutyRequest req);

    @GenericDtxEndpoint
    @Description("Request Production Performance Assessment Duty")
    RequestProductionPerformanceAssessmentDutyResponse requestProductionPerformanceAssessmentDuty(RequestProductionPerformanceAssessmentDutyRequest req);

    @Description("Retrieve Production Performance Assessment Duty")
    RetrieveProductionPerformanceAssessmentDutyResponse retrieveProductionPerformanceAssessmentDuty(RetrieveProductionPerformanceAssessmentDutyRequest req);

    @GenericDtxEndpoint
    @Description("Update Production Performance Assessment Duty")
    UpdateProductionPerformanceAssessmentDutyResponse updateProductionPerformanceAssessmentDuty(UpdateProductionPerformanceAssessmentDutyRequest req);
}