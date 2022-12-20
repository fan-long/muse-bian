package org.museframework.bian.trabooove;

import org.museframework.bian.trabooove.dto.ExchangeTradingBookAnalysisandReportingDutyRequest;
import org.museframework.bian.trabooove.dto.ExchangeTradingBookAnalysisandReportingDutyResponse;
import org.museframework.bian.trabooove.dto.GrantTradingBookAnalysisandReportingDutyRequest;
import org.museframework.bian.trabooove.dto.GrantTradingBookAnalysisandReportingDutyResponse;
import org.museframework.bian.trabooove.dto.NotifyTradingBookAnalysisandReportingDutyRequest;
import org.museframework.bian.trabooove.dto.NotifyTradingBookAnalysisandReportingDutyResponse;
import org.museframework.bian.trabooove.dto.RequestTradingBookAnalysisandReportingDutyRequest;
import org.museframework.bian.trabooove.dto.RequestTradingBookAnalysisandReportingDutyResponse;
import org.museframework.bian.trabooove.dto.RetrieveTradingBookAnalysisandReportingDutyRequest;
import org.museframework.bian.trabooove.dto.RetrieveTradingBookAnalysisandReportingDutyResponse;
import org.museframework.bian.trabooove.dto.UpdateTradingBookAnalysisandReportingDutyRequest;
import org.museframework.bian.trabooove.dto.UpdateTradingBookAnalysisandReportingDutyResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Trading Book Risk Mitigation Duty is a specific role or responsibility that is one aspect of Trading Book Risk Mitigation Duty")
@GenericDomain(name="TradingBookOversight", group="TradingBookAnalysisandReportingDuty")
public interface BqTradingBookAnalysisandReportingDuty {
    @GenericDtxEndpoint
    @Description("Exchange Trading Book Analysis and Reporting Duty")
    ExchangeTradingBookAnalysisandReportingDutyResponse exchangeTradingBookAnalysisandReportingDuty(ExchangeTradingBookAnalysisandReportingDutyRequest req);

    @GenericDtxEndpoint
    @Description("Grant Trading Book Analysis and Reporting Duty")
    GrantTradingBookAnalysisandReportingDutyResponse grantTradingBookAnalysisandReportingDuty(GrantTradingBookAnalysisandReportingDutyRequest req);

    @Description("Notify Trading Book Analysis and Reporting Duty")
    NotifyTradingBookAnalysisandReportingDutyResponse notifyTradingBookAnalysisandReportingDuty(NotifyTradingBookAnalysisandReportingDutyRequest req);

    @GenericDtxEndpoint
    @Description("Request Trading Book Analysis and Reporting Duty")
    RequestTradingBookAnalysisandReportingDutyResponse requestTradingBookAnalysisandReportingDuty(RequestTradingBookAnalysisandReportingDutyRequest req);

    @Description("Retrieve Trading Book Analysis and Reporting Duty")
    RetrieveTradingBookAnalysisandReportingDutyResponse retrieveTradingBookAnalysisandReportingDuty(RetrieveTradingBookAnalysisandReportingDutyRequest req);

    @GenericDtxEndpoint
    @Description("Update Trading Book Analysis and Reporting Duty")
    UpdateTradingBookAnalysisandReportingDutyResponse updateTradingBookAnalysisandReportingDuty(UpdateTradingBookAnalysisandReportingDutyRequest req);
}