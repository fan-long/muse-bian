package org.museframework.bian.corbanrelman;

import org.museframework.bian.corbanrelman.dto.ExchangeRelationshipDevelopmentDutyRequest;
import org.museframework.bian.corbanrelman.dto.ExchangeRelationshipDevelopmentDutyResponse;
import org.museframework.bian.corbanrelman.dto.GrantRelationshipDevelopmentDutyRequest;
import org.museframework.bian.corbanrelman.dto.GrantRelationshipDevelopmentDutyResponse;
import org.museframework.bian.corbanrelman.dto.NotifyRelationshipDevelopmentDutyRequest;
import org.museframework.bian.corbanrelman.dto.NotifyRelationshipDevelopmentDutyResponse;
import org.museframework.bian.corbanrelman.dto.RequestRelationshipDevelopmentDutyRequest;
import org.museframework.bian.corbanrelman.dto.RequestRelationshipDevelopmentDutyResponse;
import org.museframework.bian.corbanrelman.dto.RetrieveRelationshipDevelopmentDutyRequest;
import org.museframework.bian.corbanrelman.dto.RetrieveRelationshipDevelopmentDutyResponse;
import org.museframework.bian.corbanrelman.dto.UpdateRelationshipDevelopmentDutyRequest;
import org.museframework.bian.corbanrelman.dto.UpdateRelationshipDevelopmentDutyResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Incident Troubleshooting Oversight Duty is a specific role or responsibility that is one aspect of Incident Troubleshooting Oversight Duty")
@GenericDomain(name="CorrespondentBankRelationshipManagement", group="RelationshipDevelopmentDuty")
public interface BqRelationshipDevelopmentDuty {
    @GenericDtxEndpoint
    @Description("Exchange Relationship Development Duty")
    ExchangeRelationshipDevelopmentDutyResponse exchangeRelationshipDevelopmentDuty(ExchangeRelationshipDevelopmentDutyRequest req);

    @GenericDtxEndpoint
    @Description("Grant Relationship Development Duty")
    GrantRelationshipDevelopmentDutyResponse grantRelationshipDevelopmentDuty(GrantRelationshipDevelopmentDutyRequest req);

    @Description("Notify Relationship Development Duty")
    NotifyRelationshipDevelopmentDutyResponse notifyRelationshipDevelopmentDuty(NotifyRelationshipDevelopmentDutyRequest req);

    @GenericDtxEndpoint
    @Description("Request Relationship Development Duty")
    RequestRelationshipDevelopmentDutyResponse requestRelationshipDevelopmentDuty(RequestRelationshipDevelopmentDutyRequest req);

    @Description("Retrieve Relationship Development Duty")
    RetrieveRelationshipDevelopmentDutyResponse retrieveRelationshipDevelopmentDuty(RetrieveRelationshipDevelopmentDutyRequest req);

    @GenericDtxEndpoint
    @Description("Update Relationship Development Duty")
    UpdateRelationshipDevelopmentDutyResponse updateRelationshipDevelopmentDuty(UpdateRelationshipDevelopmentDutyRequest req);
}