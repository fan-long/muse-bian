package org.museframework.bian.brokeredproduct;

import org.museframework.bian.brokeredproduct.dto.ExchangeServiceLevelAgreementOversightDutyRequest;
import org.museframework.bian.brokeredproduct.dto.ExchangeServiceLevelAgreementOversightDutyResponse;
import org.museframework.bian.brokeredproduct.dto.GrantServiceLevelAgreementOversightDutyRequest;
import org.museframework.bian.brokeredproduct.dto.GrantServiceLevelAgreementOversightDutyResponse;
import org.museframework.bian.brokeredproduct.dto.NotifyServiceLevelAgreementOversightDutyRequest;
import org.museframework.bian.brokeredproduct.dto.NotifyServiceLevelAgreementOversightDutyResponse;
import org.museframework.bian.brokeredproduct.dto.RequestServiceLevelAgreementOversightDutyRequest;
import org.museframework.bian.brokeredproduct.dto.RequestServiceLevelAgreementOversightDutyResponse;
import org.museframework.bian.brokeredproduct.dto.RetrieveServiceLevelAgreementOversightDutyRequest;
import org.museframework.bian.brokeredproduct.dto.RetrieveServiceLevelAgreementOversightDutyResponse;
import org.museframework.bian.brokeredproduct.dto.UpdateServiceLevelAgreementOversightDutyRequest;
import org.museframework.bian.brokeredproduct.dto.UpdateServiceLevelAgreementOversightDutyResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Production Performance Assessment Duty is a specific role or responsibility that is one aspect of Production Performance Assessment Duty")
@GenericDomain(name="BrokeredProduct", group="ServiceLevelAgreementOversightDuty")
public interface BqServiceLevelAgreementOversightDuty {
    @GenericDtxEndpoint
    @Description("Exchange Service Level Agreement Oversight Duty")
    ExchangeServiceLevelAgreementOversightDutyResponse exchangeServiceLevelAgreementOversightDuty(ExchangeServiceLevelAgreementOversightDutyRequest req);

    @GenericDtxEndpoint
    @Description("Grant Service Level Agreement Oversight Duty")
    GrantServiceLevelAgreementOversightDutyResponse grantServiceLevelAgreementOversightDuty(GrantServiceLevelAgreementOversightDutyRequest req);

    @Description("Notify Service Level Agreement Oversight Duty")
    NotifyServiceLevelAgreementOversightDutyResponse notifyServiceLevelAgreementOversightDuty(NotifyServiceLevelAgreementOversightDutyRequest req);

    @GenericDtxEndpoint
    @Description("Request Service Level Agreement Oversight Duty")
    RequestServiceLevelAgreementOversightDutyResponse requestServiceLevelAgreementOversightDuty(RequestServiceLevelAgreementOversightDutyRequest req);

    @Description("Retrieve Service Level Agreement Oversight Duty")
    RetrieveServiceLevelAgreementOversightDutyResponse retrieveServiceLevelAgreementOversightDuty(RetrieveServiceLevelAgreementOversightDutyRequest req);

    @GenericDtxEndpoint
    @Description("Update Service Level Agreement Oversight Duty")
    UpdateServiceLevelAgreementOversightDutyResponse updateServiceLevelAgreementOversightDuty(UpdateServiceLevelAgreementOversightDutyRequest req);
}