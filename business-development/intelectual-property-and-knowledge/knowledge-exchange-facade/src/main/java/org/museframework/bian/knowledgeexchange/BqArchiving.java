package org.museframework.bian.knowledgeexchange;

import org.museframework.bian.knowledgeexchange.dto.RetrieveArchivingRequest;
import org.museframework.bian.knowledgeexchange.dto.RetrieveArchivingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility  within Knowledge Exchange.  Example: Operate the bank's internal intranet facility.")
@GenericDomain(name="KnowledgeExchange", group="Archiving")
public interface BqArchiving {
    @Description("ReBQ Retrieve details about any aspect of Archiving")
    RetrieveArchivingResponse retrieveArchiving(RetrieveArchivingRequest req);
}