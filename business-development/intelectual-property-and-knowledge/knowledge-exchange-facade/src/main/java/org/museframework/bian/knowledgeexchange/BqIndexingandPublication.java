package org.museframework.bian.knowledgeexchange;

import org.museframework.bian.knowledgeexchange.dto.ExchangeIndexingandPublicationRequest;
import org.museframework.bian.knowledgeexchange.dto.ExchangeIndexingandPublicationResponse;
import org.museframework.bian.knowledgeexchange.dto.RetrieveIndexingandPublicationRequest;
import org.museframework.bian.knowledgeexchange.dto.RetrieveIndexingandPublicationResponse;
import org.museframework.bian.knowledgeexchange.dto.UpdateIndexingandPublicationRequest;
import org.museframework.bian.knowledgeexchange.dto.UpdateIndexingandPublicationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility  within Knowledge Exchange.  Example: Operate the bank's internal intranet facility.")
@GenericDomain(name="KnowledgeExchange", group="IndexingandPublication")
public interface BqIndexingandPublication {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Indexing and Publication processing")
    ExchangeIndexingandPublicationResponse exchangeIndexingandPublication(ExchangeIndexingandPublicationRequest req);

    @Description("ReBQ Retrieve details about any aspect of Indexing and Publication")
    RetrieveIndexingandPublicationResponse retrieveIndexingandPublication(RetrieveIndexingandPublicationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Indexing and Publication")
    UpdateIndexingandPublicationResponse updateIndexingandPublication(UpdateIndexingandPublicationRequest req);
}