package org.museframework.bian.knowledgeexchange;

import org.museframework.bian.knowledgeexchange.dto.ExchangeCaptureandClassificationRequest;
import org.museframework.bian.knowledgeexchange.dto.ExchangeCaptureandClassificationResponse;
import org.museframework.bian.knowledgeexchange.dto.ExecuteCaptureandClassificationRequest;
import org.museframework.bian.knowledgeexchange.dto.ExecuteCaptureandClassificationResponse;
import org.museframework.bian.knowledgeexchange.dto.InitiateCaptureandClassificationRequest;
import org.museframework.bian.knowledgeexchange.dto.InitiateCaptureandClassificationResponse;
import org.museframework.bian.knowledgeexchange.dto.RequestCaptureandClassificationRequest;
import org.museframework.bian.knowledgeexchange.dto.RequestCaptureandClassificationResponse;
import org.museframework.bian.knowledgeexchange.dto.RetrieveCaptureandClassificationRequest;
import org.museframework.bian.knowledgeexchange.dto.RetrieveCaptureandClassificationResponse;
import org.museframework.bian.knowledgeexchange.dto.UpdateCaptureandClassificationRequest;
import org.museframework.bian.knowledgeexchange.dto.UpdateCaptureandClassificationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility  within Knowledge Exchange.  Example: Operate the bank's internal intranet facility.")
@GenericDomain(name="KnowledgeExchange", group="CaptureandClassification")
public interface BqCaptureandClassification {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Capture and Classification processing")
    ExchangeCaptureandClassificationResponse exchangeCaptureandClassification(ExchangeCaptureandClassificationRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute an available automated action for Capture and Classification")
    ExecuteCaptureandClassificationResponse executeCaptureandClassification(ExecuteCaptureandClassificationRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Capture and Classification")
    InitiateCaptureandClassificationResponse initiateCaptureandClassification(InitiateCaptureandClassificationRequest req);

    @Description("ReBQ Retrieve details about any aspect of Capture and Classification")
    RetrieveCaptureandClassificationResponse retrieveCaptureandClassification(RetrieveCaptureandClassificationRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Capture and Classification")
    RequestCaptureandClassificationResponse requestCaptureandClassification(RequestCaptureandClassificationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Capture and Classification")
    UpdateCaptureandClassificationResponse updateCaptureandClassification(UpdateCaptureandClassificationRequest req);
}