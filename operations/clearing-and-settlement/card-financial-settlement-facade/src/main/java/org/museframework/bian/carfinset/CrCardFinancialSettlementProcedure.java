package org.museframework.bian.carfinset;

import org.museframework.bian.carfinset.dto.InitiateCardFinancialSettlementProcedureRequest;
import org.museframework.bian.carfinset.dto.InitiateCardFinancialSettlementProcedureResponse;
import org.museframework.bian.carfinset.dto.RetrieveCardFinancialSettlementProcedureRequest;
import org.museframework.bian.carfinset.dto.RetrieveCardFinancialSettlementProcedureResponse;
import org.museframework.bian.carfinset.dto.UpdateCardFinancialSettlementProcedureRequest;
import org.museframework.bian.carfinset.dto.UpdateCardFinancialSettlementProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Card Financial Settlement. ")
@GenericDomain(name="CardFinancialSettlement", group="CardFinancialSettlementProcedure")
public interface CrCardFinancialSettlementProcedure {
    @GenericDtxEndpoint
    @Description("InCR Initiate card financial settlement processing")
    InitiateCardFinancialSettlementProcedureResponse initiateCardFinancialSettlementProcedure(InitiateCardFinancialSettlementProcedureRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update the card financial settlement processing")
    UpdateCardFinancialSettlementProcedureResponse updateCardFinancialSettlementProcedure(UpdateCardFinancialSettlementProcedureRequest req);

    @Description("ReCR Retrieve details and reports about the card settlement processing")
    RetrieveCardFinancialSettlementProcedureResponse retrieveCardFinancialSettlementProcedure(RetrieveCardFinancialSettlementProcedureRequest req);
}