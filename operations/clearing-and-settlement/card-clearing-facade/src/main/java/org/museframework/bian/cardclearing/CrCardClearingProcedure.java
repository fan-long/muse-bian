package org.museframework.bian.cardclearing;

import org.museframework.bian.cardclearing.dto.InitiateCardClearingProcedureRequest;
import org.museframework.bian.cardclearing.dto.InitiateCardClearingProcedureResponse;
import org.museframework.bian.cardclearing.dto.RetrieveCardClearingProcedureRequest;
import org.museframework.bian.cardclearing.dto.RetrieveCardClearingProcedureResponse;
import org.museframework.bian.cardclearing.dto.UpdateCardClearingProcedureRequest;
import org.museframework.bian.cardclearing.dto.UpdateCardClearingProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Card Clearing. ")
@GenericDomain(name="CardClearing", group="CardClearingProcedure")
public interface CrCardClearingProcedure {
    @GenericDtxEndpoint
    @Description("InCR Initiate a card clearing process")
    InitiateCardClearingProcedureResponse initiateCardClearingProcedure(InitiateCardClearingProcedureRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of a card clearing processing batch")
    UpdateCardClearingProcedureResponse updateCardClearingProcedure(UpdateCardClearingProcedureRequest req);

    @Description("ReCR Retrieve details about a card clearing process")
    RetrieveCardClearingProcedureResponse retrieveCardClearingProcedure(RetrieveCardClearingProcedureRequest req);
}