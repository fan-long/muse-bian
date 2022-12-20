package org.museframework.bian.cardcase;

import org.museframework.bian.cardcase.dto.InitiateCardCaseProcedureRequest;
import org.museframework.bian.cardcase.dto.InitiateCardCaseProcedureResponse;
import org.museframework.bian.cardcase.dto.RetrieveCardCaseProcedureRequest;
import org.museframework.bian.cardcase.dto.RetrieveCardCaseProcedureResponse;
import org.museframework.bian.cardcase.dto.UpdateCardCaseProcedureRequest;
import org.museframework.bian.cardcase.dto.UpdateCardCaseProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Card Case. ")
@GenericDomain(name="CardCase", group="CardCaseProcedure")
public interface CrCardCaseProcedure {
    @GenericDtxEndpoint
    @Description("InCR Initiate a card case procedure")
    InitiateCardCaseProcedureResponse initiateCardCaseProcedure(InitiateCardCaseProcedureRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details about a card case")
    UpdateCardCaseProcedureResponse updateCardCaseProcedure(UpdateCardCaseProcedureRequest req);

    @Description("ReCR Retrieve details about a card case")
    RetrieveCardCaseProcedureResponse retrieveCardCaseProcedure(RetrieveCardCaseProcedureRequest req);
}