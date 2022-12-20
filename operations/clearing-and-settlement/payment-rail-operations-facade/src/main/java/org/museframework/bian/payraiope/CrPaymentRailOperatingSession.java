package org.museframework.bian.payraiope;

import org.museframework.bian.payraiope.dto.ControlPaymentRailOperatingSessionRequest;
import org.museframework.bian.payraiope.dto.ControlPaymentRailOperatingSessionResponse;
import org.museframework.bian.payraiope.dto.ExchangePaymentRailOperatingSessionRequest;
import org.museframework.bian.payraiope.dto.ExchangePaymentRailOperatingSessionResponse;
import org.museframework.bian.payraiope.dto.ExecutePaymentRailOperatingSessionRequest;
import org.museframework.bian.payraiope.dto.ExecutePaymentRailOperatingSessionResponse;
import org.museframework.bian.payraiope.dto.InitiatePaymentRailOperatingSessionRequest;
import org.museframework.bian.payraiope.dto.InitiatePaymentRailOperatingSessionResponse;
import org.museframework.bian.payraiope.dto.NotifyPaymentRailOperatingSessionRequest;
import org.museframework.bian.payraiope.dto.NotifyPaymentRailOperatingSessionResponse;
import org.museframework.bian.payraiope.dto.RequestPaymentRailOperatingSessionRequest;
import org.museframework.bian.payraiope.dto.RequestPaymentRailOperatingSessionResponse;
import org.museframework.bian.payraiope.dto.RetrievePaymentRailOperatingSessionRequest;
import org.museframework.bian.payraiope.dto.RetrievePaymentRailOperatingSessionResponse;
import org.museframework.bian.payraiope.dto.UpdatePaymentRailOperatingSessionRequest;
import org.museframework.bian.payraiope.dto.UpdatePaymentRailOperatingSessionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility within Payment Rail Operations. ")
@GenericDomain(name="PaymentRailOperations", group="PaymentRailOperatingSession")
public interface CrPaymentRailOperatingSession {
    @GenericDtxEndpoint
    @Description("Control Payment Rail Operating Session")
    ControlPaymentRailOperatingSessionResponse controlPaymentRailOperatingSession(ControlPaymentRailOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Payment Rail Operating Session")
    ExchangePaymentRailOperatingSessionResponse exchangePaymentRailOperatingSession(ExchangePaymentRailOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Payment Rail Operating Session")
    ExecutePaymentRailOperatingSessionResponse executePaymentRailOperatingSession(ExecutePaymentRailOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Payment Rail Operating Session")
    InitiatePaymentRailOperatingSessionResponse initiatePaymentRailOperatingSession(InitiatePaymentRailOperatingSessionRequest req);

    @Description("Notify Payment Rail Operating Session")
    NotifyPaymentRailOperatingSessionResponse notifyPaymentRailOperatingSession(NotifyPaymentRailOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Request Payment Rail Operating Session")
    RequestPaymentRailOperatingSessionResponse requestPaymentRailOperatingSession(RequestPaymentRailOperatingSessionRequest req);

    @Description("Retrieve Payment Rail Operating Session")
    RetrievePaymentRailOperatingSessionResponse retrievePaymentRailOperatingSession(RetrievePaymentRailOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Update Payment Rail Operating Session")
    UpdatePaymentRailOperatingSessionResponse updatePaymentRailOperatingSession(UpdatePaymentRailOperatingSessionRequest req);
}