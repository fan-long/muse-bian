package org.museframework.bian.syndicatemanagement;

import org.museframework.bian.syndicatemanagement.dto.NotifySyndicateEligibilityClausesRequest;
import org.museframework.bian.syndicatemanagement.dto.NotifySyndicateEligibilityClausesResponse;
import org.museframework.bian.syndicatemanagement.dto.RetrieveSyndicateEligibilityClausesRequest;
import org.museframework.bian.syndicatemanagement.dto.RetrieveSyndicateEligibilityClausesResponse;
import org.museframework.bian.syndicatemanagement.dto.UpdateSyndicateEligibilityClausesRequest;
import org.museframework.bian.syndicatemanagement.dto.UpdateSyndicateEligibilityClausesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Syndicate Eligibility Clauses defines a particular clause or consideration that is applied to determine eligibility for Syndicate Eligibility Clauses")
@GenericDomain(name="SyndicateManagement", group="SyndicateEligibilityClauses")
public interface BqSyndicateEligibilityClauses {
    @Description("Notify Syndicate Eligibility Clauses")
    NotifySyndicateEligibilityClausesResponse notifySyndicateEligibilityClauses(NotifySyndicateEligibilityClausesRequest req);

    @Description("Retrieve Syndicate Eligibility Clauses")
    RetrieveSyndicateEligibilityClausesResponse retrieveSyndicateEligibilityClauses(RetrieveSyndicateEligibilityClausesRequest req);

    @GenericDtxEndpoint
    @Description("Update Syndicate Eligibility Clauses")
    UpdateSyndicateEligibilityClausesResponse updateSyndicateEligibilityClauses(UpdateSyndicateEligibilityClausesRequest req);
}