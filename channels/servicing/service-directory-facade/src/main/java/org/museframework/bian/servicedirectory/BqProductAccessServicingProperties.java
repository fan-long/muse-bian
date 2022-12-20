package org.museframework.bian.servicedirectory;

import org.museframework.bian.servicedirectory.dto.ExecuteProductAccessServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.ExecuteProductAccessServicingPropertiesResponse;
import org.museframework.bian.servicedirectory.dto.NotifyProductAccessServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.NotifyProductAccessServicingPropertiesResponse;
import org.museframework.bian.servicedirectory.dto.RegisterProductAccessServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.RegisterProductAccessServicingPropertiesResponse;
import org.museframework.bian.servicedirectory.dto.RequestProductAccessServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.RequestProductAccessServicingPropertiesResponse;
import org.museframework.bian.servicedirectory.dto.RetrieveProductAccessServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.RetrieveProductAccessServicingPropertiesResponse;
import org.museframework.bian.servicedirectory.dto.UpdateProductAccessServicingPropertiesRequest;
import org.museframework.bian.servicedirectory.dto.UpdateProductAccessServicingPropertiesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Access Control Servicing Properties properties that represent a discrete aspect of the Access Control Servicing Properties")
@GenericDomain(name="ServiceDirectory", group="ProductAccessServicingProperties")
public interface BqProductAccessServicingProperties {
    @GenericDtxEndpoint
    @Description("Execute Product Access Servicing Properties")
    ExecuteProductAccessServicingPropertiesResponse executeProductAccessServicingProperties(ExecuteProductAccessServicingPropertiesRequest req);

    @Description("Notify Product Access Servicing Properties")
    NotifyProductAccessServicingPropertiesResponse notifyProductAccessServicingProperties(NotifyProductAccessServicingPropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Register Product Access Servicing Properties")
    RegisterProductAccessServicingPropertiesResponse registerProductAccessServicingProperties(RegisterProductAccessServicingPropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Request Product Access Servicing Properties")
    RequestProductAccessServicingPropertiesResponse requestProductAccessServicingProperties(RequestProductAccessServicingPropertiesRequest req);

    @Description("Retrieve Product Access Servicing Properties")
    RetrieveProductAccessServicingPropertiesResponse retrieveProductAccessServicingProperties(RetrieveProductAccessServicingPropertiesRequest req);

    @GenericDtxEndpoint
    @Description("Update Product Access Servicing Properties")
    UpdateProductAccessServicingPropertiesResponse updateProductAccessServicingProperties(UpdateProductAccessServicingPropertiesRequest req);
}