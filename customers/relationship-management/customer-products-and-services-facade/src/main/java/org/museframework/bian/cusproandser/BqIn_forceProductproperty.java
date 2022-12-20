package org.museframework.bian.cusproandser;

import org.museframework.bian.cusproandser.dto.ExecuteIn_forceProductpropertyRequest;
import org.museframework.bian.cusproandser.dto.ExecuteIn_forceProductpropertyResponse;
import org.museframework.bian.cusproandser.dto.NotifyIn_forceProductpropertyRequest;
import org.museframework.bian.cusproandser.dto.NotifyIn_forceProductpropertyResponse;
import org.museframework.bian.cusproandser.dto.RegisterIn_forceProductpropertyRequest;
import org.museframework.bian.cusproandser.dto.RegisterIn_forceProductpropertyResponse;
import org.museframework.bian.cusproandser.dto.RequestIn_forceProductpropertyRequest;
import org.museframework.bian.cusproandser.dto.RequestIn_forceProductpropertyResponse;
import org.museframework.bian.cusproandser.dto.RetrieveIn_forceProductpropertyRequest;
import org.museframework.bian.cusproandser.dto.RetrieveIn_forceProductpropertyResponse;
import org.museframework.bian.cusproandser.dto.UpdateIn_forceProductpropertyRequest;
import org.museframework.bian.cusproandser.dto.UpdateIn_forceProductpropertyResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The In-force Product property properties that represent a discrete aspect of the In-force Product property")
@GenericDomain(name="CustomerProductsandServices", group="In_forceProductproperty")
public interface BqIn_forceProductproperty {
    @GenericDtxEndpoint
    @Description("Execute In-force Product property")
    ExecuteIn_forceProductpropertyResponse executeIn_forceProductproperty(ExecuteIn_forceProductpropertyRequest req);

    @Description("Notify In-force Product property")
    NotifyIn_forceProductpropertyResponse notifyIn_forceProductproperty(NotifyIn_forceProductpropertyRequest req);

    @GenericDtxEndpoint
    @Description("Register In-force Product property")
    RegisterIn_forceProductpropertyResponse registerIn_forceProductproperty(RegisterIn_forceProductpropertyRequest req);

    @GenericDtxEndpoint
    @Description("Request In-force Product property")
    RequestIn_forceProductpropertyResponse requestIn_forceProductproperty(RequestIn_forceProductpropertyRequest req);

    @Description("Retrieve In-force Product property")
    RetrieveIn_forceProductpropertyResponse retrieveIn_forceProductproperty(RetrieveIn_forceProductpropertyRequest req);

    @GenericDtxEndpoint
    @Description("Update In-force Product property")
    UpdateIn_forceProductpropertyResponse updateIn_forceProductproperty(UpdateIn_forceProductpropertyRequest req);
}