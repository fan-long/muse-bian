package org.museframework.bian.orderallocation;

import org.museframework.bian.orderallocation.dto.ControlSecuritiesAllocationProcedureRequest;
import org.museframework.bian.orderallocation.dto.ControlSecuritiesAllocationProcedureResponse;
import org.museframework.bian.orderallocation.dto.ExchangeSecuritiesAllocationProcedureRequest;
import org.museframework.bian.orderallocation.dto.ExchangeSecuritiesAllocationProcedureResponse;
import org.museframework.bian.orderallocation.dto.ExecuteSecuritiesAllocationProcedureRequest;
import org.museframework.bian.orderallocation.dto.ExecuteSecuritiesAllocationProcedureResponse;
import org.museframework.bian.orderallocation.dto.InitiateSecuritiesAllocationProcedureRequest;
import org.museframework.bian.orderallocation.dto.InitiateSecuritiesAllocationProcedureResponse;
import org.museframework.bian.orderallocation.dto.NotifySecuritiesAllocationProcedureRequest;
import org.museframework.bian.orderallocation.dto.NotifySecuritiesAllocationProcedureResponse;
import org.museframework.bian.orderallocation.dto.RequestSecuritiesAllocationProcedureRequest;
import org.museframework.bian.orderallocation.dto.RequestSecuritiesAllocationProcedureResponse;
import org.museframework.bian.orderallocation.dto.RetrieveSecuritiesAllocationProcedureRequest;
import org.museframework.bian.orderallocation.dto.RetrieveSecuritiesAllocationProcedureResponse;
import org.museframework.bian.orderallocation.dto.UpdateSecuritiesAllocationProcedureRequest;
import org.museframework.bian.orderallocation.dto.UpdateSecuritiesAllocationProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Order Allocation. ")
@GenericDomain(name="OrderAllocation", group="SecuritiesAllocationProcedure")
public interface CrSecuritiesAllocationProcedure {
    @GenericDtxEndpoint
    @Description("Control Securities Allocation Procedure")
    ControlSecuritiesAllocationProcedureResponse controlSecuritiesAllocationProcedure(ControlSecuritiesAllocationProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Securities Allocation Procedure")
    ExchangeSecuritiesAllocationProcedureResponse exchangeSecuritiesAllocationProcedure(ExchangeSecuritiesAllocationProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Execute Securities Allocation Procedure")
    ExecuteSecuritiesAllocationProcedureResponse executeSecuritiesAllocationProcedure(ExecuteSecuritiesAllocationProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Securities Allocation Procedure")
    InitiateSecuritiesAllocationProcedureResponse initiateSecuritiesAllocationProcedure(InitiateSecuritiesAllocationProcedureRequest req);

    @Description("Notify Securities Allocation Procedure")
    NotifySecuritiesAllocationProcedureResponse notifySecuritiesAllocationProcedure(NotifySecuritiesAllocationProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Request Securities Allocation Procedure")
    RequestSecuritiesAllocationProcedureResponse requestSecuritiesAllocationProcedure(RequestSecuritiesAllocationProcedureRequest req);

    @Description("Retrieve Securities Allocation Procedure")
    RetrieveSecuritiesAllocationProcedureResponse retrieveSecuritiesAllocationProcedure(RetrieveSecuritiesAllocationProcedureRequest req);

    @GenericDtxEndpoint
    @Description("Update Securities Allocation Procedure")
    UpdateSecuritiesAllocationProcedureResponse updateSecuritiesAllocationProcedure(UpdateSecuritiesAllocationProcedureRequest req);
}