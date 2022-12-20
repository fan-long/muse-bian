package org.museframework.bian.corbanope;

import org.museframework.bian.corbanope.dto.ExchangeCorrespondentBankOperatingSessionRequest;
import org.museframework.bian.corbanope.dto.ExchangeCorrespondentBankOperatingSessionResponse;
import org.museframework.bian.corbanope.dto.ExecuteCorrespondentBankOperatingSessionRequest;
import org.museframework.bian.corbanope.dto.ExecuteCorrespondentBankOperatingSessionResponse;
import org.museframework.bian.corbanope.dto.InitiateCorrespondentBankOperatingSessionRequest;
import org.museframework.bian.corbanope.dto.InitiateCorrespondentBankOperatingSessionResponse;
import org.museframework.bian.corbanope.dto.NotifyCorrespondentBankOperatingSessionRequest;
import org.museframework.bian.corbanope.dto.NotifyCorrespondentBankOperatingSessionResponse;
import org.museframework.bian.corbanope.dto.RequestCorrespondentBankOperatingSessionRequest;
import org.museframework.bian.corbanope.dto.RequestCorrespondentBankOperatingSessionResponse;
import org.museframework.bian.corbanope.dto.RetrieveCorrespondentBankOperatingSessionRequest;
import org.museframework.bian.corbanope.dto.RetrieveCorrespondentBankOperatingSessionResponse;
import org.museframework.bian.corbanope.dto.UpdateCorrespondentBankOperatingSessionRequest;
import org.museframework.bian.corbanope.dto.UpdateCorrespondentBankOperatingSessionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Correspondent Bank. ")
@GenericDomain(name="CorrespondentBankOperations", group="CorrespondentBankOperatingSession")
public interface CrCorrespondentBankOperatingSession {
    @GenericDtxEndpoint
    @Description("Initiate a correspondent fulfillment arrangement")
    InitiateCorrespondentBankOperatingSessionResponse initiateCorrespondentBankOperatingSession(InitiateCorrespondentBankOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Update correspondent fulfillment arrangement")
    UpdateCorrespondentBankOperatingSessionResponse updateCorrespondentBankOperatingSession(UpdateCorrespondentBankOperatingSessionRequest req);

    @Description("Retrieve a correspondent fulfillment arrangement")
    RetrieveCorrespondentBankOperatingSessionResponse retrieveCorrespondentBankOperatingSession(RetrieveCorrespondentBankOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Correspondent Bank Operating Session")
    ExchangeCorrespondentBankOperatingSessionResponse exchangeCorrespondentBankOperatingSession(ExchangeCorrespondentBankOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Correspondent Bank Operating Session")
    ExecuteCorrespondentBankOperatingSessionResponse executeCorrespondentBankOperatingSession(ExecuteCorrespondentBankOperatingSessionRequest req);

    @Description("Notify Correspondent Bank Operating Session")
    NotifyCorrespondentBankOperatingSessionResponse notifyCorrespondentBankOperatingSession(NotifyCorrespondentBankOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Request Correspondent Bank Operating Session")
    RequestCorrespondentBankOperatingSessionResponse requestCorrespondentBankOperatingSession(RequestCorrespondentBankOperatingSessionRequest req);
}