package org.museframework.bian.prosalsup;

import org.museframework.bian.prosalsup.dto.ControlProductSalesSupportAdministrativePlanRequest;
import org.museframework.bian.prosalsup.dto.ControlProductSalesSupportAdministrativePlanResponse;
import org.museframework.bian.prosalsup.dto.CreateProductSalesSupportAdministrativePlanRequest;
import org.museframework.bian.prosalsup.dto.CreateProductSalesSupportAdministrativePlanResponse;
import org.museframework.bian.prosalsup.dto.ExchangeProductSalesSupportAdministrativePlanRequest;
import org.museframework.bian.prosalsup.dto.ExchangeProductSalesSupportAdministrativePlanResponse;
import org.museframework.bian.prosalsup.dto.GrantProductSalesSupportAdministrativePlanRequest;
import org.museframework.bian.prosalsup.dto.GrantProductSalesSupportAdministrativePlanResponse;
import org.museframework.bian.prosalsup.dto.NotifyProductSalesSupportAdministrativePlanRequest;
import org.museframework.bian.prosalsup.dto.NotifyProductSalesSupportAdministrativePlanResponse;
import org.museframework.bian.prosalsup.dto.RequestProductSalesSupportAdministrativePlanRequest;
import org.museframework.bian.prosalsup.dto.RequestProductSalesSupportAdministrativePlanResponse;
import org.museframework.bian.prosalsup.dto.RetrieveProductSalesSupportAdministrativePlanRequest;
import org.museframework.bian.prosalsup.dto.RetrieveProductSalesSupportAdministrativePlanResponse;
import org.museframework.bian.prosalsup.dto.UpdateProductSalesSupportAdministrativePlanRequest;
import org.museframework.bian.prosalsup.dto.UpdateProductSalesSupportAdministrativePlanResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handle and assign the day to day activities, capture time, costs and income for an operational unit within Product Sales Support. ")
@GenericDomain(name="ProductSalesSupport", group="ProductSalesSupportAdministrativePlan")
public interface CrProductSalesSupportAdministrativePlan {
    @GenericDtxEndpoint
    @Description("Control Product Sales Support Administrative Plan")
    ControlProductSalesSupportAdministrativePlanResponse controlProductSalesSupportAdministrativePlan(ControlProductSalesSupportAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("Create Product Sales Support Administrative Plan")
    CreateProductSalesSupportAdministrativePlanResponse createProductSalesSupportAdministrativePlan(CreateProductSalesSupportAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Product Sales Support Administrative Plan")
    ExchangeProductSalesSupportAdministrativePlanResponse exchangeProductSalesSupportAdministrativePlan(ExchangeProductSalesSupportAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("Grant Product Sales Support Administrative Plan")
    GrantProductSalesSupportAdministrativePlanResponse grantProductSalesSupportAdministrativePlan(GrantProductSalesSupportAdministrativePlanRequest req);

    @Description("Notify Product Sales Support Administrative Plan")
    NotifyProductSalesSupportAdministrativePlanResponse notifyProductSalesSupportAdministrativePlan(NotifyProductSalesSupportAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("Request Product Sales Support Administrative Plan")
    RequestProductSalesSupportAdministrativePlanResponse requestProductSalesSupportAdministrativePlan(RequestProductSalesSupportAdministrativePlanRequest req);

    @Description("Retrieve Product Sales Support Administrative Plan")
    RetrieveProductSalesSupportAdministrativePlanResponse retrieveProductSalesSupportAdministrativePlan(RetrieveProductSalesSupportAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("Update Product Sales Support Administrative Plan")
    UpdateProductSalesSupportAdministrativePlanResponse updateProductSalesSupportAdministrativePlan(UpdateProductSalesSupportAdministrativePlanRequest req);
}