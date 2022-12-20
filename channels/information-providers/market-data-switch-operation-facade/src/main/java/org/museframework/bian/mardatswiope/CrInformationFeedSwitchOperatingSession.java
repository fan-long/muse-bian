package org.museframework.bian.mardatswiope;

import org.museframework.bian.mardatswiope.dto.InitiateInformationFeedSwitchOperatingSessionRequest;
import org.museframework.bian.mardatswiope.dto.InitiateInformationFeedSwitchOperatingSessionResponse;
import org.museframework.bian.mardatswiope.dto.RetrieveInformationFeedSwitchOperatingSessionRequest;
import org.museframework.bian.mardatswiope.dto.RetrieveInformationFeedSwitchOperatingSessionResponse;
import org.museframework.bian.mardatswiope.dto.UpdateInformationFeedSwitchOperatingSessionRequest;
import org.museframework.bian.mardatswiope.dto.UpdateInformationFeedSwitchOperatingSessionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility within Market Data Switch Operation. ")
@GenericDomain(name="MarketDataSwitchOperation", group="InformationFeedSwitchOperatingSession")
public interface CrInformationFeedSwitchOperatingSession {
    @GenericDtxEndpoint
    @Description("InCR Initiate a market data switch operating session")
    InitiateInformationFeedSwitchOperatingSessionResponse initiateInformationFeedSwitchOperatingSession(InitiateInformationFeedSwitchOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details for the market data switch operating session")
    UpdateInformationFeedSwitchOperatingSessionResponse updateInformationFeedSwitchOperatingSession(UpdateInformationFeedSwitchOperatingSessionRequest req);

    @Description("ReCR Retrieve details about the market data switch operating session")
    RetrieveInformationFeedSwitchOperatingSessionResponse retrieveInformationFeedSwitchOperatingSession(RetrieveInformationFeedSwitchOperatingSessionRequest req);
}