/*The Syndicate Eligibility Clauses defines a particular clause or consideration that is applied to determine eligibility for Syndicate Eligibility Clauses*/
package org.museframework.bian.syndicatemanagement.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class SyndicateManagementOutcome {
    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.DirectoryEntry syndicateManagementEntry;

    public void setSyndicateManagementEntry(org.museframework.bian.classes.DirectoryEntry syndicateManagementEntry) {
        this.syndicateManagementEntry = syndicateManagementEntry;
    }

    public org.museframework.bian.classes.DirectoryEntry getSyndicateManagementEntry() {
        return syndicateManagementEntry;
    }
}