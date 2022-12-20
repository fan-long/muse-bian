package org.museframework.bian.merandacqadv;

import org.museframework.bian.merandacqadv.dto.ControlMergersAndAcquisitionAdviceRequest;
import org.museframework.bian.merandacqadv.dto.ControlMergersAndAcquisitionAdviceResponse;
import org.museframework.bian.merandacqadv.dto.ExchangeMergersAndAcquisitionAdviceRequest;
import org.museframework.bian.merandacqadv.dto.ExchangeMergersAndAcquisitionAdviceResponse;
import org.museframework.bian.merandacqadv.dto.ExecuteMergersAndAcquisitionAdviceRequest;
import org.museframework.bian.merandacqadv.dto.ExecuteMergersAndAcquisitionAdviceResponse;
import org.museframework.bian.merandacqadv.dto.InitiateMergersAndAcquisitionAdviceRequest;
import org.museframework.bian.merandacqadv.dto.InitiateMergersAndAcquisitionAdviceResponse;
import org.museframework.bian.merandacqadv.dto.NotifyMergersAndAcquisitionAdviceRequest;
import org.museframework.bian.merandacqadv.dto.NotifyMergersAndAcquisitionAdviceResponse;
import org.museframework.bian.merandacqadv.dto.RequestMergersAndAcquisitionAdviceRequest;
import org.museframework.bian.merandacqadv.dto.RequestMergersAndAcquisitionAdviceResponse;
import org.museframework.bian.merandacqadv.dto.RetrieveMergersAndAcquisitionAdviceRequest;
import org.museframework.bian.merandacqadv.dto.RetrieveMergersAndAcquisitionAdviceResponse;
import org.museframework.bian.merandacqadv.dto.UpdateMergersAndAcquisitionAdviceRequest;
import org.museframework.bian.merandacqadv.dto.UpdateMergersAndAcquisitionAdviceResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Provide specialist advice and/or support as an ongoing service or for a specific task/event within Mergers and Acquisitions Advisory")
@GenericDomain(name="MergersandAcquisitionsAdvisory", group="MergersAndAcquisitionAdvice")
public interface CrMergersAndAcquisitionAdvice {
    @GenericDtxEndpoint
    @Description("Control Mergers And Acquisition Advice")
    ControlMergersAndAcquisitionAdviceResponse controlMergersAndAcquisitionAdvice(ControlMergersAndAcquisitionAdviceRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Mergers And Acquisition Advice")
    ExchangeMergersAndAcquisitionAdviceResponse exchangeMergersAndAcquisitionAdvice(ExchangeMergersAndAcquisitionAdviceRequest req);

    @GenericDtxEndpoint
    @Description("Execute Mergers And Acquisition Advice")
    ExecuteMergersAndAcquisitionAdviceResponse executeMergersAndAcquisitionAdvice(ExecuteMergersAndAcquisitionAdviceRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Mergers And Acquisition Advice")
    InitiateMergersAndAcquisitionAdviceResponse initiateMergersAndAcquisitionAdvice(InitiateMergersAndAcquisitionAdviceRequest req);

    @Description("Notify Mergers And Acquisition Advice")
    NotifyMergersAndAcquisitionAdviceResponse notifyMergersAndAcquisitionAdvice(NotifyMergersAndAcquisitionAdviceRequest req);

    @GenericDtxEndpoint
    @Description("Request Mergers And Acquisition Advice")
    RequestMergersAndAcquisitionAdviceResponse requestMergersAndAcquisitionAdvice(RequestMergersAndAcquisitionAdviceRequest req);

    @Description("Retrieve Mergers And Acquisition Advice")
    RetrieveMergersAndAcquisitionAdviceResponse retrieveMergersAndAcquisitionAdvice(RetrieveMergersAndAcquisitionAdviceRequest req);

    @GenericDtxEndpoint
    @Description("Update Mergers And Acquisition Advice")
    UpdateMergersAndAcquisitionAdviceResponse updateMergersAndAcquisitionAdvice(UpdateMergersAndAcquisitionAdviceRequest req);
}