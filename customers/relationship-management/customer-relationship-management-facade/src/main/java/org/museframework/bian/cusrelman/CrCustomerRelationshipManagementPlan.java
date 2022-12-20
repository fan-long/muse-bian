package org.museframework.bian.cusrelman;

import org.museframework.bian.cusrelman.dto.CreateCustomerRelationshipManagementPlanRequest;
import org.museframework.bian.cusrelman.dto.CreateCustomerRelationshipManagementPlanResponse;
import org.museframework.bian.cusrelman.dto.RetrieveCustomerRelationshipManagementPlanRequest;
import org.museframework.bian.cusrelman.dto.RetrieveCustomerRelationshipManagementPlanResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues within Customer Relationship Management.")
@GenericDomain(name="CustomerRelationshipManagement", group="CustomerRelationshipManagementPlan")
public interface CrCustomerRelationshipManagementPlan {
    @GenericDtxEndpoint
    @Description("CrCR Create an initial relationship management plan")
    CreateCustomerRelationshipManagementPlanResponse createCustomerRelationshipManagementPlan(CreateCustomerRelationshipManagementPlanRequest req);

    @Description("ReCR Retrieve details about a relationship plan")
    RetrieveCustomerRelationshipManagementPlanResponse retrieveCustomerRelationshipManagementPlan(RetrieveCustomerRelationshipManagementPlanRequest req);
}