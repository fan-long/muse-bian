package org.museframework.bian.productdesign;

import org.museframework.bian.productdesign.dto.CreateProductorServiceSpecificationRequest;
import org.museframework.bian.productdesign.dto.CreateProductorServiceSpecificationResponse;
import org.museframework.bian.productdesign.dto.ExecuteProductorServiceSpecificationRequest;
import org.museframework.bian.productdesign.dto.ExecuteProductorServiceSpecificationResponse;
import org.museframework.bian.productdesign.dto.RequestProductorServiceSpecificationRequest;
import org.museframework.bian.productdesign.dto.RequestProductorServiceSpecificationResponse;
import org.museframework.bian.productdesign.dto.RetrieveProductorServiceSpecificationRequest;
import org.museframework.bian.productdesign.dto.RetrieveProductorServiceSpecificationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Create and maintain a design for a procedure, product/service model or other such entity  within Product Design.  Example: Create and maintain product designs and analytical models.")
@GenericDomain(name="ProductDesign", group="ProductorServiceSpecification")
public interface CrProductorServiceSpecification {
    @GenericDtxEndpoint
    @Description("CrCR Create or register an imported product or service specification")
    CreateProductorServiceSpecificationResponse createProductorServiceSpecification(CreateProductorServiceSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an automated action against a product or service specification")
    ExecuteProductorServiceSpecificationResponse executeProductorServiceSpecification(ExecuteProductorServiceSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention to a specification")
    RequestProductorServiceSpecificationResponse requestProductorServiceSpecification(RequestProductorServiceSpecificationRequest req);

    @Description("ReCR Retrieve details about a product or service specification")
    RetrieveProductorServiceSpecificationResponse retrieveProductorServiceSpecification(RetrieveProductorServiceSpecificationRequest req);
}