package org.museframework.bian.chequeprocessing;

import org.museframework.bian.chequeprocessing.dto.ControlChequeProcessingOperatingSessionRequest;
import org.museframework.bian.chequeprocessing.dto.ControlChequeProcessingOperatingSessionResponse;
import org.museframework.bian.chequeprocessing.dto.ExchangeChequeProcessingOperatingSessionRequest;
import org.museframework.bian.chequeprocessing.dto.ExchangeChequeProcessingOperatingSessionResponse;
import org.museframework.bian.chequeprocessing.dto.ExecuteChequeProcessingOperatingSessionRequest;
import org.museframework.bian.chequeprocessing.dto.ExecuteChequeProcessingOperatingSessionResponse;
import org.museframework.bian.chequeprocessing.dto.InitiateChequeProcessingOperatingSessionRequest;
import org.museframework.bian.chequeprocessing.dto.InitiateChequeProcessingOperatingSessionResponse;
import org.museframework.bian.chequeprocessing.dto.RequestChequeProcessingOperatingSessionRequest;
import org.museframework.bian.chequeprocessing.dto.RequestChequeProcessingOperatingSessionResponse;
import org.museframework.bian.chequeprocessing.dto.RetrieveChequeProcessingOperatingSessionRequest;
import org.museframework.bian.chequeprocessing.dto.RetrieveChequeProcessingOperatingSessionResponse;
import org.museframework.bian.chequeprocessing.dto.UpdateChequeProcessingOperatingSessionRequest;
import org.museframework.bian.chequeprocessing.dto.UpdateChequeProcessingOperatingSessionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility  within Cheque Processing.  Example: Operate the bank's internal intranet facility.")
@GenericDomain(name="ChequeProcessing", group="ChequeProcessingOperatingSession")
public interface CrChequeProcessingOperatingSession {
    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Cheque Processing Operating Session")
    ControlChequeProcessingOperatingSessionResponse controlChequeProcessingOperatingSession(ControlChequeProcessingOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Cheque Processing Operating Session processing")
    ExchangeChequeProcessingOperatingSessionResponse exchangeChequeProcessingOperatingSession(ExchangeChequeProcessingOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an available automated action for Cheque Processing Operating Session")
    ExecuteChequeProcessingOperatingSessionResponse executeChequeProcessingOperatingSession(ExecuteChequeProcessingOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Cheque Processing Operating Session")
    InitiateChequeProcessingOperatingSessionResponse initiateChequeProcessingOperatingSession(InitiateChequeProcessingOperatingSessionRequest req);

    @Description("ReCR Retrieve details about any aspect of Cheque Processing Operating Session")
    RetrieveChequeProcessingOperatingSessionResponse retrieveChequeProcessingOperatingSession(RetrieveChequeProcessingOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Cheque Processing Operating Session")
    RequestChequeProcessingOperatingSessionResponse requestChequeProcessingOperatingSession(RequestChequeProcessingOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Cheque Processing Operating Session")
    UpdateChequeProcessingOperatingSessionResponse updateChequeProcessingOperatingSession(UpdateChequeProcessingOperatingSessionRequest req);
}