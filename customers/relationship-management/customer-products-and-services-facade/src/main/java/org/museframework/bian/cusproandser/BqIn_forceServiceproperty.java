package org.museframework.bian.cusproandser;

import org.museframework.bian.cusproandser.dto.ExecuteIn_forceServicepropertyRequest;
import org.museframework.bian.cusproandser.dto.ExecuteIn_forceServicepropertyResponse;
import org.museframework.bian.cusproandser.dto.NotifyIn_forceServicepropertyRequest;
import org.museframework.bian.cusproandser.dto.NotifyIn_forceServicepropertyResponse;
import org.museframework.bian.cusproandser.dto.RegisterIn_forceServicepropertyRequest;
import org.museframework.bian.cusproandser.dto.RegisterIn_forceServicepropertyResponse;
import org.museframework.bian.cusproandser.dto.RequestIn_forceServicepropertyRequest;
import org.museframework.bian.cusproandser.dto.RequestIn_forceServicepropertyResponse;
import org.museframework.bian.cusproandser.dto.RetrieveIn_forceServicepropertyRequest;
import org.museframework.bian.cusproandser.dto.RetrieveIn_forceServicepropertyResponse;
import org.museframework.bian.cusproandser.dto.UpdateIn_forceServicepropertyRequest;
import org.museframework.bian.cusproandser.dto.UpdateIn_forceServicepropertyResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The In-force Product property properties that represent a discrete aspect of the In-force Product property")
@GenericDomain(name="CustomerProductsandServices", group="In_forceServiceproperty")
public interface BqIn_forceServiceproperty {
    @GenericDtxEndpoint
    @Description("Execute In-force Service property")
    ExecuteIn_forceServicepropertyResponse executeIn_forceServiceproperty(ExecuteIn_forceServicepropertyRequest req);

    @Description("Notify In-force Service property")
    NotifyIn_forceServicepropertyResponse notifyIn_forceServiceproperty(NotifyIn_forceServicepropertyRequest req);

    @GenericDtxEndpoint
    @Description("Register In-force Service property")
    RegisterIn_forceServicepropertyResponse registerIn_forceServiceproperty(RegisterIn_forceServicepropertyRequest req);

    @GenericDtxEndpoint
    @Description("Request In-force Service property")
    RequestIn_forceServicepropertyResponse requestIn_forceServiceproperty(RequestIn_forceServicepropertyRequest req);

    @Description("Retrieve In-force Service property")
    RetrieveIn_forceServicepropertyResponse retrieveIn_forceServiceproperty(RetrieveIn_forceServicepropertyRequest req);

    @GenericDtxEndpoint
    @Description("Update In-force Service property")
    UpdateIn_forceServicepropertyResponse updateIn_forceServiceproperty(UpdateIn_forceServicepropertyRequest req);
}