package org.museframework.bian.trabooove;

import org.museframework.bian.trabooove.dto.ExchangeTradingBookRiskMitigationDutyRequest;
import org.museframework.bian.trabooove.dto.ExchangeTradingBookRiskMitigationDutyResponse;
import org.museframework.bian.trabooove.dto.GrantTradingBookRiskMitigationDutyRequest;
import org.museframework.bian.trabooove.dto.GrantTradingBookRiskMitigationDutyResponse;
import org.museframework.bian.trabooove.dto.NotifyTradingBookRiskMitigationDutyRequest;
import org.museframework.bian.trabooove.dto.NotifyTradingBookRiskMitigationDutyResponse;
import org.museframework.bian.trabooove.dto.RequestTradingBookRiskMitigationDutyRequest;
import org.museframework.bian.trabooove.dto.RequestTradingBookRiskMitigationDutyResponse;
import org.museframework.bian.trabooove.dto.RetrieveTradingBookRiskMitigationDutyRequest;
import org.museframework.bian.trabooove.dto.RetrieveTradingBookRiskMitigationDutyResponse;
import org.museframework.bian.trabooove.dto.UpdateTradingBookRiskMitigationDutyRequest;
import org.museframework.bian.trabooove.dto.UpdateTradingBookRiskMitigationDutyResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Trading Book Risk Mitigation Duty is a specific role or responsibility that is one aspect of Trading Book Risk Mitigation Duty")
@GenericDomain(name="TradingBookOversight", group="TradingBookRiskMitigationDuty")
public interface BqTradingBookRiskMitigationDuty {
    @GenericDtxEndpoint
    @Description("Exchange Trading Book Risk Mitigation Duty")
    ExchangeTradingBookRiskMitigationDutyResponse exchangeTradingBookRiskMitigationDuty(ExchangeTradingBookRiskMitigationDutyRequest req);

    @GenericDtxEndpoint
    @Description("Grant Trading Book Risk Mitigation Duty")
    GrantTradingBookRiskMitigationDutyResponse grantTradingBookRiskMitigationDuty(GrantTradingBookRiskMitigationDutyRequest req);

    @Description("Notify Trading Book Risk Mitigation Duty")
    NotifyTradingBookRiskMitigationDutyResponse notifyTradingBookRiskMitigationDuty(NotifyTradingBookRiskMitigationDutyRequest req);

    @GenericDtxEndpoint
    @Description("Request Trading Book Risk Mitigation Duty")
    RequestTradingBookRiskMitigationDutyResponse requestTradingBookRiskMitigationDuty(RequestTradingBookRiskMitigationDutyRequest req);

    @Description("Retrieve Trading Book Risk Mitigation Duty")
    RetrieveTradingBookRiskMitigationDutyResponse retrieveTradingBookRiskMitigationDuty(RetrieveTradingBookRiskMitigationDutyRequest req);

    @GenericDtxEndpoint
    @Description("Update Trading Book Risk Mitigation Duty")
    UpdateTradingBookRiskMitigationDutyResponse updateTradingBookRiskMitigationDuty(UpdateTradingBookRiskMitigationDutyRequest req);
}