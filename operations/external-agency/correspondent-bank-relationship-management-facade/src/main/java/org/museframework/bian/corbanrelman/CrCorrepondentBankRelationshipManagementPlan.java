package org.museframework.bian.corbanrelman;

import org.museframework.bian.corbanrelman.dto.ControlCorrepondentBankRelationshipManagementPlanRequest;
import org.museframework.bian.corbanrelman.dto.ControlCorrepondentBankRelationshipManagementPlanResponse;
import org.museframework.bian.corbanrelman.dto.CreateCorrepondentBankRelationshipManagementPlanRequest;
import org.museframework.bian.corbanrelman.dto.CreateCorrepondentBankRelationshipManagementPlanResponse;
import org.museframework.bian.corbanrelman.dto.ExchangeCorrepondentBankRelationshipManagementPlanRequest;
import org.museframework.bian.corbanrelman.dto.ExchangeCorrepondentBankRelationshipManagementPlanResponse;
import org.museframework.bian.corbanrelman.dto.GrantCorrepondentBankRelationshipManagementPlanRequest;
import org.museframework.bian.corbanrelman.dto.GrantCorrepondentBankRelationshipManagementPlanResponse;
import org.museframework.bian.corbanrelman.dto.NotifyCorrepondentBankRelationshipManagementPlanRequest;
import org.museframework.bian.corbanrelman.dto.NotifyCorrepondentBankRelationshipManagementPlanResponse;
import org.museframework.bian.corbanrelman.dto.RequestCorrepondentBankRelationshipManagementPlanRequest;
import org.museframework.bian.corbanrelman.dto.RequestCorrepondentBankRelationshipManagementPlanResponse;
import org.museframework.bian.corbanrelman.dto.RetrieveCorrepondentBankRelationshipManagementPlanRequest;
import org.museframework.bian.corbanrelman.dto.RetrieveCorrepondentBankRelationshipManagementPlanResponse;
import org.museframework.bian.corbanrelman.dto.UpdateCorrepondentBankRelationshipManagementPlanRequest;
import org.museframework.bian.corbanrelman.dto.UpdateCorrepondentBankRelationshipManagementPlanResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues within Correspondent Bank Relationship Management.")
@GenericDomain(name="CorrespondentBankRelationshipManagement", group="CorrepondentBankRelationshipManagementPlan")
public interface CrCorrepondentBankRelationshipManagementPlan {
    @GenericDtxEndpoint
    @Description("Control Correpondent Bank Relationship Management Plan")
    ControlCorrepondentBankRelationshipManagementPlanResponse controlCorrepondentBankRelationshipManagementPlan(ControlCorrepondentBankRelationshipManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("Create Correpondent Bank Relationship Management Plan")
    CreateCorrepondentBankRelationshipManagementPlanResponse createCorrepondentBankRelationshipManagementPlan(CreateCorrepondentBankRelationshipManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Correpondent Bank Relationship Management Plan")
    ExchangeCorrepondentBankRelationshipManagementPlanResponse exchangeCorrepondentBankRelationshipManagementPlan(ExchangeCorrepondentBankRelationshipManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("Grant Correpondent Bank Relationship Management Plan")
    GrantCorrepondentBankRelationshipManagementPlanResponse grantCorrepondentBankRelationshipManagementPlan(GrantCorrepondentBankRelationshipManagementPlanRequest req);

    @Description("Notify Correpondent Bank Relationship Management Plan")
    NotifyCorrepondentBankRelationshipManagementPlanResponse notifyCorrepondentBankRelationshipManagementPlan(NotifyCorrepondentBankRelationshipManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("Request Correpondent Bank Relationship Management Plan")
    RequestCorrepondentBankRelationshipManagementPlanResponse requestCorrepondentBankRelationshipManagementPlan(RequestCorrepondentBankRelationshipManagementPlanRequest req);

    @Description("Retrieve Correpondent Bank Relationship Management Plan")
    RetrieveCorrepondentBankRelationshipManagementPlanResponse retrieveCorrepondentBankRelationshipManagementPlan(RetrieveCorrepondentBankRelationshipManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("Update Correpondent Bank Relationship Management Plan")
    UpdateCorrepondentBankRelationshipManagementPlanResponse updateCorrepondentBankRelationshipManagementPlan(UpdateCorrepondentBankRelationshipManagementPlanRequest req);
}