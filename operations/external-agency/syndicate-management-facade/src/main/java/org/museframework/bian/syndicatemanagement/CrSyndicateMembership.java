package org.museframework.bian.syndicatemanagement;

import org.museframework.bian.syndicatemanagement.dto.ControlSyndicateMembershipRequest;
import org.museframework.bian.syndicatemanagement.dto.ControlSyndicateMembershipResponse;
import org.museframework.bian.syndicatemanagement.dto.GrantSyndicateMembershipRequest;
import org.museframework.bian.syndicatemanagement.dto.GrantSyndicateMembershipResponse;
import org.museframework.bian.syndicatemanagement.dto.NotifySyndicateMembershipRequest;
import org.museframework.bian.syndicatemanagement.dto.NotifySyndicateMembershipResponse;
import org.museframework.bian.syndicatemanagement.dto.RegisterSyndicateMembershipRequest;
import org.museframework.bian.syndicatemanagement.dto.RegisterSyndicateMembershipResponse;
import org.museframework.bian.syndicatemanagement.dto.RequestSyndicateMembershipRequest;
import org.museframework.bian.syndicatemanagement.dto.RequestSyndicateMembershipResponse;
import org.museframework.bian.syndicatemanagement.dto.RetrieveSyndicateMembershipRequest;
import org.museframework.bian.syndicatemanagement.dto.RetrieveSyndicateMembershipResponse;
import org.museframework.bian.syndicatemanagement.dto.UpdateSyndicateMembershipRequest;
import org.museframework.bian.syndicatemanagement.dto.UpdateSyndicateMembershipResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Maintain a membership for some group or related collection of parties within Syndicate Management. ")
@GenericDomain(name="SyndicateManagement", group="SyndicateMembership")
public interface CrSyndicateMembership {
    @GenericDtxEndpoint
    @Description("Control Syndicate Membership")
    ControlSyndicateMembershipResponse controlSyndicateMembership(ControlSyndicateMembershipRequest req);

    @GenericDtxEndpoint
    @Description("Grant Syndicate Membership")
    GrantSyndicateMembershipResponse grantSyndicateMembership(GrantSyndicateMembershipRequest req);

    @Description("Notify Syndicate Membership")
    NotifySyndicateMembershipResponse notifySyndicateMembership(NotifySyndicateMembershipRequest req);

    @GenericDtxEndpoint
    @Description("Register Syndicate Membership")
    RegisterSyndicateMembershipResponse registerSyndicateMembership(RegisterSyndicateMembershipRequest req);

    @GenericDtxEndpoint
    @Description("Request Syndicate Membership")
    RequestSyndicateMembershipResponse requestSyndicateMembership(RequestSyndicateMembershipRequest req);

    @Description("Retrieve Syndicate Membership")
    RetrieveSyndicateMembershipResponse retrieveSyndicateMembership(RetrieveSyndicateMembershipRequest req);

    @GenericDtxEndpoint
    @Description("Update Syndicate Membership")
    UpdateSyndicateMembershipResponse updateSyndicateMembership(UpdateSyndicateMembershipRequest req);
}