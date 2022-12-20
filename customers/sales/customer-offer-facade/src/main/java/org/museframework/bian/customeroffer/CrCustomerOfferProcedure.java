package org.museframework.bian.customeroffer;

import org.museframework.bian.customeroffer.dto.ExecuteCustomerOfferProcedureRequest;
import org.museframework.bian.customeroffer.dto.ExecuteCustomerOfferProcedureResponse;
import org.museframework.bian.customeroffer.dto.InitiateCustomerOfferProcedureRequest;
import org.museframework.bian.customeroffer.dto.InitiateCustomerOfferProcedureResponse;
import org.museframework.bian.customeroffer.dto.RequestCustomerOfferProcedureRequest;
import org.museframework.bian.customeroffer.dto.RequestCustomerOfferProcedureResponse;
import org.museframework.bian.customeroffer.dto.RetrieveCustomerOfferProcedureRequest;
import org.museframework.bian.customeroffer.dto.RetrieveCustomerOfferProcedureResponse;
import org.museframework.bian.customeroffer.dto.UpdateCustomerOfferProcedureRequest;
import org.museframework.bian.customeroffer.dto.UpdateCustomerOfferProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The customer offer procedure record, combines the result of all underlying work steps")
@GenericDomain(name="CustomerOffer", group="CustomerOfferProcedure")
public interface CrCustomerOfferProcedure {
    @GenericDtxEndpoint
    @Description("InCR Initiate the offer procedure")
    InitiateCustomerOfferProcedureResponse initiateCustomerOfferProcedure(InitiateCustomerOfferProcedureRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of an offer procedure")
    UpdateCustomerOfferProcedureResponse updateCustomerOfferProcedure(UpdateCustomerOfferProcedureRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an automated task against an offer (e.g. submit data)")
    ExecuteCustomerOfferProcedureResponse executeCustomerOfferProcedure(ExecuteCustomerOfferProcedureRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention in an offer (e.g. request specialist support)")
    RequestCustomerOfferProcedureResponse requestCustomerOfferProcedure(RequestCustomerOfferProcedureRequest req);

    @Description("ReCR Retrieve details about a customer offer")
    RetrieveCustomerOfferProcedureResponse retrieveCustomerOfferProcedure(RetrieveCustomerOfferProcedureRequest req);
}