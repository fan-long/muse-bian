package org.museframework.bian.carterope;

import org.museframework.bian.carterope.dto.InitiateCardPOSNetworkOperatingSessionRequest;
import org.museframework.bian.carterope.dto.InitiateCardPOSNetworkOperatingSessionResponse;
import org.museframework.bian.carterope.dto.RetrieveCardPOSNetworkOperatingSessionRequest;
import org.museframework.bian.carterope.dto.RetrieveCardPOSNetworkOperatingSessionResponse;
import org.museframework.bian.carterope.dto.UpdateCardPOSNetworkOperatingSessionRequest;
import org.museframework.bian.carterope.dto.UpdateCardPOSNetworkOperatingSessionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility within Card Terminal Operation. ")
@GenericDomain(name="CardTerminalOperation", group="CardPOSNetworkOperatingSession")
public interface CrCardPOSNetworkOperatingSession {
    @GenericDtxEndpoint
    @Description("InCR Initiate a card POS network operation session")
    InitiateCardPOSNetworkOperatingSessionResponse initiateCardPOSNetworkOperatingSession(InitiateCardPOSNetworkOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of a card POS session")
    UpdateCardPOSNetworkOperatingSessionResponse updateCardPOSNetworkOperatingSession(UpdateCardPOSNetworkOperatingSessionRequest req);

    @Description("ReCR Retrieve details about the card POS session")
    RetrieveCardPOSNetworkOperatingSessionResponse retrieveCardPOSNetworkOperatingSession(RetrieveCardPOSNetworkOperatingSessionRequest req);
}