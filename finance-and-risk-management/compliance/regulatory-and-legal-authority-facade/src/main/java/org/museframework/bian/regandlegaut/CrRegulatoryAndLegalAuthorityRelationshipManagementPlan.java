package org.museframework.bian.regandlegaut;

import org.museframework.bian.regandlegaut.dto.CaptureRegulatoryAndLegalAuthorityRelationshipManagementPlanRequest;
import org.museframework.bian.regandlegaut.dto.CaptureRegulatoryAndLegalAuthorityRelationshipManagementPlanResponse;
import org.museframework.bian.regandlegaut.dto.ControlRegulatoryAndLegalAuthorityRelationshipManagementPlanRequest;
import org.museframework.bian.regandlegaut.dto.ControlRegulatoryAndLegalAuthorityRelationshipManagementPlanResponse;
import org.museframework.bian.regandlegaut.dto.ExchangeRegulatoryAndLegalAuthorityRelationshipManagementPlanRequest;
import org.museframework.bian.regandlegaut.dto.ExchangeRegulatoryAndLegalAuthorityRelationshipManagementPlanResponse;
import org.museframework.bian.regandlegaut.dto.GrantRegulatoryAndLegalAuthorityRelationshipManagementPlanRequest;
import org.museframework.bian.regandlegaut.dto.GrantRegulatoryAndLegalAuthorityRelationshipManagementPlanResponse;
import org.museframework.bian.regandlegaut.dto.InitiateRegulatoryAndLegalAuthorityRelationshipManagementPlanRequest;
import org.museframework.bian.regandlegaut.dto.InitiateRegulatoryAndLegalAuthorityRelationshipManagementPlanResponse;
import org.museframework.bian.regandlegaut.dto.RequestRegulatoryAndLegalAuthorityRelationshipManagementPlanRequest;
import org.museframework.bian.regandlegaut.dto.RequestRegulatoryAndLegalAuthorityRelationshipManagementPlanResponse;
import org.museframework.bian.regandlegaut.dto.RetrieveRegulatoryAndLegalAuthorityRelationshipManagementPlanRequest;
import org.museframework.bian.regandlegaut.dto.RetrieveRegulatoryAndLegalAuthorityRelationshipManagementPlanResponse;
import org.museframework.bian.regandlegaut.dto.UpdateRegulatoryAndLegalAuthorityRelationshipManagementPlanRequest;
import org.museframework.bian.regandlegaut.dto.UpdateRegulatoryAndLegalAuthorityRelationshipManagementPlanResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues  within Regulatory & Legal Authority. Example: Manage the day to day activities at a bank branch location.")
@GenericDomain(name="RegulatoryAndLegalAuthority", group="RegulatoryAndLegalAuthorityRelationshipManagementPlan")
public interface CrRegulatoryAndLegalAuthorityRelationshipManagementPlan {
    @GenericDtxEndpoint
    @Description("CaCR Capture Regulatory And Legal Authority Relationship Management Plan activity or event related information")
    CaptureRegulatoryAndLegalAuthorityRelationshipManagementPlanResponse captureRegulatoryAndLegalAuthorityRelationshipManagementPlan(CaptureRegulatoryAndLegalAuthorityRelationshipManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Regulatory And Legal Authority Relationship Management Plan")
    ControlRegulatoryAndLegalAuthorityRelationshipManagementPlanResponse controlRegulatoryAndLegalAuthorityRelationshipManagementPlan(ControlRegulatoryAndLegalAuthorityRelationshipManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Regulatory And Legal Authority Relationship Management Plan processing")
    ExchangeRegulatoryAndLegalAuthorityRelationshipManagementPlanResponse exchangeRegulatoryAndLegalAuthorityRelationshipManagementPlan(ExchangeRegulatoryAndLegalAuthorityRelationshipManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("GrCR Obtain permission to act in relation to Regulatory And Legal Authority Relationship Management Plan")
    GrantRegulatoryAndLegalAuthorityRelationshipManagementPlanResponse grantRegulatoryAndLegalAuthorityRelationshipManagementPlan(GrantRegulatoryAndLegalAuthorityRelationshipManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Regulatory And Legal Authority Relationship Management Plan")
    InitiateRegulatoryAndLegalAuthorityRelationshipManagementPlanResponse initiateRegulatoryAndLegalAuthorityRelationshipManagementPlan(InitiateRegulatoryAndLegalAuthorityRelationshipManagementPlanRequest req);

    @Description("ReCR Retrieve details about any aspect of Regulatory And Legal Authority Relationship Management Plan")
    RetrieveRegulatoryAndLegalAuthorityRelationshipManagementPlanResponse retrieveRegulatoryAndLegalAuthorityRelationshipManagementPlan(RetrieveRegulatoryAndLegalAuthorityRelationshipManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Regulatory And Legal Authority Relationship Management Plan")
    RequestRegulatoryAndLegalAuthorityRelationshipManagementPlanResponse requestRegulatoryAndLegalAuthorityRelationshipManagementPlan(RequestRegulatoryAndLegalAuthorityRelationshipManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Regulatory And Legal Authority Relationship Management Plan")
    UpdateRegulatoryAndLegalAuthorityRelationshipManagementPlanResponse updateRegulatoryAndLegalAuthorityRelationshipManagementPlan(UpdateRegulatoryAndLegalAuthorityRelationshipManagementPlanRequest req);
}