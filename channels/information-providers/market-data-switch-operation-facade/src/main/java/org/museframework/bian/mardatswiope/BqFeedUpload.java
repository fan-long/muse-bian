package org.museframework.bian.mardatswiope;

import org.museframework.bian.mardatswiope.dto.RetrieveFeedUploadRequest;
import org.museframework.bian.mardatswiope.dto.RetrieveFeedUploadResponse;
import org.museframework.bian.mardatswiope.dto.UpdateFeedUploadRequest;
import org.museframework.bian.mardatswiope.dto.UpdateFeedUploadResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="MarketDataSwitchOperation", group="FeedUpload")
public interface BqFeedUpload {
    @GenericDtxEndpoint
    @Description("UpBQ Update details for the feed upload")
    UpdateFeedUploadResponse updateFeedUpload(UpdateFeedUploadRequest req);

    @Description("ReBQ Retrieve details about the feed upload activity")
    RetrieveFeedUploadResponse retrieveFeedUpload(RetrieveFeedUploadRequest req);
}