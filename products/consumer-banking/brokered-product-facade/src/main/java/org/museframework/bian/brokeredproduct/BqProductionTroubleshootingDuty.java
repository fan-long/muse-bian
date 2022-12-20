package org.museframework.bian.brokeredproduct;

import org.museframework.bian.brokeredproduct.dto.ExchangeProductionTroubleshootingDutyRequest;
import org.museframework.bian.brokeredproduct.dto.ExchangeProductionTroubleshootingDutyResponse;
import org.museframework.bian.brokeredproduct.dto.GrantProductionTroubleshootingDutyRequest;
import org.museframework.bian.brokeredproduct.dto.GrantProductionTroubleshootingDutyResponse;
import org.museframework.bian.brokeredproduct.dto.NotifyProductionTroubleshootingDutyRequest;
import org.museframework.bian.brokeredproduct.dto.NotifyProductionTroubleshootingDutyResponse;
import org.museframework.bian.brokeredproduct.dto.RequestProductionTroubleshootingDutyRequest;
import org.museframework.bian.brokeredproduct.dto.RequestProductionTroubleshootingDutyResponse;
import org.museframework.bian.brokeredproduct.dto.RetrieveProductionTroubleshootingDutyRequest;
import org.museframework.bian.brokeredproduct.dto.RetrieveProductionTroubleshootingDutyResponse;
import org.museframework.bian.brokeredproduct.dto.UpdateProductionTroubleshootingDutyRequest;
import org.museframework.bian.brokeredproduct.dto.UpdateProductionTroubleshootingDutyResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Production Performance Assessment Duty is a specific role or responsibility that is one aspect of Production Performance Assessment Duty")
@GenericDomain(name="BrokeredProduct", group="ProductionTroubleshootingDuty")
public interface BqProductionTroubleshootingDuty {
    @GenericDtxEndpoint
    @Description("Exchange Production Troubleshooting Duty")
    ExchangeProductionTroubleshootingDutyResponse exchangeProductionTroubleshootingDuty(ExchangeProductionTroubleshootingDutyRequest req);

    @GenericDtxEndpoint
    @Description("Grant Production Troubleshooting Duty")
    GrantProductionTroubleshootingDutyResponse grantProductionTroubleshootingDuty(GrantProductionTroubleshootingDutyRequest req);

    @Description("Notify Production Troubleshooting Duty")
    NotifyProductionTroubleshootingDutyResponse notifyProductionTroubleshootingDuty(NotifyProductionTroubleshootingDutyRequest req);

    @GenericDtxEndpoint
    @Description("Request Production Troubleshooting Duty")
    RequestProductionTroubleshootingDutyResponse requestProductionTroubleshootingDuty(RequestProductionTroubleshootingDutyRequest req);

    @Description("Retrieve Production Troubleshooting Duty")
    RetrieveProductionTroubleshootingDutyResponse retrieveProductionTroubleshootingDuty(RetrieveProductionTroubleshootingDutyRequest req);

    @GenericDtxEndpoint
    @Description("Update Production Troubleshooting Duty")
    UpdateProductionTroubleshootingDutyResponse updateProductionTroubleshootingDuty(UpdateProductionTroubleshootingDutyRequest req);
}