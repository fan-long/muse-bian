package org.museframework.bian.corporateaction;

import org.museframework.bian.corporateaction.dto.ControlCorporateActionProcedureRequest;
import org.museframework.bian.corporateaction.dto.ControlCorporateActionProcedureResponse;
import org.museframework.bian.corporateaction.dto.ExchangeCorporateActionProcedureRequest;
import org.museframework.bian.corporateaction.dto.ExchangeCorporateActionProcedureResponse;
import org.museframework.bian.corporateaction.dto.ExecuteCorporateActionProcedureRequest;
import org.museframework.bian.corporateaction.dto.ExecuteCorporateActionProcedureResponse;
import org.museframework.bian.corporateaction.dto.InitiateCorporateActionProcedureRequest;
import org.museframework.bian.corporateaction.dto.InitiateCorporateActionProcedureResponse;
import org.museframework.bian.corporateaction.dto.NotifyCorporateActionProcedureRequest;
import org.museframework.bian.corporateaction.dto.NotifyCorporateActionProcedureResponse;
import org.museframework.bian.corporateaction.dto.RequestCorporateActionProcedureRequest;
import org.museframework.bian.corporateaction.dto.RequestCorporateActionProcedureResponse;
import org.museframework.bian.corporateaction.dto.RetrieveCorporateActionProcedureRequest;
import org.museframework.bian.corporateaction.dto.RetrieveCorporateActionProcedureResponse;
import org.museframework.bian.corporateaction.dto.UpdateCorporateActionProcedureRequest;
import org.museframework.bian.corporateaction.dto.UpdateCorporateActionProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Corporate Action. ")
@GenericDomain(name="CorporateAction", group="CorporateActionProcedure")
public interface CrCorporateActionProcedure {
    @GenericDtxEndpoint
    @Description("Control Corporate Action Procedure")
    ControlCorporateActionProcedureResponse controlCorporateActionProcedure(ControlCorporateActionProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Corporate Action Procedure")
    ExchangeCorporateActionProcedureResponse exchangeCorporateActionProcedure(ExchangeCorporateActionProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Execute Corporate Action Procedure")
    ExecuteCorporateActionProcedureResponse executeCorporateActionProcedure(ExecuteCorporateActionProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Corporate Action Procedure")
    InitiateCorporateActionProcedureResponse initiateCorporateActionProcedure(InitiateCorporateActionProcedureRequest req);

    @Description("Notify Corporate Action Procedure")
    NotifyCorporateActionProcedureResponse notifyCorporateActionProcedure(NotifyCorporateActionProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Request Corporate Action Procedure")
    RequestCorporateActionProcedureResponse requestCorporateActionProcedure(RequestCorporateActionProcedureRequest req);

    @Description("Retrieve Corporate Action Procedure")
    RetrieveCorporateActionProcedureResponse retrieveCorporateActionProcedure(RetrieveCorporateActionProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Update Corporate Action Procedure")
    UpdateCorporateActionProcedureResponse updateCorporateActionProcedure(UpdateCorporateActionProcedureRequest req);
}