package org.museframework.bian.corbanrelman;

import org.museframework.bian.corbanrelman.dto.ExchangeRelationshipReciprocityAssessmentDutyRequest;
import org.museframework.bian.corbanrelman.dto.ExchangeRelationshipReciprocityAssessmentDutyResponse;
import org.museframework.bian.corbanrelman.dto.GrantRelationshipReciprocityAssessmentDutyRequest;
import org.museframework.bian.corbanrelman.dto.GrantRelationshipReciprocityAssessmentDutyResponse;
import org.museframework.bian.corbanrelman.dto.NotifyRelationshipReciprocityAssessmentDutyRequest;
import org.museframework.bian.corbanrelman.dto.NotifyRelationshipReciprocityAssessmentDutyResponse;
import org.museframework.bian.corbanrelman.dto.RequestRelationshipReciprocityAssessmentDutyRequest;
import org.museframework.bian.corbanrelman.dto.RequestRelationshipReciprocityAssessmentDutyResponse;
import org.museframework.bian.corbanrelman.dto.RetrieveRelationshipReciprocityAssessmentDutyRequest;
import org.museframework.bian.corbanrelman.dto.RetrieveRelationshipReciprocityAssessmentDutyResponse;
import org.museframework.bian.corbanrelman.dto.UpdateRelationshipReciprocityAssessmentDutyRequest;
import org.museframework.bian.corbanrelman.dto.UpdateRelationshipReciprocityAssessmentDutyResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Incident Troubleshooting Oversight Duty is a specific role or responsibility that is one aspect of Incident Troubleshooting Oversight Duty")
@GenericDomain(name="CorrespondentBankRelationshipManagement", group="RelationshipReciprocityAssessmentDuty")
public interface BqRelationshipReciprocityAssessmentDuty {
    @GenericDtxEndpoint
    @Description("Exchange Relationship Reciprocity Assessment Duty")
    ExchangeRelationshipReciprocityAssessmentDutyResponse exchangeRelationshipReciprocityAssessmentDuty(ExchangeRelationshipReciprocityAssessmentDutyRequest req);

    @GenericDtxEndpoint
    @Description("Grant Relationship Reciprocity Assessment Duty")
    GrantRelationshipReciprocityAssessmentDutyResponse grantRelationshipReciprocityAssessmentDuty(GrantRelationshipReciprocityAssessmentDutyRequest req);

    @Description("Notify Relationship Reciprocity Assessment Duty")
    NotifyRelationshipReciprocityAssessmentDutyResponse notifyRelationshipReciprocityAssessmentDuty(NotifyRelationshipReciprocityAssessmentDutyRequest req);

    @GenericDtxEndpoint
    @Description("Request Relationship Reciprocity Assessment Duty")
    RequestRelationshipReciprocityAssessmentDutyResponse requestRelationshipReciprocityAssessmentDuty(RequestRelationshipReciprocityAssessmentDutyRequest req);

    @Description("Retrieve Relationship Reciprocity Assessment Duty")
    RetrieveRelationshipReciprocityAssessmentDutyResponse retrieveRelationshipReciprocityAssessmentDuty(RetrieveRelationshipReciprocityAssessmentDutyRequest req);

    @GenericDtxEndpoint
    @Description("Update Relationship Reciprocity Assessment Duty")
    UpdateRelationshipReciprocityAssessmentDutyResponse updateRelationshipReciprocityAssessmentDuty(UpdateRelationshipReciprocityAssessmentDutyRequest req);
}