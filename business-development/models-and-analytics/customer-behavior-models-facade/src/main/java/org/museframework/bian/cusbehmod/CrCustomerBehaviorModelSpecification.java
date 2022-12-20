package org.museframework.bian.cusbehmod;

import org.museframework.bian.cusbehmod.dto.CreateCustomerBehaviorModelSpecificationRequest;
import org.museframework.bian.cusbehmod.dto.CreateCustomerBehaviorModelSpecificationResponse;
import org.museframework.bian.cusbehmod.dto.ExecuteCustomerBehaviorModelSpecificationRequest;
import org.museframework.bian.cusbehmod.dto.ExecuteCustomerBehaviorModelSpecificationResponse;
import org.museframework.bian.cusbehmod.dto.RequestCustomerBehaviorModelSpecificationRequest;
import org.museframework.bian.cusbehmod.dto.RequestCustomerBehaviorModelSpecificationResponse;
import org.museframework.bian.cusbehmod.dto.RetrieveCustomerBehaviorModelSpecificationRequest;
import org.museframework.bian.cusbehmod.dto.RetrieveCustomerBehaviorModelSpecificationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Create and maintain a design for a procedure, product/service model or other such entity  within Customer Behavior Models.  Example: Create and maintain product designs and analytical models.")
@GenericDomain(name="CustomerBehaviorModels", group="CustomerBehaviorModelSpecification")
public interface CrCustomerBehaviorModelSpecification {
    @GenericDtxEndpoint
    @Description("CrCR Create or register an imported customer behavior model")
    CreateCustomerBehaviorModelSpecificationResponse createCustomerBehaviorModelSpecification(CreateCustomerBehaviorModelSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Automatically download a customer behavior model")
    ExecuteCustomerBehaviorModelSpecificationResponse executeCustomerBehaviorModelSpecification(ExecuteCustomerBehaviorModelSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request the use of a customer behavior model")
    RequestCustomerBehaviorModelSpecificationResponse requestCustomerBehaviorModelSpecification(RequestCustomerBehaviorModelSpecificationRequest req);

    @Description("ReCR Retrieve details about a customer behavior model")
    RetrieveCustomerBehaviorModelSpecificationResponse retrieveCustomerBehaviorModelSpecification(RetrieveCustomerBehaviorModelSpecificationRequest req);
}