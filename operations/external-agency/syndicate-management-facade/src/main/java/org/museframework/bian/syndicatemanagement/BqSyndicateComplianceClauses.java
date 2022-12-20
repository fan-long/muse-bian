package org.museframework.bian.syndicatemanagement;

import org.museframework.bian.syndicatemanagement.dto.NotifySyndicateComplianceClausesRequest;
import org.museframework.bian.syndicatemanagement.dto.NotifySyndicateComplianceClausesResponse;
import org.museframework.bian.syndicatemanagement.dto.RetrieveSyndicateComplianceClausesRequest;
import org.museframework.bian.syndicatemanagement.dto.RetrieveSyndicateComplianceClausesResponse;
import org.museframework.bian.syndicatemanagement.dto.UpdateSyndicateComplianceClausesRequest;
import org.museframework.bian.syndicatemanagement.dto.UpdateSyndicateComplianceClausesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Syndicate Eligibility Clauses defines a particular clause or consideration that is applied to determine eligibility for Syndicate Eligibility Clauses")
@GenericDomain(name="SyndicateManagement", group="SyndicateComplianceClauses")
public interface BqSyndicateComplianceClauses {
    @Description("Notify Syndicate Compliance Clauses")
    NotifySyndicateComplianceClausesResponse notifySyndicateComplianceClauses(NotifySyndicateComplianceClausesRequest req);

    @Description("Retrieve Syndicate Compliance Clauses")
    RetrieveSyndicateComplianceClausesResponse retrieveSyndicateComplianceClauses(RetrieveSyndicateComplianceClausesRequest req);

    @GenericDtxEndpoint
    @Description("Update Syndicate Compliance Clauses")
    UpdateSyndicateComplianceClausesResponse updateSyndicateComplianceClauses(UpdateSyndicateComplianceClausesRequest req);
}