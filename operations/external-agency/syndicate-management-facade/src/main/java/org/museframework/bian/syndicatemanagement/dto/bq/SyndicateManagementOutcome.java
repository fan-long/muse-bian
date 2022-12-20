/*The Syndicate Eligibility Clauses defines a particular clause or consideration that is applied to determine eligibility for Syndicate Eligibility Clauses*/
package org.museframework.bian.syndicatemanagement.dto.bq;

public class SyndicateManagementOutcome {
    /**/
    private org.museframework.bian.classes.DirectoryEntry syndicateManagementEntry;

    public void setSyndicateManagementEntry(org.museframework.bian.classes.DirectoryEntry syndicateManagementEntry) {
        this.syndicateManagementEntry = syndicateManagementEntry;
    }

    public org.museframework.bian.classes.DirectoryEntry getSyndicateManagementEntry() {
        return syndicateManagementEntry;
    }
}