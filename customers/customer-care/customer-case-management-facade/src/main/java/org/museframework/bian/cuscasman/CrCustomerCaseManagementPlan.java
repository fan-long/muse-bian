package org.museframework.bian.cuscasman;

import org.museframework.bian.cuscasman.dto.CreateCustomerCaseManagementPlanRequest;
import org.museframework.bian.cuscasman.dto.CreateCustomerCaseManagementPlanResponse;
import org.museframework.bian.cuscasman.dto.RequestCustomerCaseManagementPlanRequest;
import org.museframework.bian.cuscasman.dto.RequestCustomerCaseManagementPlanResponse;
import org.museframework.bian.cuscasman.dto.RetrieveCustomerCaseManagementPlanRequest;
import org.museframework.bian.cuscasman.dto.RetrieveCustomerCaseManagementPlanResponse;
import org.museframework.bian.cuscasman.dto.UpdateCustomerCaseManagementPlanRequest;
import org.museframework.bian.cuscasman.dto.UpdateCustomerCaseManagementPlanResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues within Customer Case Management.")
@GenericDomain(name="CustomerCaseManagement", group="CustomerCaseManagementPlan")
public interface CrCustomerCaseManagementPlan {
    @GenericDtxEndpoint
    @Description("CrCR Create the management plan for customer case handling")
    CreateCustomerCaseManagementPlanResponse createCustomerCaseManagementPlan(CreateCustomerCaseManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update aspects of the customer case handling management plan")
    UpdateCustomerCaseManagementPlanResponse updateCustomerCaseManagementPlan(UpdateCustomerCaseManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention with the plan")
    RequestCustomerCaseManagementPlanResponse requestCustomerCaseManagementPlan(RequestCustomerCaseManagementPlanRequest req);

    @Description("ReCR Retrieve details about the customer case handling management plan")
    RetrieveCustomerCaseManagementPlanResponse retrieveCustomerCaseManagementPlan(RetrieveCustomerCaseManagementPlanRequest req);
}