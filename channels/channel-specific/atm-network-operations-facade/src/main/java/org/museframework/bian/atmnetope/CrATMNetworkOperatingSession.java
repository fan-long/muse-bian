package org.museframework.bian.atmnetope;

import org.museframework.bian.atmnetope.dto.ControlATMNetworkOperatingSessionRequest;
import org.museframework.bian.atmnetope.dto.ControlATMNetworkOperatingSessionResponse;
import org.museframework.bian.atmnetope.dto.ExchangeATMNetworkOperatingSessionRequest;
import org.museframework.bian.atmnetope.dto.ExchangeATMNetworkOperatingSessionResponse;
import org.museframework.bian.atmnetope.dto.ExecuteATMNetworkOperatingSessionRequest;
import org.museframework.bian.atmnetope.dto.ExecuteATMNetworkOperatingSessionResponse;
import org.museframework.bian.atmnetope.dto.InitiateATMNetworkOperatingSessionRequest;
import org.museframework.bian.atmnetope.dto.InitiateATMNetworkOperatingSessionResponse;
import org.museframework.bian.atmnetope.dto.RequestATMNetworkOperatingSessionRequest;
import org.museframework.bian.atmnetope.dto.RequestATMNetworkOperatingSessionResponse;
import org.museframework.bian.atmnetope.dto.RetrieveATMNetworkOperatingSessionRequest;
import org.museframework.bian.atmnetope.dto.RetrieveATMNetworkOperatingSessionResponse;
import org.museframework.bian.atmnetope.dto.UpdateATMNetworkOperatingSessionRequest;
import org.museframework.bian.atmnetope.dto.UpdateATMNetworkOperatingSessionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility  within ATM Network Operations.  Example: Operate the bank's internal intranet facility.")
@GenericDomain(name="ATMNetworkOperations", group="ATMNetworkOperatingSession")
public interface CrATMNetworkOperatingSession {
    @GenericDtxEndpoint
    @Description("CoCR Control the processing of ATM Network Operating Session")
    ControlATMNetworkOperatingSessionResponse controlATMNetworkOperatingSession(ControlATMNetworkOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of ATM Network Operating Session processing")
    ExchangeATMNetworkOperatingSessionResponse exchangeATMNetworkOperatingSession(ExchangeATMNetworkOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an available automated action for ATM Network Operating Session")
    ExecuteATMNetworkOperatingSessionResponse executeATMNetworkOperatingSession(ExecuteATMNetworkOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new ATM Network Operating Session")
    InitiateATMNetworkOperatingSessionResponse initiateATMNetworkOperatingSession(InitiateATMNetworkOperatingSessionRequest req);

    @Description("ReCR Retrieve details about any aspect of ATM Network Operating Session")
    RetrieveATMNetworkOperatingSessionResponse retrieveATMNetworkOperatingSession(RetrieveATMNetworkOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to ATM Network Operating Session")
    RequestATMNetworkOperatingSessionResponse requestATMNetworkOperatingSession(RequestATMNetworkOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to ATM Network Operating Session")
    UpdateATMNetworkOperatingSessionResponse updateATMNetworkOperatingSession(UpdateATMNetworkOperatingSessionRequest req);
}