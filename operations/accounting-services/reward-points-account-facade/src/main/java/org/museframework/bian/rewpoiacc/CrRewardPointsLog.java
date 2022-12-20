package org.museframework.bian.rewpoiacc;

import org.museframework.bian.rewpoiacc.dto.CaptureRewardPointsLogRequest;
import org.museframework.bian.rewpoiacc.dto.CaptureRewardPointsLogResponse;
import org.museframework.bian.rewpoiacc.dto.ControlRewardPointsLogRequest;
import org.museframework.bian.rewpoiacc.dto.ControlRewardPointsLogResponse;
import org.museframework.bian.rewpoiacc.dto.ExchangeRewardPointsLogRequest;
import org.museframework.bian.rewpoiacc.dto.ExchangeRewardPointsLogResponse;
import org.museframework.bian.rewpoiacc.dto.GrantRewardPointsLogRequest;
import org.museframework.bian.rewpoiacc.dto.GrantRewardPointsLogResponse;
import org.museframework.bian.rewpoiacc.dto.InitiateRewardPointsLogRequest;
import org.museframework.bian.rewpoiacc.dto.InitiateRewardPointsLogResponse;
import org.museframework.bian.rewpoiacc.dto.RequestRewardPointsLogRequest;
import org.museframework.bian.rewpoiacc.dto.RequestRewardPointsLogResponse;
import org.museframework.bian.rewpoiacc.dto.RetrieveRewardPointsLogRequest;
import org.museframework.bian.rewpoiacc.dto.RetrieveRewardPointsLogResponse;
import org.museframework.bian.rewpoiacc.dto.UpdateRewardPointsLogRequest;
import org.museframework.bian.rewpoiacc.dto.UpdateRewardPointsLogResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Maintain a log of transactions or activity, typically a financial account/journal or a log of activity to support behavioral analysis  within Reward Points Account.  Examples: Maintain a financial journal of transactions processed for a product or service and maintain a log of customer events and activity for subsequent analysis.")
@GenericDomain(name="RewardPointsAccount", group="RewardPointsLog")
public interface CrRewardPointsLog {
    @GenericDtxEndpoint
    @Description("CaCR Capture Reward Points Log activity or event related information")
    CaptureRewardPointsLogResponse captureRewardPointsLog(CaptureRewardPointsLogRequest req);

    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Reward Points Log")
    ControlRewardPointsLogResponse controlRewardPointsLog(ControlRewardPointsLogRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Reward Points Log processing")
    ExchangeRewardPointsLogResponse exchangeRewardPointsLog(ExchangeRewardPointsLogRequest req);

    @GenericDtxEndpoint
    @Description("GrCR Obtain permission to act in relation to Reward Points Log")
    GrantRewardPointsLogResponse grantRewardPointsLog(GrantRewardPointsLogRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Reward Points Log")
    InitiateRewardPointsLogResponse initiateRewardPointsLog(InitiateRewardPointsLogRequest req);

    @Description("ReCR Retrieve details about any aspect of Reward Points Log")
    RetrieveRewardPointsLogResponse retrieveRewardPointsLog(RetrieveRewardPointsLogRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Reward Points Log")
    RequestRewardPointsLogResponse requestRewardPointsLog(RequestRewardPointsLogRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Reward Points Log")
    UpdateRewardPointsLogResponse updateRewardPointsLog(UpdateRewardPointsLogRequest req);
}