package org.museframework.bian.cartraswi;

import org.museframework.bian.cartraswi.dto.InitiateCardTransactionSwitchOperatingSessionRequest;
import org.museframework.bian.cartraswi.dto.InitiateCardTransactionSwitchOperatingSessionResponse;
import org.museframework.bian.cartraswi.dto.RetrieveCardTransactionSwitchOperatingSessionRequest;
import org.museframework.bian.cartraswi.dto.RetrieveCardTransactionSwitchOperatingSessionResponse;
import org.museframework.bian.cartraswi.dto.UpdateCardTransactionSwitchOperatingSessionRequest;
import org.museframework.bian.cartraswi.dto.UpdateCardTransactionSwitchOperatingSessionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility within Card Transaction Switch. ")
@GenericDomain(name="CardTransactionSwitch", group="CardTransactionSwitchOperatingSession")
public interface CrCardTransactionSwitchOperatingSession {
    @GenericDtxEndpoint
    @Description("InCR Initiate a card transaction switch operating session")
    InitiateCardTransactionSwitchOperatingSessionResponse initiateCardTransactionSwitchOperatingSession(InitiateCardTransactionSwitchOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update an active card transaction switch operating session")
    UpdateCardTransactionSwitchOperatingSessionResponse updateCardTransactionSwitchOperatingSession(UpdateCardTransactionSwitchOperatingSessionRequest req);

    @Description("ReCR Retrieve details about an active card transaction switch operating session")
    RetrieveCardTransactionSwitchOperatingSessionResponse retrieveCardTransactionSwitchOperatingSession(RetrieveCardTransactionSwitchOperatingSessionRequest req);
}