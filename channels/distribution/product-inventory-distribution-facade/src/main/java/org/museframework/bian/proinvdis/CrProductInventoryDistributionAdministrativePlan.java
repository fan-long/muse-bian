package org.museframework.bian.proinvdis;

import org.museframework.bian.proinvdis.dto.CaptureProductInventoryDistributionAdministrativePlanRequest;
import org.museframework.bian.proinvdis.dto.CaptureProductInventoryDistributionAdministrativePlanResponse;
import org.museframework.bian.proinvdis.dto.ControlProductInventoryDistributionAdministrativePlanRequest;
import org.museframework.bian.proinvdis.dto.ControlProductInventoryDistributionAdministrativePlanResponse;
import org.museframework.bian.proinvdis.dto.ExchangeProductInventoryDistributionAdministrativePlanRequest;
import org.museframework.bian.proinvdis.dto.ExchangeProductInventoryDistributionAdministrativePlanResponse;
import org.museframework.bian.proinvdis.dto.GrantProductInventoryDistributionAdministrativePlanRequest;
import org.museframework.bian.proinvdis.dto.GrantProductInventoryDistributionAdministrativePlanResponse;
import org.museframework.bian.proinvdis.dto.InitiateProductInventoryDistributionAdministrativePlanRequest;
import org.museframework.bian.proinvdis.dto.InitiateProductInventoryDistributionAdministrativePlanResponse;
import org.museframework.bian.proinvdis.dto.RequestProductInventoryDistributionAdministrativePlanRequest;
import org.museframework.bian.proinvdis.dto.RequestProductInventoryDistributionAdministrativePlanResponse;
import org.museframework.bian.proinvdis.dto.RetrieveProductInventoryDistributionAdministrativePlanRequest;
import org.museframework.bian.proinvdis.dto.RetrieveProductInventoryDistributionAdministrativePlanResponse;
import org.museframework.bian.proinvdis.dto.UpdateProductInventoryDistributionAdministrativePlanRequest;
import org.museframework.bian.proinvdis.dto.UpdateProductInventoryDistributionAdministrativePlanResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handle and assign the day to day activities, capture time, costs and income for an operational unit  within Product Inventory Distribution.  Example: Administer the time reporting and billing for the specialist sales support team.")
@GenericDomain(name="ProductInventoryDistribution", group="ProductInventoryDistributionAdministrativePlan")
public interface CrProductInventoryDistributionAdministrativePlan {
    @GenericDtxEndpoint
    @Description("CaCR Capture Product Inventory Distribution Administrative Plan activity or event related information")
    CaptureProductInventoryDistributionAdministrativePlanResponse captureProductInventoryDistributionAdministrativePlan(CaptureProductInventoryDistributionAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Product Inventory Distribution Administrative Plan")
    ControlProductInventoryDistributionAdministrativePlanResponse controlProductInventoryDistributionAdministrativePlan(ControlProductInventoryDistributionAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Product Inventory Distribution Administrative Plan processing")
    ExchangeProductInventoryDistributionAdministrativePlanResponse exchangeProductInventoryDistributionAdministrativePlan(ExchangeProductInventoryDistributionAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("GrCR Obtain permission to act in relation to Product Inventory Distribution Administrative Plan")
    GrantProductInventoryDistributionAdministrativePlanResponse grantProductInventoryDistributionAdministrativePlan(GrantProductInventoryDistributionAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Product Inventory Distribution Administrative Plan")
    InitiateProductInventoryDistributionAdministrativePlanResponse initiateProductInventoryDistributionAdministrativePlan(InitiateProductInventoryDistributionAdministrativePlanRequest req);

    @Description("ReCR Retrieve details about any aspect of Product Inventory Distribution Administrative Plan")
    RetrieveProductInventoryDistributionAdministrativePlanResponse retrieveProductInventoryDistributionAdministrativePlan(RetrieveProductInventoryDistributionAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Product Inventory Distribution Administrative Plan")
    RequestProductInventoryDistributionAdministrativePlanResponse requestProductInventoryDistributionAdministrativePlan(RequestProductInventoryDistributionAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Product Inventory Distribution Administrative Plan")
    UpdateProductInventoryDistributionAdministrativePlanResponse updateProductInventoryDistributionAdministrativePlan(UpdateProductInventoryDistributionAdministrativePlanRequest req);
}