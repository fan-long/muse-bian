package org.museframework.bian.servicingorder;

import org.museframework.bian.servicingorder.dto.ExecuteServicingOrderProcedureRequest;
import org.museframework.bian.servicingorder.dto.ExecuteServicingOrderProcedureResponse;
import org.museframework.bian.servicingorder.dto.InitiateServicingOrderProcedureRequest;
import org.museframework.bian.servicingorder.dto.InitiateServicingOrderProcedureResponse;
import org.museframework.bian.servicingorder.dto.RequestServicingOrderProcedureRequest;
import org.museframework.bian.servicingorder.dto.RequestServicingOrderProcedureResponse;
import org.museframework.bian.servicingorder.dto.RetrieveServicingOrderProcedureRequest;
import org.museframework.bian.servicingorder.dto.RetrieveServicingOrderProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Servicing Order. ")
@GenericDomain(name="ServicingOrder", group="ServicingOrderProcedure")
public interface CrServicingOrderProcedure {
    @GenericDtxEndpoint
    @Description("InCR Initiate a servicing order")
    InitiateServicingOrderProcedureResponse initiateServicingOrderProcedure(InitiateServicingOrderProcedureRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an automated task in a servicing order (e.g. upload data)")
    ExecuteServicingOrderProcedureResponse executeServicingOrderProcedure(ExecuteServicingOrderProcedureRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention in a servicing order (e.g. engage a servicing agent)")
    RequestServicingOrderProcedureResponse requestServicingOrderProcedure(RequestServicingOrderProcedureRequest req);

    @Description("ReCR Retrieve details about a servicing order")
    RetrieveServicingOrderProcedureResponse retrieveServicingOrderProcedure(RetrieveServicingOrderProcedureRequest req);
}