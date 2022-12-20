package org.museframework.bian.productdeployment;

import org.museframework.bian.productdeployment.dto.CaptureProductandServiceDeploymentDevelopmentRequest;
import org.museframework.bian.productdeployment.dto.CaptureProductandServiceDeploymentDevelopmentResponse;
import org.museframework.bian.productdeployment.dto.CreateProductandServiceDeploymentDevelopmentRequest;
import org.museframework.bian.productdeployment.dto.CreateProductandServiceDeploymentDevelopmentResponse;
import org.museframework.bian.productdeployment.dto.RequestProductandServiceDeploymentDevelopmentRequest;
import org.museframework.bian.productdeployment.dto.RequestProductandServiceDeploymentDevelopmentResponse;
import org.museframework.bian.productdeployment.dto.RetrieveProductandServiceDeploymentDevelopmentRequest;
import org.museframework.bian.productdeployment.dto.RetrieveProductandServiceDeploymentDevelopmentResponse;
import org.museframework.bian.productdeployment.dto.UpdateProductandServiceDeploymentDevelopmentRequest;
import org.museframework.bian.productdeployment.dto.UpdateProductandServiceDeploymentDevelopmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("To build or enhance something, typically an IT production systems  within Product Deployment. Includes development, Assessment and deployment activities. Example: Build, enhance, test and deploy a major enhancement to a production product processing system.")
@GenericDomain(name="ProductDeployment", group="ProductandServiceDeploymentDevelopment")
public interface CrProductandServiceDeploymentDevelopment {
    @GenericDtxEndpoint
    @Description("CrCR Create a product or service deployment project")
    CreateProductandServiceDeploymentDevelopmentResponse createProductandServiceDeploymentDevelopment(CreateProductandServiceDeploymentDevelopmentRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of a product or service deployment project")
    UpdateProductandServiceDeploymentDevelopmentResponse updateProductandServiceDeploymentDevelopment(UpdateProductandServiceDeploymentDevelopmentRequest req);

    @GenericDtxEndpoint
    @Description("CaCR Capture details about tasks performed during the deployment")
    CaptureProductandServiceDeploymentDevelopmentResponse captureProductandServiceDeploymentDevelopment(CaptureProductandServiceDeploymentDevelopmentRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention in a deployment project")
    RequestProductandServiceDeploymentDevelopmentResponse requestProductandServiceDeploymentDevelopment(RequestProductandServiceDeploymentDevelopmentRequest req);

    @Description("ReCR Retrieve details about a deployment project")
    RetrieveProductandServiceDeploymentDevelopmentResponse retrieveProductandServiceDeploymentDevelopment(RetrieveProductandServiceDeploymentDevelopmentRequest req);
}