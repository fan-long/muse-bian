package org.museframework.bian.servicingissue;

import org.museframework.bian.servicingissue.dto.ControlServicingIssueProcedureRequest;
import org.museframework.bian.servicingissue.dto.ControlServicingIssueProcedureResponse;
import org.museframework.bian.servicingissue.dto.ExchangeServicingIssueProcedureRequest;
import org.museframework.bian.servicingissue.dto.ExchangeServicingIssueProcedureResponse;
import org.museframework.bian.servicingissue.dto.ExecuteServicingIssueProcedureRequest;
import org.museframework.bian.servicingissue.dto.ExecuteServicingIssueProcedureResponse;
import org.museframework.bian.servicingissue.dto.InitiateServicingIssueProcedureRequest;
import org.museframework.bian.servicingissue.dto.InitiateServicingIssueProcedureResponse;
import org.museframework.bian.servicingissue.dto.NotifyServicingIssueProcedureRequest;
import org.museframework.bian.servicingissue.dto.NotifyServicingIssueProcedureResponse;
import org.museframework.bian.servicingissue.dto.RequestServicingIssueProcedureRequest;
import org.museframework.bian.servicingissue.dto.RequestServicingIssueProcedureResponse;
import org.museframework.bian.servicingissue.dto.RetrieveServicingIssueProcedureRequest;
import org.museframework.bian.servicingissue.dto.RetrieveServicingIssueProcedureResponse;
import org.museframework.bian.servicingissue.dto.UpdateServicingIssueProcedureRequest;
import org.museframework.bian.servicingissue.dto.UpdateServicingIssueProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Servicing Issue. ")
@GenericDomain(name="ServicingIssue", group="ServicingIssueProcedure")
public interface CrServicingIssueProcedure {
    @GenericDtxEndpoint
    @Description("Control Servicing Issue Procedure")
    ControlServicingIssueProcedureResponse controlServicingIssueProcedure(ControlServicingIssueProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Servicing Issue Procedure")
    ExchangeServicingIssueProcedureResponse exchangeServicingIssueProcedure(ExchangeServicingIssueProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Execute Servicing Issue Procedure")
    ExecuteServicingIssueProcedureResponse executeServicingIssueProcedure(ExecuteServicingIssueProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Servicing Issue Procedure")
    InitiateServicingIssueProcedureResponse initiateServicingIssueProcedure(InitiateServicingIssueProcedureRequest req);

    @Description("Notify Servicing Issue Procedure")
    NotifyServicingIssueProcedureResponse notifyServicingIssueProcedure(NotifyServicingIssueProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Request Servicing Issue Procedure")
    RequestServicingIssueProcedureResponse requestServicingIssueProcedure(RequestServicingIssueProcedureRequest req);

    @Description("Retrieve Servicing Issue Procedure")
    RetrieveServicingIssueProcedureResponse retrieveServicingIssueProcedure(RetrieveServicingIssueProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Update Servicing Issue Procedure")
    UpdateServicingIssueProcedureResponse updateServicingIssueProcedure(UpdateServicingIssueProcedureRequest req);
}