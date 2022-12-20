package org.museframework.bian.knowledgeexchange;

import org.museframework.bian.knowledgeexchange.dto.ControlIntellectualPropertyExchangeOperatingSessionRequest;
import org.museframework.bian.knowledgeexchange.dto.ControlIntellectualPropertyExchangeOperatingSessionResponse;
import org.museframework.bian.knowledgeexchange.dto.ExchangeIntellectualPropertyExchangeOperatingSessionRequest;
import org.museframework.bian.knowledgeexchange.dto.ExchangeIntellectualPropertyExchangeOperatingSessionResponse;
import org.museframework.bian.knowledgeexchange.dto.ExecuteIntellectualPropertyExchangeOperatingSessionRequest;
import org.museframework.bian.knowledgeexchange.dto.ExecuteIntellectualPropertyExchangeOperatingSessionResponse;
import org.museframework.bian.knowledgeexchange.dto.InitiateIntellectualPropertyExchangeOperatingSessionRequest;
import org.museframework.bian.knowledgeexchange.dto.InitiateIntellectualPropertyExchangeOperatingSessionResponse;
import org.museframework.bian.knowledgeexchange.dto.RequestIntellectualPropertyExchangeOperatingSessionRequest;
import org.museframework.bian.knowledgeexchange.dto.RequestIntellectualPropertyExchangeOperatingSessionResponse;
import org.museframework.bian.knowledgeexchange.dto.RetrieveIntellectualPropertyExchangeOperatingSessionRequest;
import org.museframework.bian.knowledgeexchange.dto.RetrieveIntellectualPropertyExchangeOperatingSessionResponse;
import org.museframework.bian.knowledgeexchange.dto.UpdateIntellectualPropertyExchangeOperatingSessionRequest;
import org.museframework.bian.knowledgeexchange.dto.UpdateIntellectualPropertyExchangeOperatingSessionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility  within Knowledge Exchange.  Example: Operate the bank's internal intranet facility.")
@GenericDomain(name="KnowledgeExchange", group="IntellectualPropertyExchangeOperatingSession")
public interface CrIntellectualPropertyExchangeOperatingSession {
    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Intellectual Property Exchange Operating Session")
    ControlIntellectualPropertyExchangeOperatingSessionResponse controlIntellectualPropertyExchangeOperatingSession(ControlIntellectualPropertyExchangeOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Intellectual Property Exchange Operating Session processing")
    ExchangeIntellectualPropertyExchangeOperatingSessionResponse exchangeIntellectualPropertyExchangeOperatingSession(ExchangeIntellectualPropertyExchangeOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an available automated action for Intellectual Property Exchange Operating Session")
    ExecuteIntellectualPropertyExchangeOperatingSessionResponse executeIntellectualPropertyExchangeOperatingSession(ExecuteIntellectualPropertyExchangeOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Intellectual Property Exchange Operating Session")
    InitiateIntellectualPropertyExchangeOperatingSessionResponse initiateIntellectualPropertyExchangeOperatingSession(InitiateIntellectualPropertyExchangeOperatingSessionRequest req);

    @Description("ReCR Retrieve details about any aspect of Intellectual Property Exchange Operating Session")
    RetrieveIntellectualPropertyExchangeOperatingSessionResponse retrieveIntellectualPropertyExchangeOperatingSession(RetrieveIntellectualPropertyExchangeOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Intellectual Property Exchange Operating Session")
    RequestIntellectualPropertyExchangeOperatingSessionResponse requestIntellectualPropertyExchangeOperatingSession(RequestIntellectualPropertyExchangeOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Intellectual Property Exchange Operating Session")
    UpdateIntellectualPropertyExchangeOperatingSessionResponse updateIntellectualPropertyExchangeOperatingSession(UpdateIntellectualPropertyExchangeOperatingSessionRequest req);
}