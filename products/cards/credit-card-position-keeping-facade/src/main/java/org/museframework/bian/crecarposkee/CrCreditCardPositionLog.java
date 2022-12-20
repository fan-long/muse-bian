package org.museframework.bian.crecarposkee;

import org.museframework.bian.crecarposkee.dto.CaptureCreditCardPositionLogRequest;
import org.museframework.bian.crecarposkee.dto.CaptureCreditCardPositionLogResponse;
import org.museframework.bian.crecarposkee.dto.ControlCreditCardPositionLogRequest;
import org.museframework.bian.crecarposkee.dto.ControlCreditCardPositionLogResponse;
import org.museframework.bian.crecarposkee.dto.InitiateCreditCardPositionLogRequest;
import org.museframework.bian.crecarposkee.dto.InitiateCreditCardPositionLogResponse;
import org.museframework.bian.crecarposkee.dto.NotifyCreditCardPositionLogRequest;
import org.museframework.bian.crecarposkee.dto.NotifyCreditCardPositionLogResponse;
import org.museframework.bian.crecarposkee.dto.RetrieveCreditCardPositionLogRequest;
import org.museframework.bian.crecarposkee.dto.RetrieveCreditCardPositionLogResponse;
import org.museframework.bian.crecarposkee.dto.UpdateCreditCardPositionLogRequest;
import org.museframework.bian.crecarposkee.dto.UpdateCreditCardPositionLogResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Maintain a log of transactions or activity, typically a financial account/journal or a log of activity to support behavioral analysis within Credit Card Position Keeping. ")
@GenericDomain(name="CreditCardPositionKeeping", group="CreditCardPositionLog")
public interface CrCreditCardPositionLog {
    @GenericDtxEndpoint
    @Description("Capture Credit Card Position Log")
    CaptureCreditCardPositionLogResponse captureCreditCardPositionLog(CaptureCreditCardPositionLogRequest req);

    @GenericDtxEndpoint
    @Description("Control Credit Card Position Log")
    ControlCreditCardPositionLogResponse controlCreditCardPositionLog(ControlCreditCardPositionLogRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Credit Card Position Log")
    InitiateCreditCardPositionLogResponse initiateCreditCardPositionLog(InitiateCreditCardPositionLogRequest req);

    @Description("Notify Credit Card Position Log")
    NotifyCreditCardPositionLogResponse notifyCreditCardPositionLog(NotifyCreditCardPositionLogRequest req);

    @Description("Retrieve Credit Card Position Log")
    RetrieveCreditCardPositionLogResponse retrieveCreditCardPositionLog(RetrieveCreditCardPositionLogRequest req);

    @GenericDtxEndpoint
    @Description("Update Credit Card Position Log")
    UpdateCreditCardPositionLogResponse updateCreditCardPositionLog(UpdateCreditCardPositionLogRequest req);
}