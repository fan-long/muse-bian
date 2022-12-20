package org.museframework.bian.intrelman;

import org.museframework.bian.intrelman.dto.CreateBankRelationshipManagementPlanRequest;
import org.museframework.bian.intrelman.dto.CreateBankRelationshipManagementPlanResponse;
import org.museframework.bian.intrelman.dto.RequestBankRelationshipManagementPlanRequest;
import org.museframework.bian.intrelman.dto.RequestBankRelationshipManagementPlanResponse;
import org.museframework.bian.intrelman.dto.RetrieveBankRelationshipManagementPlanRequest;
import org.museframework.bian.intrelman.dto.RetrieveBankRelationshipManagementPlanResponse;
import org.museframework.bian.intrelman.dto.UpdateBankRelationshipManagementPlanRequest;
import org.museframework.bian.intrelman.dto.UpdateBankRelationshipManagementPlanResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues within Interbank Relationship Management.")
@GenericDomain(name="InterbankRelationshipManagement", group="BankRelationshipManagementPlan")
public interface CrBankRelationshipManagementPlan {
    @GenericDtxEndpoint
    @Description("CrCR Create an initial bank relationship management plan")
    CreateBankRelationshipManagementPlanResponse createBankRelationshipManagementPlan(CreateBankRelationshipManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of an active bank relationship plan")
    UpdateBankRelationshipManagementPlanResponse updateBankRelationshipManagementPlan(UpdateBankRelationshipManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request intervention with a bank relationship plan")
    RequestBankRelationshipManagementPlanResponse requestBankRelationshipManagementPlan(RequestBankRelationshipManagementPlanRequest req);

    @Description("ReCR Retrieve details about a bank relationship plan and associated activity")
    RetrieveBankRelationshipManagementPlanResponse retrieveBankRelationshipManagementPlan(RetrieveBankRelationshipManagementPlanRequest req);
}