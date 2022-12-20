package org.museframework.bian.virtualaccount;

import org.museframework.bian.virtualaccount.dto.CaptureDirectDebitRequest;
import org.museframework.bian.virtualaccount.dto.CaptureDirectDebitResponse;
import org.museframework.bian.virtualaccount.dto.ControlDirectDebitRequest;
import org.museframework.bian.virtualaccount.dto.ControlDirectDebitResponse;
import org.museframework.bian.virtualaccount.dto.GrantDirectDebitRequest;
import org.museframework.bian.virtualaccount.dto.GrantDirectDebitResponse;
import org.museframework.bian.virtualaccount.dto.InitiateDirectDebitRequest;
import org.museframework.bian.virtualaccount.dto.InitiateDirectDebitResponse;
import org.museframework.bian.virtualaccount.dto.RequestDirectDebitRequest;
import org.museframework.bian.virtualaccount.dto.RequestDirectDebitResponse;
import org.museframework.bian.virtualaccount.dto.RetrieveDirectDebitRequest;
import org.museframework.bian.virtualaccount.dto.RetrieveDirectDebitResponse;
import org.museframework.bian.virtualaccount.dto.UpdateDirectDebitRequest;
import org.museframework.bian.virtualaccount.dto.UpdateDirectDebitResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Virtual Account Configuration Fulfillment arrangement within the Virtual Account Configuration Fulfillment")
@GenericDomain(name="VirtualAccount", group="DirectDebit")
public interface BqDirectDebit {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Direct Debit activity or event related information")
    CaptureDirectDebitResponse captureDirectDebit(CaptureDirectDebitRequest req);

    @GenericDtxEndpoint
    @Description("CoBQ Control the processing of Direct Debit")
    ControlDirectDebitResponse controlDirectDebit(ControlDirectDebitRequest req);

    @GenericDtxEndpoint
    @Description("GrBQ Obtain permission to act in relation to Direct Debit")
    GrantDirectDebitResponse grantDirectDebit(GrantDirectDebitRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Direct Debit")
    InitiateDirectDebitResponse initiateDirectDebit(InitiateDirectDebitRequest req);

    @Description("ReBQ Retrieve details about any aspect of Direct Debit")
    RetrieveDirectDebitResponse retrieveDirectDebit(RetrieveDirectDebitRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Direct Debit")
    RequestDirectDebitResponse requestDirectDebit(RequestDirectDebitRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Direct Debit")
    UpdateDirectDebitResponse updateDirectDebit(UpdateDirectDebitRequest req);
}