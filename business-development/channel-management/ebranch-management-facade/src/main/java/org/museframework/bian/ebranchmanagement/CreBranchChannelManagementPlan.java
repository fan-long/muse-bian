package org.museframework.bian.ebranchmanagement;

import org.museframework.bian.ebranchmanagement.dto.CreateeBranchChannelManagementPlanRequest;
import org.museframework.bian.ebranchmanagement.dto.CreateeBranchChannelManagementPlanResponse;
import org.museframework.bian.ebranchmanagement.dto.RetrieveeBranchChannelManagementPlanRequest;
import org.museframework.bian.ebranchmanagement.dto.RetrieveeBranchChannelManagementPlanResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues within eBranch Management.")
@GenericDomain(name="eBranchManagement", group="eBranchChannelManagementPlan")
public interface CreBranchChannelManagementPlan {
    @GenericDtxEndpoint
    @Description("CrCR Create the management plan for the eBranch channel")
    CreateeBranchChannelManagementPlanResponse createeBranchChannelManagementPlan(CreateeBranchChannelManagementPlanRequest req);

    @Description("ReCR Retrieve details about the eBranch channel management plan")
    RetrieveeBranchChannelManagementPlanResponse retrieveeBranchChannelManagementPlan(RetrieveeBranchChannelManagementPlanRequest req);
}