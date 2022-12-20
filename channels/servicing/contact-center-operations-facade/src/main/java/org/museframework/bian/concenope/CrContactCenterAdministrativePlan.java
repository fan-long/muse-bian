package org.museframework.bian.concenope;

import org.museframework.bian.concenope.dto.CreateContactCenterAdministrativePlanRequest;
import org.museframework.bian.concenope.dto.CreateContactCenterAdministrativePlanResponse;
import org.museframework.bian.concenope.dto.ExecuteContactCenterAdministrativePlanRequest;
import org.museframework.bian.concenope.dto.ExecuteContactCenterAdministrativePlanResponse;
import org.museframework.bian.concenope.dto.RequestContactCenterAdministrativePlanRequest;
import org.museframework.bian.concenope.dto.RequestContactCenterAdministrativePlanResponse;
import org.museframework.bian.concenope.dto.RetrieveContactCenterAdministrativePlanRequest;
import org.museframework.bian.concenope.dto.RetrieveContactCenterAdministrativePlanResponse;
import org.museframework.bian.concenope.dto.UpdateContactCenterAdministrativePlanRequest;
import org.museframework.bian.concenope.dto.UpdateContactCenterAdministrativePlanResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handle and assign the day to day activities, capture time, costs and income for an operational unit within Contact Center Operations.  ")
@GenericDomain(name="ContactCenterOperations", group="ContactCenterAdministrativePlan")
public interface CrContactCenterAdministrativePlan {
    @GenericDtxEndpoint
    @Description("CrCR Create the administrative plan for the contact center")
    CreateContactCenterAdministrativePlanResponse createContactCenterAdministrativePlan(CreateContactCenterAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update aspects of the administrative plan")
    UpdateContactCenterAdministrativePlanResponse updateContactCenterAdministrativePlan(UpdateContactCenterAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an automated action against the plan")
    ExecuteContactCenterAdministrativePlanResponse executeContactCenterAdministrativePlan(ExecuteContactCenterAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention to the plan")
    RequestContactCenterAdministrativePlanResponse requestContactCenterAdministrativePlan(RequestContactCenterAdministrativePlanRequest req);

    @Description("ReCR Retrieve details about the execution of the administrative plan")
    RetrieveContactCenterAdministrativePlanResponse retrieveContactCenterAdministrativePlan(RetrieveContactCenterAdministrativePlanRequest req);
}