package org.museframework.bian.corbanrelman;

import org.museframework.bian.corbanrelman.dto.ExchangeIncidentTroubleshootingOversightDutyRequest;
import org.museframework.bian.corbanrelman.dto.ExchangeIncidentTroubleshootingOversightDutyResponse;
import org.museframework.bian.corbanrelman.dto.GrantIncidentTroubleshootingOversightDutyRequest;
import org.museframework.bian.corbanrelman.dto.GrantIncidentTroubleshootingOversightDutyResponse;
import org.museframework.bian.corbanrelman.dto.NotifyIncidentTroubleshootingOversightDutyRequest;
import org.museframework.bian.corbanrelman.dto.NotifyIncidentTroubleshootingOversightDutyResponse;
import org.museframework.bian.corbanrelman.dto.RequestIncidentTroubleshootingOversightDutyRequest;
import org.museframework.bian.corbanrelman.dto.RequestIncidentTroubleshootingOversightDutyResponse;
import org.museframework.bian.corbanrelman.dto.RetrieveIncidentTroubleshootingOversightDutyRequest;
import org.museframework.bian.corbanrelman.dto.RetrieveIncidentTroubleshootingOversightDutyResponse;
import org.museframework.bian.corbanrelman.dto.UpdateIncidentTroubleshootingOversightDutyRequest;
import org.museframework.bian.corbanrelman.dto.UpdateIncidentTroubleshootingOversightDutyResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Incident Troubleshooting Oversight Duty is a specific role or responsibility that is one aspect of Incident Troubleshooting Oversight Duty")
@GenericDomain(name="CorrespondentBankRelationshipManagement", group="IncidentTroubleshootingOversightDuty")
public interface BqIncidentTroubleshootingOversightDuty {
    @GenericDtxEndpoint
    @Description("Exchange Incident Troubleshooting Oversight Duty")
    ExchangeIncidentTroubleshootingOversightDutyResponse exchangeIncidentTroubleshootingOversightDuty(ExchangeIncidentTroubleshootingOversightDutyRequest req);

    @GenericDtxEndpoint
    @Description("Grant Incident Troubleshooting Oversight Duty")
    GrantIncidentTroubleshootingOversightDutyResponse grantIncidentTroubleshootingOversightDuty(GrantIncidentTroubleshootingOversightDutyRequest req);

    @Description("Notify Incident Troubleshooting Oversight Duty")
    NotifyIncidentTroubleshootingOversightDutyResponse notifyIncidentTroubleshootingOversightDuty(NotifyIncidentTroubleshootingOversightDutyRequest req);

    @GenericDtxEndpoint
    @Description("Request Incident Troubleshooting Oversight Duty")
    RequestIncidentTroubleshootingOversightDutyResponse requestIncidentTroubleshootingOversightDuty(RequestIncidentTroubleshootingOversightDutyRequest req);

    @Description("Retrieve Incident Troubleshooting Oversight Duty")
    RetrieveIncidentTroubleshootingOversightDutyResponse retrieveIncidentTroubleshootingOversightDuty(RetrieveIncidentTroubleshootingOversightDutyRequest req);

    @GenericDtxEndpoint
    @Description("Update Incident Troubleshooting Oversight Duty")
    UpdateIncidentTroubleshootingOversightDutyResponse updateIncidentTroubleshootingOversightDuty(UpdateIncidentTroubleshootingOversightDutyRequest req);
}