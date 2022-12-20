package org.museframework.bian.cardcollections;

import org.museframework.bian.cardcollections.dto.InitiateCardCollectionsProcedureRequest;
import org.museframework.bian.cardcollections.dto.InitiateCardCollectionsProcedureResponse;
import org.museframework.bian.cardcollections.dto.RetrieveCardCollectionsProcedureRequest;
import org.museframework.bian.cardcollections.dto.RetrieveCardCollectionsProcedureResponse;
import org.museframework.bian.cardcollections.dto.UpdateCardCollectionsProcedureRequest;
import org.museframework.bian.cardcollections.dto.UpdateCardCollectionsProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Card Collections. ")
@GenericDomain(name="CardCollections", group="CardCollectionsProcedure")
public interface CrCardCollectionsProcedure {
    @GenericDtxEndpoint
    @Description("InCR Initiate card collections processing")
    InitiateCardCollectionsProcedureResponse initiateCardCollectionsProcedure(InitiateCardCollectionsProcedureRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of card collections processing")
    UpdateCardCollectionsProcedureResponse updateCardCollectionsProcedure(UpdateCardCollectionsProcedureRequest req);

    @Description("ReCR Retrieve details about a card collections procedure")
    RetrieveCardCollectionsProcedureResponse retrieveCardCollectionsProcedure(RetrieveCardCollectionsProcedureRequest req);
}